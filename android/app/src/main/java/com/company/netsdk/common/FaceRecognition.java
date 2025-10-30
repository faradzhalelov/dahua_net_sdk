package com.company.netsdk.common;

import com.company.NetSDK.*;
import com.company.netsdk.activity.NetSDKApplication;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 目标识别相关功能
 * 主要功能：1、目标识别事件
 *           2、人脸库的增、删、改、查
 *           3、人员的增、删、改、查
 *           4、布控、撤控
 *           5、下载图片
 */
public class FaceRecognition {
    /***************************************************************************************************************
     *                                            目标识别事件                                                     *
     ***************************************************************************************************************/
    // 智能订阅句柄
    private static long mRealLoadHandle = 0;

    /**
     * 智能订阅，用于订阅目标识别事件
     */
    public static void realLoadPicture() {
        // 通道号， -1代表全通道，大部分设备都支持，有些设备，只能单个通道订阅
        int channel = 1;

        // 每次订阅，返回的订阅句柄 mRealLoadHandle 都是最新的，是实时的
        mRealLoadHandle = INetSDK.RealLoadPictureEx(NetSDKApplication.getInstance().getLoginHandle(),
                                                    channel,
                                                    FinalVar.EVENT_IVS_ALL,
                                                    true,
                                                    RealLoadPictureCallBack.getInstance(),
                                                    0);
        if(mRealLoadHandle != 0) {
            ToolKits.writeLog("订阅" + channel + "通道成功！");
        } else {
            ToolKits.writeErrorLog("订阅" + channel + "通道失败！");
        }
    }

    /**
     * 停止订阅
     */
    public static void stopRealLoadPic() {
        if(mRealLoadHandle != 0) {
            INetSDK.StopLoadPic(mRealLoadHandle);
            mRealLoadHandle = 0;
        }
    }

    public static class RealLoadPictureCallBack implements CB_fAnalyzerDataCallBack {
        private static RealLoadPictureCallBack instance = new RealLoadPictureCallBack();

        public static RealLoadPictureCallBack getInstance() {
            return instance;
        }

        @Override
        public void invoke(long lAnalyzerHandle, int dwAlarmType,
                           Object alarmInfo, byte pBuffer[], int dwBufSize,
                           int nSequence, int reserved) {
            if(dwAlarmType == FinalVar.EVENT_IVS_FACERECOGNITION) //目标识别事件
            {
                DEV_EVENT_FACERECOGNITION_INFO facerecognitionInfo = (DEV_EVENT_FACERECOGNITION_INFO)alarmInfo;

                ///////////////////////////////////////// 全景图 ////////////////////////////////////
                String strFileName = "";
                if(facerecognitionInfo.bGlobalScenePic) {
                    if (ToolKits.createFile("/mnt/sdcard/NetSDK/", "全景图.jpg")) {
                        strFileName = "/mnt/sdcard/NetSDK/全景图.jpg";
                    }
                    if ("" != strFileName) {
                        FileOutputStream fileStream;
                        try {
                            fileStream = new FileOutputStream(strFileName, true);
                            fileStream.write(pBuffer,
                                    facerecognitionInfo.stuGlobalScenePicInfo.dwOffSet,
                                    facerecognitionInfo.stuGlobalScenePicInfo.dwFileLenth);
                            fileStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                /////////////////////////////////////////////// 人脸信息 ///////////////////////////////////
                if(facerecognitionInfo.stuObject.stPicInfo != null) {
                    if (ToolKits.createFile("/mnt/sdcard/NetSDK/", "人脸图.jpg")) {
                        strFileName = "/mnt/sdcard/NetSDK/人脸图.jpg";
                    }
                    if ("" != strFileName) {
                        FileOutputStream fileStream;
                        try {
                            fileStream = new FileOutputStream(strFileName, true);
                            fileStream.write(pBuffer,
                                    facerecognitionInfo.stuObject.stPicInfo.dwOffSet,
                                    facerecognitionInfo.stuObject.stPicInfo.dwFileLenth);
                            fileStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                ToolKits.writeLog("--------------------- 人脸信息 --------------------------------");
                ToolKits.writeLog("时间：" + facerecognitionInfo.UTC.toStringTime());
                ToolKits.writeLog("性别：" + getSex(facerecognitionInfo.stuFaceData.emSex));
                ToolKits.writeLog("年龄：" + facerecognitionInfo.stuFaceData.nAge);
                ToolKits.writeLog("眼睛：" + getEye(facerecognitionInfo.stuFaceData.emEye));
                ToolKits.writeLog("嘴巴：" + getMouth(facerecognitionInfo.stuFaceData.emMouth));
                ToolKits.writeLog("口罩：" + getMask(facerecognitionInfo.stuFaceData.emMask));
                ToolKits.writeLog("胡子：" + getBeard(facerecognitionInfo.stuFaceData.emBeard));
                ToolKits.writeLog(" " + "\n");

                //////////////////////////////////////// 对比信息 ////////////////////////////////
                if(facerecognitionInfo.nRetCandidatesExNum > 0) {
                    if (ToolKits.createFile("/mnt/sdcard/NetSDK/", "对比图.jpg")) {
                        strFileName = "/mnt/sdcard/NetSDK/对比图.jpg";
                    }
                    if ("" != strFileName) {
                        FileOutputStream fileStream;
                        try {
                            fileStream = new FileOutputStream(strFileName, true);
                            fileStream.write(pBuffer,
                                    facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.szFacePicInfo[0].dwOffSet,
                                    facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.szFacePicInfo[0].dwFileLenth);
                            fileStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                ToolKits.writeLog("--------------------- 对比信息 --------------------------------");
                ToolKits.writeLog("姓名：" + new String(facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.szPersonName).trim());
                ToolKits.writeLog("性别：" +getSex(facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.bySex & 0xff));
                ToolKits.writeLog("生日：" + ((int)facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.wYear) + "-" +
                                              (facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.byMonth & 0xff) + "-" +
                                              (facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.byDay & 0xff));
                ToolKits.writeLog("证件号：" +new String(facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.szID).trim());
                ToolKits.writeLog("人脸库ID：" + new String(facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.szGroupID).trim());
                ToolKits.writeLog("人脸库名称：" + new String(facerecognitionInfo.stuCandidatesEx[0].stPersonInfo.szGroupName).trim());
                ToolKits.writeLog("相似度：" + (facerecognitionInfo.stuCandidatesEx[0].bySimilarity & 0xff));
                ToolKits.writeLog(" " + "\n");
            }
        }
    }

    /***************************************************************************************************************
     *                                  人脸库的增、删、改、查                                                     *
     ***************************************************************************************************************/

    /**
     * 添加人脸库
     * @param groupName 人脸库名称
     */
    public static void addGroup(String groupName) {
        /**
         * 人员信息
         */
        NET_ADD_FACERECONGNITION_GROUP_INFO groupInfo = new NET_ADD_FACERECONGNITION_GROUP_INFO();

        // 人脸库名称
        System.arraycopy(groupName.getBytes(), 0, groupInfo.stuGroupInfo.szGroupName, 0, groupName.getBytes().length);

        /**
         * 入参
         */
        NET_IN_OPERATE_FACERECONGNITION_GROUP stIn = new NET_IN_OPERATE_FACERECONGNITION_GROUP();
        stIn.emOperateType = EM_OPERATE_FACERECONGNITION_GROUP_TYPE.NET_FACERECONGNITION_GROUP_ADD; // 添加人员组信息
        stIn.pOPerateInfo = groupInfo;

        /**
         * 出参
         */
        NET_OUT_OPERATE_FACERECONGNITION_GROUP stOut = new NET_OUT_OPERATE_FACERECONGNITION_GROUP();

        if(INetSDK.OperateFaceRecognitionGroup(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 3000)) {
            ToolKits.writeLog("添加人脸库成功， 人脸库ID：" + new String(stOut.szGroupId).trim());
        } else {
            ToolKits.writeErrorLog("添加人脸库失败！");
        }
    }

    /**
     * 修改人脸库
     * @param groupName 修改后的人脸库名称
     * @param groupId   需要修改的人脸库ID
     */
    public static void modifyGroup(String groupName, String groupId) {
        /**
         * 人员信息
         */
        NET_MODIFY_FACERECONGNITION_GROUP_INFO groupInfo = new NET_MODIFY_FACERECONGNITION_GROUP_INFO();

        // 人脸库名称
        System.arraycopy(groupName.getBytes(), 0, groupInfo.stuGroupInfo.szGroupName, 0, groupName.getBytes().length);

        // 人脸库ID
        System.arraycopy(groupId.getBytes(), 0, groupInfo.stuGroupInfo.szGroupId, 0, groupId.getBytes().length);

        /**
         * 入参
         */
        NET_IN_OPERATE_FACERECONGNITION_GROUP stIn = new NET_IN_OPERATE_FACERECONGNITION_GROUP();
        stIn.emOperateType = EM_OPERATE_FACERECONGNITION_GROUP_TYPE.NET_FACERECONGNITION_GROUP_MODIFY; // 修改人员组信息
        stIn.pOPerateInfo = groupInfo;

        /**
         * 出参
         */
        NET_OUT_OPERATE_FACERECONGNITION_GROUP stOut = new NET_OUT_OPERATE_FACERECONGNITION_GROUP();

        if(INetSDK.OperateFaceRecognitionGroup(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 3000)) {
            ToolKits.writeLog("修改人脸库成功！");
        } else {
            ToolKits.writeErrorLog("修改人脸库失败！");
        }
    }

    /**
     * 删除人脸库
     * @param groupId   需要删除的人脸库ID
     */
    public static void deleteGroup(String groupId) {
        /**
         * 人员信息
         */
        NET_DELETE_FACERECONGNITION_GROUP_INFO groupInfo = new NET_DELETE_FACERECONGNITION_GROUP_INFO();

        // 人脸库ID
        System.arraycopy(groupId.getBytes(), 0, groupInfo.szGroupId, 0, groupId.getBytes().length);

        /**
         * 入参
         */
        NET_IN_OPERATE_FACERECONGNITION_GROUP stIn = new NET_IN_OPERATE_FACERECONGNITION_GROUP();
        stIn.emOperateType = EM_OPERATE_FACERECONGNITION_GROUP_TYPE.NET_FACERECONGNITION_GROUP_DELETE; // 删除人员组信息
        stIn.pOPerateInfo = groupInfo;

        /**
         * 出参
         */
        NET_OUT_OPERATE_FACERECONGNITION_GROUP stOut = new NET_OUT_OPERATE_FACERECONGNITION_GROUP();

        if(INetSDK.OperateFaceRecognitionGroup(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 3000)) {
            ToolKits.writeLog("删除人脸库成功！");
        } else {
            ToolKits.writeErrorLog("删除人脸库失败！");
        }
    }

    /**
     * 查询人脸库, IPC最大支持5个人脸库，IVSS最大支持20个人脸库
     * @param groupId 人脸库ID，空为查询所有人脸库
     */
    public static void findGroup(String groupId ) {
        /**
         * 入参
          */
        NET_IN_FIND_GROUP_INFO stIn = new NET_IN_FIND_GROUP_INFO();
		System.arraycopy(groupId.getBytes(), 0, stIn.szGroupId, 0, groupId.getBytes().length);

        /**
         * 出参
         */
        NET_OUT_FIND_GROUP_INFO stOut = new NET_OUT_FIND_GROUP_INFO(20);   // 需要设备人员组最大个数

        if(INetSDK.FindGroupInfo(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 5000)) {
            ToolKits.writeLog("人脸库个数 : " + stOut.nRetGroupNum + "\n");

            for(int i = 0; i < stOut.nRetGroupNum; i++) {
                ToolKits.writeLog("人脸库ID : " + new String(stOut.pGroupInfos[i].szGroupId).trim());
                ToolKits.writeLog("人脸库名称 : " + new String(stOut.pGroupInfos[i].szGroupName).trim() + "\n");
            }
        } else {
            ToolKits.writeErrorLog("查询人脸库失败！");
        }
    }

    /***************************************************************************************************************
     *                                      按人脸库布控、撤控                                                     *
     ***************************************************************************************************************/

    /**
     * 按人脸库布控
     * @param groupId  人脸库ID
     * @param msg      布控信息数组： 一维:通道号   二维:相似度;  通道号与相似度一一对应， 下发哪些就布控哪些
     */
    public static void putDisposition(String groupId, int[][] msg) {
        /**
         * 入参
         */
        NET_IN_FACE_RECOGNITION_PUT_DISPOSITION_INFO stIn = new NET_IN_FACE_RECOGNITION_PUT_DISPOSITION_INFO();
        // 人脸库ID
        System.arraycopy(groupId.getBytes(), 0, stIn.szGroupId, 0, groupId.getBytes().length);

        // 布控通道个数，跟相似度个数一样
        stIn.nDispositionChnNum = msg.length;

        // 布控信息
        for(int i = 0; i < msg.length; i++) {
            stIn.stuDispositionChnInfo[i].nChannelID = msg[i][0];   // 布控通道号
            stIn.stuDispositionChnInfo[i].nSimilary = msg[i][1];    // 布控通道对应的相似度
        }

        /**
         * 出参
         */
        NET_OUT_FACE_RECOGNITION_PUT_DISPOSITION_INFO stOut = new NET_OUT_FACE_RECOGNITION_PUT_DISPOSITION_INFO();

        if(INetSDK.FaceRecognitionPutDisposition(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 6000)) {
            ToolKits.writeLog("布控结果个数：" + stOut.nReportCnt + "\n");

            for(int i = 0; i < stOut.nReportCnt; i++) {
                ToolKits.writeLog("布控结果：" + stOut.bReport[i]);
            }
        } else {
            ToolKits.writeErrorLog("布控失败！");
        }
    }

    /**
     * 按人脸库撤控
     * @param groupId 人脸库ID
     * @param channels      撤控的通道号数组
     */
    public static void delDisposition(String groupId, int[] channels) {
        /**
         * 入参
         */
        NET_IN_FACE_RECOGNITION_DEL_DISPOSITION_INFO stIn = new NET_IN_FACE_RECOGNITION_DEL_DISPOSITION_INFO();
        // 人脸库ID
        System.arraycopy(groupId.getBytes(), 0, stIn.szGroupId, 0, groupId.getBytes().length);

        // 撤控视频通道个数
        stIn.nDispositionChnNum = channels.length;

        // 撤控视频通道列表
        for(int i = 0; i < channels.length; i++) {
            stIn.nDispositionChn[i] = channels[i];   // 撤控通道号
        }

        /**
         * 出参
         */
        NET_OUT_FACE_RECOGNITION_DEL_DISPOSITION_INFO stOut = new NET_OUT_FACE_RECOGNITION_DEL_DISPOSITION_INFO();

        if(INetSDK.FaceRecognitionDelDisposition(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 6000)) {
            ToolKits.writeLog("撤控结果个数：" + stOut.nReportCnt + "\n");

            for(int i = 0; i < stOut.nReportCnt; i++) {
                ToolKits.writeLog("撤控结果：" + stOut.bReport[i]);
            }
        } else {
            ToolKits.writeErrorLog("撤控失败！");
        }
    }

    /**
     * 查询布控信息，跟查询人脸库一个接口
     * @param groupId 人脸库ID
     */
    public static void findDisposition(String groupId) {
        /**
         * 入参
         */
        NET_IN_FIND_GROUP_INFO stIn = new NET_IN_FIND_GROUP_INFO();
        System.arraycopy(groupId.getBytes(), 0, stIn.szGroupId, 0, groupId.getBytes().length);

        /**
         * 出参
         */
        NET_OUT_FIND_GROUP_INFO stOut = new NET_OUT_FIND_GROUP_INFO(20);   // 需要设备人员组最大个数

        if(INetSDK.FindGroupInfo(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 5000)) {
//            ToolKits.writeLog("人脸库个数 : " + stOut.nRetGroupNum + "\n");

            for(int i = 0; i < stOut.nRetGroupNum; i++) {
                // 通道个数 与 相似度个数一一对应，所以返回的值是一样的
                ToolKits.writeLog("通道个数 : " + stOut.pGroupInfos[i].nRetChnCount);
                ToolKits.writeLog("相似度个数 : " + stOut.pGroupInfos[i].nRetSimilarityCount + "\n");

                for(int j = 0; j < stOut.pGroupInfos[i].nRetChnCount; j++) {
                    ToolKits.writeLog("通道号 : " + stOut.pGroupInfos[i].nChannel[j]);
                    ToolKits.writeLog("相似度 : " + stOut.pGroupInfos[i].nSimilarity[j] + "\n");
                }
            }
        } else {
            ToolKits.writeErrorLog("查询布控信息失败！");
        }
    }

    /***************************************************************************************************************
     *                                         人员的增、删、改                                                    *
     ***************************************************************************************************************/

    /**
     * 添加人员
     * @param groupId      人脸库ID
     * @param personName  人员名称
     * @param birthdays   生日
     * @param sex          性别，1-男,2-女,作为查询条件时,此参数填0,则表示此参数无效
     * @param idType      证件类型，0-未知，1-证件，2-护照
     * @param idNo        证件号
     * @param imagePath  图片路径
     */
    public static void addPerson(String groupId,
                                   String personName,
                                   String birthdays,
                                   int sex,
                                   int idType,
                                   String idNo,
                                   String imagePath) {
        /**
         * 入参
         */
        NET_IN_OPERATE_FACERECONGNITIONDB stIn = new NET_IN_OPERATE_FACERECONGNITIONDB();
        // 添加人员信息和人脸样本，如果人员已经存在，图片数据和原来的数据合并
        stIn.emOperateType = EM_OPERATE_FACERECONGNITIONDB_TYPE.NET_FACERECONGNITIONDB_ADD;

        // 使用人员扩展信息
        stIn.bUsePersonInfoEx = true;

        // 人脸库ID
        System.arraycopy(groupId.getBytes(), 0, stIn.stPersonInfoEx.szGroupID, 0, groupId.getBytes().length);

        // 人员名称
        System.arraycopy(personName.getBytes(), 0, stIn.stPersonInfoEx.szPersonName, 0, personName.getBytes().length);

        // 生日
        if(!birthdays.isEmpty()) {
            String[] birthday = birthdays.split("-");

            stIn.stPersonInfoEx.wYear = (short)Integer.parseInt(birthday[0]);
            stIn.stPersonInfoEx.byMonth = (byte)Integer.parseInt(birthday[1]);
            stIn.stPersonInfoEx.byDay = (byte)Integer.parseInt(birthday[2]);
        }

        // 性别,1-男,2-女,作为查询条件时,此参数填0,则表示此参数无效
        stIn.stPersonInfoEx.bySex = (byte)sex;

        // 证件类型，0-未知，1-证件，2-护照
        stIn.stPersonInfoEx.byIDType = (byte)idType;

        // 证件号
        System.arraycopy(idNo.getBytes(), 0, stIn.stPersonInfoEx.szID, 0, idNo.getBytes().length);

        // 图片信息
        if(!imagePath.isEmpty()) {
            // 人脸图片数据
            stIn.pBuffer = imagePath;

            // 图片张数
            stIn.stPersonInfoEx.wFacePicNum = 1;

            // 图片大小
            stIn.stPersonInfoEx.szFacePicInfo[0].dwFileLenth = (int)GetFileSize(imagePath);

            // 图片偏移量
            stIn.stPersonInfoEx.szFacePicInfo[0].dwOffSet = 0;
        }
        /**
         * 出参
         */
        NET_OUT_OPERATE_FACERECONGNITIONDB stOut = new NET_OUT_OPERATE_FACERECONGNITIONDB();

        if(INetSDK.OperateFaceRecognitionDB(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 4000)) {
            // 添加成功后，设备会返回人员唯一标识符  szUID
            ToolKits.writeLog("人员唯一标识符：" + new String(stOut.szUID).trim());
        } else {
            ToolKits.writeErrorLog("添加人员失败！");
        }
    }

    /**
     * 修改人员
     * @param groupId      人脸库ID
     * @param uid          人员唯一标识符,修改人员时，必填
     * @param personName  人员名称
     * @param birthdays   生日
     * @param sex          性别，1-男,2-女,作为查询条件时,此参数填0,则表示此参数无效
     * @param idType      证件类型，0-未知，1-证件，2-护照
     * @param idNo        证件号
     * @param imagePath  图片路径
     */
    public static void modifyPerson(String groupId,
                                      String uid,
                                      String personName,
                                      String birthdays,
                                      int sex,
                                      int idType,
                                      String idNo,
                                      String imagePath) {
        /**
         * 入参
         */
        NET_IN_OPERATE_FACERECONGNITIONDB stIn = new NET_IN_OPERATE_FACERECONGNITIONDB();
        // 修改人员信息和人脸样本,人员的UID标识必填
        stIn.emOperateType = EM_OPERATE_FACERECONGNITIONDB_TYPE.NET_FACERECONGNITIONDB_MODIFY;

        // 使用人员扩展信息
        stIn.bUsePersonInfoEx = true;

        // 人脸库ID
        System.arraycopy(groupId.getBytes(), 0, stIn.stPersonInfoEx.szGroupID, 0, groupId.getBytes().length);

        // 人员唯一标识符
        System.arraycopy(uid.getBytes(), 0, stIn.stPersonInfoEx.szUID, 0, uid.getBytes().length);

        // 人员名称
        System.arraycopy(personName.getBytes(), 0, stIn.stPersonInfoEx.szPersonName, 0, personName.getBytes().length);

        // 生日
        if(!birthdays.isEmpty()) {
            String[] birthday = birthdays.split("-");

            stIn.stPersonInfoEx.wYear = (short)Integer.parseInt(birthday[0]);
            stIn.stPersonInfoEx.byMonth = (byte)Integer.parseInt(birthday[1]);
            stIn.stPersonInfoEx.byDay = (byte)Integer.parseInt(birthday[2]);
        }

        // 性别,1-男,2-女,作为查询条件时,此参数填0,则表示此参数无效
        stIn.stPersonInfoEx.bySex = (byte)sex;

        // 证件类型，0-未知，1-证件，2-护照
        stIn.stPersonInfoEx.byIDType = (byte)idType;

        // 证件号
        System.arraycopy(idNo.getBytes(), 0, stIn.stPersonInfoEx.szID, 0, idNo.getBytes().length);

        // 图片信息
        if(!imagePath.isEmpty()) {
            // 人脸图片名称
            stIn.pBuffer = imagePath;

            // 图片张数
            stIn.stPersonInfoEx.wFacePicNum = 1;

            // 图片大小
            stIn.stPersonInfoEx.szFacePicInfo[0].dwFileLenth = (int)GetFileSize(imagePath);

            // 图片偏移量
            stIn.stPersonInfoEx.szFacePicInfo[0].dwOffSet = 0;
        }
        /**
         * 出参
         */
        NET_OUT_OPERATE_FACERECONGNITIONDB stOut = new NET_OUT_OPERATE_FACERECONGNITIONDB();

        if(INetSDK.OperateFaceRecognitionDB(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 4000)) {
            ToolKits.writeLog("修改人员成功！");
        } else {
            ToolKits.writeErrorLog("修改人员失败！");
        }
    }

    /**
     * 删除人员
     * @param groupId      人脸库ID
     * @param uid          人员唯一标识符,修改人员时，必填
     */
    public static void deletePerson(String groupId, String uid) {
        /**
         * 入参
         */
        NET_IN_OPERATE_FACERECONGNITIONDB stIn = new NET_IN_OPERATE_FACERECONGNITIONDB();
        // 删除人员信息和人脸样本，人员的UID标识必填
        stIn.emOperateType = EM_OPERATE_FACERECONGNITIONDB_TYPE.NET_FACERECONGNITIONDB_DELETE;

        // 使用人员扩展信息
        stIn.bUsePersonInfoEx = true;

        // 人脸库ID
        System.arraycopy(groupId.getBytes(), 0, stIn.stPersonInfoEx.szGroupID, 0, groupId.getBytes().length);

        // 人员唯一标识符
        System.arraycopy(uid.getBytes(), 0, stIn.stPersonInfoEx.szUID, 0, uid.getBytes().length);

        /**
         * 出参
         */
        NET_OUT_OPERATE_FACERECONGNITIONDB stOut = new NET_OUT_OPERATE_FACERECONGNITIONDB();

        if(INetSDK.OperateFaceRecognitionDB(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 4000)) {
            ToolKits.writeLog("删除人员成功！");
        } else {
            ToolKits.writeErrorLog("删除人员失败！");
        }
    }

    /***************************************************************************************************************
     *                                       人员查询，下载图片                                                    *
     ***************************************************************************************************************/
    /**
     * 按条件查询人员信息
     * @param groupId               人脸库ID
     * @param birthdayStartTime   生日开始时间
     * @param birthdayEndTime     生日结束时间
     * @param personName           人员名称，可以模糊查询， 比如 122*  或   26*66  或  *7889 等
     * @param sex                   性别，1-男,2-女,作为查询条件时,此参数填0,则表示此参数无效
     * @param idType                证件类型，0-未知，1-证件，2-护照
     * @param idNo                  证件号
     * 注意：生日开始/结束时间，可以都填，也可以只填单个，也可以不填，属于独立的条件
     * 查询人员信息分三步，每次最多查询20条信息。  在第一步后，查询所有信息，需要循环第二步操作，根据偏移量来查询。
     */
     public static void findPerson(String groupId,
                                     String birthdayStartTime,
                                     String birthdayEndTime,
                                     String personName,
                                     int sex,
                                     int idType,
                                     String idNo) {

         //////////////////////////////// 【第一步：获取查询句柄，记录个数，以及 nToken】 ////////////////////////////////
		 /**
		  * 入参
		  */
         NET_IN_STARTFIND_FACERECONGNITION startFindIn = new NET_IN_STARTFIND_FACERECONGNITION();
         // 人员信息查询条件是否有效, 并使用扩展结构体
         startFindIn.bPersonExEnable = true;

         // 人脸库ID
         System.arraycopy(groupId.getBytes(), 0, startFindIn.stPersonInfoEx.szGroupID, 0, groupId.getBytes().length);

         // 人员姓名
         System.arraycopy(personName.getBytes(), 0, startFindIn.stPersonInfoEx.szPersonName, 0, personName.getBytes().length);

         // 性别
         startFindIn.stPersonInfoEx.bySex = (byte)sex;

         // 证件类型
         startFindIn.stPersonInfoEx.byIDType = (byte)idType;

         // 证件号
         System.arraycopy(idNo.getBytes(), 0, startFindIn.stPersonInfoEx.szID, 0, idNo.getBytes().length);

         startFindIn.stFilterInfo.nGroupIdNum = 1;

         // 人脸库ID
         System.arraycopy(groupId.getBytes(), 0, startFindIn.stFilterInfo.szGroupId[0], 0, groupId.getBytes().length);

         // 待查询人脸类型
         startFindIn.stFilterInfo.emFaceType = EM_FACERECOGNITION_FACE_TYPE.EM_FACERECOGNITION_FACE_TYPE_ALL; // 所有人脸

         // 生日开始时间
         if(!birthdayStartTime.isEmpty()) {
             String[] startTimeStr = birthdayStartTime.split("-");

             startFindIn.stFilterInfo.stBirthdayRangeStart.dwYear = Integer.parseInt(startTimeStr[0]);
             startFindIn.stFilterInfo.stBirthdayRangeStart.dwMonth = Integer.parseInt(startTimeStr[1]);
             startFindIn.stFilterInfo.stBirthdayRangeStart.dwDay = Integer.parseInt(startTimeStr[2]);
         }

         // 生日结束时间
         if(!birthdayEndTime.isEmpty()) {
             String[] endTimeStr = birthdayEndTime.split("-");

             startFindIn.stFilterInfo.stBirthdayRangeEnd.dwYear = Integer.parseInt(endTimeStr[0]);
             startFindIn.stFilterInfo.stBirthdayRangeEnd.dwMonth = Integer.parseInt(endTimeStr[1]);
             startFindIn.stFilterInfo.stBirthdayRangeEnd.dwDay = Integer.parseInt(endTimeStr[2]);
         }

         // 数据库个数
         startFindIn.stFilterInfo.nRangeNum = 1;

         // 待查询数据库类型
         startFindIn.stFilterInfo.szRange[0] = EM_FACE_DB_TYPE.NET_FACE_DB_TYPE_BLACKLIST; // 禁止名单数据库

         /**
	      * 出参
	      */
         NET_OUT_STARTFIND_FACERECONGNITION startFindOut = new NET_OUT_STARTFIND_FACERECONGNITION();

         if(!INetSDK.StartFindFaceRecognition(NetSDKApplication.getInstance().getLoginHandle(), startFindIn, startFindOut, 4000)) {
             ToolKits.writeErrorLog("StartFindFaceRecognition 查询失败！");
             return;
         }

         ////////////////////////////////// 【第二步：查询人员信息】 //////////////////////////////////////////
         int beginNum = 0;         // 查询起始序号，即偏移量
         int nFindMaxCount = 12;   // 每次查询的人员信息个数
         int nFindTimes = 0;       // 循环查询的次数
         int nFindTotalCount = 0;  // 查询的人员信息总个数

         /**
    	  *入参
    	  */
         NET_IN_DOFIND_FACERECONGNITION  doFindIn = new NET_IN_DOFIND_FACERECONGNITION();
         doFindIn.lFindHandle = startFindOut.lFindHandle;  // 查询句柄
         doFindIn.nCount      = nFindMaxCount;  	          // 当前想查询的记录条数

         /**
          * 出参
          */
         NET_OUT_DOFIND_FACERECONGNITION doFindOut = new NET_OUT_DOFIND_FACERECONGNITION(1024*1024*10);
         // 是否使用候选对象扩展结构体
         doFindOut.bUseCandidatesEx = true;

         // 每次查询个数是多少，就需要初始化多少个 pszFilePath， 最大20
         for(int i = 0; i < nFindMaxCount; i++) {
             doFindOut.stuCandidatesEx[i].stPersonInfo.szFacePicInfo[0].pszFilePath = new byte[256];
         }

         while(true) {
             doFindIn.nBeginNum   = beginNum;                    // 查询起始序号

             if(!INetSDK.DoFindFaceRecognition(doFindIn, doFindOut, 6000)) {
                ToolKits.writeErrorLog("DoFindFaceRecognition 查询失败！");
                break;
             }

             for(int i = 0; i < doFindOut.nCadidateExNum; i++) {
                 nFindTotalCount = i + nFindMaxCount * nFindTimes + 1;  // 序号从1开始
                 ToolKits.writeLog("--------------------------------- [" + nFindTotalCount + "] -----------------------------------");
                 ToolKits.writeLog("[" + nFindTotalCount + "]人脸库ID：" + new String(doFindOut.stuCandidatesEx[i].stPersonInfo.szGroupID).trim());
                 ToolKits.writeLog("[" + nFindTotalCount + "]人脸库名称：" + new String(doFindOut.stuCandidatesEx[i].stPersonInfo.szGroupName).trim());
                 ToolKits.writeLog("[" + nFindTotalCount + "]人员标识符：" + new String(doFindOut.stuCandidatesEx[i].stPersonInfo.szUID).trim());
                 ToolKits.writeLog("[" + nFindTotalCount + "]人员姓名：" + new String(doFindOut.stuCandidatesEx[i].stPersonInfo.szPersonName).trim());
                 ToolKits.writeLog("[" + nFindTotalCount + "]性别：" + getSex(doFindOut.stuCandidatesEx[i].stPersonInfo.bySex & 0xff));
                 ToolKits.writeLog("[" + nFindTotalCount + "]生日：" + ((int)doFindOut.stuCandidatesEx[i].stPersonInfo.wYear) + "-" +
                                                                        (doFindOut.stuCandidatesEx[i].stPersonInfo.byMonth & 0xff) + "-" +
                                                                        (doFindOut.stuCandidatesEx[i].stPersonInfo.byDay & 0xff));
                 ToolKits.writeLog("[" + nFindTotalCount + "]证件类型：" + getIDType(doFindOut.stuCandidatesEx[i].stPersonInfo.byIDType & 0xff));
                 ToolKits.writeLog("[" + nFindTotalCount + "]证件号：" + new String(doFindOut.stuCandidatesEx[i].stPersonInfo.szID).trim());
                 ToolKits.writeLog("[" + nFindTotalCount + "]图片地址：" + new String(doFindOut.stuCandidatesEx[i].stPersonInfo.szFacePicInfo[0].pszFilePath).trim());
                 ToolKits.writeLog(" ");
             }

             if(doFindOut.nCadidateExNum < nFindMaxCount) {
                 break;
             } else {
                 nFindTimes++;               // 查询次数+1
                 beginNum += nFindMaxCount;  // 查询偏移量增加
             }
         }

         ////////////////////////////////// 【第三步：关闭查询】 //////////////////////////////////////////
         // 查询结束，关闭查询
         INetSDK.StopFindFaceRecognition(startFindOut.lFindHandle);
     }

    /**
     * 下载图片，查询人员返回的是图片地址，如果需要查看图片，要用此下载接口
     * @param downloadPicPath  需要下载的图片路径
     */
    public static void downloadPicture(String downloadPicPath) {
        SDK_IN_DOWNLOAD_REMOTE_FILE stIn = new SDK_IN_DOWNLOAD_REMOTE_FILE();
        // 存放文件路径
        stIn.pszFileDst = "/mnt/sdcard/person.jpg";

        // 需要下载的文件名
        stIn.pszFileName = downloadPicPath;

        SDK_OUT_DOWNLOAD_REMOTE_FILE stOut = new SDK_OUT_DOWNLOAD_REMOTE_FILE();

        if (INetSDK.DownloadRemoteFile(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 4000)) {
            ToolKits.writeLog("下载成功！");
        }else {
            ToolKits.writeErrorLog("下载失败！");
        }
    }

    ///////////////////////////////////////////// 工具方法 //////////////////////////////////////////////

    /**
     * 性别
     * @param sex
     * @return
     */
    public static String getSex(int sex) {
        String msg = "未知";
        switch (sex) {
            case 0:
                msg = "未知";
                break;
            case 1:
                msg = "男";
                break;
            case 2:
                msg = "女";
                break;
            default:
                break;
        }
        return msg;
    }

    /**
     * 眼睛
     * @param eye
     * @return
     */
    public static String getEye(int eye) {
        String msg = "未知";
        switch (eye) {
            case 0:
                msg = "未知";
                break;
            case 1:
                msg = "未识别";
                break;
            case 2:
                msg = "闭眼";
                break;
            case 3:
                msg = "睁眼";
                break;
            default:
                msg = "未知";
                break;
        }
        return msg;
    }


    /**
     * 嘴巴
     * @param mouth
     * @return
     */
    public static String getMouth(int mouth) {
        String msg = "未知";
        switch (mouth) {
            case 0:
                msg = "未知";
                break;
            case 1:
                msg = "未识别";
                break;
            case 2:
                msg = "闭嘴";
                break;
            case 3:
                msg = "张嘴";
                break;
            default:
                msg = "未知";
                break;
        }
        return msg;
    }

    /**
     * 口罩
     * @param mask
     * @return
     */
    public static String getMask(int mask) {
        String msg = "未知";
        switch (mask) {
            case 0:
                msg = "未知";
                break;
            case 1:
                msg = "未识别";
                break;
            case 2:
                msg = "没戴口罩";
                break;
            case 3:
                msg = "戴口罩";
                break;
            default:
                msg = "未知";
                break;
        }
        return msg;
    }

    /**
     * 胡子
     * @param beard
     * @return
     */
    public static String getBeard(int beard) {
        String msg = "未知";
        switch (beard) {
            case 0:
                msg = "未知";
                break;
            case 1:
                msg = "未识别";
                break;
            case 2:
                msg = "没胡子";
                break;
            case 3:
                msg = "有胡子";
                break;
            default:
                msg = "未知";
                break;
        }
        return msg;
    }

    /**
     * 证件类型
     * @param idType
     * @return
     */
    public static String getIDType(int idType) {
        String msg = "未知";
        switch (idType) {
            case 0:
                msg = "未知";
                break;
            case 1:
                msg = "证件";
                break;
            case 2:
                msg = "护照";
                break;
            default:
                break;
        }
        return msg;
    }

    /**
     * 读取图片大小
     * @param filePath  图片路径
     * @return
     */
    public static long GetFileSize(String filePath) {
        File f = new File(filePath);
        if (f.exists() && f.isFile()) {
            return f.length();
        }
        else
        {
            return 0;
        }
    }
}

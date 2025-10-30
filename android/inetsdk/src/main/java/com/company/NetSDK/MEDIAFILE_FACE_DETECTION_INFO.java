package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE_DETECTION} corresponding target recognition service FINDNEXT search return parameter
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE_DETECTION} 对应的目标识别服务FINDNEXT查询返回参数
 * \endif
 */
public class MEDIAFILE_FACE_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel no.
     * \else
     * 通道号
     * \endif
     */
    public int ch;

    /**
     * \if ENGLISH_LANG
     * file path
     * \else
     * 文件路径
     * \endif
     */
    public byte szFilePath[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * file length
     * \else
     * 文件长度
     * \endif
     */
    public int size;

    /**
     * \if ENGLISH_LANG
     * start time
     * \else
     * 开始时间
     * \endif
     */
    public NET_TIME starttime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * end time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME endtime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * working directory no.
     * \else
     * 工作目录编号
     * \endif
     */
    public int nWorkDirSN;

    /**
     * \if ENGLISH_LANG
     * file type  1：jpg picture
     * \else
     * 文件类型  1：jpg图片
     * \endif
     */
    public byte nFileType;

    /**
     * \if ENGLISH_LANG
     * file positioning index
     * \else
     * 文件定位索引
     * \endif
     */
    public byte bHint;

    /**
     * \if ENGLISH_LANG
     * disk no.
     * \else
     * 磁盘号
     * \endif
     */
    public byte bDriveNo;

    /**
     * \if ENGLISH_LANG
     * picture type, 0-normal, 1-combined, 2-cut
     * \else
     * 图片类型, 0-普通, 1-合成, 2-抠图
     * \endif
     */
    public byte byPictureType;

    /**
     * \if ENGLISH_LANG
     * cluster no.
     * \else
     * 簇号
     * \endif
     */
    public int nCluster;

    /**
     * \if ENGLISH_LANG
     * picture type，see {@link EM_FACE_PIC_TYPE}
     * \else
     * 图片类型，详见 {@link EM_FACE_PIC_TYPE}
     * \endif
     */
    public int emPicType;

    /**
     * \if ENGLISH_LANG
     * object ID
     * \else
     * 物体ID
     * \endif
     */
    public int dwObjectId;

    /**
     * \if ENGLISH_LANG
     * frame no.,group has two elements，one means small picture，two means large picture
     * \else
     * 帧序号,数组有2个元素时，第一个表示小图，第二个表示大图
     * \endif
     */
    public int dwFrameSequence[] = new int[FinalVar.NET_MAX_FRAMESEQUENCE_NUM];

    /**
     * \if ENGLISH_LANG
     * frame no.quantity
     * \else
     * 帧序号个数
     * \endif
     */
    public int nFrameSequenceNum;

    /**
     * \if ENGLISH_LANG
     * time，group has two elements，one means small picture，two means large picture
     * \else
     * 发生时间，数组有2个元素时，第一个表示小图，第二个表示大图
     * \endif
     */
    public NET_TIME_EX stTimes[] = new NET_TIME_EX[FinalVar.NET_MAX_TIMESTAMP_NUM];

    public int nTimeStampNum;

    /**
     * \if ENGLISH_LANG
     * Picture number in the cluster
     * For packaged multiple images in the same cluster,provides indexed mode to position pictures
     * \else
     * 表示在簇中的图片序号
     * 对于同一个簇中打包多张图片,提供索引方式定位图片
     * \endif
     */
    public int nPicIndex;

    /**
     * \if ENGLISH_LANG
     * sex type,{@link EM_DEV_EVENT_FACEDETECT_SEX_TYPE}
     * \else
     * 性别类型,{@link EM_DEV_EVENT_FACEDETECT_SEX_TYPE}
     * \endif
     */
    public int emSex;

    /**
     * \if ENGLISH_LANG
     * age
     * \else
     * 年龄
     * \endif
     */
    public int nAge;

    /**
     * \if ENGLISH_LANG
     * human emotion,{@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \else
     * 目标表情,{@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \endif
     */
    public int emEmotion;

    /**
     * \if ENGLISH_LANG
     * wear glasses info,{@link EM_FACEDETECT_GLASSES_TYPE}
     * \else
     * 否戴眼镜,{@link EM_FACEDETECT_GLASSES_TYPE}
     * \endif
     */
    public int emGlasses;

    /**
     * \if ENGLISH_LANG
     * size of file extension, Support file length is greater than 4G,unit:Byte
     * \else
     * 文件长度扩展，支持文件长度大于4G，单位字节
     * \endif
     */
    public long sizeEx;

    /**
     * \if ENGLISH_LANG
     * mask type,{@link EM_MASK_STATE_TYPE}
     * \else
     * 是否带口罩,{@link EM_MASK_STATE_TYPE}
     * \endif
     */
    public int emMask;

    /**
     * \if ENGLISH_LANG
     * beard type,{@link EM_BEARD_STATE_TYPE}
     * \else
     * 是否有胡子,{@link EM_BEARD_STATE_TYPE}
     * \endif
     */
    public int emBeard;

    /**
     * \if ENGLISH_LANG
     * eye type,{@link EM_EYE_STATE_TYPE}
     * \else
     * 眼睛状态,{@link EM_EYE_STATE_TYPE}
     * \endif
     */
    public int emEye;

    /**
     * \if ENGLISH_LANG
     * mouth type,{@link EM_MOUTH_STATE_TYPE}
     * \else
     * 嘴巴状态,{@link EM_MOUTH_STATE_TYPE}
     * \endif
     */
    public int emMouth;

    /**
     * \if ENGLISH_LANG
     * attractive
     * \else
     * 魅力值
     * \endif
     */
    public int nAttractive;

    /**
     * \if ENGLISH_LANG
     * 0-unknown;1-Stranger mode unable;2-Stranger mode enable
     * \else
     * 0-未知；1-未开启陌生人模式；2-开启了陌生人模式
     * \endif
     */
    public int nIsStranger;

    /**
     * \if ENGLISH_LANG
     * if emPicType is NET_FACEPIC_TYPE_GLOBAL_SENCE, means Target file's path
     * \else
     * 当 emPicType 为 NET_FACEPIC_TYPE_GLOBAL_SENCE 时, 代表目标小图路径
     * \endif
     */
    public byte szFaceObjectUrl[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * euler angle of Target in the capture picture, nPitch:pitch of the head, nYaw: yaw of the head, nRoll:roll of the head
     * \else
     * 目标在抓拍图片中的角度信息, nPitch:抬头低头的俯仰角, nYaw左右转头的偏航角, nRoll头在平面内左偏右偏的翻滚角
     * \endif
     */
    public NET_EULER_ANGLE stuFaceCaptureAngle = new NET_EULER_ANGLE();

    /**
     * \if ENGLISH_LANG
     * quality about capture picture
     * \else
     * 目标抓拍质量分数
     * \endif
     */
    public int nFaceQuality;

    /**
     * \if ENGLISH_LANG
     * Scene image
     * \else
     * 大图信息
     * \endif
     */
    public NET_FACEDETECT_IMAGE_INFO stuSceneImage = new NET_FACEDETECT_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Center of Target(not center of bounding box), 0-8191 relative coordinates, relative to small graph
     * \else
     * 目标型心(不是包围盒中心), 0-8191相对坐标, 相对于小图
     * \endif
     */
    public NET_POINT stuFaceCenter = new NET_POINT();

    /**
     * \if ENGLISH_LANG
     * TRUE means only stuStartTimeRealUTC and stuEndTimeRealUTC are valid (only stuStartTimeRealUTC and stuEndTimeRealUTC are used), FALSE means only starttime and endtime are valid (only starttime and endtime are used)
     * \else
     * 为TRUE表示仅stuStartTimeRealUTC和stuEndTimeRealUTC有效(仅使用stuStartTimeRealUTC和stuEndTimeRealUTC), 为FALSE表示仅starttime和endtime有效(仅使用starttime和endtime)
     * \endif
     */
    public boolean bRealUTC;

    /**
     * \if ENGLISH_LANG
     * UTC start time (standard UTC time), paired with stuEndTimeRealUTC
     * \else
     * UTC开始时间(标准UTC时间), 与stuEndTimeRealUTC配对使用
     * \endif
     */
    public NET_TIME stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * UTC end time (standard UTC time), paired with stuStartTimeRealUTC
     * \else
     * UTC结束时间(标准UTC时间), 与stuStartTimeRealUTC配对使用
     * \endif
     */
    public NET_TIME stuEndTimeRealUTC = new NET_TIME();

    public MEDIAFILE_FACE_DETECTION_INFO() {
        for (int i = 0; i < FinalVar.NET_MAX_TIMESTAMP_NUM; i++) {
            stTimes[i] = new NET_TIME_EX();
        }
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * corresponding facial recognition service {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE} FINDNEXT search returned parameter
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE} 对应的目标识别服务FINDNEXT查询返回参数
 * \endif
 */
public class MEDIAFILE_FACERECOGNITION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The existence panorama
     * \else
     * 全景图是否存在
     * \endif
     */
    public boolean bGlobalScenePic;

    /**
     * \if ENGLISH_LANG
     * Panoramic image file path
     * \else
     * 全景图片文件路径
     * \endif
     */
    public SDK_PIC_INFO_EX stGlobalScenePic = new SDK_PIC_INFO_EX();

    /**
     * \if ENGLISH_LANG
     * the target face object information
     * \else
     * 物体信息
     * \endif
     */
    public SDK_MSG_OBJECT stuObject = new SDK_MSG_OBJECT();

    /**
     * \if ENGLISH_LANG
     * the target face file path
     * \else
     * 文件路径
     * \endif
     */
    public SDK_PIC_INFO_EX stObjectPic = new SDK_PIC_INFO_EX();

    /**
     * \if ENGLISH_LANG
     * Target Matching the current number of candidates
     * \else
     * 当前目标匹配到的候选对象数量
     * \endif
     */
    public int nCandidateNum;

    /**
     * \if ENGLISH_LANG
     * Target candidates to match this informatio
     * \else
     * 当前目标匹配到的候选对象信息
     * \endif
     */
    public CANDIDATE_INFO stuCandidates[] = new CANDIDATE_INFO[FinalVar.SDK_MAX_CANDIDATE_NUM];

    /**
     * \if ENGLISH_LANG
     * The current face matching candidates to the image file path
     * \else
     * 当前目标匹配到的候选对象图片文件路径
     * \endif
     */
    public NET_CANDIDAT_PIC_PATHS stuCandidatesPic[] = new NET_CANDIDAT_PIC_PATHS[FinalVar.SDK_MAX_CANDIDATE_NUM];

    /**
     * \if ENGLISH_LANG
     * time for an alarm
     * \else
     * 报警发生时间
     * \endif
     */
    public NET_TIME stTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Place for an alarm
     * \else
     * 报警发生地点
     * \endif
     */
    public byte szAddress[] = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * channel no.
     * \else
     * 通道号
     * \endif
     */
    public int nChannelId;

    /**
     * \if ENGLISH_LANG
     * whether or not to use stuCandidatesEx
     * stuCandidatesEx is effective and stuCandidates is invalid when the bUseCandidatesEx is TRUE, otherwise, on the contrary
     * \else
     * 是否使用候选对象扩展结构体,若为TRUE, 则表示使用stuCandidatesEx, 且stuCandidates无效, 否则相反
     * \endif
     */
    public boolean bUseCandidatesEx;

    /**
     * \if ENGLISH_LANG
     * the actual return number of stuCandidatesEx
     * \else
     * 当前目标匹配到的候选对象(扩展结构体) 数量
     * \endif
     */
    public int nCandidateExNum;

    /**
     * \if ENGLISH_LANG
     * the expansion of candidate information
     * \else
     * 当前目标匹配到的候选对象信息, 实际返回个数同nCandidateNum
     * \endif
     */
    public CANDIDATE_INFOEX stuCandidatesEx[] = new CANDIDATE_INFOEX[FinalVar.SDK_MAX_CANDIDATE_NUM];

    /**
     * \if ENGLISH_LANG
     * Target info object
     * \else
     * 目标目标信息
     * \endif
     */
    public FACE_INFO_OBJECT stuFaceInfoObject = new FACE_INFO_OBJECT();

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
     * Media file general Information
     * \else
     * 通用信息
     * \endif
     */
    public NET_MEDIAFILE_GENERAL_INFO stuGeneralInfo = new NET_MEDIAFILE_GENERAL_INFO();

    /**
     * \if ENGLISH_LANG
     * Database record number
     * \else
     * 数据库记录号
     * \endif
     */
    public int nRecNo;

    /**
     * \if ENGLISH_LANG
     * TRUE means only stuStartTimeRealUTC and stuEndTimeRealUTC are valid (only stuStartTimeRealUTC and stuEndTimeRealUTC are used), FALSE means stuStartTimeRealUTC and stuEndTimeRealUTC are invalid
     * \else
     * 为TRUE表示仅stuStartTimeRealUTC和stuEndTimeRealUTC有效(仅使用stuStartTimeRealUTC和stuEndTimeRealUTC), 为FALSE表示stuStartTimeRealUTC和stuEndTimeRealUTC无效
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

    public MEDIAFILE_FACERECOGNITION_INFO() {
        for (int i = 0; i < FinalVar.SDK_MAX_CANDIDATE_NUM; i++) {
            stuCandidates[i] = new CANDIDATE_INFO();
            stuCandidatesPic[i] = new NET_CANDIDAT_PIC_PATHS();
            stuCandidatesEx[i] = new CANDIDATE_INFOEX();
        }
    }
}

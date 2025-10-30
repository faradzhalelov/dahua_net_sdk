package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * staff group info
 * \else
 * 人员组信息
 * \endif
 */
public class NET_FACERECONGNITION_GROUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * staff group type ,  see  {@link EM_FACE_DB_TYPE}
     * \else
     * 人员组类型,详见 {@link EM_FACE_DB_TYPE}
     * \endif
     */
    public int                  emFaceDBType;

    /**
     * \if ENGLISH_LANG
     * staff group ID, SN(cannot modify, invalid when adding operation)
     * \else
     * 人员组ID,唯一标识一组人员(不可修改,添加操作时无效)
     * \endif
     */
    public byte                szGroupId[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * staff operation name
     * \else
     * 人员组名称
     * \endif
     */
    public byte                szGroupName[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * staff group note info
     * \else
     * 人员组备注信息
     * \endif
     */
    public byte                szGroupRemarks[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * current group staff number
     * \else
     * 当前组内人员数
     * \endif
     */
    public int                 nGroupSize;

    /**
     * \if ENGLISH_LANG
     * rect similarity count
     * \else
     * 实际返回的库相似度阈值个数
     * \endif
     */
    public int					nRetSimilarityCount;

    /**
     * \if ENGLISH_LANG
     * library similarity threshold
     * \else
     * 库相似度阈值，目标比对高于阈值认为匹配成功
     * \endif
     */
    public int					nSimilarity[] = new int[FinalVar.MAX_SIMILARITY_COUNT];

    /**
     * \if ENGLISH_LANG
     * rect channel count
     * \else
     * 实际返回的通道号个数
     * \endif
     */
    public int					nRetChnCount;

    /**
     * \if ENGLISH_LANG
     * the list of channels
     * \else
     * 当前组绑定到的视频通道号列表
     * \endif
     */
    public int					nChannel[] = new int[FinalVar.SDK_MAX_CAMERA_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 目标组建模状态信息
     * [0]-准备建模的人员数量，不保证一定建模成功
     * [1]-建模失败的人员数量，图片不符合算法要求，需要更换图片
     * [2]-已建模成功人员数量，数据可用于算法进行目标识别
     * [3]-曾经建模成功，但因算法升级变得不可用的数量，重新建模就可用
     * \endif
     */
    public int[]			   nFeatureState = new int[FinalVar.MAX_FEATURESTATE_NUM];
}

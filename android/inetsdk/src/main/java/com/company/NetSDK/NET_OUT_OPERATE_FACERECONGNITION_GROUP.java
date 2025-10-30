package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateFaceRecognitionGroup} output parameter
 * \else
 * {@link INetSDK#OperateFaceRecognitionGroup}接口输出参数
 * \endif
 */
public class NET_OUT_OPERATE_FACERECONGNITION_GROUP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 新增记录的人员组ID,唯一标识一组人员
     * \else
     * {@link INetSDK#OperateFaceRecognitionGroup}接口输出参数
     * \endif
     */
    public byte[]        szGroupId = new byte[FinalVar.SDK_COMMON_STRING_64];
}

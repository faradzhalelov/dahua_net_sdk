package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateFaceRecognitionDB} output parameter
 * \else
 * {@link INetSDK#OperateFaceRecognitionDB} 接口输出参数
 * \endif
 */
public class NET_OUT_OPERATE_FACERECONGNITIONDB implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Person unique mark. it is effective when emOperateType is {@link EM_OPERATE_FACERECONGNITIONDB_TYPE#NET_FACERECONGNITIONDB_ADD}
     * \else
     * 人员唯一标识符, 只有在操作类型emOperateType 为 {@link EM_OPERATE_FACERECONGNITIONDB_TYPE#NET_FACERECONGNITIONDB_ADD}时有效
     * \endif
     */
    public byte[]				szUID = new byte[FinalVar.SDK_MAX_PERSON_ID_LEN];
}

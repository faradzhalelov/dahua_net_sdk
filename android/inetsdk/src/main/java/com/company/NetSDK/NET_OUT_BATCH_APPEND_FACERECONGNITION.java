package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * output param of CLIENT_BatchAppendFaceRecognition
 * \else
 * CLIENT_BatchAppendFaceRecognition 接口输出参数
 * \endif
 */
public class NET_OUT_BATCH_APPEND_FACERECONGNITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  number of result,it is set by user. The value is same with the nPersonNum in ET_IN_MULTI_APPEND_FACERECONGNITION
     * \else
     *  批量添加结果个数，由用户指定，数值与NET_IN_BATCH_APPEND_FACERECONGNITION中的nPersonNum一致
     * \endif
     */
    public int					nResultNum;

    /**
     * \if ENGLISH_LANG
     *  result of batch append persons
     * \else
     *  批量添加结果信息
     * \endif
     */
    public NET_BATCH_APPEND_PERSON_RESULT[]					pstResultInfo;

    /**
     * \if ENGLISH_LANG
     *  Specify the UID field in NET_BATCH_APPEND_PERSON_RESULT. If this field does not exist or the value is 0, the UID field will be used. If the value is 1, the UID2 field will be used.
     * \else
     *  指定NET_BATCH_APPEND_PERSON_RESULT中的UID使用字段，不存在本字段或值为0则使用UID字段，若值为1则使用UID2字段
     * \endif
     */
    public int					nUIDType;

    public NET_OUT_BATCH_APPEND_FACERECONGNITION(int nResultNum) {
        this.nResultNum = nResultNum;
        this.pstResultInfo = new NET_BATCH_APPEND_PERSON_RESULT[nResultNum];

        for(int i = 0; i < nResultNum; i ++){
            this.pstResultInfo[i] = new NET_BATCH_APPEND_PERSON_RESULT();
        }
    }
}

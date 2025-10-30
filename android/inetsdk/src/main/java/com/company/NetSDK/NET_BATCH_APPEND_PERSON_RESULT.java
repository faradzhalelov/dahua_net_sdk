package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * result of batch append persons
 * \else
 * 批量添加人员结果信息
 * \endif
 */
public class NET_BATCH_APPEND_PERSON_RESULT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  UID
     * \else
     *  人员UID
     * \endif
     */
    public int					nUID;

    /**
     * \if ENGLISH_LANG
     *  error code
     * \else
     *  错误码信息
     * \endif
     */
    public int					dwErrorCode;

    /**
     * \if ENGLISH_LANG
     *  Add personnel UID, specify UID field according to UIDType
     * \else
     *  添加人员UID, 根据UIDType指定UID使用字段
     * \endif
     */
    public byte					szUID2[] = new byte[64];

}

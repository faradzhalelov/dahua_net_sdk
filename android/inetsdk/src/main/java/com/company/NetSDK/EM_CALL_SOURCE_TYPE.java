package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Call source type
 * \else
 * 呼叫源对象类型
 * \endif
 */
public class EM_CALL_SOURCE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_CALL_SOURCE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * VT or SIP
     * \else
     * VT或SIP
     * \endif
     */
    public static final int EM_CALL_SOURCE_TYPE_VT_OR_SIP = 1;

    /**
     * \if ENGLISH_LANG
     * Generation 2
     * \else
     * 二代
     * \endif
     */
    public static final int EM_CALL_SOURCE_TYPE_GEN2 = 2;

    /**
     * \if ENGLISH_LANG
     * Third party
     * \else
     * 第三方
     * \endif
     */
    public static final int EM_CALL_SOURCE_TYPE_THIRD_PARTY = 3;
}

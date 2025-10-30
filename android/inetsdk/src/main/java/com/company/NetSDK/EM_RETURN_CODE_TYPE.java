package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Return Code Type
 * \else
 * 返回结果
 * \endif
 */
public class EM_RETURN_CODE_TYPE implements Serializable {
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
    public static final int EM_RETURN_CODE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Success
     * \else
     * 返回成功
     * \endif
     */
    public static final int EM_RETURN_CODE_TYPE_OK = 1;

    /**
     * \if ENGLISH_LANG
     * Failed
     * \else
     * 返回失败
     * \endif
     */
    public static final int EM_RETURN_CODE_TYPE_FAILED = 2;

    /**
     * \if ENGLISH_LANG
     * Timeout
     * \else
     * 返回超时
     * \endif
     */
    public static final int EM_RETURN_CODE_TYPE_TIMEOUT = 3;
}

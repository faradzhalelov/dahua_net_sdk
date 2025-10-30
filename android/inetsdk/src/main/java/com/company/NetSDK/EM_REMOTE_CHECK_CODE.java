package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief remote check code
 * \else
 * @brief 远程权限验证结果
 * \endif
 */
public class EM_REMOTE_CHECK_CODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_REMOTE_CHECK_CODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  success
     * \else
     *  成功
     * \endif
     */
    public static final int					EM_REMOTE_CHECK_CODE_SUCCESS = 0;

    /**
     * \if ENGLISH_LANG
     *  fail
     * \else
     *  失败
     * \endif
     */
    public static final int					EM_REMOTE_CHECK_CODE_FAIL = 1;

}
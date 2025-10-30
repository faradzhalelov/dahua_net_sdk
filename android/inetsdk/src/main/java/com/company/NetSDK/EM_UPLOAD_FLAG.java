package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Upload flag
 * \else
 * @brief 上传标识
 * \endif
 */
public class EM_UPLOAD_FLAG implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_UPLOAD_FLAG_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Succeed
     * \else
     *  成功
     * \endif
     */
    public static final int					EM_UPLOAD_FLAG_SUCCEED = 1;

    /**
     * \if ENGLISH_LANG
     *  Failed
     * \else
     *  失败
     * \endif
     */
    public static final int					EM_UPLOAD_FLAG_FAILED = 2;

}
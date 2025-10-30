package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TLS policy
 * \else
 * TLS加密策略
 * \endif
 */
public class EM_TLS_ENCRYPTION_POLICY implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * self-adaption
     * \else
     * 自适应TLS加密方式，优先使用TLS加密，否则不加密
     * \endif
     */
    public static final int EM_TLS_ENCRYPTION_SELFADAPTION = 0;

    /**
     * \if ENGLISH_LANG
     * use TLS, encrypt signaling and video
     * \else
     * 强制使用TLS加密, 信令和视频数据都加密
     * \endif
     */
    public static final int EM_TLS_ENCRYPTION_COMPULSIVE = 1;

    /**
     * \if ENGLISH_LANG
     * not use TLS
     * \else
     * 不采用TLS加密, 信令和视频数据都不加密
     * \endif
     */
    public static final int EM_TLS_ENCRYPTION_NOTLS = 2;

    /**
     * \if ENGLISH_LANG
     * only encrypt signaling
     * \else
     * 只信令加密, 视频数据不加密
     * \endif
     */
    public static final int EM_TLS_ENCRYPTION_SIGNAL_TLS = 3;
}

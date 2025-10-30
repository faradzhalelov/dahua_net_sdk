package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * APK install status
 * \else
 * APK安装状态
 * \endif
 */
public class EM_NAS_APK_INSTALL_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_NAS_APK_INSTALL_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * failed
     * \else
     * 失败
     * \endif
     */
    public static final int EM_NAS_APK_INSTALL_STATUS_FAILED = 1;

    /**
     * \if ENGLISH_LANG
     * succeed
     * \else
     * 成功
     * \endif
     */
    public static final int EM_NAS_APK_INSTALL_STATUS_SUCCEED = 2;

    /**
     * \if ENGLISH_LANG
     * installing
     * \else
     * 安装中
     * \endif
     */
    public static final int EM_NAS_APK_INSTALL_STATUS_INSTALLING = 3;
}

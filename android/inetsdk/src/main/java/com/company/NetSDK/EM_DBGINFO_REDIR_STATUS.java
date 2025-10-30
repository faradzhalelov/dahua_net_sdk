package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Debug info redirect status
 * \else
 * 重定向状态
 * \endif
 */
public class EM_DBGINFO_REDIR_STATUS implements Serializable {
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
    public static final  int EM_DBGINFO_REDIR_STATUS_UNKNOWN = 0;
    /**
     * \if ENGLISH_LANG
     * No State
     * \else
     * 未重定向
     * \endif
     */
    public static final  int EM_DBGINFO_REDIR_STATUS_NO = 1;

    /**
     * \if ENGLISH_LANG
     * Local State
     * \else
     * 重定向到本地
     * \endif
     */
    public static final  int EM_DBGINFO_REDIR_STATUS_LOCAL = 2;

    /**
     * \if ENGLISH_LANG
     * Callback State
     * \else
     * 重定向到回调
     * \endif
     */
    public static final  int EM_DBGINFO_REDIR_STATUS_CALLBACK = 3;

}

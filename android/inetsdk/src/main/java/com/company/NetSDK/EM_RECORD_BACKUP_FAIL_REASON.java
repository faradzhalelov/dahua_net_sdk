package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The reason for the failure
 * \else
 * @brief 失败的原因
 * \endif
 */
public class EM_RECORD_BACKUP_FAIL_REASON implements Serializable {
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
    public static final int					EM_RECORD_BACKUP_FAIL_REASON_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     *  Login Fail
     * \else
     *  登入失败
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FAIL_REASON_LOGIN_FAIL = 1;

    /**
     * \if ENGLISH_LANG
     *  No recording found
     * \else
     *  没有查询到录像
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FAIL_REASON_NO_FILES = 2;

    /**
     * \if ENGLISH_LANG
     *  The network is disconnected during the download process
     * \else
     *  下载过程中网络断开
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FAIL_REASON_DOWNLOAD_NET_ERROR = 3;

    /**
     * \if ENGLISH_LANG
     *  Unknown Error
     * \else
     *  未知错误
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FAIL_REASON_UNKNOW_ERROR = 4;

}

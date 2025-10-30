package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Protocol type of FTP server
 * \else
 * @brief FTP服务协议类型
 * \endif
 */
public class EM_FTP_PROTOCOL_TYPE implements Serializable {
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
    public static final int					EM_FTP_PROTOCOL_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  ftps
     * \else
     *  ftps
     * \endif
     */
    public static final int					EM_FTP_PROTOCOL_TYPE_FTPS = 0;

}
package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input param of CLIENT_SendFtpUploadServerInfo
 * \else
 * @brief CLIENT_SendFtpUploadServerInfo 接口输入参数
 * \endif
 */
public class NET_IN_SEND_FTP_UPLOAD_SERVER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Count of FTP servers
     * \else
     *  FTP 服务个数
     * \endif
     */
    public int					nFtpServerNum;

    /**
     * \if ENGLISH_LANG
     *  FTP server info
     * \else
     *  FTP 服务信息
     * \endif
     */
    public NET_FTP_SERVER_INFO					stuFtpServerInfo[] = new NET_FTP_SERVER_INFO[4];

    public NET_IN_SEND_FTP_UPLOAD_SERVER_INFO(){
        for(int i = 0; i < 4; ++i) {
            this.stuFtpServerInfo[i] = new NET_FTP_SERVER_INFO();
        }
    }
}
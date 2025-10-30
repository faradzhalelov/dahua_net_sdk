package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief FTP server info
 * \else
 * @brief FTP服务信息
 * \endif
 */
public class NET_FTP_SERVER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  IP address
     * \else
     *  IP地址
     * \endif
     */
    public byte					szIP[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  User name
     * \else
     *  用户名
     * \endif
     */
    public byte					szUserName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Password
     * \else
     *  密码
     * \endif
     */
    public byte					szPassword[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Port
     * \else
     *  端口号
     * \endif
     */
    public int					nPort;

    /**
     * \if ENGLISH_LANG
     *  Protocol type of FTP server,refer to {@Link EM_FTP_PROTOCOL_TYPE}
     * \else
     *  FTP服务协议类型，,参考 {@Link EM_FTP_PROTOCOL_TYPE}
     * \endif
     */
    public int					emFtpProtocolType;

    /**
     * \if ENGLISH_LANG
     *  Time out of connect, unit : Millisecond
     * \else
     *  连接超时时间, 单位: 毫秒
     * \endif
     */
    public int					nTimeOut;

    /**
     * \if ENGLISH_LANG
     *  Root directory for storing video
     * \else
     *  存放视频的根目录
     * \endif
     */
    public byte					szDirectory[] = new byte[128];

}
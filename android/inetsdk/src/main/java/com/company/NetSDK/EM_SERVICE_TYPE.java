package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief UPnP service type
 * \else
 * @brief UPnP服务类型
 * \endif
 */
public class EM_SERVICE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown service
     * \else
     *  未知服务
     * \endif
     */
    public static final int					EM_SERVICE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  web service
     * \else
     *  WEB服务
     * \endif
     */
    public static final int					EM_SERVICE_WEB = 0;

    /**
     * \if ENGLISH_LANG
     *  private protocol service
     * \else
     *  私有协议服务
     * \endif
     */
    public static final int					EM_SERVICE_PRIV = 1;

    /**
     * \if ENGLISH_LANG
     *  RTSP service
     * \else
     *  RTSP服务
     * \endif
     */
    public static final int					EM_SERVICE_RTSP = 2;

    /**
     * \if ENGLISH_LANG
     *  HTTPS service
     * \else
     *  HTTPS服务
     * \endif
     */
    public static final int					EM_SERVICE_HTTPS = 3;

    /**
     * \if ENGLISH_LANG
     *  SNMP service
     * \else
     *  SNMP服务
     * \endif
     */
    public static final int					EM_SERVICE_SNMP = 4;

}

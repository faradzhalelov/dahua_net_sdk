package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Net applications, operation type
 * \else
 * 网络应用组件 操作类型
 * \endif
 */
public class EM_RPC_NETAPP_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  get statistics of net resource, pstuIn: NET_IN_NETAPP_GET_NET_RESOURCE_STAT*, pstuOut: NET_OUT_NETAPP_GET_NET_RESOURCE_STAT*
     * \else
     *  获得网络资源统计, pstuIn 对应 NET_IN_NETAPP_GET_NET_RESOURCE_STAT*,pstuOut对应 NET_OUT_NETAPP_GET_NET_RESOURCE_STAT*
     * \endif
     */
    public static final int					EM_RPC_NETAPP_TYPE_GET_NET_RESOURCE_STAT = 0;

    /**
     * \if ENGLISH_LANG
     *  get the signal strength of the 3G network, pstuIn: NET_IN_NETAPP_GET_MOBILE_RSSI*, pstuOut : NET_OUT_NETAPP_GET_MOBILE_RSSI*
     * \else
     *  获取3G网络的信号强度, pstuIn 对应 NET_IN_NETAPP_GET_MOBILE_RSSI*, pstuOut 对应 NET_OUT_NETAPP_GET_MOBILE_RSSI*
     * \endif
     */
    public static final int					EM_RPC_NETAPP_TYPE_GET_MOBILE_RSSI = 1;

    /**
     * \if ENGLISH_LANG
     *  get moblie interface, pstuIn: NET_IN_NETAPP_GET_MOBILE_INTERFACE*, pstuOut: NET_OUT_NETAPP_GET_MOBILE_INTERFACE*
     * \else
     *  获取所有移动网络接口, pstuIn 对应 NET_IN_NETAPP_GET_MOBILE_INTERFACE*,pstuOut对应 NET_OUT_NETAPP_GET_MOBILE_INTERFACE*
     * \endif
     */
    public static final int					EM_PRC_NETAPP_TYPE_GET_MOBILE_INTERFACE = 2;

    /**
     * \if ENGLISH_LANG
     *  get dail info, pstuIn: NET_IN_NETAPP_GET_DIAL_INFO*, pstuOut: NET_OUT_NETAPP_GET_DIAL_INFO*
     * \else
     *  获取拨号信息, pstuIn 对应 NET_IN_NETAPP_GET_DIAL_INFO*,pstuOut对应 NET_OUT_NETAPP_GET_DIAL_INFO*
     * \endif
     */
    public static final int					EM_PRC_NETAPP_TYPE_GET_DIAL_INFO = 3;

    /**
     * \if ENGLISH_LANG
     *  Obtain the connected AP hotspot signal strength pstuIn : NET_IN_NETAPP_GET_DEVAP_INFO*,pstuOut: NET_OUT_NETAPP_GET_DEVAP_INFO*
     * \else
     *  获取已连接的AP热点信号强度 pstuIn 对应 NET_IN_NETAPP_GET_DEVAP_INFO*,pstuOut对应 NET_OUT_NETAPP_GET_DEVAP_INFO*
     * \endif
     */
    public static final int					EM_RPC_NETAPP_TYPE_GET_DEVAP_INFO = 4;

}
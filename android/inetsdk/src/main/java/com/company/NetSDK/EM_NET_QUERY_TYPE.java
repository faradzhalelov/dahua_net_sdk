package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of Card information
 * \else
 * 网卡信息类型
 * \endif
 */
public class EM_NET_QUERY_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Statistics for protocol stack	{@link INetSDK#QueryNetStat}:(pstuInParam: {@link NET_IN_NETAPP_NET_DATA_STAT}    pstuOutParam: {@link NET_OUT_NETAPP_NET_DATA_STAT} )
     * \else
     * 获取协议栈统计数据，此时{@link INetSDK#QueryNetStat}接口中的pstuInParam类型为 {@link NET_IN_NETAPP_NET_DATA_STAT}， pstuOutParam类型为 {@link NET_OUT_NETAPP_NET_DATA_STAT}
     * \endif
     */
    public static final int NET_APP_DATA_STAT = 0;

    /**
     * \if ENGLISH_LANG
     * Access to physical link state	{@link INetSDK#QueryNetStat}:(pstuInParam: {@link NET_IN_NETAPP_LINK_STATUS}  pstuOutParam: {@link NET_OUT_NETAPP_LINK_STATUS} )
     * \else
     * 获取物理链路状态，此时{@link INetSDK#QueryNetStat}接口中的pstuInParam类型为{@link NET_IN_NETAPP_LINK_STATUS}， pstuOutParam类型为{@link NET_OUT_NETAPP_LINK_STATUS}
     * \endif
     */
    public static final int NET_APP_LINK_STAT = 1;
}

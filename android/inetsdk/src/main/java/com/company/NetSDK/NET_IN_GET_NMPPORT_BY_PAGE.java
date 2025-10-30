package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetNMPPortInfoByPage} input param
 * \else
 * {@link INetSDK#GetNMPPortInfoByPage} 输入参数
 * \endif
 */
public class NET_IN_GET_NMPPORT_BY_PAGE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Starting port offset of port information list
     * \else
     * 端口信息列表的起始端口偏移量
     * \endif
     */
    public int  nOffset;

    /**
     * \if ENGLISH_LANG
     * Number of ports to be obtained this time, If 0, the total number of ports is returned, but there is no port specific information
     * \else
     * 本次需要获取的端口数量, 若为0, 则返回端口总数量, 但没有端口的具体信息
     * \endif
     */
    public int  nPortNum;
}

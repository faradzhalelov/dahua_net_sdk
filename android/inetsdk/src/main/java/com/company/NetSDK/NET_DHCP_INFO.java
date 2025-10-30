package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DHCP INFO
 * \else
 * DHCP 配置
 * \endif
 */
public class NET_DHCP_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * start IP
	 * \else
	 * 分配的起始IP
	 * \endif
	 */
    public byte[]                    szStartIP = new byte[FinalVar.NET_IPADDRSTR_LEN];       
    
	/**
	 * \if ENGLISH_LANG
	 * stop IP
	 * \else
	 * 分配的结束IP
	 * \endif
	 */
    public byte[]                    szStopIP = new byte[FinalVar.NET_IPADDRSTR_LEN];        
    
	/**
	 * \if ENGLISH_LANG
	 * Renewal time unit:minute
	 * \else
	 * 续租时间 单位: 分钟
	 * \endif
	 */
    public int                       nLeaseTime;                         
}

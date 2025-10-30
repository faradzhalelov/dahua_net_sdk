package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network of one WLAN
 * \else
 * 单个WLAN配置Network
 * \endif
 */
public class CFG_WLAN_NETWORK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte                    szIPAddress[] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];        
	
	/**
	 * \if ENGLISH_LANG
	 * subnet mask
	 * \else
	 * 子网掩码
	 * \endif
	 */
	public byte                    szSubnetMask[] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];       
	
	/**
	 * \if ENGLISH_LANG
	 * gateway
	 * \else
	 * 网关
	 * \endif
	 */
	public byte                    szDefaultGateway[] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];   
	
	/**
	 * \if ENGLISH_LANG
	 * DHCP enable
	 * \else
	 * 是否开启DHCP
	 * \endif
	 */
	public boolean                    bDhcpEnable;                              
	
	/**
	 * \if ENGLISH_LANG
	 * DNS servers
	 * \else
	 * DNS服务器
	 * \endif
	 */
    public byte                    szDnsServers[][] = new byte[2][FinalVar.AV_CFG_IP_Address_Len_EX];    
}

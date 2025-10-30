package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DNS server setup 
 * \else
 * DNS服务器配置
 * \endif
 */
public class SDKDEV_DNS_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Primary IP
	 * \else
	 * 主IP地址
	 * \endif
	 */
	public byte                szPrimaryIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Secondary IP 
	 * \else
	 * 次IP地址
	 * \endif
	 */
	public byte                szSecondaryIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to interface {@link INetSDK#SearchDevicesByIPs}
 * \else
 * 对应接口 {@link INetSDK#SearchDevicesByIPs}
 * \endif
 */
public class DEVICE_IP_SEARCH_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The IPs number for search
	 * \else
	 * 当前搜索的IP个数
	 * \endif
	 */
	public int                 nIpNum;
	
	/**
	 * \if ENGLISH_LANG
	 * The IPs for search
	 * \else
	 * 具体待搜索的IP信息
	 * \endif
	 */
	public byte                szIP[][] = new byte[FinalVar.SDK_MAX_SAERCH_IP_NUM][64];  
}

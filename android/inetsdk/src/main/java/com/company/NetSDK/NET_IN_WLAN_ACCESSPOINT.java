package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_WLAN_ACCESSPOINT}
 * \else
 * 入参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_WLAN_ACCESSPOINT}
 * \endif
 */
public class NET_IN_WLAN_ACCESSPOINT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * \if ENGLISH_LANG
	 * SSID of wireless network whose info you want to query. if null, query all wireless network  
	 * \else
	 * 需要获取信息的无线网络名称，为空时搜索所有网络。
	 * \endif
	 */
	public      byte[]          szSSID        =     new byte[FinalVar.SDK_MAX_SSID_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Network Name, default is eth2
	 * \else
	 * 网卡名称, 为空时, 默认为eth2
	 * \endif
	 */
	public      byte[]	 		 szName	        =     new byte[FinalVar.MAX_COMMON_STRING_32];
}

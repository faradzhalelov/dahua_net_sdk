package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_WLAN_ACCESSPOINT}
 * \else
 * 出参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_WLAN_ACCESSPOINT}
 * \endif
 */
public class NET_OUT_WLAN_ACCESSPOINT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * wireless network count
	 * \else
	 * 无线网络接入点个数
	 * \endif
	 */
	public       int          nCount;
	
	/**
	 * \if ENGLISH_LANG
	 * info for each network   
	 * \else
	 * 接入点信息
	 * \endif
	 */
	public       NET_WLAN_ACCESSPOINT_INFO[]     stuInfo     =    new NET_WLAN_ACCESSPOINT_INFO[128];

	public NET_OUT_WLAN_ACCESSPOINT(){
		for(int i = 0; i < 128; i++){
			stuInfo[i] = new NET_WLAN_ACCESSPOINT_INFO();
		}
	}
}










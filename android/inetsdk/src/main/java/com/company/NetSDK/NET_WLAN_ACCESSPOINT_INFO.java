package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless network information
 * \else
 * 无线网络接入点信息
 * \endif
 */
public class NET_WLAN_ACCESSPOINT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * SSID (name of wireless network)
	 * \else
	 * 无线网络名称
	 * \endif
	 */
	public           byte[]         szSSID       =  new byte[FinalVar.SDK_MAX_SSID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * signal strength, range: 0-100
	 * \else
	 * 信号强度，范围0-100
	 * \endif
	 */
	public           int            nStrength;
	
	/**
	 * \if ENGLISH_LANG
	 *  authentication mode
	 * 0-OPEN;
	 * 1-SHARED;
	 * 2-WPA;
	 * 3-WPA-PSK;
	 * 4-WPA2;
	 * 5-WPA2-PSK;
	 * 6:WPA-NONE
	 * 7-WPA-PSK/WPA2-PSK;
	 * 8:WPA/WPA2;
	 * \else
	 * 认证模式
	 * 0-OPEN;
	 * 1-SHARED;
	 * 2-WPA;
	 * 3-WPA-PSK;
	 * 4-WPA2;
	 * 5-WPA2-PSK;
     * 6:WPA-NONE
     * 7-WPA-PSK/WPA2-PSK;(表示WPA-PSK和WPA2-PSK都支持，但配置必须选其一)
	 * 8:WPA/WPA2;(表示WPA和WPA2都支持，但配置必须选其一)
	 * \endif
	 */
	public           int            nAuthMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Encryption mode
	 * 0-NONE
	 * 1-WEP
	 * 2-TKIP
	 * 3-AES(CCMP)
	 * 4-TKIP+AES(mix Mode）
	 * 5-UnKnow
	 * \else
	 * 加密模式
	 * 0-NONE
	 * 1-WEP
	 * 2-TKIP
	 * 3-AES(CCMP)
	 * 4-TKIP+AES(mix Mode）
	 * 5-UnKnow
	 * \endif
	 */
	public           int            nEncrAlgr;

}

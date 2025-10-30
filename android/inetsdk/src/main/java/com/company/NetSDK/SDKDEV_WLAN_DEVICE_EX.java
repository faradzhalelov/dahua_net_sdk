package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless device expended configuration
 * \else
 * 无线设备扩展配置
 * \endif
 */
public class SDKDEV_WLAN_DEVICE_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * server id
	 * \else
	 * 服务名称
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];

	/**
	 * \if ENGLISH_LANG
	 * mac address
	 * \else
	 * mac地址
	 * \endif
	 */
	public byte                szMacAddr[] = new byte[18];

	/**
	 * \if ENGLISH_LANG
	 * connect state 0: not connect,1: connected
	 * \else
	 * 是否连接成功 0:没有，1: 连接成功
	 * \endif
	 */
	public byte                byApConnected;

	/**
	 * \if ENGLISH_LANG
	 * connect mod 0:adhoc 1:Infrastructure;
	 * \else
	 * 连接模式 0:adhoc 1:Infrastructure;
	 * \endif
	 */
	public byte                byLinkMode;

	/**
	 * \if ENGLISH_LANG
	 * rssi quality(dbm)
	 * \else
	 * 信号强度(dbm)
	 * \endif
	 */
	public int                 nRSSIQuality;

	/**
	 * \if ENGLISH_LANG
	 * max transmit speed
	 * \else
	 * 站点的最大传输速率
	 * \endif
	 */
	public int        unApMaxBitRate;

	/**
	 * \if ENGLISH_LANG
	 * attestation mod:0:OPEN;1:SHARED;2:WPA;3:WPA-PSK;4:WPA2;5:WPA2-PSK;
	 * 6:WPA-NONE(only use in Adhoc mode),
	 * 7-11 are mix mode,choose one of them can to be connected 
	 * 7:WPA-PSK | WPA2-PSK; 8:WPA | WPA2; 9:WPA | WPA-PSK;
	 * 10:WPA2 | WPA2-PSK; 11:WPA | WPA-PSK |WPA2 |WPA2-PSK //12: UnKnown
	 * 13:WPA3-SAE; 14:WPA3-SAE/PSK
	 * \else
	 * 认证模式0:OPEN;1:SHARED;2:WPA;3:WPA-PSK;4:WPA2;5:WPA2-PSK;
	 * 6:WPA-NONE(用在adhoc网络模式),
	 * 7-11是混合模式，选择其中任何一种都可以进行连接 
	 * 7:WPA-PSK | WPA2-PSK; 8:WPA | WPA2; 9:WPA | WPA-PSK;
	 * 10:WPA2 | WPA2-PSK; 11:WPA | WPA-PSK |WPA2 |WPA2-PSK //12: UnKnown
	 * 13:WPA3-SAE; 14:WPA3-SAE/PSK
	 * \endif
	 */
	public byte                byAuthMode;

	/**
	 * \if ENGLISH_LANG
	 * encrypt mod 0:off; 2:WEP64bit; 3:WEP128bit; 4:WEP; 5:TKIP; 6:AES(CCMP)
	 * 7: TKIP+AES( mix Mode) 8: UnKnown
	 * \else
	 * 加密模式0:off; 2:WEP64bit; 3:WEP128bit; 4:WEP; 5:TKIP; 6:AES(CCMP)
	 * 7: TKIP+AES(混合模式) 8: UnKnown
	 * \endif
	 */
	public byte                byEncrAlgr;

	/**
	 * \if ENGLISH_LANG
	 * link quality 0~100(%)
	 * \else
	 * 连接强度 0~100(%)
	 * \endif
	 */
	public byte                byLinkQuality;

	/**
	 * \if ENGLISH_LANG
	 * WIFI frequency band type 0 : 2.4G (default); 1: 5G
	 * \else
	 * WIFI频段类型 0 : 2.4G(默认) ; 1 : 5G
	 * \endif
	 */
	public byte                byWifiType;
}

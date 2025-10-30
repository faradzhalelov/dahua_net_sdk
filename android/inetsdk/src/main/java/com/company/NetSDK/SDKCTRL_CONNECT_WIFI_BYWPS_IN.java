package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * connect parameter(user to fill in)
 * \else
 * 连接参数 (由用户填写)
 * \endif
 */
public class SDKCTRL_CONNECT_WIFI_BYWPS_IN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * WPS connect type,0:virtual buttons; 1:(device)pin; 2:(wifi hot point)pin
	 * \else
	 * WPS连接类型,0:虚拟按钮方式; 1:(设备端)pin码方式; 2:(wifi热点端)pin码方式
	 * \endif
	 */
	public int       	nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * when SSID,nType is 1 or 2,availability,biggest support 32-bit
	 * \else
	 * SSID，nType为1或2时有效，最大支持32位
	 * \endif
	 */
	public byte       	szSSID[] = new byte[FinalVar.SDK_MAX_SSID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * APPIN, when nType = 2,availability,PIN is 8 digits,from the wife(hot point)
	 * \else
	 * APPIN码, nType为2时有效，PIN码为8位数字，这个pin码是从wifi热点端拿到的
	 * \endif
	 */
	public byte       	szApPin[] = new byte[FinalVar.SDK_MAX_APPIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * device pin,when nType = 1,availability.produced by the device when empty,not empty soecified by the user,need to increase in wifi
	 * \else
	 * 设备pin码,nType为1时有效:为空时由设备产生;不为空时即表示由用户设定，最大支持8位数字，这个pin码要在WIFI热点端增加
	 * \endif
	 */
	public byte      	szWLanPin[] = new byte[FinalVar.SDK_MAX_APPIN_LEN];
}

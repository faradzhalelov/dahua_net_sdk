package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remove specified wireless device
 * \else
 * 删除指定无线设备
 * \endif
 */
public class NET_CTRL_LOWRATEWPAN_REMOVE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * wireless device Id
	 * \else
	 * 无线设备ID
	 * \endif
	 */
    public long                  nWirelessId;
    
    /**
	 * \if ENGLISH_LANG
	 * wireless device Id
	 * \else
	 * 无线设备ID
	 * \endif
	 */
    public byte[]                szSerialNumber = new byte[FinalVar.SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN];                                                                                
}

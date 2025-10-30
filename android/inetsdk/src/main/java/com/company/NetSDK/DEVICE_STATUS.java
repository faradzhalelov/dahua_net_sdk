package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device state
 * \else
 * 设备状态
 * \endif
 */
public class DEVICE_STATUS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Remoute device name
	 * \else
	 * 远程设备的名字
	 * \endif
	 */
	public byte[]	szDeviceName = new byte[FinalVar.MAX_REMOTEDEVICENAME_LEN];	
	
	/**
	 * \if ENGLISH_LANG
	 * Remoute device state 0:not on line 1:on line
	 * \else
	 * 远程设备的状态 0：断线 1：在线
	 * \endif
	 */
	public boolean	bDeviceStatus;						
}

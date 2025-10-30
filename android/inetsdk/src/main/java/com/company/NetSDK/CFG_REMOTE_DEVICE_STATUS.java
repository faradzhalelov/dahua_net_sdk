package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get back end device's online state， the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_NETAPP_REMOTEDEVICE}
 * \else
 * 获取后端设备的的在线状态, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_NETAPP_REMOTEDEVICE}
 * \endif
 */
public class CFG_REMOTE_DEVICE_STATUS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device state
	 * \else
	 * 设备状态
	 * \endif
	 */
	public DEVICE_STATUS[] devStatus = new DEVICE_STATUS[FinalVar.MAX_REMOTE_DEV_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Device number
	 * \else
	 * 设备数量
	 * \endif
	 */
	public int		  dwDevCount;					 

	public CFG_REMOTE_DEVICE_STATUS() {
		for (int i = 0; i < devStatus.length; i++) {
			devStatus[i] = new DEVICE_STATUS();
		}
	}
}

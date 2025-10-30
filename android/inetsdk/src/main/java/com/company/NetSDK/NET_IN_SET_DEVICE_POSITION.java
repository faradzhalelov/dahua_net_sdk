package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#SetDevicePosition} interface parameter input
* \else
* {@link INetSDK#SetDevicePosition} 设置设备地址信息输入参数
* \endif
*/
public class NET_IN_SET_DEVICE_POSITION implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Address info 
	 * \else
	 * 地址信息
	 * \endif
	 */
	public byte	szPosition[] = new byte[FinalVar.SDK_COMMON_STRING_512];
}

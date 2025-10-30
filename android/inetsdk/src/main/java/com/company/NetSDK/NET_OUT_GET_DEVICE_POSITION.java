package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#GetDevicePosition} interface paramter output
* \else
* {@link INetSDK#GetDevicePosition} 获取设备地址信息输出参数
* \endif
*/
public class NET_OUT_GET_DEVICE_POSITION implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * 地址信息
	 * \else
	 * Address info 
	 * \endif
	 */
	public byte szPosition[] = new byte[FinalVar.SDK_COMMON_STRING_512];
}

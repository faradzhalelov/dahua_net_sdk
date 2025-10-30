package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#LoginWithPolicy} output parameter
 * \else
 * {@link INetSDK#LoginWithPolicy} 入参
 * \endif
 */
public class NET_OUT_LOGIN_POLICY_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device info
	 * \else
	 * 设备信息
	 * \endif
	 */
	public NET_DEVICEINFO_Ex	stuDeviceInfo = new NET_DEVICEINFO_Ex();
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronism search device call
 * \else
 * 搜索设备回调
 * \endif
 */
public interface CB_fSearchDevicesCB {
	/**
	 * \if ENGLISH_LANG
	 * Asynchronism search device call
	 * @param pDevNetInfo recall structure
	 * \else
	 * 网络断线回调函数
	 * @param pDevNetInfo 回调结构体
	 * \endif
	 */
	public void invoke(DEVICE_NET_INFO_EX pDevNetInfo);
}

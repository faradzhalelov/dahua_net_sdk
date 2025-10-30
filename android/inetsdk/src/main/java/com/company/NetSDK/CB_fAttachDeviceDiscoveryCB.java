package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Attach Device Discovery callback function
 * \else
 * 注册设备搜索处理回调函数原形
 * \endif
 */
public interface CB_fAttachDeviceDiscoveryCB {
	/**
	 * \if ENGLISH_LANG
	 * Attach Device Discovery callback function
	 * @param lAttachHandle, return from {@link INetSDK#AttachDeviceDiscovery}
	 * @param pDeviceInfo, the returned value of deviceInfo
	 * @param nDeviceNum,  the number of  pDeviceInfo
	 * \else
	 * 注册设备搜索处理回调函数
	 * @param lAttachHandle, {@link INetSDK#AttachDeviceDiscovery}返回值
	 * @param pDeviceInfo 设备信息
	 * @param nDeviceNum  设备信息数组个数
	 * \endif
	 */
	public void invoke(long lAttachHandle, NET_DEVICE_DISCOVERY_INFO pDeviceInfo, int nDeviceNum);
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronism register device call
 * \else
 * 异步注册设备回调函数
 * \endif
 */
public interface CB_fHaveLogin {
	/**
	 * \if ENGLISH_LANG
	 * Asynchronism register device call
	 * @param lLoginID login handle, return from {@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param pchDVRIP device ip
	 * @param nDVRPort device port
	 * @param bOnline on line or not
	 * @param stuDeviceInfo device info
	 * @param nError error info
	 * \else
	 * 网络断线回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param pchDVRIP 设备IP
	 * @param nDVRPort 设备端口
	 * @param bOnline 是否在线
	 * @param stuDeviceInfo 设备信息
	 * @param nError 出错信息
	 * \endif
	 */
	public void invoke(long lLoginID, String pchDVRIP, int nDVRPort, boolean bOnline, NET_DEVICEINFO_Ex stuDeviceInfo, int nError);
}

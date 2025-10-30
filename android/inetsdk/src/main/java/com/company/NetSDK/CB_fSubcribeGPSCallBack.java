package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * GPS subscription callback
 * \else
 * GPS订阅回调
 * \endif
 */
public interface CB_fSubcribeGPSCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * GPS subscription callback
	 * @param lLoginID login handle, return from {@link INetSDK#LoginEx} or {@link INetSDK#Login}
	 * @param gpsInfo GPS info

	 * \else
	 * GPS订阅回调函数
	 * @param lLoginID {@link INetSDK#LoginEx} 或者 {@link INetSDK#Login}的返回值
	 * @param gpsInfo GPS信息
	 */

	public void invoke(long lLoginID, GPS_Info gpsInfo);
}

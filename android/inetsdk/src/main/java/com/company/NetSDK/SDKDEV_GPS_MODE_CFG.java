package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GPS mode configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_GPS_MODE_CFG}
 * \else
 * GPS定位模式配置结构, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_GPS_MODE_CFG}
 * \endif
 */
public class SDKDEV_GPS_MODE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * GPS mode, refer to {@link GPS_MODE}
	 * \else
	 * GPS定位模式，见 {@link GPS_MODE}
	 * \endif
	 */
	public byte                byGPSMode; 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * enclosure version config, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_ENCLOSURE_VERSION_CFG}
 * \else
 * 电子围栏版本号配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_ENCLOSURE_VERSION_CFG}
 * \endif
 */
public class SDKDEV_ENCLOSURE_VERSION_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type mask,such as LIMITSPEED | DRIVEALLOW
	 * \else
	 * 围栏类型掩码，如 LIMITSPEED | DRIVEALLOW
	 * \endif
	 */
	public int          unType; 
	
	/**
	 * \if ENGLISH_LANG
	 * version
	 * \else
	 * 每个类型一个版本号,用于统一平台与设备上的围栏配置
	 * \endif
	 */
	public int          unVersion[] = new int[32]; 
}

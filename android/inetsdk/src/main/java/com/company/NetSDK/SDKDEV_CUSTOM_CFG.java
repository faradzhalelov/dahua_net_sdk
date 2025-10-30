package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_CUSTOM_CFG}
 * \else
 * 用户自定义配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_CUSTOM_CFG}
 * \endif
 */
public class SDKDEV_CUSTOM_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * configuration information
	 * \else
	 * 用户自定义配置信息
	 * \endif
	 */
	public byte                   szData[] = new byte[1024]; 
}

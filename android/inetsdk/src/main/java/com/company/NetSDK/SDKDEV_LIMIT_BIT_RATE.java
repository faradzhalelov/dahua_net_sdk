package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * limit stream configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_LIMIT_BIT_RATE_CFG}
 * \else
 * 限码流配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_LIMIT_BIT_RATE_CFG}
 * \endif
 */
public class SDKDEV_LIMIT_BIT_RATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * limit stream (kps)
	 * \else
	 * 限制码流，单位kps
	 * \endif
	 */
    public int                   nExpectCodeRate; 
}

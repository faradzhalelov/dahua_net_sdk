package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Emergency storage configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_URGENCY_RECORD_CFG}
 * \else
 * 紧急存储配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_URGENCY_RECORD_CFG}
 * \endif
 */
public class SDKDEV_URGENCY_RECORD_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable or not. 1=enable.0=unable
	 * \else
	 * 是否使能，1使能，0不使能
	 * \endif
	 */
	public boolean    bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Max record time. Unit is second.
	 * \else
	 * 最大录像时间，单位秒
	 * \endif
	 */
	public int    nMaxRecordTime;
}

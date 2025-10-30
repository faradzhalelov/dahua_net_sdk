package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Speed limit configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_SPEED_LIMIT_CFG}
 * \else
 * 限速配置结构, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_SPEED_LIMIT_CFG}
 * \endif
 */
public class SDKDEV_SPEED_LIMIT_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable speed limit;1:enable,0:disable
	 * \else
	 * 限速使能1：使能；0：不使能。
	 * \endif
	 */
	public byte                byEnable;

	/**
	 * \if ENGLISH_LANG
	 * upper speed(KM/H) 0: none limit speed, >0:limit speed
	 * \else
	 * 速度上限值：单位KM/H 0表示不限速,大于0表示限速
	 * \endif
	 */
	public short                wMaxSpeed;

	/**
	 * \if ENGLISH_LANG
	 * low speed(KM/H) 0: none limit speed, >0:limit speed
	 * \else
	 * 速度下限值：单位KM/H 0表示不限速,大于0表示限速
	 * \endif
	 */
	public short                wMinSpeed;
}

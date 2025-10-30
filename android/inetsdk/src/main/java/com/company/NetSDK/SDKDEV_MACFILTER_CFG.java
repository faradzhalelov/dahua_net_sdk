package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MAC filter configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_MACFILTER_CFG}
 * \else
 * MAC过滤配置结构体, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_MACFILTER_CFG}
 * \endif
 */
public class SDKDEV_MACFILTER_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 使能
	 * \endif
	 */
	public int                 dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * current list type,0:allow list, 1:block list (The device can enable only one type of list) can only user one kind of device
	 * \else
	 * 当前名单类型：0：允许名单 1：禁止名单（设备只能使一种名单生效，或者是允许名单或者是禁止名单）
	 * \endif
	 */
	public int                 dwType;

	/**
	 * \if ENGLISH_LANG
	 * block list Mac
	 * \else
	 * 禁止名单Mac
	 * \endif
	 */
	public MACFILTER_INFO        stuBannedMac = new MACFILTER_INFO();

	/**
	 * \if ENGLISH_LANG
	 * allow list Mac
	 * \else
	 * 允许名单Mac
	 * \endif
	 */
	public MACFILTER_INFO        stuTrustMac = new MACFILTER_INFO();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP Filtering extended configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_IPFILTER_CFG_EX}
 * \else
 * IP过滤配置结构体扩展, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_IPFILTER_CFG_EX}
 * \endif
 */
public class SDKDEV_IPIFILTER_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public int                dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * The current list type;0:Allow list 1:Blocklist(The device can enable only one type of list) can only user one kind of device
	 * \else
	 * 当前名单类型：0：允许名单 1：禁止名单（设备只能使一种名单生效，或者是允许名单或者是禁止名单）
	 * \endif
	 */
	public int                dwType;

	/**
	 * \if ENGLISH_LANG
	 * block list
	 * \else
	 * 禁止名单
	 * \endif
	 */
	public IPIFILTER_INFO_EX    BannedIP = new IPIFILTER_INFO_EX();

	/**
	 * \if ENGLISH_LANG
	 * Trusted sites
	 * \else
	 * 允许名单
	 * \endif
	 */
	public IPIFILTER_INFO_EX    TrustIP = new IPIFILTER_INFO_EX();
}

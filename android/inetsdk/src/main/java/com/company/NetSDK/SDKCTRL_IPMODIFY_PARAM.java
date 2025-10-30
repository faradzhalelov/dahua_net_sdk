package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP modify configuration
 * \else
 * IP修改配置
 * \endif
 */
public class SDKCTRL_IPMODIFY_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * device IP
	 * \else
	 * 前端设备IP
	 * \endif
	 */
	public byte            szRemoteIP[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];

	/**
	 * \if ENGLISH_LANG
	 * submask
	 * \else
	 * 子网掩码
	 * \endif
	 */
	public byte            szSubmask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * gatway
	 * \else
	 * 网关
	 * \endif
	 */
	public byte            szGateway[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];

	/**
	 * \if ENGLISH_LANG
	 * MAC addr
	 * \else
	 * MAC地址
	 * \endif
	 */
	public byte            szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * device type
	 * \else
	 * 设备类型
	 * \endif
	 */
	public byte            szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
}

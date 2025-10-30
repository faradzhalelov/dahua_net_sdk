package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IPv6 config, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_IPV6_CFG}
 * \else
 * IPv6配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_IPV6_CFG}
 * \endif
 */
public class SDKDEV_IPV6_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * link address: string length = 44;(every host has an exclusive link address, read only)
	 * \else
	 * 链路地址: 字符串, 长度为44;(局域网内每台主机拥有唯一的链路地址，只读)
	 * \endif
	 */
	public byte               szLinkAddr[] = new byte[44];

	/**
	 * \if ENGLISH_LANG
	 * host IP
	 * \else
	 * 主机IP
	 * \endif
	 */
	public byte               szHostIP[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * net prefix, 1-128
	 * \else
	 * 网络前缀（范围：1-128，可读可写）
	 * \endif
	 */
	public int              dwPreFix;

	/**
	 * \if ENGLISH_LANG
	 * gateway
	 * \else
	 * 默认网关
	 * \endif
	 */
	public byte               szGateWay[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * enable of auto get ip
	 * \else
	 * 自动获取使能
	 * \endif
	 */
	public boolean               bAutoGet;

	/**
	 * \if ENGLISH_LANG
	 * primary DNS
	 * \else
	 * 首选DNS
	 * \endif
	 */
	public byte               szPrimaryDns[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * second DNS
	 * \else
	 * 备选DNS
	 * \endif
	 */
	public byte               szSecondDns[] = new byte[40];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Multi ddns configuration
 * \else
 * 多ddns配置
 * \endif
 */
public class SDKDEV_MULTI_DDNS_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ddns number
	 * \else
	 * ddns数目
	 * \endif
	 */
	public int                dwDdnsServerNum;
	
	/**
	 * \if ENGLISH_LANG
	 * ddns configuration
	 * \else
	 * ddns配置
	 * \endif
	 */
	public SDK_DDNS_SERVER_CFG   struDdnsServer[] = new SDK_DDNS_SERVER_CFG[FinalVar.SDK_MAX_DDNS_NUM];
	
	public SDKDEV_MULTI_DDNS_CFG() {
		for (int i = 0; i < FinalVar.SDK_MAX_DDNS_NUM; i++) {
			struDdnsServer[i] = new SDK_DDNS_SERVER_CFG();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Configuration structure of each sniffer 
 * \else
 * 每组抓包对应的配置结构
 * \endif
 */
public class SDK_ATM_SNIFFER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Sniffer source address
	 * \else
	 * 抓包源地址
	 * \endif
	 */
	public byte                SnifferSrcIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Sniffer source port
	 * \else
	 * 抓包源端口
	 * \endif
	 */
	public int                 SnifferSrcPort;

	/**
	 * \if ENGLISH_LANG
	 * Sniffer destination address
	 * \else
	 * 抓包目标地址
	 * \endif
	 */
	public byte                SnifferDestIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Sniffer destination port
	 * \else
	 * 抓包目标端口
	 * \endif
	 */
	public int                 SnifferDestPort;

	/**
	 * \if ENGLISH_LANG
	 * 6 FRAME options
	 * \else
	 * 6个FRAME 选项
	 * \endif
	 */
	public SDK_SNIFFER_FRAME    snifferFrame[] = new SDK_SNIFFER_FRAME[FinalVar.SDK_SNIFFER_FRAMEID_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Display position
	 * \else
	 * 显示位置
	 * \endif
	 */
	public int                 displayPosition;

	/**
	 * \if ENGLISH_LANG
	 * Channel mask
	 * \else
	 * 通道掩码
	 * \endif
	 */
	public int                 recdChannelMask;
	
	public SDK_ATM_SNIFFER_CFG() {
		for (int i = 0; i < FinalVar.SDK_SNIFFER_FRAMEID_NUM; i++) {
			snifferFrame[i] = new SDK_SNIFFER_FRAME();
		}
	}
}

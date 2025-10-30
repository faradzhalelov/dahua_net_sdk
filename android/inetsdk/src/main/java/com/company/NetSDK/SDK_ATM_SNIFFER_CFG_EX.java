package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture each of the corresponding structure
 * \else
 * 每组抓包对应的配置结构
 * \endif
 */
public class SDK_ATM_SNIFFER_CFG_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Source address capture
	 * \else
	 * 抓包源地址
	 * \endif
	 */
	public byte                SnifferSrcIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Capture source port
	 * \else
	 * 抓包源端口
	 * \endif
	 */
	public int                 SnifferSrcPort;

	/**
	 * \if ENGLISH_LANG
	 * Destination address capture
	 * \else
	 * 抓包目标地址
	 * \endif
	 */
	public byte                SnifferDestIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Capture the target port
	 * \else
	 * 抓包目标端口
	 * \endif
	 */
	public int                 SnifferDestPort;

	/**
	 * \if ENGLISH_LANG
	 * 6 FRAME Options
	 * \else
	 * 6个FRAME 选项
	 * \endif
	 */
	public SDK_SNIFFER_FRAME_EX snifferFrame[] = new SDK_SNIFFER_FRAME_EX[FinalVar.SDK_SNIFFER_FRAMEID_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Display Position
	 * \else
	 * 显示位置
	 * \endif
	 */
	public int                 displayPosition;

	/**
	 * \if ENGLISH_LANG
	 * Channel mask
	 * \else
	 * 通道掩码  0  ~ 31 通道
	 * \endif
	 */
	public int                 recdChannelMask;

	/**
	 * \if ENGLISH_LANG
	 * Data sources enable
	 * \else
	 * 数据来源使能
	 * \endif
	 */
	public boolean                bDateScopeEnable;

	/**
	 * \if ENGLISH_LANG
	 * Protocol enable
	 * \else
	 * 协议使能
	 * \endif
	 */
	public boolean                bProtocolEnable;

	/**
	 * \if ENGLISH_LANG
	 * Protocol name
	 * \else
	 * 协议名字
	 * \endif
	 */
	public byte                szProtocolName[] = new byte[FinalVar.SDK_SNIFFER_PROTOCOL_SIZE];

	/**
	 * \if ENGLISH_LANG
	 * Capture mode; 0:net,1:232.
	 * \else
	 * 抓包方式，0:net,1:232.
	 * \endif
	 */
	public int                 nSnifferMode;

	/**
	 * \if ENGLISH_LANG
	 * Channel submask  32 ~ 63 channel
	 * \else
	 * 通道掩码  32 ~ 63 通道
	 * \endif
	 */
	public int                 recdChannelMask1;
    
    public SDK_ATM_SNIFFER_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_SNIFFER_FRAMEID_NUM; i++) {
    		snifferFrame[i] = new SDK_SNIFFER_FRAME_EX();
    	}
    }
}

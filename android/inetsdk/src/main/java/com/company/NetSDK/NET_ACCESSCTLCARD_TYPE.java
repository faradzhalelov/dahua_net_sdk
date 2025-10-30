package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Card Type
 * \else
 * 卡类型
 * \endif
 */
public class NET_ACCESSCTLCARD_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_UNKNOWN = -1;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal Card
	 * \else
	 * 一般卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_GENERAL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * VIP
	 * \else
	 * VIP卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_VIP = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Guest Card
	 * \else
	 * 来宾卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_GUEST = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Patrol Card
	 * \else
	 * 巡逻卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_PATROL = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Block List Card
	 * \else
	 * 禁止名单卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_BLACKLIST = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Threat Card
	 * \else
	 * 胁迫卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_CORCE = 5;

	/**
	 * \if ENGLISH_LANG
	 * Polling Card
	 * \else
	 * 巡检卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_POLLING = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Main Card
	 * \else
	 * 母卡
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_MOTHERCARD = 0xff;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Input parameter of {@link INetSDK#SetLowRateWPANPower}
 * \else
 * 发射功率设置参数 {@link INetSDK#SetLowRateWPANPower}
 * \endif
 */
public class NET_IN_SET_LOWRATEWPAN_POWER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * transmitted power
	 * \else
	 * 发射功率
	 * \endif
	 */
	public int  nPower;
	
	/**
	 * \if ENGLISH_LANG
	 * serial number of intelligent lock
	 * \else
	 * 智能锁序列号
	 * \endif
	 */
	public byte[] szSmartLockNum = new byte[FinalVar.MAX_COMMON_STRING_32]; 
	
}

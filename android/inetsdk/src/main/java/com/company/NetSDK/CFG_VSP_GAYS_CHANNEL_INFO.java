package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel related info 
 * \else
 * 通道相关信息
 * \endif
 */
public class CFG_VSP_GAYS_CHANNEL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm related info 
	 * \else
	 * 通道编号	字符串（24位）
	 * \endif
	 */
	public byte[] szId = new byte[FinalVar.CFG_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm level [1,6]
	 * \else
	 * 报警级别[1,6]	整型
	 * \endif
	 */
	public int nAlarmLevel;
}

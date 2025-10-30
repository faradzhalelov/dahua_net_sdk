package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * 码流控制模式
 * \endif
 */
public class CFG_BITRATE_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Control Bit Rate
	 * \else
	 * 固定码流
	 * \endif
	 */
	public static final int     BITRATE_CBR = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Variable Bit Rate
	 * \else
	 * 可变码流
	 * \endif
	 */
	public static final int     BITRATE_VBR = 1;
}

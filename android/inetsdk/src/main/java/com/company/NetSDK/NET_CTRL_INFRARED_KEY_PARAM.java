package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IR button
 * \else
 * 红外按键
 * \endif
 */
public class NET_CTRL_INFRARED_KEY_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IR control channel no.
	 * \else
	 * 红外控制通道号
	 * \endif
	 */
	public int		nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * IR button ID
	 * \else
	 * 红外按键ID
	 * \endif
	 */
	public int		nKey; 
}

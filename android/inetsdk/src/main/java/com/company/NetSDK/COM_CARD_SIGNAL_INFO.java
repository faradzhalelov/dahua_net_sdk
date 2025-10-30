package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232/485 com card signal info configuration
 * \else
 * 232串口卡号信号、485串口卡号信号事件配置
 * \endif
 */
public class COM_CARD_SIGNAL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card number start location
	 * \else
	 * 卡号起始位
	 * \endif
	 */
	public short                wCardStartPose; 
	
	/**
	 * \if ENGLISH_LANG
	 * card number length
	 * \else
	 * 卡号长度
	 * \endif
	 */
	public short                wCardLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * start string
	 * \else
	 * 开始符
	 * \endif
	 */
	public byte                cStartCharacter[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * end string
	 * \else
	 * 结束符
	 * \endif
	 */
	public byte                cEndCharacter[] = new byte[32];
}

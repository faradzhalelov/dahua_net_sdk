package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarming Decoder 
 * \else
 * 报警解码器的报警
 * \endif
 */
public class ALARM_DECODER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Now it supports max 8 alarm input ports. Reserved 8 bits for future development.
	 * \else
	 * 现在最多支持8个报警输入口，留8位待以后扩展
	 * \endif
	 */
	public int               dwAlarmDecoder;
	
 	/**
	 * \if ENGLISH_LANG
	 * It means it is from which alarm decoder.
	 * \else
	 * 表示第几个报警解码器
	 * \endif
	 */
	public byte                bDecoderIndex;              
}

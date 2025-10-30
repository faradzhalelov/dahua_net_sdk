package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm decoder control 
 * \else
 * 报警解码器控制
 * \endif
 */
public class DECODER_ALARM_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder. It begins from 0.
	 * \else
	 * 报警解码器号，从0开始
	 * \endif
	 */
	public int					decoderNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output port. It begin from o.
	 * \else
	 * 报警输出口，从0开始
	 * \endif
	 */
	public short				alarmChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output status;1:open,0:close.
	 * \else
	 * 报警输出状态；1：打开，0：关闭
	 * \endif
	 */
	public short				alarmState;
}

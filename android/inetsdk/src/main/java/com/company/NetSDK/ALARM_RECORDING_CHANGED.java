package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Status Changes Alarm Info
 * \else
 * 录像状态变化报警信息
 * \endif
 */
public class ALARM_RECORDING_CHANGED implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Record Channel No.
	 * \else
	 * 录像通道号
	 * \endif
	 */
	public int                 nChannel;                
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm status
 * \else
 * 报警状态
 * \endif
 */
public class ALARMCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel. It begins from 0. 
	 * \else
	 * 报警通道号，从0开始
	 * \endif
	 */
	public int					nAlarmNo;
	
	/**
	 * \if ENGLISH_LANG
	 * 1:activate alarm,0:stop alarm  
	 * \else
	 * 1：触发报警，0：停止报警
	 * \endif
	 */
	public int					nAction;
}

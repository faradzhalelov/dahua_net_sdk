package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Clear Alarm Event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ALARMCLEAR}
 * \else
 * 消警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ALARMCLEAR}
 * \endif
 */
public class ALARM_ALARMCLEAR_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	 public int             nChannelID;                        
	 
	/**
	 * \if ENGLISH_LANG
	 * Alarm event time
	 * \else
	 * 报警事件发生的时间
	 * \endif
	 */
	 public NET_TIME        stuTime = new NET_TIME();                            
	 
	/**
	 * \if ENGLISH_LANG
	 * Event Action,0=Impluse Event,1=Continued Event Start,2=Continued Event End;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	 public int             bEventAction;                       
}

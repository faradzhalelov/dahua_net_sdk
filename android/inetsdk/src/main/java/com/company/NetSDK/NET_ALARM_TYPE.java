package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#ControlDevice}'s param: {@link CtrlType#SDK_CTRL_CLEAR_ALARM}
 * \else
 * {@link INetSDK#ControlDevice}接口的 {@link CtrlType#SDK_CTRL_CLEAR_ALARM} 命令参数
 * \endif
 */
public class NET_ALARM_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SwitchingValue Defence Area's Alarm Information, refer to {@link FinalVar#SDK_ALARM_ALARM_EX2}
	 * \else
	 * 开关量防区的报警事件, 取值参考 {@link FinalVar#SDK_ALARM_ALARM_EX2}
	 * \endif
	 */
    public static final int NET_ALARM_LOCAL 		  = 0;                   
    
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Event, refer to {@link FinalVar#SDK_ALARM_ALARMEXTENDED}
	 * \else
	 * 扩展模块报警事件, 取值参考 {@link FinalVar#SDK_ALARM_ALARMEXTENDED}
	 * \endif
	 */
	public static final int NET_ALARM_ALARMEXTENDED   = 1;                   
	
	/**
	 * \if ENGLISH_LANG
	 * Temperature Alarm Event, refer to {@link FinalVar#SDK_ALARM_TEMPERATURE}
	 * \else
	 * 温度报警事件, 取值参考 {@link FinalVar#SDK_ALARM_TEMPERATURE}
	 * \endif
	 */
	public static final int NET_ALARM_TEMP 			  = 2;                   
	
	/**
	 * \if ENGLISH_LANG
	 * Emergency Alarm Event, refer to {@link FinalVar#SDK_URGENCY_ALARM_EX}
	 * \else
	 * 紧急报警事件, 取值参考 {@link FinalVar#SDK_URGENCY_ALARM_EX}
	 * \endif
	 */
	public static final int NET_ALARM_URGENCY 		  = 3;                    
	
	/**
	 * \if ENGLISH_LANG
	 * Emergency call alarm event, refer to {@link FinalVar#SDK_ALARM_RCEMERGENCY_CALL}
	 * \else
	 * 紧急呼叫报警事件, 取值参考 {@link FinalVar#SDK_ALARM_RCEMERGENCY_CALL}
	 * \endif
	 */
	public static final int NET_ALARM_RCEMERGENCYCALL = 4;                    
	
	/**
	 * \if ENGLISH_LANG
	 * ALL Alarm Event
	 * \else
	 * 所有报警事件
	 * \endif
	 */
	public static final int NET_ALARM_ALL 			  = 5;                   
}

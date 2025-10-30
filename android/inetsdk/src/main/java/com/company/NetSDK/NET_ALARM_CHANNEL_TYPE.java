package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to {@link INetSDK#QueryDevState} Interface's {@link FinalVar#SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE} Command Parameter
 * \else
 * 对应{@link INetSDK#QueryDevState}接口的  {@link FinalVar#SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE} 命令参数
 * 获取报警通道状态
 * \endif
 */
public class NET_ALARM_CHANNEL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All channels (including all of the following)
	 * \else
	 * 所有通道（包含以下所有）
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALL = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input channel 
	 * \else
	 * 报警输入通道
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMIN = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output channel 
	 * \else
	 * 报警输出通道
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMOUT = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Signal channel 
	 * \else
	 * 警号通道
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_ALARMBELL = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module alarm input channel 
	 * \else
	 * 扩展模块报警输入通道
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_EXALARMIN = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * Extension module and alarm output channel
	 * \else
	 * 扩展模块报警输出通道
	 * \endif
	 */
	public static final int NET_ALARM_CHANNEL_TYPE_EXALARMOUT = 5; 
}

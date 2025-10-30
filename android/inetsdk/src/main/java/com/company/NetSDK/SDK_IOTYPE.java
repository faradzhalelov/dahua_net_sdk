package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IO control command. Corresponding to interface {@link INetSDK#QueryIOControlState}
 * \else
 * IO控制命令，对应  {@link INetSDK#QueryIOControlState}接口
 * \endif
 */
public class SDK_IOTYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Control alarm input 
	 * \else
	 * 控制报警输入
	 * \endif
	 */
	public static final int     SDK_ALARMINPUT = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Control alarm output 
	 * \else
	 * 控制报警输出
	 * \endif
	 */
	public static final int     SDK_ALARMOUTPUT = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Control alarm decoder output
	 * \else
	 * 控制报警解码器输出
	 * \endif
	 */
	public static final int     SDK_DECODER_ALARMOUT = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Control wireless alarm output 
	 * \else
	 * 控制无线报警输出
	 * \endif
	 */
	public static final int     SDK_WIRELESS_ALARMOUT = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm activation type(auto/manual/close). Use {@link TRIGGER_MODE_CONTROL} structure
	 * \else
	 * 报警触发方式（手动,自动,关闭），使用 {@link TRIGGER_MODE_CONTROL} 结构体
	 * \endif
	 */
	public static final int     SDK_ALARM_TRIGGER_MODE = 7;
}

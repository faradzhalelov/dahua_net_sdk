package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Wireless) Infrared Alarm Configuration
 * \else
 * (无线)红外报警配置
 * \endif
 */
public class SDK_INFRARED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 报警输入使能
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Input Name
	 * \else
	 * 报警输入名称
	 * \endif
	 */
	public byte                szAlarmName[] = new byte[FinalVar.SDK_MAX_ALARM_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm In Pattern
	 * \else
	 * 报警器输入波形
	 * \endif
	 */
	public int                 nAlarmInPattern;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmOutPattern
	 * \else
	 * 报警输出波形
	 * \endif
	 */
	public int                 nAlarmOutPattern;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmInAddress
	 * \else
	 * 报警输入地址
	 * \endif
	 */
	public byte                szAlarmInAddress[] = new byte[FinalVar.SDK_MAX_ALARM_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * SensorType, normal open or normal close
	 * \else
	 * 外部设备传感器类型常开 or 常闭
	 * \endif
	 */
	public int                 nSensorType;
	
	/**
	 * \if ENGLISH_LANG
	 * DefendEfectTime
	 * \else
	 * 布撤防延时时间，在此时间后该报警输入有效
	 * \endif
	 */
	public int                 nDefendEfectTime;
	
	/**
	 * \if ENGLISH_LANG
	 * DefendAreaType
	 * \else
	 * 防区类型
	 * \endif
	 */
	public int                 nDefendAreaType;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmSmoothTime
	 * \else
	 * 报警平滑时间，即在此时间内如果只有一个报警输入连续输入两次则忽略掉后面一次
	 * \endif
	 */
	public int                 nAlarmSmoothTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Schedule
	 * \else
	 * 时间表
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Handle Mode
	 * \else
	 * 处理方式
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
	
	public SDK_INFRARED_INFO() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}

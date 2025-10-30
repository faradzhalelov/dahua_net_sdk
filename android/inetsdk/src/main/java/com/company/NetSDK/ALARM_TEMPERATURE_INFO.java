package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * temperature alarm info, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_TEMPERATURE}
 * \else
 * 温度异常报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_TEMPERATURE}
 * \endif
 */
public class ALARM_TEMPERATURE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * sensor name
	 * \else
	 * 温度传感器名称
	 * \endif
	 */
	public byte               szSensorName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start	
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
	public int                nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * current temperature, unit:degree centigrade
	 * \else
	 * 当前温度值, 单位摄氏度
	 * \endif
	 */
	public float              fTemperature;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * 事件发生时间
	 * \endif
	 */
	public NET_TIME           stTime = new NET_TIME();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fan speed abnormal, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_FAN_SPEED}
 * \else
 * 风扇转速异常事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_FAN_SPEED}
 * \endif
 */
public class ALARM_FAN_SPEED implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0-开始, 1-停止
	 * \endif
	 */
	public int                dwAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * index
	 * \else
	 * 风扇序号
	 * \endif
	 */
	public int                dwIndex;
	
 	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 传感器名称
	 * \endif
	 */
	public byte                 szName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 事件发生时间
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * current speed
	 * \else
	 * 当前转速
	 * \endif
	 */
	public int                dwCurrent;                           
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of smoke sensor, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_SMOKE_SENSOR}
 * \else
 * 烟感报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_SMOKE_SENSOR}
 * \endif
 */
public class ALARM_SMOKE_SENSOR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * 当前时间
	 * \endif
	 */
	public NET_TIME        stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * 报警通道
	 * \endif
	 */
	public int             nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1:hight temperature alarm start,0:end
	 * \else
	 * 1:温度异常报警开始，0：温度异常报警结束
	 * \endif
	 */
	public byte            byHighTemperature;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1:smoke alarm start,0:end
	 * \else
	 * 1:烟感报警开始，0：烟感报警结束
	 * \endif
	 */
	public byte            bySmoke;
}

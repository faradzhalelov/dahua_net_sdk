package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor Alarm Way
 * \else
 * 传感器报警方式
 * \endif
 */
public class CFG_ALARM_SENSE_METHOD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The Number of Supported Sensors Way
	 * \else
	 * 支持的传感器方式数
	 * \endif
	 */
	public int                 nSupportSenseMethodNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported Sensor Way, refer to {@link EM_SENSE_METHOD}
	 * \else
	 * 支持的传感器方式, 取值参考 {@link EM_SENSE_METHOD}
	 * \endif
	 */
	public int                 emSupportSenseMethod[] = new int[FinalVar.MAX_ALARM_SENSE_METHOD_NUM];
}

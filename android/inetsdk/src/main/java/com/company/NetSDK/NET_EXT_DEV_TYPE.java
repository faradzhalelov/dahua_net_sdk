package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * external device type
 * \else
 * 外接设备类型
 * \endif
 */
public class NET_EXT_DEV_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EXT_DEV_UNKNOWN = 0;                    
	
	/**
	 * \if ENGLISH_LANG
	 * projector
	 * \else
	 * 投影仪
	 * \endif
	 */
	public static final int EXT_DEV_PROJECTOR = 1;                  
	
	/**
	 * \if ENGLISH_LANG
	 * power sequence
	 * \else
	 * 电源序列器
	 * \endif
	 */
	public static final int EXT_DEV_SEQUENCE_POWER = 2;            
}

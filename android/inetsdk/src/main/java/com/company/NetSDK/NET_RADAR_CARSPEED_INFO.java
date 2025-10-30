package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * radar configuration - car speed
 * \else
 *  雷达配置——车速
 * \endif
 */
public class NET_RADAR_CARSPEED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * lowerbound of trigger value, range 1~255km/h
	 * \else
	 * 触发值下限, 范围 1~255km/h
	 * \endif
	 */
   public int                 nTriggerLower;                 
   
	/**
	 * \if ENGLISH_LANG
	 * upperbound of trigger value, range 1~255km/h
	 * \else
	 * 触发值上限, 范围 1~255km/h
	 * \endif
	 */
   public int                 nTriggerUpper;                  
   
	/**
	 * \if ENGLISH_LANG
	 * lowerbound of limit value, range 5~255km/h
	 * \else
	 * 限速值下限, 范围 5~255km/h
	 * \endif
	 */
   public int                 nLimitLower;                    
   
	/**
	 * \if ENGLISH_LANG
	 * upperbound of limit value, range 5~255km/h
	 * \else
	 * 限速值上限, 范围 5~255km/h
	 * \endif
	 */
   public int                 nLimitUpper;     
}

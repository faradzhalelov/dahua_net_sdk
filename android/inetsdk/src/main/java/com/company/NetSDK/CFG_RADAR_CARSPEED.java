package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * radar configuration - car speed
 * \else
 *  雷达配置——车速
 * \endif
 */
public class CFG_RADAR_CARSPEED implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * lowerbound of trigger value
	 * \else
	 * 触发值下限
	 * \endif
	 */
    public int                 nTriggerLower;                 
    
	/**
	 * \if ENGLISH_LANG
	 * upperbound of trigger value
	 * \else
	 * 触发值上限
	 * \endif
	 */
    public int                 nTriggerUpper;                  
    
	/**
	 * \if ENGLISH_LANG
	 * lowerbound of limit value
	 * \else
	 * 限速值下限
	 * \endif
	 */
    public int                 nLimitLower;                    
    
	/**
	 * \if ENGLISH_LANG
	 * upperbound of limit value
	 * \else
	 * 限速值上限
	 * \endif
	 */
    public int                 nLimitUpper;                    
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Many Scene  Calibrate Day and night Basic Unit Configuration
 * \else
 * 多场景标定白天和黑夜配置基本单元
 * \endif
 */
public class CFG_TIME_PERIOD_SCENE_UNIT implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Calibratie period during the day.(8,20), indicate from 8am to 20pm is for day time  
	 * \else
	 * 标定白天的时间段.(8,20),表示从8点到晚上20点为白天
	 * \endif
	 */
	public CFG_TIME_PERIOD        stuDayTimePeriod = new CFG_TIME_PERIOD();			
	
	/**
	 * \if ENGLISH_LANG
	 * Calibrate period during the night.(20,7), indicate from 8pm to 7am  is for night time 
	 * \else
	 * 标定黑夜的时间段.(20,7)，表示从晚8点到凌晨7点为黑夜
	 * \endif
	 */
	public CFG_TIME_PERIOD        stuNightTimePeriod = new CFG_TIME_PERIOD();		
	
	/**
	 * \if ENGLISH_LANG
	 * Day and night algorithm switching mode, refer to {@link CFG_TIMEPERIOD_SWITCH_MODE}
	 * \else
	 * 昼夜算法切换模式，详见 {@link CFG_TIMEPERIOD_SWITCH_MODE}
	 * \endif
	 */
	public int 					  emSwitchMode;                                  	
	
	/**
	 * \if ENGLISH_LANG
	 * longitude company:one in a million
	 * \else
	 * 经度 单位百万分之一度
	 * \endif
	 */
	public int					  unLongitude;								
	
	/**
	 * \if ENGLISH_LANG
	 * dimension company:one in a million
	 * \else
	 * 纬度 单位百万分之一度
	 * \endif
	 */
	public int					  unLatitude;										
}

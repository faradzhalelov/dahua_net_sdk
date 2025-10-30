package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 定义有问题，请勿再使用
 * \else
 * 定义有问题，请勿再使用
 * \endif
 */
public class NET_BATTERY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电池容量百分比
	 * \endif
	 */
	public 	int        nPercent;                       
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 是否真正充电
	 * \endif
	 */
	public	boolean    bCharging;                      
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电池在位状态 EM_BATTERY_EXIST_STATE
	 * \endif
	 */
	public  int        emExistState ;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电池电量状态 EM_BATTERY_STATE
	 * \endif
	 */
	public 	int 		emState;
}

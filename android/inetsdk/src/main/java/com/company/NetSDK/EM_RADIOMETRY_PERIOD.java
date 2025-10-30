package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * radiometry period
 * \else
 * 热成像查询保存周期
 * \endif
 */
public class EM_RADIOMETRY_PERIOD implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_RADIOMETRY_PERIOD_UNKNOWN = 0;			
	
	/**
	 * \if ENGLISH_LANG
	 * 5minutes,default
	 * \else
	 * 5分钟记录表，默认
	 * \endif
	 */
	public static final int EM_RADIOMETRY_PERIOD_5  = 5;			
	
	/**
	 * \if ENGLISH_LANG
	 * 10minutes  
	 * \else
	 * 10分钟记录表
	 * \endif
	 */
	public static final int EM_RADIOMETRY_PERIOD_10 = 10;           
	
	/**
	 * \if ENGLISH_LANG
	 * 15minutes 
	 * \else
	 * 15分钟记录表
	 * \endif
	 */
	public static final int EM_RADIOMETRY_PERIOD_15 = 15;           
	
	/**
	 * \if ENGLISH_LANG
	 * 30minutes  
	 * \else
	 * 30分钟记录表
	 * \endif
	 */
	public static final int EM_RADIOMETRY_PERIOD_30 = 30;           
}

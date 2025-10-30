package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The time definition in the log information
 * \else
 * 日志信息里的时间定义
 * \endif
 */
public class SDKDEVTIME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Second	1-60	
	 * \else
	 * 秒	1-60	
	 * \endif
	 */
	public int				second;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute	1-60
	 * \else
	 * 分	1-60
	 * \endif
	 */
	public int				minute;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour		1-24		
	 * \else
	 * 时	1-24
	 * \endif
	 */
	public int				hour;
	
	/**
	 * \if ENGLISH_LANG
	 * Date		1-31
	 * \else
	 * 日	1-31	
	 * \endif
	 */
	public int				day;
	
	/**
	 * \if ENGLISH_LANG
	 * Month	1-12	
	 * \else
	 * 月	1-12	
	 * \endif
	 */
	public int				month;
	
	/**
	 * \if ENGLISH_LANG
	 * Year	2000-2063
	 * \else
	 * 年	2000-2063
	 * \endif
	 */
	public int				year;
}

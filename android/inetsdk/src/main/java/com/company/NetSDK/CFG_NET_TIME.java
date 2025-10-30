package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time
 * \else
 * 时间
 * \endif
 */
public class CFG_NET_TIME implements Serializable{
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Year 
	 * \else
	 * 年
	 * \endif
	 */
	public int				dwYear;
	
 	/**
	 * \if ENGLISH_LANG
	 * Month 
	 * \else
	 * 月
	 * \endif
	 */
	public int				dwMonth;
	
 	/**
	 * \if ENGLISH_LANG
	 * Day 
	 * \else
	 * 日
	 * \endif
	 */
	public int				dwDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * Hour
	 * \else
	 * 时
	 * \endif
	 */
	public int				dwHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * Minute 
	 * \else
	 * 分
	 * \endif
	 */
	public int				dwMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * Second 
	 * \else
	 * 秒
	 * \endif
	 */
	public int				dwSecond;

	@Override
	public String toString() {
		return dwYear + "-" + dwMonth + "-" + dwDay + " " + dwHour + ":" + dwMinute + ":" + dwSecond;
	}
}

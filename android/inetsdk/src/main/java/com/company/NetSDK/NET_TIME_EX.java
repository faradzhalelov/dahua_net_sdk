package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * class of time
 * \else
 * 时间类
 * \endif
 */
public class NET_TIME_EX implements Serializable {
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
	public long				dwYear;
	
	/**
	 * \if ENGLISH_LANG
	 * Month
	 * \else
	 * 月
	 * \endif
	 */
	public long				dwMonth;
	
	/**
	 * \if ENGLISH_LANG
	 * Day
	 * \else
	 * 日
	 * \endif
	 */
	public long				dwDay;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour
	 * \else
	 * 时
	 * \endif
	 */
	public long				dwHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute
	 * \else
	 *  分
	 * \endif
	 */
	public long				dwMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Second
	 * \else
	 * 秒
	 * \endif
	 */
	public long				dwSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * Millisecond
	 * \else
	 * 毫秒
	 * \endif
	 */
	public long             dwMillisecond;

	@Override
	public String toString(){
		return "dwYear:"+this.dwYear+"dwMonth:"+this.dwMonth+"dwDay:"+this.dwDay+"dwHour:"+this.dwHour
				+"dwMinute:"+this.dwMinute+"dwSecond:"+this.dwSecond+"dwMillisecond:"+this.dwMillisecond;
	}
	public String toStringTime() {
		return dwYear + "/" + dwMonth + "/" + dwDay + " " + dwHour + ":" + dwMinute + ":" + dwSecond;
	}
}

package com.company.NetSDK;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * \if ENGLISH_LANG
 * class of time
 * \else
 * 时间类
 * \endif
 */
public class NET_TIME implements Serializable {
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
	 * 分
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

	public NET_TIME() {
	}

	public NET_TIME(long dwYear, long dwMonth, long dwDay, long dwHour, long dwMinute, long dwSecond) {
		this.dwYear = dwYear;
		this.dwMonth = dwMonth;
		this.dwDay = dwDay;
		this.dwHour = dwHour;
		this.dwMinute = dwMinute;
		this.dwSecond = dwSecond;
	}

	public void setTime(long dwYear, long dwMonth, long dwDay, long dwHour, long dwMinute, long dwSecond) {
		this.dwYear = dwYear;
		this.dwMonth = dwMonth;
		this.dwDay = dwDay;
		this.dwHour = dwHour;
		this.dwMinute = dwMinute;
		this.dwSecond = dwSecond;
	}

	public String toString() {
		String time = String.format("%04d-%02d-%02d %02d:%02d:%02d",
				dwYear,dwMonth,dwDay,
				dwHour,dwMinute,dwSecond);
		return time;
	}

	public String toMinString() {
		String time = String.format("%04d/%02d/%02d %02d:%02d",
				dwYear,dwMonth,dwDay,
				dwHour,dwMinute);
		return time;
	}

	public void parseTime(String timeFormat){
		String depart[] = timeFormat.split(" ");
		if(depart.length != 2) {
			return;
		} else {
			String left[] = depart[0].split("/");
			String right[] = depart[1].split(":");
			if(left.length != 3 || right.length != 3){
				return;
			} else {
				this.dwYear = Integer.parseInt(left[0]);
				this.dwMonth = Integer.parseInt(left[1]);
				this.dwDay = Integer.parseInt(left[2]);
				this.dwHour = Integer.parseInt(right[0]);
				this.dwMinute = Integer.parseInt(right[1]);
				this.dwSecond = Integer.parseInt(right[2]);
			}
		}
	}

	public void parseTime2Min(String timeFormat){
		String depart[] = timeFormat.split(" ");
		if(depart.length != 2) {
			return;
		} else {
			String left[] = depart[0].split("/");
			String right[] = depart[1].split(":");
			if(left.length != 3 || right.length != 2){
				return;
			} else {
				this.dwYear = Integer.parseInt(left[0]);
				this.dwMonth = Integer.parseInt(left[1]);
				this.dwDay = Integer.parseInt(left[2]);
				this.dwHour = Integer.parseInt(right[0]);
				this.dwMinute = Integer.parseInt(right[1]);
			}
		}
	}

	public boolean biggerThan(NET_TIME that){
		String lTime = this.dwYear + "-" + this.dwMonth + "-" + this.dwDay + " " + this.dwHour + ":" + this.dwMinute + ":" + this.dwSecond;
		String rTime = that.dwYear + "-" + that.dwMonth + "-" + that.dwDay + " " + that.dwHour + ":" + that.dwMinute + ":" + that.dwSecond;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long lts,rts;
		try {
			lts = simpleDateFormat.parse(lTime).getTime();
			rts = simpleDateFormat.parse(rTime).getTime();
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		if(lts > rts){
			return true;
		}
		return false;
	}

}

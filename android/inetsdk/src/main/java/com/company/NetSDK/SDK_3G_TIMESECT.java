package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time structure
 * \else
 * 时间段结构 
 * \endif
 */
public class SDK_3G_TIMESECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Time period enable,1 shows this time period valid,0 shows invalid.
	 * \else
	 * 时间段使能，1表示该时间段有效，0表示该时间段无效。
	 * \endif
	 */
	public byte                bEnable; 
	public byte                bBeginHour;
	public byte                bBeginMin;
    public byte                bBeginSec;
    public byte                bEndHour;
    public byte                bEndMin;
    public byte                bEndSec;
}

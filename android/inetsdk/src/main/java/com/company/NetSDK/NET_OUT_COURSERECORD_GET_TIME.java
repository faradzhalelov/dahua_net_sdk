package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output of get course recorded time
 * \else
 * 获取当前课程已录制时间出参
 * \endif
 */

public class NET_OUT_COURSERECORD_GET_TIME implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * recorded time, unit: second
	 * \else
	 * 已录制时间，单位:秒
	 * \endif
	 */
    public int                        nTime;                              
}

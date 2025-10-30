package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter about getting mode of course record 
 * \else
 * 获取录像模式入参
 * \endif
 */
public class NET_IN_GET_COURSE_RECORD_MODE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * classroom id
	 * \else
	 * 教室id号
	 * \endif
	 */
	public     int                         nClassRoomID;                   
}

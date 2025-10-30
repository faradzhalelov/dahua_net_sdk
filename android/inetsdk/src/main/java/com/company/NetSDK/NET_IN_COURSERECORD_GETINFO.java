package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of get course record info
 * \else
 * 获取指定教室的录像信息入参
 * \endif
 */

public class NET_IN_COURSERECORD_GETINFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * classroom id,defult:0
	 * \else
	 * 教室ID,0为默认教室
	 * \endif
	 */
	public int                         nClassRoomID;                        
}

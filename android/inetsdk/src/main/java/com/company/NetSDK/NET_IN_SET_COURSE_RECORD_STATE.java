package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * enable/unable designated channel video input parameter
 * \else
 * 开启/关闭指定通道录像入参
 * \endif
 */
public class NET_IN_SET_COURSE_RECORD_STATE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                      nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:enable 1:unable
	 * \else
	 * 0:开启, 1:关闭
	 * \endif
	 */
	public int                      nAction;	
}

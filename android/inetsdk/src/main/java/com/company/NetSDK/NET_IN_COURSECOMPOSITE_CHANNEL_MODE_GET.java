package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input params of get CourseCompositeChannelMode
 * \else
 * 录播主机获取模式入参
 * \endif
 */
public class NET_IN_COURSECOMPOSITE_CHANNEL_MODE_GET implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * onumber of get mode
	 * \else
	 * 要获取的模式个数
	 * \endif
	 */
	public int   nCount = 0;

}

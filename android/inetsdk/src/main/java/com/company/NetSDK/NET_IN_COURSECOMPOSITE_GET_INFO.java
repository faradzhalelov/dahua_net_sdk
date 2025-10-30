package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of get composite channel info 
 * \else
 * 获取组合通道信息入参
 * \endif
 */
public class NET_IN_COURSECOMPOSITE_GET_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * classroom id
	 * \else
	 * 教室ID号
	 * \endif
	 */
    public int                     nClassRoomId;                  
}

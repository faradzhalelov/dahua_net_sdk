package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of set composite channel info
 * \else
 * 设置组合通道信息入参
 * \endif
 */
public class NET_IN_COURSECOMPOSITE_SET_INFO implements Serializable{
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
    public int                          nClassRoomId;                            
    
	/**
	 * \if ENGLISH_LANG
	 * composite channel info
	 * \else
	 * 组合通道信息
	 * \endif
	 */
    public NET_COMPOSITECHANNEL_INFO    stuChannelInfo = new NET_COMPOSITECHANNEL_INFO();                          
}

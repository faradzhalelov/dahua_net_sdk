package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of get lock state
 * \else
 * 获取锁定状态入参
 * \endif
 */
public class NET_IN_COURSECOMPOSITE_GET_LOCKINFO implements Serializable{
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
    public int                     nClassRoomID;  
    
	/**
	 * \if ENGLISH_LANG
	 * logic channel
	 * \else
	 * 逻辑通道号
	 * \endif
	 */
    public int                     nLogicChannel;                 
}

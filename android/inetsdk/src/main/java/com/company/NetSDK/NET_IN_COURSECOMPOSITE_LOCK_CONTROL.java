package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of set lock or unlock
 * \else
 * 锁定和解锁组合通道和逻辑通道入参
 * \endif
 */
public class NET_IN_COURSECOMPOSITE_LOCK_CONTROL implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TRUE lock，FALSE unlock
	 * \else
	 * TRUE锁定，FALSE 解锁
	 * \endif
	 */
    public boolean                    bLock;
    
	/**
	 * \if ENGLISH_LANG
	 * classroom id
	 * \else
	 * 教室ID号  
	 * \endif
	 */
    public int                       nClassRoomID;                  
    
	/**
	 * \if ENGLISH_LANG
	 * logic channel
	 * \else
	 * 逻辑通道号
	 * \endif
	 */
    public int                      nLogicChannel;                 
}

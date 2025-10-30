package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of set course record info
 * \else
 * 设置指定教室的录像信息入参
 * \endif
 */

public class NET_IN_COURSERECORD_SETINFO implements Serializable{
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
    
	/**
	 * \if ENGLISH_LANG
	 * logic channel number
	 * \else
	 * 逻辑通道数量
	 * \endif
	 */
    public int                         nChannelNum;                            
    
	/**
	 * \if ENGLISH_LANG
	 * 0:invalid,1:record,2unrecord,number is logic channel id
	 * \else
	 * 0:无效,1:录像,2不录像,下标对应为逻辑通道号
	 * \endif
	 */
    public int[]                       nCanRecord = new int[FinalVar.MAX_COURSE_LOGIC_CHANNEL];   
}

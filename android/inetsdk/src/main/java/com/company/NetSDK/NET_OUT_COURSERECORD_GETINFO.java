package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output of get course record info
 * \else
 * 获取指定教室的录像信息出参
 * \endif
 */

public class NET_OUT_COURSERECORD_GETINFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * logic channel number
	 * \else
	 * 逻辑通道数量
	 * \endif
	 */
    public int                 nChannelNum;                           
    
	/**
	 * \if ENGLISH_LANG
	 * 0:invalid,1:record,2:unrecord,number is logic channel id
	 * \else
	 * 0:无效,1:录像,2:不录像,下标对应为逻辑通道号
	 * \endif
	 */
    public int[]               nCanRecord = new int[FinalVar.MAX_COURSE_LOGIC_CHANNEL];  
}

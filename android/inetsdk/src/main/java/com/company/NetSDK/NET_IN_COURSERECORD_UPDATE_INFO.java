package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of update record info to  time
 * \else
 * 录像信息更新到time入参
 * \endif
 */
public class NET_IN_COURSERECORD_UPDATE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * classroom id, defult:0
	 * \else
	 * 教室ID,0为默认教室
	 * \endif
	 */
    public int                 nClassRoomID;                        
    
	/**
	 * \if ENGLISH_LANG
	 * query time
	 * \else
	 * 查询时间
	 * \endif
	 */
    public NET_TIME            stuTime = new NET_TIME();                             
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input of update composite channel info to time
 * \else
 * 组合通道信息更新到time入参
 * \endif
 */

public class NET_IN_COURSECOMPOSITE_UPDATE_INFO implements Serializable{
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
    public int                         nClassRoomId;                        
    
	/**
	 * \if ENGLISH_LANG
	 * query time
	 * \else
	 * 查询时间
	 * \endif
	 */
    public NET_TIME                    stuTime = new NET_TIME();                             
}

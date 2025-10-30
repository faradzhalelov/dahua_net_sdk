package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * to confirm event info 
 * \else
 * 待确认的事件的信息
 * \endif
 */
public class NET_EVENT_INFO_TO_CONFIRM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * event type , corresponding to {@link INetSDK#AttachBusState} event type
	 * \else
	 * 事件类型, 对应 {@link INetSDK#AttachBusState} 接口的事件类型
	 * \endif
	 */
	public int               dwEventType;            
	
	/**
	 * \if ENGLISH_LANG
	 * event time, UTC
	 * \else
	 * 事件时间, UTC制
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();                
	
	/**
	 * \if ENGLISH_LANG
	 * event time, UTC, unit is second
	 * \else
	 * 事件时间, UTC制, 单位秒
	 * \endif
	 */
    public int                lTime;                  
}

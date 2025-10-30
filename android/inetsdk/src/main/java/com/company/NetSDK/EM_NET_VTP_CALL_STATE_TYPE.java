package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of video phone call
 * \else
 * 视频电话呼叫状态类型
 * \endif
 */
public class EM_NET_VTP_CALL_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Initial State
	 * \else
	 * 初始状态
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_IDLE = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling(the opposite side not response)
	 * \else
	 * 主叫呼叫状态(对方未回应)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CALLING = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of called
	 * \else
	 * 被叫呼叫状态
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CALLED = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling back (the opposite side responsed but no answer)
	 * \else
	 * 主叫回铃状态(对方回应, 但没有接听)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_RINGING = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of answering 
	 * \else
	 * 通话中状态
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CONNECTING = 5; 
	
	/**
	 * \if ENGLISH_LANG
	 * 2 states in the call 
	 * \else
	 * 通话中2状态(通话媒体变更后的通话中状态)
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_CONNECTING2 = 6; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of call off
	 * \else
	 * 通话挂断状态
	 * \endif
	 */
	public final static int EM_NET_VTP_CALL_STATE_DISCONNECT = 7; 
}

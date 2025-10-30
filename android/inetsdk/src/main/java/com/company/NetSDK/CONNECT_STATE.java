package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * State of Connection
 * \else
 * 连接信息
 * \endif
 */
public class CONNECT_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unconnected
	 * \else
	 * 没有连接
	 * \endif
	 */
	public static final int  CONNECT_STATE_UNCONNECT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Connecting
	 * \else
	 * 连接中
	 * \endif
	 */
	public static final int  CONNECT_STATE_CONNECTING = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Connected
	 * \else
	 * 已连接
	 * \endif
	 */
	public static final int  CONNECT_STATE_CONNECTED = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Connect Error
	 * \else
	 * 连接错误
	 * \endif
	 */
	public static final int  CONNECT_STATE_ERROR = 255;
}

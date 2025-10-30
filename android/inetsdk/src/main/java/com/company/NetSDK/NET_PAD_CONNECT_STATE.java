package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PAD/DVR connection state type  
 * \else
 * PAD/DVR连接状态
 * \endif
 */
public class NET_PAD_CONNECT_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public final static int NET_PAD_CONNECT_STATE_UNKNOWN = 0;       
	
	/**
	 * \if ENGLISH_LANG
	 * unconnected 
	 * \else
	 * 未连接
	 * \endif
	 */
	public final static int NET_PAD_CONNECT_STATE_UNCONNECTED = 1;   
	
	/**
	 * \if ENGLISH_LANG
	 * connected 
	 * \else
	 * 连接
	 * \endif
	 */
	public final static int NET_PAD_CONNECT_STATE_CONNECTED = 2;     
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * connection state
 * \else
 * 连接状态
 * \endif
 */
public class EM_CAMERA_STATE_TYPE implements Serializable {

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
	public static final int EM_CAMERA_STATE_TYPE_UNKNOWN = 0;       
	
	/**
	 * \if ENGLISH_LANG
	 * connecting
	 * \else
	 * 正在连接
	 * \endif
	 */
	public static final int EM_CAMERA_STATE_TYPE_CONNECTING = 1;    
	
	/**
	 * \if ENGLISH_LANG
	 * connected
	 * \else
	 * 已连接
	 * \endif
	 */
	public static final int EM_CAMERA_STATE_TYPE_CONNECTED = 2;     
	
	/**
	 * \if ENGLISH_LANG
	 * unconnected
	 * \else
	 * 未连接
	 * \endif
	 */
	public static final int EM_CAMERA_STATE_TYPE_UNCONNECT = 3;     
	
	/**
	 * \if ENGLISH_LANG
	 * channel is not configured, no info
	 * \else
	 * 通道未配置,无信息
	 * \endif
	 */
	public static final int EM_CAMERA_STATE_TYPE_EMPTY = 4;         
	
	/**
	 * \if ENGLISH_LANG
	 * channel is configured, but it is forbidden.
	 * \else
	 * 通道有配置,但被禁用
	 * \endif
	 */
	public static final int EM_CAMERA_STATE_TYPE_DISABLE = 5;       
}

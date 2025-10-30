package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Callback data(Asynchronous interface)
 * \else
 * 回调数据(异步接口)
 * \endif
 */
public class NET_CALLBACK_DATA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Result code;0:Success
	 * \else
	 * 返回码；0：成功
	 * \endif
	 */
	public int					nResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Receive data,buffer is opened by the user,from the interface parameters
	 * \else
	 * 接收数据
	 * \endif
	 */
	public char[]				pBuf;
	
	/**
	 * \if ENGLISH_LANG
	 * The length of receive data
	 * \else
	 * 接收长度
	 * \endif
	 */
	public int					nRetLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Operating handle
	 * \else
	 * 操作句柄
	 * \endif
	 */
	public long				lOperateHandle;
	
	/**
	 * \if ENGLISH_LANG
	 * User parameters
	 * \else
	 * 操作对应用户参数
	 * \endif
	 */
	public long				userdata;
}

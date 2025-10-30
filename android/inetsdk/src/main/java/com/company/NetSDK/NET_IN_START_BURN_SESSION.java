package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartBurnSession} input param
 * \else
 * {@link INetSDK#StartBurnSession} 接口输入参数
 * \endif
 */
public class NET_IN_START_BURN_SESSION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * session ID
	 * \else
	 * 会话ID
	 * \endif
	 */
	public int         nSessionID;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Push the server configuration
 * \else
 * 推送服务器配置
 * \endif
 */
public class NET_PUSH_SERVER_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Address
	 * \else
	 * 地址
	 * \endif
	 */
	public byte                           szAddress[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * 端口
	 * \endif
	 */
    public int                             nPort;
}

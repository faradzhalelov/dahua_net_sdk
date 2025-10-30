package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Push server config info
 * \else
 * 推送服务器配置
 * \endif
 */
public class NET_PUSH_SERVER_INFO_EX implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ip address
	 * \else
	 * 地址
	 * \endif
	 */
	public byte                            szAddress[] = new byte[FinalVar.MAX_URL_LEN];

	/**
	 * \if ENGLISH_LANG
	 * port
	 * \else
	 * 端口
	 * \endif
	 */
	public int                             nPort;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * service
 * \else
 * 服务器
 * \endif
 */
public class CFG_SERVER_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * service port
	 * \else
	 * 服务器端口号
	 * \endif
	 */
	public int                 nPort;                             
	
	/**
	 * \if ENGLISH_LANG
	 * IP address or net name
	 * \else
	 * IP地址或网络名
	 * \endif
	 */
	public byte                szAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];        
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MAC, IP filter configuration info
 * \else
 * MAC，IP过滤信息
 * \endif
 */
public class MACIP_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * mac
	 * \else
	 * mac
	 * \endif
	 */
	public byte        szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ip
	 * \else
	 * ip
	 * \endif
	 */
	public byte        szIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
}

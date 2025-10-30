package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MAC info
 * \else
 * MAC信息
 * \endif
 */
public class MACFILTER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * MAC count
	 * \else
	 * MAC个数
	 * \endif
	 */
	public int                dwMacNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * MAC
	 * \else
	 * MAC
	 * \endif
	 */
	public byte                 szMac[][] = new byte[FinalVar.SDK_MACFILTER_NUM][FinalVar.SDK_MACADDR_LEN];
}

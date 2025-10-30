package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP Information extended
 * \else
 * IP信息扩展
 * \endif
 */
public class IPIFILTER_INFO_EX implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * IP count
	 * \else
	 * IP个数
	 * \endif
	 */
	public int               dwIPNum;
	
	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte                SZIP[][] = new byte[FinalVar.SDK_IPIFILTER_NUM_EX][FinalVar.SDK_MAX_IPADDR_LEN];
}

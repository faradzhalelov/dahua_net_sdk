package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * network transmission mode
 * \else
 * 网络传输模式
 * \endif
 */
public class CFG_ENUM_NET_TRANSMISSION_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * adapt
	 * \else
	 * 自适应
	 * \endif
	 */
	public static final int    CFG_ENUM_NET_MODE_ADAPT = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * half 10M
	 * \else
	 * 10M半双工
	 * \endif
	 */
	public static final int    CFG_ENUM_NET_MODE_HALF10M = 1;                          
	
	/**
	 * \if ENGLISH_LANG
	 * full 10M
	 * \else
	 * 10M全双工
	 * \endif
	 */
	public static final int    CFG_ENUM_NET_MODE_FULL10M = 2;                          
	
	/**
	 * \if ENGLISH_LANG
	 * half 100M
	 * \else
	 * 100M半双工
	 * \endif
	 */
	public static final int    CFG_ENUM_NET_MODE_HALF100M = 3;                         
	
	/**
	 * \if ENGLISH_LANG
	 * full 100M
	 * \else
	 * 100M全双工
	 * \endif
	 */
	public static final int    CFG_ENUM_NET_MODE_FULL100M = 4;                         
}

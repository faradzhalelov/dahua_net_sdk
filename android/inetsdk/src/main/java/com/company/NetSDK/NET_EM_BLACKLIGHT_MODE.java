package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * back light mode
 * \else
 * 背光补偿模式
 * \endif
 */
public class NET_EM_BLACKLIGHT_MODE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unkonw
	 * \else
	 * 未知模式
	 * \endif
	 */
	public static final int NET_EM_BLACKLIGHT_UNKNOW = 0;						
	
	/**
	 * \if ENGLISH_LANG
	 * default
	 * \else
	 * 默认模式
	 * \endif
	 */
	public static final int NET_EM_BLACKLIGHT_DEFAULT = 1;						
	
	/**
	 * \if ENGLISH_LANG
	 * region
	 * \else
	 * 自定义区域模式
	 * \endif
	 */
	public static final int NET_EM_BLACKLIGHT_REGION = 2;						
}

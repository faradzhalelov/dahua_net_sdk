package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * config type
 * \else
 * 每个通道对应的配置类型
 * \endif
 */
public class NET_EM_CONFIG_TYPE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * day time
	 * \else
	 * 白天
	 * \endif
	 */
	public static final int NET_EM_CONFIG_DAYTIME = 0;			
	
	/**
	 * \if ENGLISH_LANG
	 * night
	 * \else
	 * 夜晚
	 * \endif
	 */
	public static final int NET_EM_CONFIG_NIGHT = 1;			
	
	/**
	 * \if ENGLISH_LANG
	 * normal
	 * \else
	 * 普通
	 * \endif
	 */
	public static final int NET_EM_CONFIG_NORMAL = 2;			
}

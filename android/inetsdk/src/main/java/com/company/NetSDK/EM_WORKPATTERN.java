package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Accesspoint work pattern type
 * \else
 * Accesspoint 工作模式
 * \endif
 */
public class EM_WORKPATTERN implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_WORKPATTERN_UNKNOWN = 0;                          
    
	/**
	 * \if ENGLISH_LANG
	 * 2.4G default
	 * \else
	 * 默认为2.4G工作模式的配置
	 * \endif
	 */
    public static final int EM_WORKPATTERN_2_4G = 1;                            
    
	/**
	 * \if ENGLISH_LANG
	 * 5G
	 * \else
	 * 5G模式的配置
	 * \endif
	 */
    public static final int EM_WORKPATTERN_5G = 2;                               
}

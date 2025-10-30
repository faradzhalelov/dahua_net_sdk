package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record mdoe
 * \else
 * 录制模式
 * \endif
 */

public class EM_COMPOSITECHANNEL_MODE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * customer
	 * \else
	 * 自定义
	 * \endif
	 */
    public static final int EM_COMPOSITECHANNEL_CUSTOMER  = -1;                      
    
	/**
	 * \if ENGLISH_LANG
	 * invalid
	 * \else
	 * 无效
	 * \endif
	 */
	public static final int EM_COMPOSITECHANNEL_INVALID   = 0;                           
	
	/**
	 * \if ENGLISH_LANG
	 * movie
	 * \else
	 * 电影模式
	 * \endif
	 */
	public static final int EM_COMPOSITECHANNEL_MOVIE     = 1;                              
	
	/**
	 * \if ENGLISH_LANG
	 * normal
	 * \else
	 * 常态模式
	 * \endif
	 */
	public static final int EM_COMPOSITECHANNEL_NORMALCY  = 2;                           
	
	/**
	 * \if ENGLISH_LANG
	 * pick
	 * \else
	 * 精品模式
	 * \endif
	 */
	public static final int EM_COMPOSITECHANNEL_PICK      = 3;                             
}

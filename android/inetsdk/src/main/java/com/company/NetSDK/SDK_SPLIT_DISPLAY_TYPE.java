package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Display type
 * \else
 * 显示类型
 * \endif
 */
public class SDK_SPLIT_DISPLAY_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Common display types
	 * \else
	 * 普通显示类型
	 * \endif
	 */
    public static final int SDK_SPLIT_DISPLAY_TYPE_GENERAL = 1;          
    		
	/**
	 * \if ENGLISH_LANG
	 * PIP Display Type
	 * \else
	 * 画中画显示类型
	 * \endif
	 */    		
    public static final int SDK_SPLIT_DISPLAY_TYPE_PIP = 2;             
    
	/**
	 * \if ENGLISH_LANG
	 * Custom Display Type
	 * \else
	 * 自由组合分割模式
	 * \endif
	 */
    public static final int SDK_SPLIT_DISPLAY_TYPE_CUSTOM = 3;          
}

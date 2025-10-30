package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Color type
 * \else
 * 颜色类型 
 * \endif
 */
public class EM_COLOR_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Red
	 * \else
	 * 红色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_RED 		= 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Yellow
	 * \else
	 * 黄色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_YELLOW 	= 1	;
	
	/**
	 * \if ENGLISH_LANG
	 * Green
	 * \else
	 * 绿色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_GREEN 	= 2 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Cyan
	 * \else
	 * 青色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_CYAN		= 3 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue
	 * \else
	 * 蓝色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_BLUE		= 4 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Purple
	 * \else
	 * 紫色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_PURPLE	= 5	;
	
	/**
	 * \if ENGLISH_LANG
	 * Black
	 * \else
	 * 黑色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_BLACK	= 6 ;
	
	/**
	 * \if ENGLISH_LANG
	 * White
	 * \else
	 * 白色
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_WHITE	= 7 ;

	public static final int NET_COLOR_TYPE_MAX		= 8 ;
}

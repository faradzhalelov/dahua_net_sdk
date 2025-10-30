package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* window Z sequence
* \else
* 窗口Z次序
* \endif
*/
public class NET_WINDOW_ZORDER implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * top
	 * \else
	 * 顶层
	 * \endif
	 */
	public static final int NET_WINDOW_ZORDER_TOP = 0;                              
	
	 /**
	 * \if ENGLISH_LANG
	 * bottom
	 * \else
	 * 底层
	 * \endif
	 */
	public static final int NET_WINDOW_ZORDER_BOTTOM = 1;                          
	
	 /**
	 * \if ENGLISH_LANG
	 * up
	 * \else
	 * 往上一层
	 * \endif
	 */
	public static final int NET_WINDOW_ZORDER_UP = 2;                       
	
	 /**
	 * \if ENGLISH_LANG
	 * down
	 * \else
	 * 往下一层
	 * \endif
	 */
	public static final int NET_WINDOW_ZORDER_DOWN = 3;                            
}

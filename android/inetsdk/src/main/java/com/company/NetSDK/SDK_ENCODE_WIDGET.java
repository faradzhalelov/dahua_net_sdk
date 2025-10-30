package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD attribute structure
 * \else
 * OSD属性结构
 * \endif
 */
public class SDK_ENCODE_WIDGET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front ground 
	 * \else
	 * 物件的前景；按字节表示，分别为红、绿、蓝和透明度
	 * \endif
	 */
	public int				rgbaFrontground;
	
	/**
	 * \if ENGLISH_LANG
	 * Back ground 
	 * \else
	 * 物件的背景；按字节表示，分别为红、绿、蓝和透明度
	 * \endif
	 */
	public int				rgbaBackground;
	
	/**
	 * \if ENGLISH_LANG
	 * Position 
	 * \else
	 * 位置
	 * \endif
	 */
	public SDK_RECT				rcRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Show
	 * \else
	 * 显示使能
	 * \endif
	 */
	public byte				bShow;
	
	/**
	 * \if ENGLISH_LANG
	 * Extend Function Mask，0-Not Display，1-Display 
	 * \else
	 * 扩展使能 ，掩码  bit0 表示是否显示星期几，0-不显示 1-显示 
	 * \endif
	 */
	public byte                bExtFuncMask;
}

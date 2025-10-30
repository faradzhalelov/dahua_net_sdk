package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * image stable type
 * \else
 * 图像防抖模式
 * \endif
 */
public class NET_EM_STABLE_TYPE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * off
	 * \else
	 * 关闭
	 * \endif
	 */
	public static final int NET_EM_STABLE_OFF = 0;				
	
	/**
	 * \if ENGLISH_LANG
	 * electronics
	 * \else
	 * 电子防抖
	 * \endif
	 */
	public static final int NET_EM_STABLE_ELEC = 1;				 
	
	/**
	 * \if ENGLISH_LANG
	 * light
	 * \else
	 * 光学防抖
	 * \endif
	 */
	public static final int NET_EM_STABLE_LIGHT = 2;			
	
	/**
	 * \if ENGLISH_LANG
	 * control
	 * \else
	 * 控件防抖
	 * \endif
	 */
	public static final int NET_EM_STABLE_CONTORL = 3;	
}

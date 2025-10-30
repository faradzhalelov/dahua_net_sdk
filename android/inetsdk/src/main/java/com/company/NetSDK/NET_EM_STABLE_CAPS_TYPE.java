package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the stable caps type
 * \else
 * 防抖类型
 * \endif
 */
public class NET_EM_STABLE_CAPS_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unsupport
	 * \else
	 * 不支持图像防抖
	 * \endif
	 */
	public static final int EM_STABLE_UNSPPORT = 0;					
	
	/**
	 * \if ENGLISH_LANG
	 * electornic
	 * \else
	 * 支持电子防抖
	 * \endif
	 */
	public static final int EM_STABLE_ELEC = 1;						 
	
	/**
	 * \if ENGLISH_LANG
	 * light
	 * \else
	 * 支持光学防抖
	 * \endif
	 */
	public static final int EM_STABLE_LIGHT = 2;					
	
	/**
	 * \if ENGLISH_LANG
	 * electornic and light
	 * \else
	 * 支持电子防抖和光学防抖
	 * \endif
	 */
	public static final int EM_STAVLE_ELEC_AND_LIGHT = 3;			 
	
	/**
	 * \if ENGLISH_LANG
	 * control
	 * \else
	 * 支持控件防抖
	 * \endif
	 */
	public static final int EM_STABLE_CONTROL = 4;					 
	
	/**
	 * \if ENGLISH_LANG
	 * electornic and control
	 * \else
	 * 支持电子防抖和控件防抖
	 * \endif
	 */
	public static final int EM_STABLE_ELEC_AND_CONTROL = 5;			 
	
	/**
	 * \if ENGLISH_LANG
	 * light and control
	 * \else
	 * 支持光学防抖和控件防抖
	 * \endif
	 */
	public static final int EM_STABLE_LIGHT_AND_CONTROL = 6;		 
}

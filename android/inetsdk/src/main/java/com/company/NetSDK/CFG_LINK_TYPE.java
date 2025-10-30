package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activation Type 
 * \else
 * 云台联动类型
 * \endif
 */
public class CFG_LINK_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * No Activation
	 * \else
	 * 无联动
	 * \endif
	 */
	public static final int LINK_TYPE_NONE = 0;						    		

	/**
	 * \if ENGLISH_LANG
	 * Activitation Preset Point
	 * \else
	 * 联动预置点
	 * \endif
	 */
	public static final int LINK_TYPE_PRESET = 1;								

	/**
	 * \if ENGLISH_LANG
	 * Activation Tour
	 * \else
	 * 联动巡航
	 * \endif
	 */
	public static final int LINK_TYPE_TOUR = 2;									

	/**
	 * \if ENGLISH_LANG
	 * Activation Pattern
	 * \else
	 * 联动轨迹
	 * \endif
	 */
	public static final int LINK_TYPE_PATTERN = 3;								
}

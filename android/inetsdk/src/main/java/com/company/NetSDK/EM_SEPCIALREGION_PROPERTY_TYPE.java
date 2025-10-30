package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sepcial region property type
 * \else
 * 特殊区域的属性类型
 * \endif
 */

public class EM_SEPCIALREGION_PROPERTY_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Hight light, screen detection area has this feature
	 * \else
	 * 高亮，键盘检测区域具有此特性
	 * \endif
	 */
	public static final int EM_SEPCIALREGION_PROPERTY_TYPE_HIGHLIGHT = 1;      
	
	/**
	 * \if ENGLISH_LANG
	 * Regular blink,card area has this feature
	 * \else
	 * 规律的闪烁，插卡区域具有此特性
	 * \endif
	 */
	public static final int EM_SEPCIALREGION_PROPERTY_TYPE_REGULARBLINK = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Iregular blink,keyboard area has this feature
	 * \else
	 * 不规律的闪烁，屏幕区域具有此特性
	 * \endif
	 */
	public static final int EM_SEPCIALREGION_PROPERTY_TYPE_IREGULARBLINK = 3;   
	
	public static final int EM_SEPCIALREGION_PROPERTY_TYPE_NUM = 4;
}

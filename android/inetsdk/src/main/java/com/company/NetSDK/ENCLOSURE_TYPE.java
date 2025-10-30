package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Electronic Fence Type
 * \else
 * 电子围栏类型枚举
 * \endif
 */
public class ENCLOSURE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Speed Zone
	 * \else
	 * 限速区
	 * \endif
	 */
	public static final int ENCLOSURE_LIMITSPEED = 0x01;                    
 	/**
	 * \if ENGLISH_LANG
	 * Driver Zone
	 * \else
	 * 驾驶区
	 * \endif
	 */
	public static final int ENCLOSURE_DRIVEALLOW = 0x02;                    
 	/**
	 * \if ENGLISH_LANG
	 * Forbidden Zone
	 * \else
	 * 禁止区
	 * \endif
	 */
	public static final int ENCLOSURE_FORBIDDRIVE = 0x04;                   
 	/**
	 * \if ENGLISH_LANG
	 * Loading Area
	 * \else
	 * 装货区
	 * \endif
	 */
	public static final int ENCLOSURE_LOADGOODS = 0x08;                     
 	/**
	 * \if ENGLISH_LANG
	 * Unloading Area
	 * \else
	 * 卸货区
	 * \endif
	 */
	public static final int ENCLOSURE_UPLOADGOODS = 0x10;                   
}

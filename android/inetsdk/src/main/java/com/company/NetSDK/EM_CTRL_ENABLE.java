package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm enable control. 
 * \else
 * 报警使能控制方式枚举类型
 * \endif
 */
public class EM_CTRL_ENABLE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * no control enable
	 * \else
	 * 不控制使能
	 * \endif
	 */
	public static final int EM_CTRL_NORMAL = 0;   

	/**
	 * \if ENGLISH_LANG
	 * always enable
	 * \else
	 * 总是使能
	 * \endif
	 */
	public static final int EM_CTRL_ALWAYS_EN = 1;  

	/**
	 * \if ENGLISH_LANG
	 * bypass
	 * \else
	 * 旁路
	 * \endif
	 */
	public static final int EM_CTRL_ONCE_DIS = 2;   

	/**
	 * \if ENGLISH_LANG
	 * remove
	 * \else
	 * 移除
	 * \endif
	 */
	public static final int EM_CTRL_ALWAYS_DIS = 3; 

	/**
	 * \if ENGLISH_LANG
	 * enumeration type total
	 * \else
	 * 枚举类型总数
	 * \endif
	 */
	public static final int EM_CTRL_NUM = 4;         
}

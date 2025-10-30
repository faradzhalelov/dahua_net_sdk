package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The language types device supported 
 * \else
 * 设备支持语言种类
 * \endif
 */
public class SDK_DEV_LANGUAGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The language amount supported
	 * \else
	 * 支持语言个数
	 * \endif
	 */
	public int					dwLanguageNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Enumeration value please refer to {@link SDK_LANGUAGE_TYPE}
	 * \else
	 * 枚举值，详见 {@link SDK_LANGUAGE_TYPE}
	 * \endif
	 */
	public byte					byLanguageType[] = new byte[252];	
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Talk From
 * \else
 * 对讲发起方
 * \endif
 */
public class EM_TALKING_CALLER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知发起方
	 * \endif
	 */
	public static final int EM_TALKING_CALLER_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Talk from Platform
	 * \else
	 * 对讲发起方为平台
	 * \endif
	 */
	public static final int EM_TALKING_CALLER_PLATFORM = 1;
}

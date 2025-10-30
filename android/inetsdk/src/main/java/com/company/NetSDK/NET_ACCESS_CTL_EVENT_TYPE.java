package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control Event Type
 * \else
 * 门禁事件类型
 * \endif
 */
public class NET_ACCESS_CTL_EVENT_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_ACCESS_CTL_EVENT_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Enter
	 * \else
	 * 进门
	 * \endif
	 */
	public static final int NET_ACCESS_CTL_EVENT_ENTRY   = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Exit
	 * \else
	 * 出门
	 * \endif
	 */
	public static final int NET_ACCESS_CTL_EVENT_EXIT    = 2;
}

package com.company.NetSDK;

import java.io.Serializable;


public class SDK_SNIFFER_FRAMEID implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Symbol position bit Offset
	 * \else
	 * 标志位的位偏移
	 * \endif
	 */
	public int           Offset;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position length
	 * \else
	 * 标志位的长度
	 * \endif
	 */
	public int           Length;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position value
	 * \else
	 * 标志位的值
	 * \endif
	 */
	public byte          Key[] = new byte[16];

}

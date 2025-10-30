package com.company.NetSDK;

import java.io.Serializable;


public class SDK_SNIFFER_CONTENT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position bit offset
	 * \else
	 * 标志位的位偏移
	 * \endif
	 */
	public int           Offset;

	/**
	 * \if ENGLISH_LANG
	 * It is invalid now
	 * \else
	 * 目前没有应用
	 * \endif
	 */
	public int           Offset2;

	/**
	 * \if ENGLISH_LANG
	 * The symbol position length
	 * \else
	 * 标志位的长度
	 * \endif
	 */
	public int           Length;

	/**
	 * \if ENGLISH_LANG
	 * It is invalid now
	 * \else
	 * 目前没有应用
	 * \endif
	 */
	public int           Length2;

	/**
	 * \if ENGLISH_LANG
	 * Title value
	 * \else
	 * 标题的值
	 * \endif
	 */
	public byte          Title[] = new byte[12];

	/**
	 * \if ENGLISH_LANG
	 * Key value
	 * \else
	 * 关键字的值
	 * \endif
	 */
	public byte          Key[] = new byte[12];
}

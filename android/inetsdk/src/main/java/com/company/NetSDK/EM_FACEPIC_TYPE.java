package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * picture type
 * \else
 * 图片类型
 * \endif
 */
public class EM_FACEPIC_TYPE implements Serializable {
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
	public final static int NET_FACEPIC_TYPE_UNKOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * face full size picture
	 * \else
	 * 目标全景大图
	 * \endif
	 */
	public final static int NET_FACEPIC_TYPE_GLOBAL_SENCE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * face small pictrure
	 * \else
	 * 目标小图
	 * \endif
	 */
	public final static int NET_FACEPIC_TYPE_SMALL = 2;
}

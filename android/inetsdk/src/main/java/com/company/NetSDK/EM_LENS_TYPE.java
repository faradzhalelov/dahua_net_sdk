package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * lens type
 * \else
 * 镜头类型
 * \endif
 */
public class EM_LENS_TYPE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_LENS_TYPE_UNKNOWN = -1;

	/**
	 * \if ENGLISH_LANG
	 * fixed focus
	 * \else
	 * 定焦
	 * \endif
	 */
	public static final int EM_LENS_TYPE_FIXED_FOCUS = 0;

	/**
	 * \if ENGLISH_LANG
	 * internel zoom lens
	 * \else
	 * 内置变焦镜头
	 * \endif
	 */
	public static final int EM_LENS_TYPE_INTERNEL_ZOOM = 1;

	/**
	 * \if ENGLISH_LANG
	 * manual zoom lens
	 * \else
	 * 手动变焦镜头
	 * \endif
	 */
	public static final int EM_LENS_TYPE_MANUAL_ZOOM = 2;

	/**
	 * \if ENGLISH_LANG
	 * externel zoom lens
	 * \else
	 * 外置变焦镜头
	 * \endif
	 */
	public static final int EM_LENS_TYPE_EXTERNEL_ZOOM = 3;

}

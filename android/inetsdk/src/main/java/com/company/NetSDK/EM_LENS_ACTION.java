package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * lens action
 * \else
 * 镜头行为
 * \endif
 */
public class EM_LENS_ACTION implements Serializable {

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
	public static final int EM_LENS_ACTION_UNKNOWN = -1;

	/**
	 * \if ENGLISH_LANG
	 * single step(single click +-)
	 * \else
	 * 单步(单击+-)
	 * \endif
	 */
	public static final int EM_LENS_ACTION_SINGLE_STEP = 0;

	/**
	 * \if ENGLISH_LANG
	 * start continuous adjustment(long press +-)
	 * \else
	 * 开始持续调整(长按+-)
	 * \endif
	 */
	public static final int EM_LENS_ACTION_START_CONTINUOUS_ADJUSTMENT = 1;

	/**
	 * \if ENGLISH_LANG
	 * end continuous adjustment(end long press +-)
	 * \else
	 * 结束持续调整(结束长按+-)
	 * \endif
	 */
	public static final int EM_LENS_ACTION_END_CONTINUOUS_ADJUSTMENT = 2;

}

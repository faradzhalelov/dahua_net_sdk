package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the range of dejitter
 * \else
 * 去抖动配置信息
 * \endif
 */
public class CFG_DEJITTER_RANGE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * it means have this opertion yes or no, true--yes , false--no
	 * \else
	 * 表示有无此项，true表示有此项，false表示无此项
	 * \endif
	 */
	public boolean			bEnable;

	/**
	 * \if ENGLISH_LANG
	 * min value of dejitter
	 * \else
	 * 去抖动最小允许值
	 * \endif
	 */
	public int				nDejitterMin;

	/**
	 * \if ENGLISH_LANG
	 * max value of dejitter
	 * \else
	 * 去抖动最大允许值
	 * \endif
	 */
	public int				nDejitterMax;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record latch info
 * \else
 * 录像延时配置信息
 * \endif
 */
public class CFG_RECORD_LATCH implements Serializable {

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
	 * min value of record latch
	 * \else
	 * 录像延时最小值
	 * \endif
	 */
	public int 			nRecordLatchMin;

	/**
	 * \if ENGLISH_LANG
	 * max value of record latch
	 * \else
	 * 录像延时最大值
	 * \endif
	 */
	public int				nRecordLatchMax;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm out latch info
 * \else
 * 报警输出延时配置信息
 * \endif
 */
public class CFG_ALARMOUT_LATCH implements Serializable {

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
	 * min value of alarmOut latch
	 * \else
	 * 报警输出延时最小值
	 * \endif
	 */
	public int				nAlarmOutLatchMin;

	/**
	 * \if ENGLISH_LANG
	 * max value of alarmOut latch
	 * \else
	 * 报警输出延时最大值
	 * \endif
	 */
	public int				nAlarmOutLatchMax;
}

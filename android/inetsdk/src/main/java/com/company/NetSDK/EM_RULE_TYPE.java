package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The type of rule
 * \else
 * 规则类型
 * \endif
 */
public class EM_RULE_TYPE implements Serializable {

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
	public static final int EM_RULE_UNKNOWN = 0;

	/**
	 * \if ENGLISH_LANG
	 * Number Stat
	 * \else
	 * 人数统计
	 * \endif
	 */
	public static final int EM_RULE_NUMBER_STAT = 1;

	/**
	 * \if ENGLISH_LANG
	 * Man number detection
	 * \else
	 * 区域内人数统计
	 * \endif
	 */
	public static final int EM_RULE_MAN_NUM_DETECTION = 2;

}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * failed detail
 * \else
 * 布防失败细节
 * \endif
 */
public class ARM_FAILED_DETAIL implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * failed area id
	 * \else
	 * 布防失败的区域号
	 * \endif
	 */
	public int       nArea;

	/**
	 * \if ENGLISH_LANG
	 * alarm source return number
	 * \else
	 * 报警源输入返回个数
	 * \endif
	 */
	public int       nAlarmSourceRet;

	/**
	 * \if ENGLISH_LANG
	 * alarm source number
	 * \else
	 * 区域下包含的有源输入的防区
	 * \endif
	 */
	public int       arrAlarmSource[] = new int[FinalVar.MAX_ZONE_NUMBER];
}

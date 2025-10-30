package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * armmode information
 * \else
 * 布撤防信息
 * \endif
 */
public class NET_ARMMODE_INFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * arm state {@link EM_ARM_STATE}
	 * \else
	 * 布撤防状态 {@link EM_ARM_STATE}
	 * \endif
	 */
	public int   emArmState;
}

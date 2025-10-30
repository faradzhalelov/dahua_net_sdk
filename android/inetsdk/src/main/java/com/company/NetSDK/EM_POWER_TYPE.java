package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power Type
 * \else
 * 电源类型
 * \endif
 */
public class EM_POWER_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Main Power
	 * \else
	 * 主电源
	 * \endif
	 */
	public static final int EM_POWER_TYPE_MAIN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup Power
	 * \else
	 * 备用电源
	 * \endif
	 */
	public static final int EM_POWER_TYPE_BACKUP = 1;
}

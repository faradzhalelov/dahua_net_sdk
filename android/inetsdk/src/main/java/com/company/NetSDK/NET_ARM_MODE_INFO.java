package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 
 * \else
 * 
 * \endif
 * @deprecated
 */
public class NET_ARM_MODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * -1：unknow, 0:disarm, 1:deploy troops for defence
	 * \else
	 * -1:未知, 0:撤防, 1:布防
	 * \endif
	 */
    public int             nArmMode;				
}

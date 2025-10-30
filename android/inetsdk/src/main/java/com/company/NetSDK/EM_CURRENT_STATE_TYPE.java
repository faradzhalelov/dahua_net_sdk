package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * power current status type
 * \else
 * 电源电流状态类型
 * \endif
 */
public class EM_CURRENT_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_UNKNOWN 		= 0 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current too high
	 * \else
	 * 电流过载
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_OVER_CURRENT 	= 1 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current normal
	 * \else
	 * 电流正常
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_NORMAL			= 2 ;
    
    /**
	 * \if ENGLISH_LANG
	 * current too low
	 * \else
	 * 电源欠流
	 * \endif
	 */
    public static final int EM_CURRENT_STATE_UNDER_CURRENT  = 3 ;
}

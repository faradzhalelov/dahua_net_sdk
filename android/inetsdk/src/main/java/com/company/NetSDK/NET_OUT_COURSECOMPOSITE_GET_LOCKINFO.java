package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output of get lock state
 * \else
 * 获取锁定状态出参
 * \endif
 */

public class NET_OUT_COURSECOMPOSITE_GET_LOCKINFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * lock state TRUE locked FALSE unlock
	 * \else
	 * 锁定状态
	 * \endif
	 */
    public boolean                    bState;                         
}

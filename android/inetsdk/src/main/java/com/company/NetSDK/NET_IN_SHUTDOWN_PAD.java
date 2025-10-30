package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_SHUTDOWN_PAD implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * delay shutdown
	 * \else
	 * 延时关机时间, 单位：秒
	 * \endif
	 */
	public int                 nDelayTime;              
}

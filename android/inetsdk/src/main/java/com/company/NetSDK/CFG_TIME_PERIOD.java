package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Calibrate Time
 * \else
 * 时间段
 * \endif
 */
public class CFG_TIME_PERIOD implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public CFG_TIME	stuStartTime = new CFG_TIME();				
	
	/**
	 * \if ENGLISH_LANG
	 * End time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public CFG_TIME	stuEndTime   = new CFG_TIME();	
}

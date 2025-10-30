package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Case Record Query Conditions
 * \else
 * 刻录案件记录查询条件
 * \endif
 */
public class FIND_RECORD_BURN_CASE_CONDITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Start Time
	 * \else
	 * 起始时间
	 * \endif
	 */
	public NET_TIME		stuStartTime 	= new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End Time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME		stuEndTime		= new NET_TIME();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Search intelligent speed dome track capability
 * \else
 * 智能球跟踪能力查询
 * \endif
 */
public class SDK_INTELLI_TRACKER_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Greater than 0 means Intelligent Auto-Tracking
	 * \else
	 * 大于0表示具有智能球跟踪能力
	 * \endif
	 */
	public byte		IsIntelliTrackerEnable;		
}

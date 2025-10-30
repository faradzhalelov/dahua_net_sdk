package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video polling
 * \else
 * 视频轮巡
 * \endif
 */
public class SDK_VIDEOGROUP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Polling enabled
	 * \else
	 * 轮巡使能
	 * \endif
	 */
	public boolean                bTourEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Polling interval in seconds, 5-300
	 * \else
	 * 轮巡间隔，单位秒, 5-300
	 * \endif
	 */
	public int                 nTourPeriod;
	
	/**
	 * \if ENGLISH_LANG
	 * The polling channel mask form
	 * \else
	 * 轮巡的通道，掩码形式表示
	 * \endif
	 */
	public int               dwChannelMask;
}

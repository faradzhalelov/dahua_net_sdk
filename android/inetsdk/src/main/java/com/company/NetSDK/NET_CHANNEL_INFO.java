package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel info
 * \else
 *  通道相关信息
 * \endif
 */
public class NET_CHANNEL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道编号
	 * \endif
	 */
	public byte[]                      szID = new byte[FinalVar.MAX_CHANNEL_ID_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Alarm level,valid range is [1,6]
	 * \else
	 * 报警级别,范围[1,6]
	 * \endif
	 */
	public int                      nAlarmLevel;
}

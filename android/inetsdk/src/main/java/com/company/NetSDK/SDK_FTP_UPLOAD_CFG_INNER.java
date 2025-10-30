package com.company.NetSDK;

import java.io.Serializable;

public class SDK_FTP_UPLOAD_CFG_INNER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable invalid
	 * \else
	 * 该时间段内的“使能”无效，可忽略
	 * \endif
	 */
	public SDK_TSECT        struSect = new SDK_TSECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Motion Detect Record
	 * \else
	 * 上传动态检测录象
	 * \endif
	 */
	public boolean            bMdEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Alarm Record
	 * \else
	 * 上传外部报警录象
	 * \endif
	 */
	public boolean            bAlarmEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Normal Record
	 * \else
	 * 上传普通定时录像
	 * \endif
	 */
	public boolean            bTimerEn;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Information of Records in Device Hard Disk
 * \else
 * 设备硬盘里的录象信息
 * \endif
 */
public class DEV_DISK_RECORD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * The Earliest Recording Time 
	 * \else
	 * 最早录象时间
	 * \endif
	 */
	public NET_TIME			stuBeginTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Most Recently Recording Time
	 * \else
	 * 最近录象时间
	 * \endif
	 */
	public NET_TIME			stuEndTime = new NET_TIME();
}

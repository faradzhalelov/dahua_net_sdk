package com.company.NetSDK;

import java.io.Serializable;

public class CTRL_SPARE_DISK_INFO_A implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * count
	 * \else
	 * 热备盘的个数
	 * \endif
	 */
	public int                     nCnt;
	
	/**
	 * \if ENGLISH_LANG
	 * spare disk info array
	 * \else
	 * 热备操作信息数组
	 * \endif
	 */
	public CTRL_SPARE_DISK_INFO    stSpaceDiskInfo[] = new CTRL_SPARE_DISK_INFO[32];
	
	public CTRL_SPARE_DISK_INFO_A() {
		for (int i = 0; i < 32; i++) {
			stSpaceDiskInfo[i] = new CTRL_SPARE_DISK_INFO();
		}
	}
}

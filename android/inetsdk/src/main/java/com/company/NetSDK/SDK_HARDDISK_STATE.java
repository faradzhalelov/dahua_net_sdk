package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device HDD informaiton 
 * \else
 * 设备硬盘信息
 * \endif
 */
public class SDK_HARDDISK_STATE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Amount
	 * \else
	 * 个数
	 * \endif
	 */
	public int					dwDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD or subarea information 
	 * \else
	 * 硬盘或分区信息
	 * \endif
	 */
	public NET_DEV_DISKSTATE	stDisks[] = new NET_DEV_DISKSTATE[FinalVar.SDK_MAX_DISKNUM];
	
	public SDK_HARDDISK_STATE() {
		for (int i = 0; i < FinalVar.SDK_MAX_DISKNUM; i++) {
			stDisks[i] = new NET_DEV_DISKSTATE();
		}
	}
}

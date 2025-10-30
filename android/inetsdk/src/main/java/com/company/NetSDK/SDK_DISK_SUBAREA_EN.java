package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Net Disk Partition ability Structure
 * \else
 * 网络硬盘分区能力结构体
 * \endif
 */
public class SDK_DISK_SUBAREA_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Support NAS Partition or not 
	 * \else
	 * 是否支持网络硬盘分区
	 * \endif
	 */
	public boolean		bSupported;				

	/**
	 * \if ENGLISH_LANG
	 * Supported Partition Number 
	 * \else
	 * 支持分区的数目
	 * \endif
	 */
	public int			nSupportNum;			
}

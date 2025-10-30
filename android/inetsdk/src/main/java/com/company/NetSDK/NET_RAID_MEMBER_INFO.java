package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RAID member info
 * \else
 * RAID成员信息
 * \endif
 */

public class NET_RAID_MEMBER_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * disk no., may use to describe disk cabinet slot
	 * \else
	 * 磁盘号, 可用于描述磁盘在磁柜的槽位
	 * \endif
	 */
	 public int                    dwID;                                       
	 
	/**
	 * \if ENGLISH_LANG
	 * partial hot device, true-partial hot device, false-RAID sub disk
	 * \else
	 * 是否局部热备, true-局部热备, false-RAID子盘
	 * \endif
	 */
	 public boolean                bSpare;                                     
}

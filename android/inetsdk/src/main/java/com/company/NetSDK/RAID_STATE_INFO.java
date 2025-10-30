package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RAID state
 * \else
 * RAID异常信息
 * \endif
 */
public class RAID_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Raid name
	 * \else
	 * Raid名称
	 * \endif
	 */
	public byte          szName[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * type 1:Jbod     2:Raid0      3:Raid1     4:Raid5
	 * \else
	 * 类型 1:Jbod     2:Raid0      3:Raid1     4:Raid5
	 * \endif
	 */
	public byte          byType;
	
 	/**
	 * \if ENGLISH_LANG
	 * status 0:unknown ,1:active,2:degraded,3:inactive,4:recovering
	 * \else
	 * 状态 0:unknown ，1:active，2:degraded，3:inactive，4:recovering
	 * \endif
	 */
	public byte          byStatus;
	
 	/**
	 * \if ENGLISH_LANG
	 * nMember number 
	 * \else
	 * nMember数组的有效数据个数
	 * \endif
	 */
	public int           nCntMem;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1,2,3,.
	 * \else
	 * 1,2,3,... 组成磁盘通道,是个数组
	 * \endif
	 */
	public int           nMember[] = new int[32];
	
 	/**
	 * \if ENGLISH_LANG
	 * capacity(G)
	 * \else
	 * 容量,单位G
	 * \endif
	 */
	public int           nCapacity;
	
 	/**
	 * \if ENGLISH_LANG
	 * remain space(M)
	 * \else
	 * 剩余容量，单位M
	 * \endif
	 */
	public int           nRemainSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * Tank 0:main,1:tank1,2:tank2 ...
	 * \else
	 * 扩展柜 0:主机，1:扩展柜1，2:扩展柜2，……
	 * \endif
	 */
	public int           nTank;                                
}

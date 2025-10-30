package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD informaiton 
 * \else
 * 硬盘信息
 * \endif
 */
public class NET_DEV_DISKSTATE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD capacity 
	 * \else
	 * 硬盘的容量, 单位MB(B表示字节)
	 * \endif
	 */
	public int					dwVolume;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD free space
	 * \else
	 * 硬盘的剩余空间, 单位MB(B表示字节)
	 * \endif
	 */
	public int					dwFreeSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Higher 4 byte instruct hdd type, see the enum struct {@link EM_DISK_TYPE}; lower four byte instruct HDD status,0-hiberation,1-active,2-malfucntion and etc.;Devide DWORD into four BYTE
	 * \else
	 * 高四位的值表示硬盘类型，具体见枚举类型 {@link EM_DISK_TYPE}；低四位的值表示硬盘的状态，0-休眠,1-活动,2-故障等；将DWORD拆成四个BYTE
	 * \endif
	 */
	public byte					dwStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD number
	 * \else
	 * 硬盘号
	 * \endif
	 */
	public byte					bDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subarea number
	 * \else
	 * 分区号
	 * \endif
	 */
	public byte					bSubareaNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. 0:local. 1:remote
	 * \else
	 * 标识，0为本地 1为远程
	 * \endif
	 */
	public byte					bSignal;
}

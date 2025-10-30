package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * spake disk info
 * \else
 * 热备操作
 * \endif
 */
public class CTRL_SPARE_DISK_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * Enable，使能，Unable，不使能
	 * \endif
	 */
	public byte		szAction[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Global,Local
	 * \else
	 * Global，全局热备，Local，非全局热备
	 * \endif
	 */
	public byte		szScope[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 热备名字，若Scope为Global，则为热备池的名称，否则表示Raid组的名称
	 * \endif
	 */
	public byte		szName[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * disk index
	 * \else
	 * 磁盘序号
	 * \endif
	 */
	public int      nIndex;
}

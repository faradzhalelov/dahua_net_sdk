package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD operation, correponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_CTRL_DISK}
 * \else
 * 硬盘操作, 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_CTRL_DISK}
 * \endif
 */
public class DISKCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Subscript of array stDisks of information structure {@link SDK_HARDDISK_STATE}. It begins from 0.
	 * \else
	 * 为硬盘信息结构体 {@link SDK_HARDDISK_STATE} 里的数组stDisks下标，从0开始
	 * \endif
	 */
	public int					nIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation type
	 * 0 -  clear data, 1 - set as read-write HDD , 2 -  set as read-only HDD
	 * 3 - set as redundant , 4 - restore error , 5 -set as snapshot disk  
	 * \else
	 * 操作类型，
	 * 0 - 清除数据, 1 - 设为读写盘, 2 - 设为只读盘
	 * 3 - 设为冗余盘, 4 - 恢复错误, 5 - 设为快照盘，7 - 弹出SD卡（对SD卡操作有效）
	 * \endif
	 */
	public 	int					ctrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * diskInfo, replace nIndex
	 * \else
	 * 磁盘信息, 由于磁盘顺序可能改变导致下标不准, 用来代替下标
	 * \endif
	 */
	public NET_DEV_DISKSTATE stuDisk = new NET_DEV_DISKSTATE();
}

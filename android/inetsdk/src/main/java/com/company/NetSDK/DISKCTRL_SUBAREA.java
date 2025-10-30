package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the corresponding interface {@link INetSDK#ControlDevice}, the corresponding command {@link CtrlType#SDK_CTRL_DISK_SUBAREA}
 * \else
 * 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_CTRL_DISK_SUBAREA}
 * \endif
 */
public class DISKCTRL_SUBAREA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The number of pre-partition
	 * \else
	 * 预分区的个数
	 * \endif
	 */
	public byte	bSubareaNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscript of array stDisks of informaiton structure {@link SDK_HARDDISK_STATE}. It begins from 0.
	 * \else
	 * 为硬盘信息结构体 {@link SDK_HARDDISK_STATE} 里的数组stDisks下标，从0开始
	 * \endif
	 */
	public byte	bIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * partition Size(Percentage)
	 * \else
	 * 分区大小（百分比）
	 * \endif
	 */
	public byte	bSubareaSize[] = new byte[32];
}

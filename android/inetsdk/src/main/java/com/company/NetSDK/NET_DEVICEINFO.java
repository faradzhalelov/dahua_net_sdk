package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device information
 * \else
 * 设备信息
 * \endif
 */
public class NET_DEVICEINFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * 序列号
	 * \endif
	 */
	public byte				sSerialNumber[] = new byte[FinalVar.SDK_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * DVR alarm input amount
	 * \else
	 * DVR报警输入个数
	 * \endif
	 */
	public byte				byAlarmInPortNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR alarm output amount
	 * \else
	 * DVR报警输出个数
	 * \endif
	 */
	public byte				byAlarmOutPortNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR HDD amount 
	 * \else
	 * DVR硬盘个数
	 * \endif
	 */
	public byte				byDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR type.Please refer to {@link NET_DEVICE_TYPE}
	 * \else
	 * DVR类型, 见枚举 {@link NET_DEVICE_TYPE}
	 * \endif
	 */
	public byte				byDVRType;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR channel amount 
	 * \else
	 * DVR通道个数
	 * \endif
	 */
	public byte				byChanNum;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * disk alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_DISK}
 * \else
 * 硬盘报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_DISK}
 * \endif
 */
public class ALARM_DISK_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * 硬盘通道号
	 * \endif
	 */
	public int                nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * number, 0: main trank,1: extern trank1, 2: extern trank2 
	 * \else
	 * 磁盘列阵号, 0: 主柜，1: 扩展柜1,  2: 扩展柜2 
	 * \endif
	 */
	public int                nHDDNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * state, 0: Unknown, 1: Running, 2: Offline, 3: Warning, 4: Failed
	 * \else
	 * 硬盘状态, 0: Unknown, 1: Running, 2: Offline, 3: Warning, 4: Failed
	 * \endif
	 */
	public int                nHDDState;                           
}

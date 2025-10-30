package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of disk burned full, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_DISKBURNED_FULL}
 * \else
 * 硬盘刻录满报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_DISKBURNED_FULL}
 * \endif
 */
public class ALARM_DISKBURNED_FULL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * index
	 * \else
	 * 光盘号
	 * \endif
	 */
	public int         nIndex; 
}

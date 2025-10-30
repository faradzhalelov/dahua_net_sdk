package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm channel number, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_ALARM_CHN_COUNT}
 * \else
 * 报警通道数, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_ALARM_CHN_COUNT}
 * \endif
 */
public class NET_ALARM_CHANNEL_COUNT implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Local alarm input channel no.
	 * \else
	 * 本地报警输入通道数
	 * \endif
	 */
	public int nLocalAlarmIn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Local alarm output channel no.
	 * \else
	 * 本地报警输出通道数
	 * \endif
	 */
	public int nLocalAlarmOut;
	
 	/**
	 * \if ENGLISH_LANG
	 * Remote alarm input channel no.
	 * \else
	 * 远程报警输入通道数
	 * \endif
	 */
	public int nRemoteAlarmIn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Remote alarm output channel no.
	 * \else
	 * 远程报警输出通道数
	 * \endif
	 */
	public int nRemoteAlarmOut;
}

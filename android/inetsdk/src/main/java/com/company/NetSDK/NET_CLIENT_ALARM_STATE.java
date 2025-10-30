package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command 对应命令 {@link FinalVar#SDK_DEVSTATE_ALARM}
 * \else
 * 外部报警状态信息对应结构体, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_ALARM}
 * \endif
 */
public class NET_CLIENT_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount
	 * \else
	 * 报警输入个数
	 * \endif
	 */
	public int				  alarminputcount;
	
	/**
	 * \if ENGLISH_LANG
	 * DWORD value is the state by bit of 32 channels,0-no alarm,1-alarm
	 * \else
	 * 每一个DWORD按位表示32通道的报警状态, 0-表示无报警, 1-表示有报警
	 * \endif
	 */
	public int                dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK]; 
}

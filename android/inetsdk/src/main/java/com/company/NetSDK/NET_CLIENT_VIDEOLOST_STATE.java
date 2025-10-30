package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Struct of video loss alarm, the corresponding interface {@link INetSDK#QueryDevState}, the corresponding command {@link FinalVar#SDK_DEVSTATE_VIDEOLOST}
 * \else
 * 视频丢失报警状态信息对应结构体, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_VIDEOLOST}
 * \endif
 */
public class NET_CLIENT_VIDEOLOST_STATE implements Serializable {	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount 
	 * \else
	 * 通道数量 
	 * \endif
	 */
	public int				   channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for alarm status of channel 0-31. 0-No alarm，1-Have alarm 
	 * \else
	 * 每一个int按位表示32通道的报警状态, 0-表示无报警, 1-表示有报警
	 * \endif
	 */
	public int           	   dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK]; 
}

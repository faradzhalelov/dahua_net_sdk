package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of ivs, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_IVS}
 * \else
 * 智能报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_IVS}
 * \endif
 */
public class ALARM_IVS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 事件发生时间    
	 * \endif
	 */
	public NET_TIME   stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel ID,from 0
	 * \else
	 * 通道号，从0开始
	 * \endif
	 */
	public int        nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * type
	 * \else
	 * 报警类型
	 * \endif
	 */
	public byte       szType[] = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * state,0-reset,1-setting,2-pulse
	 * \else
	 * 报警状态，0-报警复位，1-报警置位, 2-脉冲式报警
	 * \endif
	 */
	public int        nState;
}

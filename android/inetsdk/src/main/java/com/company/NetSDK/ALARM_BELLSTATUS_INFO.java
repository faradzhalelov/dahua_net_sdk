package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * bell status event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_BELLSTATUS_EVENT}
 * \else
 * 警号状态事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_BELLSTATUS_EVENT}
 * \endif
 */
public class ALARM_BELLSTATUS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * bell channel no. 
	 * \else
	 * 警号通道号
	 * \endif
	 */
	public int         nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * event time
	 * \else
	 * 事件时间
	 * \endif
	 */
	public NET_TIME    stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
	public int         nAction;                                   
}

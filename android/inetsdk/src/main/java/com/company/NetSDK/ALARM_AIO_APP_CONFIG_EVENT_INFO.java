package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AIO alarm event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_AIO_APP_CONFIG_EVENT}
 * \else
 * AIO报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_AIO_APP_CONFIG_EVENT}
 * \endif
 */

public class ALARM_AIO_APP_CONFIG_EVENT_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * event occure time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX			     stuTime = new NET_TIME_EX();	
	
	/**
	 * \if ENGLISH_LANG
	 * ip address of publishing platform
	 * \else
	 * 发布平台的的ip地址
	 * \endif
	 */
	public byte[] 				    szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];		 
}

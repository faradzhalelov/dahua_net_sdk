package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage failure alarm info, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_STORAGE_FAILURE}
 * \else
 * 存储异常报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_STORAGE_FAILURE}
 * \endif
 */
public class ALARM_STORAGE_FAILURE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start
	 * \else
	 * 0：停止， 1：开始
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * protocol type
	 * \else
	 * 协议类型，目前只支持FTP
	 * \endif
	 */
	public byte      szProtocol[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * server device's ip 
	 * \else
	 * 服务器IP地址
	 * \endif
	 */
	public byte      szServerAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * port number
	 * \else
	 * 端口号
	 * \endif
	 */
	public int     dwPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * 事件发生时间
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel, from 1, 0 means does not distinguish
	 * \else
	 * 通道号, 从1开始, 0表示不区分通道
	 * \endif
	 */
	public int       nChannel;
}

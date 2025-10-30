package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NTP server
 * \else
 * NTP 服务器
 * \endif
 */
public class CFG_NTP_SERVER implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable switch 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * NTP IP address or network name of NTP Server
	 * \else
	 * NTP服务器  IP地址或网络名
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port number of NTP Server
	 * \else
	 * 端口号
	 * \endif
	 */
	public int					nPort;

}

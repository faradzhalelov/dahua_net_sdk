package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto register parameter configuration
 * \else
 * 主动注册参数配置
 * \endif
 */
public class SDKDEV_SERVER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Registration server IP
	 * \else
	 * 注册服务器IP 
	 * \endif
	 */
	public byte                szServerIp[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Port No. 
	 * \else
	 * 端口号
	 * \endif
	 */
	public int                 nServerPort;
    public byte                bServerIpExEn;
    public byte                szServerIpEx[] = new byte[60];
}

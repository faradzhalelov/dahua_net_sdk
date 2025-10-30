package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AIO IP config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_AIO_APP_CONFIG}
 * \else
 * AIO IP 配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_AIO_APP_CONFIG}
 * \endif
 */

public class CFG_AIO_APP_CONFIG_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ip address
	 * \else
	 * 发布平台的的ip地址
	 * \endif
	 */
	public byte[]		szAddress = new byte[FinalVar.MAX_IP_ADDR_LEN];			 
}

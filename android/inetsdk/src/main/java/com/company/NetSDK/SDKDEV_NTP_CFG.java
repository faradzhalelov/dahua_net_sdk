package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NTP setup 
 * \else
 * NTP配置
 * \endif
 */
public class SDKDEV_NTP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable or not
	 * \else
	 * 是否启用
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * NTP  server default port is 123
	 * \else
	 * NTP服务器默认端口为123
	 * \endif
	 */
	public int                 nHostPort;

	/**
	 * \if ENGLISH_LANG
	 * Host IP
	 * \else
	 * 主机IP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Domain name
	 * \else
	 * 域名
	 * \endif
	 */
	public byte                szDomainName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Read only ,0:IP,1:domain name ,2:IP and domain name
	 * \else
	 * 不可设置，0：表示IP，1：表示域名，2：表示IP和域名
	 * \endif
	 */
	public int                 nType;

	/**
	 * \if ENGLISH_LANG
	 * Update time(minute)
	 * \else
	 * 更新时间(分钟)
	 * \endif
	 */
	public int                 nUpdateInterval;

	/**
	 * \if ENGLISH_LANG
	 * Please refer to {@link SDK_TIME_ZONE_TYPE}
	 * \else
	 * 见 {@link SDK_TIME_ZONE_TYPE}
	 * \endif
	 */
	public int                 nTimeZone;
}

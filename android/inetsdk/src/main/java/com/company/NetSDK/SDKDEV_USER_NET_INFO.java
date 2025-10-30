package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User network use status info 
 * \else
 * 用户网络使用状态信息
 * \endif
 */
public class SDKDEV_USER_NET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * User name 
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte				szUserName[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Group 
	 * \else
	 * 用户组
	 * \endif
	 */
	public byte				szUserGroup[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Login time 
	 * \else
	 * 登入时间
	 * \endif
	 */
	public NET_TIME			time = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Enabled channel amount 
	 * \else
	 * 开启的通道个数
	 * \endif
	 */
	public int					nOpenedChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel network status 
	 * \else
	 * 通道网络状态
	 * \endif
	 */
	public SDKDEV_USE_CHANNEL_STATE	channelInfo[] = new SDKDEV_USE_CHANNEL_STATE[FinalVar.SDK_MAX_CHANNUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Ip address 
	 * \else
	 * ip地址
	 * \endif
	 */
	public byte                szIpAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN_EX];
	
	public SDKDEV_USER_NET_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
			channelInfo[i] = new SDKDEV_USE_CHANNEL_STATE();
		}
	}
}

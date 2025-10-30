package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network running status info
 * \else
 * 网络运行状态信息
 * \endif
 */
public class SDKDEV_TOTAL_NET_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * User amount 
	 * \else
	 * 用户数量
	 * \endif
	 */
	public int					nUserCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Network info of the user 
	 * \else
	 * 用户使用网络信息
	 * \endif
	 */
	public SDKDEV_USER_NET_INFO	stuUserInfo[] = new SDKDEV_USER_NET_INFO[32];
	
	public SDKDEV_TOTAL_NET_STATE() {
		for (int i = 0; i < 32; i++) {
			stuUserInfo[i]  = new SDKDEV_USER_NET_INFO();
		}
	}
}

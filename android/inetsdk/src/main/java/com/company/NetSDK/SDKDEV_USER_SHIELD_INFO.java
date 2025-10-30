package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_USER_SHIELD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ip
	 * \else
	 * ip地址
	 * \endif
	 */
	public byte                szIpAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * User Group
	 * \else
	 * 用户组
	 * \endif
	 */
	public byte                szUserGroup[] = new byte[32]; 
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte                szUserName[] = new byte[32]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Forbidden Time
	 * \else
	 * 屏蔽时间
	 * \endif
	 */
	public int                 nForbiddenTime; 
}

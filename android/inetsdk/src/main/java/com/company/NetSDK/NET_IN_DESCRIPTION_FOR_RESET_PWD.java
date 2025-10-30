package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get description reset and pwd input param
 * \else
 * 获取重置密码信息输入结构体
 * \endif
 */

public class NET_IN_DESCRIPTION_FOR_RESET_PWD implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * user name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte[]					szUserName = new byte[FinalVar.MAX_USER_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * device mac adress
	 * \else
	 * 设备mac地址
	 * \endif
	 */
	public byte[]					szMac = new byte[FinalVar.SDK_MACADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * device init status 
	 * \else
	 * 设备初始化状态
	 * \endif
	 */
	public byte					    byInitStatus;
}

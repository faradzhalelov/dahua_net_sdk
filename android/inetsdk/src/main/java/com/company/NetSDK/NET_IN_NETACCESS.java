package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 
 * \else
 * 设置LC设备接入使能输入结构体
 * \endif
 */
public class NET_IN_NETACCESS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device mac
	 * \else
	 * 设备mac地址
	 * \endif
	 */
	public byte[]		szMac = new byte[FinalVar.SDK_MACADDR_LEN];				
	
	/**
	 * \if ENGLISH_LANG
	 * security code
	 * \else
	 * 安全码
	 * \endif
	 */
	public byte[]		szSecurity = new byte[FinalVar.MAX_SECURITY_CODE_LEN];	 
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 设备初始化状态：搜索设备接口(SearchDevices、StartSearchDevices的回调函数、SearchDevicesByIPs)返回字段byInitStatus的值
	 * 设置bit2~3 为1：表示设置公网接入不使能 为2-表示设置公网接入使能
	 * \endif
	 */
	public byte		    byInitStaus;					
}

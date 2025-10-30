package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Dailing triggers the wireless connection
 * \else
 * 拨号激活无线连接配置
 * \endif
 */
public class SDKDEV_DIALINACTIVATION_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public int               dwEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * Sender amount
	 * \else
	 * 发送者个数
	 * \endif
	 */
	public int               dwCallerNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Sender, normally the cellphone
	 * \else
	 * 发送者, 一般为手机号码
	 * \endif
	 */
	public byte              SZCaller[][] = new byte[FinalVar.SDK_MMS_DIALINACTIVATION_NUM][32];
}

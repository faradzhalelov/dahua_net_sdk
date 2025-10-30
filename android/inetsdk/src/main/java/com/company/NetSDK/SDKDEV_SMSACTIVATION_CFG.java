package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * (Message triggers wireless connection configuration)
 * \else
 * (短信激活无线连接配置)
 * \endif
 */
public class SDKDEV_SMSACTIVATION_CFG implements Serializable {
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
	 * 短信发送者个数
	 * \endif
	 */
	public int               dwSenderNum;

	/**
	 * \if ENGLISH_LANG
	 * Sender, normally the cellphone number
	 * \else
	 * 短信发送者，一般为手机号码
	 * \endif
	 */
	public byte              SZSender[][] = new byte[FinalVar.SDK_MMS_SMSACTIVATION_NUM][32];
}

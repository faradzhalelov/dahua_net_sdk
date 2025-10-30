package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * According to the mobile function
 * (Event triggers message)MMS Configuration Structure
 * \else
 * 以下是mobile功能相关
 * (事件触发多媒体彩信/短信发送)MMS配置结构体
 * \endif
 */
public class SDKDEV_MMS_CFG implements Serializable {
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
	 * Receiver amount
	 * \else
	 * 短信接收者个数
	 * \endif
	 */
	public int               dwReceiverNum;

	/**
	 * \if ENGLISH_LANG
	 * Receiver,normally cellphone
	 * \else
	 * 短信接收者，一般为手机号码
	 * \endif
	 */
	public byte				SZReceiver[][] = new byte[FinalVar.SDK_MMS_RECEIVER_NUM][32];
	
	/**
	 * \if ENGLISH_LANG
	 * Message type 0:MMS;1:SMS
	 * \else
	 * 短信信息类型 0:MMS；1:SMS
	 * \endif
	 */
	public byte                byType;

	/**
	 * \if ENGLISH_LANG
	 * Message title
	 * \else
	 * 短信信息标题
	 * \endif
	 */
	public byte                SZTitle[] = new byte[32];
}

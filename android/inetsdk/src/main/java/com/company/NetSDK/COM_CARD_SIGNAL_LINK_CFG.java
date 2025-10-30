package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232/485 com card  linked configuration(when the info from the com fit the configuration, it will trigger the device snap picture), the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_232_COM_CARD_CFG}and{@link FinalVar#SDK_DEV_485_COM_CARD_CFG}
 * \else
 * 232串口卡号信号、485串口卡号信号联动配置(在串口发过来的卡号信息满足配置的卡号信息后，将触发设备抓图), 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_232_COM_CARD_CFG}和{@link FinalVar#SDK_DEV_485_COM_CARD_CFG}
 * \endif
 */
public class COM_CARD_SIGNAL_LINK_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card info
	 * \else
	 * 卡号信息
	 * \endif
	 */
	public COM_CARD_SIGNAL_INFO  struCardInfo = new COM_CARD_SIGNAL_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * event link
	 * \else
	 * 事件联动
	 * \endif
	 */
	public SDK_MSG_HANDLE         struHandle = new SDK_MSG_HANDLE();
}

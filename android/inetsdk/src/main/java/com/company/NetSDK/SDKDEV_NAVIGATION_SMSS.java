package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NAVIGATION OR SMS, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_NAVIGATION_SMS}
 * \else
 * 导航信息和短消息, 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_NAVIGATION_SMS}
 * \endif
 */
public class SDKDEV_NAVIGATION_SMSS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * phone no
	 * \else
	 * 电话号码
	 * \endif
	 */
	public byte                szPhoneNum[] = new byte[FinalVar.SDK_MAX_PHONE_NO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * time of sending message
	 * \else
	 * 信息发送时间
	 * \endif
	 */
	public NET_TIME            stMsgTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * type:Navigation message-Navigation,short message--SMS
	 * \else
	 * 信息类型（导航信息-Navigation； 短消息--SMS）
	 * \endif
	 */
	public byte                szMsgType[] = new byte[FinalVar.SDK_MAX_MSGTYPE_LEN];

	/**
	 * \if ENGLISH_LANG
	 * message to send
	 * \else
	 * 发送的信息内容
	 * \endif
	 */
	public byte                szSmsContext[] = new byte[FinalVar.SDK_MAX_MSG_LEN];

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * 起始经纬度
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stLogiLati = new SDKDEV_LONGI_LATI();

	/**
	 * \if ENGLISH_LANG
	 * 01:marking true longitude
	 * \else
	 * 01：标志发来的是真实经纬度
	 * \endif
	 */
	public int        uFlag;

	/**
	 * \if ENGLISH_LANG
	 * TNC,TXZ
	 * \else
	 * TNC,为凯立德地图中心导航格式，TXZ,为天行者地图中心导航格式
	 * \endif
	 */
	public byte                szNavigationType[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * address
	 * \else
	 * 地点信息
	 * \endif
	 */
	public byte                szAddress[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * mode
	 * \else
	 * 导航模式 有Recommend推荐，Economical经济型，Fastest 最快；Shortest 最短；
	 * \endif
	 */
	public byte                szNavigationMode[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * passing
	 * \else
	 * 经由点
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stPassLogiLati[] = new SDKDEV_LONGI_LATI[5];

	/**
	 * \if ENGLISH_LANG
	 * no passing
	 * \else
	 * 不经由点
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stNoPassLogiLati[] = new SDKDEV_LONGI_LATI[5];
	
	public SDKDEV_NAVIGATION_SMSS() {
		for (int i = 0; i < 5; i++) {
			stPassLogiLati[i] = new SDKDEV_LONGI_LATI();
			stNoPassLogiLati[i] = new SDKDEV_LONGI_LATI();
		}
	}
}

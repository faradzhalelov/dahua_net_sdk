package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DelMobilePusherNotification} input Parameter
 * \else
 * {@link INetSDK#DelMobilePusherNotification} 入参
 * \endif
 */
public class NET_IN_DEL_MOBILE_PUSHER_NOTIFICATION implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * RegisterID
	 * \else
	 * RegisterID, 手机向Appple/Android服务器注册返回的，每次不同；
	 * \endif
	 */
	public byte						szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];

	/**
	 * \if ENGLISH_LANG
	 * AppID
	 * \else
	 * AppID（手机每开一个客户端，会产生一个）
	 * \endif
	 */
	public byte						szAppID[] = new byte[FinalVar.MAX_APP_ID_LEN];
}

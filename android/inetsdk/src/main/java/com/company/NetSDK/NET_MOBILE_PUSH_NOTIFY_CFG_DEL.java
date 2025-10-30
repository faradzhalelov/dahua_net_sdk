package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Delete mobile push notification config, interface {@link INetSDK#DelMobilePushNotify} 's input param
 * \else
 * 删除手机订阅推送信息入参, 接口 {@link INetSDK#DelMobilePushNotify}
 * \endif
 */
public class NET_MOBILE_PUSH_NOTIFY_CFG_DEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mobile phone registered returned with the Appple/Android server, every time is different 
	 * \else
	 * 手机向Appple/ Android服务器注册返回的，每次不同
	 * \endif
	 */
	public byte                            szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];         
	
	/**
	 * \if ENGLISH_LANG
	 * bile phone for every client, will produce one 
	 * \else
	 * 手机每开一个客户端，会产生一个
	 * \endif
	 */
	public byte                            szAppID[] = new byte[FinalVar.MAX_APP_ID_LEN];                  
}

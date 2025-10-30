package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#EnablePushMobilePusher} input Parameter
 * \else
 * {@link INetSDK#EnablePushMobilePusher} 入参
 * \endif
 */
public class NET_IN_ENABLE_PUSH_MOBILE_PUSHER implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable Mobile Pusher
	 * \else
	 * 是否开启手机推送
	 * \endif
	 */
	public boolean						bEnablePush;
}

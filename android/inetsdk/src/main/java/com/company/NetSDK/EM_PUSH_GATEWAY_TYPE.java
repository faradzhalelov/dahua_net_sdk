package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Push the gateway type
 * \else
 * 推送网关类型
 * \endif
 */
public class EM_PUSH_GATEWAY_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Apple push gateway, ApplePush
	 * \else
	 * 苹果推送网关, ApplePush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_APPLE_PUSH = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android PRIVATE push gateway, Android PrivatePush
	 * \else
	 * 安卓私有推送网关, Android PrivatePush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_SDKPUSH = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android aurora push gateway, AndroidJPush
	 * \else
	 * 安卓极光推送网关, AndroidJPush
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_JPUSH = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * Android GCM gateway, AndroidGCM
	 * \else
	 * 安卓GCM网关, AndroidGCM
	 * \endif
	 */
	public static final int EM_PUSH_GATEWAY_TYPE_ANDROID_GCM = 4; 
}

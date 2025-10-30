package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Shield User, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_SHIELD_USER}
 * \else
 * 屏蔽用户, 对应接口{@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_SHIELD_USER}
 * \endif
 */
public class SDKDEV_SHIELD_USER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * User Account
	 * \else
	 * 用户数量
	 * \endif
	 */
	public int                       nUserCount;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public SDKDEV_USER_SHIELD_INFO    stuUserInfo[] = new SDKDEV_USER_SHIELD_INFO[10];
	
	public SDKDEV_SHIELD_USER() {
		for (int i = 0; i < 10; i++) {
			stuUserInfo[i] = new SDKDEV_USER_SHIELD_INFO();
		}
	}
}

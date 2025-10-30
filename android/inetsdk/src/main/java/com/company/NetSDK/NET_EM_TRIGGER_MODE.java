package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * trigger mode
 * \else
 * 触发方式
 * \endif
 */
public class NET_EM_TRIGGER_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int NET_EM_TRIGGER_MODE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Network user(Platform或Web)
	 * \else
	 * 网络用户(平台或Web)
	 * \endif
	 */
	public static final int	NET_EM_TRIGGER_MODE_NET = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * keyboard
	 * \else
	 * 键盘
	 * \endif
	 */
	public static final int NET_EM_TRIGGER_MODE_KEYBOARD = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * remote control
	 * \else
	 * 遥控器
	 * \endif
	 */
	public static final int NET_EM_TRIGGER_MODE_REMOTECONTROL = 3; 
}

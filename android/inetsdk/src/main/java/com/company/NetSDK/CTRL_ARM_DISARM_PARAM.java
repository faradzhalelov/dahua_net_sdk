package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arm and disarm control, the corresponding interface {@link INetSDK#ControlDevice},the corresponding command {@link CtrlType#SDK_CTRL_ARMED}
 * \else
 * 报警布撤防控制, 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_CTRL_ARMED}
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Arm/disarm state, 0 means disarm, 1 means arm, 2 means forced arm
	 * \else
	 * 布撤防状态，0表示撤防，1表示布防，2表示强制布防
	 * \endif
	 */
	public byte             bState; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's Password
	 * \else
	 * 用户密码
	 * \endif
	 */
	public String			szDevPwd; 
	
	/**
	 * \if ENGLISH_LANG
	 * Contextual Mode, refer to  {@link NET_SCENE_MODE}
	 * \else
	 * 情景模式, 取值参考 {@link NET_SCENE_MODE}
	 * \endif
	 */
	public int 	            emSceneMode; 
	
	/**
	 * \if ENGLISH_LANG
	 * Forwarding the Target Device ID,Null=Non Forward
	 * \else
	 * 转发目标设备ID,为NULL表示不转发
	 * \endif
	 */
	public String			szDevID; 
}

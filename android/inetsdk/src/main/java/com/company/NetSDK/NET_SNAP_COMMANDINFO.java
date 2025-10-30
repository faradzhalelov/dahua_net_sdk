package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activate device to snapshot overlay card number information, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_CTRL_CAPTURE_START}
 * \else
 * 触发设备抓图，叠加卡号信息, 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_CTRL_CAPTURE_START}
 * \endif
 */
public class NET_SNAP_COMMANDINFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Card information
	 * \else
	 * 卡号信息
	 * \endif
	 */
	public byte				szCardInfo[] 	= new byte[16];
}

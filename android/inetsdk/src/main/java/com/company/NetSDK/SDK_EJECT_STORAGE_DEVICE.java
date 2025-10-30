package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * manual pop-up storage device, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_CTRL_EJECT_STORAGE}
 * \else
 * 手动弹出存储设备, 对应接口{@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_CTRL_EJECT_STORAGE}
 * \endif
 */
public class SDK_EJECT_STORAGE_DEVICE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * storage name
	 * \else
	 * 存储设备名称
	 * \endif
	 */
	public String				pszStorageName;
}

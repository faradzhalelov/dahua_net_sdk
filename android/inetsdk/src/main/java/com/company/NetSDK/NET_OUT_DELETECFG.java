package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_DELETECFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The error code device returns
	 * \else
	 * 设备返回的错误码
	 * \endif
	 */
	public int           nError;

	/**
	 * \if ENGLISH_LANG
	 * Device reboot or not
	 * \else
	 * 设备是否重启
	 * \endif
	 */
	public int           nRestart;

	/**
	 * \if ENGLISH_LANG
	 * Option. Please refer to enumeration {@link NET_EM_CONFIGOPTION}
	 * \else
	 * 选项,具体见枚举 {@link NET_EM_CONFIGOPTION}
	 * \endif
	 */
	public int         dwOptionMask;
}

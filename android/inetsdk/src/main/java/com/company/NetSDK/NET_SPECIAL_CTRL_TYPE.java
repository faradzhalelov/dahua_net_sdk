package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * special control type, corresponding to interface {@link INetSDK#ControlSpecialDevice}
 * \else
 * 控制类型, 对应 {@link INetSDK#ControlSpecialDevice}接口
 * \endif
 */
public class NET_SPECIAL_CTRL_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * shutdown PAD command, pInBuf refer to {@link NET_IN_SHUTDOWN_PAD}, pOutBuf refer to {@link NET_OUT_SHUTDOWN_PAD} 
	 * \else
	 * 关闭PAD命令, pInBuf对应类型 {@link NET_IN_SHUTDOWN_PAD}, pOutBuf对应类型{@link NET_OUT_SHUTDOWN_PAD} 
	 * \endif
	 */
	public static final int NET_SPECIAL_CTRL_SHUTDOWN_PAD = 0;   

	/**
	 * \if ENGLISH_LANG
	 * restart PAD command, pInBuf refer to {@link NET_IN_REBOOT_PAD}, pOutBuf refer to{@link NET_OUT_REBOOT_PAD}
	 * \else
	 * 重启PAD命令, pInBuf对应类型 {@link NET_IN_REBOOT_PAD}, pOutBuf对应类型 {@link NET_OUT_REBOOT_PAD}
	 * \endif
	 */
	public static final int NET_SPECIAL_CTRL_REBOOT_PAD = 1;   
}

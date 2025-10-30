package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get bypass mode, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_GET_BYPASS}
 * \else
 * 获取旁路状态, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_GET_BYPASS}
 * \endif
 */
public class NET_DEVSTATE_GET_BYPASS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel Number, member counts of array pnLocal
	 * \else
	 * 本地报警输入通道个数, pnLocal数组的成员个数
	 * \endif
	 */	
	public int nLocalCount;
	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel ID, malloc by caller
	 * \else
	 * 本地报警输入通道号, 调用者申请空间
	 * \endif
	 */	
	public int pnLocal[];
	
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Number, member counts of array pnExtended
	 * \else
	 * 扩展模块报警输入通道个数, pnExtended数组的成员个数
	 * \endif
	 */	
	public int nExtendedCount;
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel ID, malloc by caller
	 * \else
	 * 扩展模块报警输入通道号, 调用者申请空间
	 * \endif
	 */
	public int pnExtended[];

	/**
	 * \if ENGLISH_LANG
	 * Local Alarm Input Channel Statue, malloc by caller, refer to {@link NET_BYPASS_MODE}
	 * \else
	 * 本地报警输入通道状态, 调用者申请空间, 类型为 {@link NET_BYPASS_MODE}
	 * \endif
	 */
	public int pemLocal[];
	/**
	 * \if ENGLISH_LANG
	 * Expand Module Alarm Input Channel Statue, malloc by caller, refer to {@link NET_BYPASS_MODE}
	 * \else
	 * 扩展模块报警输入通道状态, 调用者申请空间, 类型为 {@link NET_BYPASS_MODE}
	 * \endif
	 */
	public int pemExtended[];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Restore the settings of door, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ACCESS_FACTORY_RESET}
 * \else
 *  门锁恢复出厂设置事件, 对应接口{@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ACCESS_FACTORY_RESET}
 * \endif
 */
public class ALARM_ACCESS_FACTORY_RESET_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * event occurrence time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX   stuTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Intelligence lock serial number
	 * \else
	 * 智能锁序列号
	 * \endif
	 */
	public byte[]  szSmartLockSN = new byte[FinalVar.MAX_COMMON_STRING_32];
	
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Sub System Status Type
 * \else
 * 报警子系统状态类型
 * \endif
 */
public class EM_ALARM_SUBSYSTEM_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int ALARM_SUBSYSTEM_STATE_UNKNOWN 			= 		0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Activated
	 * \else
	 * 已激活
	 * \endif
	 */
	public static final int ALARM_SUBSYSTEM_STATE_ACTIVE 			= 		1 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Not activated
	 * \else
	 * 未激活
	 * \endif
	 */
	public static final int	ALARM_SUBSYSTEM_STATE_INACTIVE 			=     	2 ;
	
	/**
	 * \if ENGLISH_LANG
	 * Not distributed
	 * \else
	 * 未分配
	 * \endif
	 */
	public static final int	ALARM_SUBSYSTEM_STATE_UNDISTRIBUTED     =     	3 ;
}

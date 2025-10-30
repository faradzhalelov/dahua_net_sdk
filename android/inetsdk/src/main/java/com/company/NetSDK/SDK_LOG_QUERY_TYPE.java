package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log search type 
 * \else
 * 日志查询类型
 * \endif
 */
public class SDK_LOG_QUERY_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All logs
	 * \else
	 * 所有日志
	 * \endif
	 */
	public static final int     SDKLOG_ALL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * System logs 
	 * \else
	 * 系统日志
	 * \endif
	 */
	public static final int     SDKLOG_SYSTEM = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Configuration logs
	 * \else
	 * 配置日志
	 * \endif
	 */
	public static final int     SDKLOG_CONFIG = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage logs
	 * \else
	 * 存储相关
	 * \endif
	 */
	public static final int     SDKLOG_STORAGE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm logs 
	 * \else
	 * 报警日志
	 * \endif
	 */
	public static final int     SDKLOG_ALARM = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Record related
	 * \else
	 * 录象相关
	 * \endif
	 */
	public static final int     SDKLOG_RECORD = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Account related
	 * \else
	 * 帐号相关
	 * \endif
	 */
	public static final int     SDKLOG_ACCOUNT = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Clear log 
	 * \else
	 * 清除日志
	 * \endif
	 */
	public static final int     SDKLOG_CLEAR = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback related 
	 * \else
	 * 回放相关
	 * \endif
	 */
	public static final int     SDKLOG_PLAYBACK = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Concerning the front-end management and running
	 * \else
	 * 前端管理运行相关
	 * \endif
	 */
	public static final int     SDKLOG_MANAGER = 9;
}

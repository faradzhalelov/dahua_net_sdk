package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Search log parameter
 * \else
 * 查询日志参数
 * \endif
 */
public class QUERY_DEVICE_LOG_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Searched log type ,enumeration value, as: {@link SDK_LOG_QUERY_TYPE}
	 * \else
	 * 查询日志类型, 枚举值，见 {@link SDK_LOG_QUERY_TYPE}
	 * \endif
	 */
	public int					emLogType;
	
	/**
	 * \if ENGLISH_LANG
	 * The searched log start time
	 * \else
	 * 查询日志的开始时间
	 * \endif
	 */
	public NET_TIME			stuStartTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * The searched log end time.
	 * \else
	 * 查询日志的结束时间
	 * \endif
	 */
	public NET_TIME			stuEndTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * The search begins from which log in one period. It shall begin with 0 if it is the first time search.
	 * \else
	 * 在时间段中从第几条日志开始查询，开始第一次查询可设为0
	 * \endif
	 */
	public int					nStartNum;
	
	/**
	 * \if ENGLISH_LANG
	 * The ended log serial number in one search,the max returning number is 1024 
	 * \else
	 * 一次查询中到第几条日志结束,日志返回条数的最大值为1024
	 * \endif
	 */
	public int					nEndNum;
	
	/**
	 * \if ENGLISH_LANG
	 * log struct type,0:{@link SDK_DEVICE_LOG_ITEM}; 1: {@link SDK_DEVICE_LOG_ITEM_EX}
	 * \else
	 * 日志数据结构体类型,0:表示 {@link SDK_DEVICE_LOG_ITEM}; 1:表示 {@link SDK_DEVICE_LOG_ITEM_EX}
	 * \endif
	 */
	public byte                nLogStuType;
            
	/**
	 * \if ENGLISH_LANG
	 * Channel no. 0:Compatible with previous all channel numbers. The channel No. begins with 1.1: The first channel.
	 * \else
	 * 通道号,0:兼容之前表示所有通道号，所以通道号从1开始; 1:第一个通道
	 * \endif
	 */
	public int        			nChannelID;
}

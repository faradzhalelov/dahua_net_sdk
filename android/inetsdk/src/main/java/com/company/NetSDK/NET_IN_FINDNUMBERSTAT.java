package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#StartFindNumberStat}'s input param
 * \else
 * 接口 {@link INetSDK#StartFindNumberStat} 输入参数
 * \endif
 */
public class NET_IN_FINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel ID
	 * \else
	 * 要进行查询的通道号
	 * \endif
	 */
	public int                 nChannelID;                 
	
	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 开始时间 暂时精确到小时
	 * \endif
	 */
	public NET_TIME            stStartTime = new NET_TIME();                
	
	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * 结束时间 暂时精确到小时
	 * \endif
	 */
	public NET_TIME            stEndTime = new NET_TIME();                  
	
	/**
	 * \if ENGLISH_LANG
	 * granularity type, 0:minute,1:hour,2:day,3:week,4:month,5:quarter,6:year
	 * \else
	 * 查询粒度0:分钟,1:小时,2:日,3:周,4:月,5:季,6:年
	 * \endif
	 */
	public int                 nGranularityType;           
	
	/**
	 * \if ENGLISH_LANG
	 * wait time
	 * \else
	 * 等待接收数据的超时时间
	 * \endif
	 */
	public int                 nWaittime;                  
}

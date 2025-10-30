package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DoFindNumberStat} 's input param
 * \else
 * 接口 {@link INetSDK#DoFindNumberStat} 输入参数
 * \endif
 */
public class NET_IN_DOFINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * [0, totalCount-1]
	 * \else
	 * [0, totalCount-1], 查询起始序号,表示从beginNumber条记录开始,取count条记录返回; 
	 * \endif
	 */
	public int                 nBeginNumber;               
	
	/**
	 * \if ENGLISH_LANG
	 * count
	 * \else
	 * 每次查询的流量统计条数
	 * \endif
	 */
	public int                 nCount;                     
	
	/**
	 * \if ENGLISH_LANG
	 *  wait time
	 * \else
	 * 等待接收数据的超时时间    
	 * \endif
	 */
	public int                 nWaittime;                          
}

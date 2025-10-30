package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * BUS configuration info
 * \else
 * 总线配置信息
 * \endif
 */
public class CFG_CANFILTER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Wait for the reply timeout (unit: ms), after sending data, wait for after 3000 milliseconds, end the Reuters 
	 * \else
	 * 等待应答超时(单位:毫秒)， 发送数据后，等待3000毫秒后，结束该路透传
	 * \endif
	 */
	public int						nResponseTimeout;			
	
	/**
	 * \if ENGLISH_LANG
	 * Receives the request response timeout (unit: ms), more than a specified time not yet received data, think end of the request 
	 * \else
	 * 接收请求应答超时(单位:毫秒)， 超过指定时间未收到数据，认为请求结束
	 * \endif
	 */
	public int						nRequestTimeout;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of data, 
	 * \else
	 * 数据号个数
	 * \endif
	 */
	public int						nFilterPIDCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Returns the number of data number
	 * \else
	 * 返回数据号个数
	 * \endif
	 */
	public int						nRetFiterPIDCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Filter the number of data, 
	 * \else
	 * 过滤数据号
	 * \endif
	 */
	public int[]					pnFilterPID;
	
	/**
	 * \if ENGLISH_LANG
	 * Filtering policy
	 * If it is a allow list, report contains the data of PID
	 * If it is a block list, report does not contain the data of PID
	 * All data reported if no filter
	 * \else
	 * 过滤策略
	 * 0 = 未知策略
	 * 1 = 无过滤 ,所有数据都上报
	 * 2 = 允许名单，上报包含PID的数据
	 * 3 = 禁止名单，上报不含PID的数据
	 * \endif
	 */
	public int						nPolicy;

}

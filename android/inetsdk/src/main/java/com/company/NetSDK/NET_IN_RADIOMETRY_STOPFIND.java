package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#StopFind} interface, {@link NET_FIND#NET_FIND_RADIOMETRY} command to input parameter
* \else
* {@link INetSDK#StopFind}接口, {@link NET_FIND#NET_FIND_RADIOMETRY} 命令入参
* \endif
*/
public class NET_IN_RADIOMETRY_STOPFIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * query handle 
	 * \else
	 * 查询句柄
	 * \endif
	 */
    public int                 nFinderHanle;                       
}

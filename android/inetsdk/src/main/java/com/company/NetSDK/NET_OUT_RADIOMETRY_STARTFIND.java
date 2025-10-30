package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#StartFind} port {@link NET_FIND#NET_FIND_RADIOMETRY} command to output parameter
* \else
* {@link INetSDK#StartFind} 接口 {@link NET_FIND#NET_FIND_RADIOMETRY} 命令出参
* \endif
*/
public class NET_OUT_RADIOMETRY_STARTFIND implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * acquired query handle
	 * \else
	 * 取到的查询句柄
	 * \endif
	 */
	public int                 nFinderHanle;                      
	
	 /**
	 * \if ENGLISH_LANG
	 * total number of result which conforms to the query condition
	 * \else
	 * 符合此次查询条件的结果总条数
	 * \endif
	 */
    public int                 nTotalCount;                       
}

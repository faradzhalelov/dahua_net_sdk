package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DoFind} port, {@link NET_FIND#NET_FIND_RADIOMETRY} command to input parameter
 * \else
 * {@link INetSDK#DoFind} 接口, {@link NET_FIND#NET_FIND_RADIOMETRY} 命令入参
 * \endif
 */
public class NET_IN_RADIOMETRY_DOFIND implements Serializable {

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
    
    /**
     * \if ENGLISH_LANG
     * index number of query begin
     * \else
     * 本次查询开始的索引号
     * \endif
     */
    public int                 nBeginNumber;                      
    
    /**
     * \if ENGLISH_LANG
     * the number of query
     * \else
     * 本次查询条数
     * \endif
     */
    public int                 nCount;                            
}

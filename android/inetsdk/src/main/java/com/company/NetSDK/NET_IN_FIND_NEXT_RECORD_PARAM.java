package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#FindNextRecord} Interface Input Parameters
 * \else
 * {@link INetSDK#FindNextRecord} 接口输入参数
 * \endif
 */
public class NET_IN_FIND_NEXT_RECORD_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Query Handle
	 * \else
	 * 查询句柄
	 * \endif
	 */
    public long                     lFindeHandle;    
    
    /**
     * \if ENGLISH_LANG
     * The current number of records  need query 
     * \else
     * 当前想查询的记录条数
     * \endif
     */
    public int                      nFileCount;      
    
    /**
     * \if ENGLISH_LANG
     * Query type, refer to {@link EM_NET_RECORD_TYPE}
     * \else
     * 查询记录类型, 取值参考 {@link EM_NET_RECORD_TYPE}
     * \endif
     */
    public int         				emType;          
}

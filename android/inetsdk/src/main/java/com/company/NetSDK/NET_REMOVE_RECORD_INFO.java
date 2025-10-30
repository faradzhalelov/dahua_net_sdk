package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * remove, corresponding to command {@link EM_RECORD_OPERATE_TYPE#NET_TRAFFIC_LIST_REMOVE}
 * \else
 * 删除,对应命令{@link EM_RECORD_OPERATE_TYPE#NET_TRAFFIC_LIST_REMOVE}
 * \endif
 */
public class NET_REMOVE_RECORD_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Queried Record Number  
	 * \else
	 * 之前查询到的记录号 
	 * \endif
	 */
    public int                       nRecordNo;      
}

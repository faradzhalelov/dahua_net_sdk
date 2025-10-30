package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#FindNextRecord} Interface Output Parameters
* \else
* {@link INetSDK#FindNextRecord} 接口输出参数
* \endif
*/
public class NET_OUT_FIND_NEXT_RECORD_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * Record List, the user allocates memory, ensure structure by query record type{@link EM_NET_RECORD_TYPE} of {@link NET_IN_FIND_RECORD_PARAM},then ensure memory size
	 * \else
	 * 记录列表,用户分配内存,根据 {@link NET_IN_FIND_RECORD_PARAM}中的查询类型 {@link EM_NET_RECORD_TYPE}，确定对应结构体，进入确定内存大小
	 * \endif
	 */
    public Object[]                  pRecordList;     
    
	 /**
	 * \if ENGLISH_LANG
	 * Max list Record Number
	 * \else
	 * 列表记录数
	 * \endif
	 */
    public int                       nMaxRecordNum;  
    
	 /**
	 * \if ENGLISH_LANG
	 * Query to the number of records, when the query to the article number less than want to query the number, end 
	 * \else
	 * 查询到的记录条数,当查询到的条数小于想查询的条数时,查询结束
	 * \endif
	 */
    public int                       nRetRecordNum;   

//    public NET_OUT_FIND_NEXT_RECORD_PARAM(int nMaxRecordNum) {
//    	this.nMaxRecordNum = nMaxRecordNum;
//    	pRecordList = new Object[nMaxRecordNum];
//    }
}

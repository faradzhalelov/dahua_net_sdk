package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#FindRecord} Interface Input Parameters
 * \else
 * {@link INetSDK#FindRecord} 接口输入参数
 * \endif
 */
public class NET_IN_FIND_RECORD_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The record type to query, refer to {@link EM_NET_RECORD_TYPE}
	 * \else
	 * 待查询记录类型, 取值参考 {@link EM_NET_RECORD_TYPE}
	 * \endif
	 */
    public int         emType;         
    
    /**
     * \if ENGLISH_LANG
     * Query types corresponding to the query conditions, the space application by the user, according to query condition type, find corresponding structure, then ensure memory size
     * \else
     * 查询类型对应的查询条件,由用户申请内存，根据查询记录类型，找到查询条件对应的结构体，进而确定内存大小
     * \endif
     */
    public Object      pQueryCondition; 
}

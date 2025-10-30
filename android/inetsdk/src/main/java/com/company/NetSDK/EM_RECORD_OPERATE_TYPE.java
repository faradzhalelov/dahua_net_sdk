package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Black and allow list type operation
 * \else
 * 权限名单操作类型
 * \endif
 */
public class EM_RECORD_OPERATE_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Increase the record operation
	 * \else
	 * 增加记录操作
	 * \endif
	 */
    public static final int NET_TRAFFIC_LIST_INSERT = 0;                              
    
	/**
	 * \if ENGLISH_LANG
	 * Record update operation
	 * \else
	 * 更新记录操作
	 * \endif
	 */
    public static final int NET_TRAFFIC_LIST_UPDATE = 1;                              
    
	/**
	 * \if ENGLISH_LANG
	 * Delete the record operation
	 * \else
	 * 删除记录操作
	 * \endif
	 */
    public static final int NET_TRAFFIC_LIST_REMOVE = 2;                             
    
    public static final int NET_TRAFFIC_LIST_MAX = 3;
}

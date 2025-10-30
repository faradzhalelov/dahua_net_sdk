package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * update, corresponding to command {@link EM_RECORD_OPERATE_TYPE#NET_TRAFFIC_LIST_UPDATE}
 * \else
 * 更新,对应命令{@link EM_RECORD_OPERATE_TYPE#NET_TRAFFIC_LIST_UPDATE}
 * \endif
 */
public class NET_UPDATE_RECORD_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Record the content information,the space application by the user,apply to sizeof(NET_TRAFFIC_LIST_RECORD)         
	 * \else
	 * 记录内容信息,由用户分配内存，大小为sizeof(NET_TRAFFIC_LIST_RECORD)        
	 * \endif
	 */
	 public NET_TRAFFIC_LIST_RECORD  pRecordInfo = new NET_TRAFFIC_LIST_RECORD();    
}

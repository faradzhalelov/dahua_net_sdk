package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter of {@link INetSDK#OperateTrafficList},In current implementation of operation interface, only return nRecordNo operation, stRetRecord is temporarily unavailable 
 * \else
 * {@link INetSDK#OperateTrafficList}接口输出参数,现阶段实现的操作接口中,只有返回nRecordNo的操作,stRetRecord暂时不可用
 * \endif
 */
public class NET_OUT_OPERATE_TRAFFIC_LIST_RECORD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Number 
	 * \else
	 * 记录号
	 * \endif
	 */
	 public int                       nRecordNo;       
}

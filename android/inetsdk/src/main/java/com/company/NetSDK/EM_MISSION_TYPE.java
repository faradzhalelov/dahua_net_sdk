package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * task type
 * \else
 * 任务类型
 * \endif
 */
public class EM_MISSION_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public final static int NET_MISSION_TYPE_UNKOWN = 0;   
	
	/**
	 * \if ENGLISH_LANG
	 * device self-check, refer to {@link NET_SELFCHECK_INFO}
	 * \else
	 * 设备自检，对应结构体 {@link NET_SELFCHECK_INFO}
	 * \endif
	 */
	public final static int NET_MISSION_TYPE_SELFCHECK = 1;   
}

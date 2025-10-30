package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * access control status type
 * \else
 * 门禁状态类型
 * \endif
 */
public class EM_NET_DOOR_STATUS_TYPE implements Serializable{
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
    public static final int EM_NET_DOOR_STATUS_UNKNOWN = 0;
    
	/**
	 * \if ENGLISH_LANG
	 * door unlock
	 * \else
	 * 门打开
	 * \endif
	 */
    public static final int EM_NET_DOOR_STATUS_OPEN = 1;                           
    
	/**
	 * \if ENGLISH_LANG
	 * door lock
	 * \else
	 * 门关闭
	 * \endif
	 */
    public static final int EM_NET_DOOR_STATUS_CLOSE = 2;                           
    
	/**
	 * \if ENGLISH_LANG
	 * door abnormal unlock
	 * \else
	 * 门异常打开
	 * \endif
	 */
    public static final int EM_NET_DOOR_STATUS_BREAK = 3;                           
}

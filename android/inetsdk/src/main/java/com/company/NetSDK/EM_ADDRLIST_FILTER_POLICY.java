package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the fitering policy of address list
 * \else
 * 地址列表过滤策略
 * \endif
 */
public class EM_ADDRLIST_FILTER_POLICY implements Serializable {
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
    public static final int EM_ADDRLIST_FILTER_POLICY_UNKNOWN = 0;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "white":list of valid address device connections
	 * \else
	 * "white" : 允许列表中的有效地址设备连接热点，允许名单。
	 * \endif
	 */
    public static final int EM_ADDRLIST_FILTER_POLICY_WHITE = 1;                            
    
	/**
	 * \if ENGLISH_LANG
	 * "black":list of valid address device connections in the forbidden list 
	 * \else
	 * "black" : 禁止列表中的有效地址设备连接热点，禁止名单。
	 * \endif
	 */
    public static final int EM_ADDRLIST_FILTER_POLICY_BLACK = 2;                            
}

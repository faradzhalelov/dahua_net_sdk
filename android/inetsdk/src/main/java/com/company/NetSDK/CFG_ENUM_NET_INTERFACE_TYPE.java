package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * network interface type
 * \else
 * 网口类型
 * \endif
 */
public class CFG_ENUM_NET_INTERFACE_TYPE implements Serializable {

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
	public static final int CFG_ENUM_NET_INTERFACE_TYPE_UNKNOWN = 0;                
	
	/**
	 * \if ENGLISH_LANG
	 * standard
	 * \else
	 * 标准网口
	 * \endif
	 */
	public static final int CFG_ENUM_NET_INTERFACE_TYPE_STANDARD = 1;              
	
	/**
	 * \if ENGLISH_LANG
	 * manager
	 * \else
	 * 管理网口
	 * \endif
	 */
	public static final int CFG_ENUM_NET_INTERFACE_TYPE_MANAGER = 2;                
	
	/**
	 * \if ENGLISH_LANG
	 * extend
	 * \else
	 * 扩展网口
	 * \endif
	 */
	public static final int CFG_ENUM_NET_INTERFACE_TYPE_EXTEND = 3;                 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * EAP method
 * \else
 * EAP方法
 * \endif
 */
public class EM_EAP_METHOD implements Serializable {
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
	public static final int EM_EAP_METHOD_UNKNOWN = 0;                                      
	
	/**
	 * \if ENGLISH_LANG
	 * PEAP
	 * \else
	 * PEAP
	 * \endif
	 */
	public static final int EM_EAP_METHOD_PEAP = 1;                                  
	
	/**
	 * \if ENGLISH_LANG
	 * TLS
	 * \else
	 * TLS
	 * \endif
	 */
	public static final int EM_EAP_METHOD_TLS = 2;                                         
	
	/**
	 * \if ENGLISH_LANG
	 * TTLS
	 * \else
	 * TTLS
	 * \endif
	 */
	public static final int EM_EAP_METHOD_TTLS = 3;                                         
}

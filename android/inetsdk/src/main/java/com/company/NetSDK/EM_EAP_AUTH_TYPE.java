package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * EAP authentication method
 * \else
 * EAP身份验证方法
 * \endif
 */
public class EM_EAP_AUTH_TYPE implements Serializable {
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
	public static final int EM_EAP_AUTH_TYPE_UNKNOWN = 0;                                  
	
	/**
	 * \if ENGLISH_LANG
	 * NONE
	 * \else
	 * NONE
	 * \endif
	 */
	public static final int EM_EAP_AUTH_TYPE_NONE = 1;                                      
	
	/**
	 * \if ENGLISH_LANG
	 * PAP
	 * \else
	 * PAP
	 * \endif
	 */
	public static final int EM_EAP_AUTH_TYPE_PAP = 2;                                       
	
	/**
	 * \if ENGLISH_LANG
	 * MSCHAP
	 * \else
	 * MSCHAP
	 * \endif
	 */
	public static final int EM_EAP_AUTH_TYPE_MSCHAP = 3;                                    
	
	/**
	 * \if ENGLISH_LANG
	 * MSCHAPV2
	 * \else
	 * MSCHAPV2
	 * \endif
	 */
	public static final int EM_EAP_AUTH_TYPE_MSCHAPV2 = 4;                                  
	
	/**
	 * \if ENGLISH_LANG
	 * GTC
	 * \else
	 * GTC
	 * \endif
	 */
	public static final int EM_EAP_AUTH_TYPE_GTC = 5;                                       
}

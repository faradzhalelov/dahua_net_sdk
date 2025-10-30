package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WIFI security configuration
 * \else
 * WIFI 安全保护配置
 * \endif
 */
public class NET_WPS_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * connection mode, refer to {@link EM_WIFI_CONNECT_TYPE}
	 * \else
	 * 连接方式,取值参考{@link EM_WIFI_CONNECT_TYPE}
	 * \endif
	 */
    public int   					emConnType;                          
    
	/**
	 * \if ENGLISH_LANG
	 * PIN code, supported in PINEnrollee mode
	 * \else
	 * PIN码, 当连接方式为PIN码方式时需要填写
	 * \endif
	 */
    public byte[]                   szPIN = new byte[FinalVar.MAX_COMMON_STRING_32];         
}

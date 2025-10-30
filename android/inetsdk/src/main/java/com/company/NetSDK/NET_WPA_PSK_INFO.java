package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WPA/WPA2 PSK info
 * \else
 * WPA/WPA2 PSK配置
 * \endif
 */
public class NET_WPA_PSK_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 密码
	 * \endif
	 */
    public byte[]                    szPassword = new byte[FinalVar.MAX_COMMON_STRING_64];  
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WEP info
 * \else
 * WEP认证配置
 * \endif
 */
public class NET_WEP_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * key index :0~3
	 * \else
	 * 秘钥索引, 取值0~3
	 * \endif
	 */
    public int                     nKeyID;                             
    
	/**
	 * \if ENGLISH_LANG
	 * keys array
	 * \else
	 * 四组密码
	 * \endif
	 */
    public byte[][]                szKeys = new byte[FinalVar.MAX_WEP_KEY_NUM][FinalVar.MAX_COMMON_STRING_64];
}

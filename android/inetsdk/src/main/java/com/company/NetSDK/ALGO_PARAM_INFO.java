package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * encrypt algorithm
 * \else
 * 加密算法参数
 * \endif
 */
public class ALGO_PARAM_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt length, for example: wEncryptLenth = 128,the effictive encprypt key vlue only include byAesKey[0]~[15] in the  ENCRYPT_KEY_INFO struct
	 * when the encrypt algorithm is AES,it only support 3 kind length such as 128,192,256
	 * when the encrypt algorithm is DES,it has a fixed value 64
	 * when the encrypt algorithm is DES,it means the encrypt key's number(2 or 3 encrypt key)
	 * \else
	 * 密钥长度，当前为AES算法类型时，表示密钥位数(目前支持128，192，256位三种, 如: wEncryptLenth为128，则密钥信息ENCRYPT_KEY_INFO里的byAesKey[0]~[15])
	 * 为DES算法类型时，密钥长度固定为64位
	 * 为3DES算法类型时，表示密钥的个数(2或3个密钥)
	 * \endif
	 */
	public short       wEncryptLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * work mode, refer to {@link EM_ENCRYPT_ALOG_WORKMODE}
	 * \else
	 * 工作模式 ,取值参考 {@link EM_ENCRYPT_ALOG_WORKMODE}
	 * \endif
	 */
	public byte       byAlgoWorkMode; 
}

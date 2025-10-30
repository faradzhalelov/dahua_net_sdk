package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * user register information
 * \else
 * 注册用户的信息
 * \endif
 */
public class NET_SMART_LOCK_REGISTER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * open smart lock type {@link NET_ACCESS_METHOD}
	 * \else
	 * 开锁方式类型  {@link NET_ACCESS_METHOD}
	 * \endif
	 */
	public int emType;
	
	/**
	 * \if ENGLISH_LANG
	 * user id
	 * \else
	 * 用户ID
	 * \endif
	 */
	public byte[] szUserID = new byte[FinalVar.MAX_COMMON_STRING_16];
	
	/**
	 * \if ENGLISH_LANG
	 * user name
	 * \else
	 * 用户名称
	 * \endif
	 */
	public byte[] szName = new byte[FinalVar.MAX_COMMON_STRING_32];
	

}

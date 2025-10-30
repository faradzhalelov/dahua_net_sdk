package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * set contact info input param
 * \else
 * 设置联系方式入参
 * \endif
 */

public class NET_IN_SET_CONTACT_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * phone number
	 * \else
	 * 手机号
	 * \endif
	 */
    public String    szPhoneNumber;              
    
	/**
	 * \if ENGLISH_LANG
	 * mail
	 * \else
	 * 邮箱
	 * \endif
	 */
    public String     szMail;                     
}

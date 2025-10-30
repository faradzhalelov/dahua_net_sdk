package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get contact info output param
 * \else
 * 获取联系方式出参
 * \endif
 */
public class NET_OUT_GET_CONTACT_INFO implements Serializable{
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
    public byte[]     szPhoneNumber = new byte[FinalVar.MAX_CELL_PHONE_NUMBER_LEN];  
    
	/**
	 * \if ENGLISH_LANG
	 * mail
	 * \else
	 * 邮箱
	 * \endif
	 */
    public byte[]    szMail = new byte[FinalVar.MAX_MAIL_LEN];              
}

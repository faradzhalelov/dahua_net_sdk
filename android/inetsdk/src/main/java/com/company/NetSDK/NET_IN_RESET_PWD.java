package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * reset pwd input param
 * \else
 * 重置密码输入结构体
 * \endif
 */

public class NET_IN_RESET_PWD implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device mac adress
	 * \else
	 * 设备mac地址
	 * \endif
	 */
	public byte[]					szMac = new byte[FinalVar.SDK_MACADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * user name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte[]					szUserName = new byte[FinalVar.MAX_USER_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte[]					szPwd = new byte[FinalVar.MAX_PWD_LEN];

	/**
	 * \if ENGLISH_LANG
	 * security code
	 * \else
	 * 平台发送到预留手机或邮箱中的安全码
	 * \endif
	 */
	public byte[]					szSecurity = new byte[FinalVar.MAX_SECURITY_CODE_LEN];

	/**
	 * \if ENGLISH_LANG
	 * device init status 
	 * \else
	 * 设备初始化状态
	 * \endif
	 */
	public byte 					byInitStaus;
	
	/**
	 * \if ENGLISH_LANG
	 * pwd reset way
	 * \else
	 * 设备支持的密码重置方式
	 * \endif
	 */
	public byte 					byPwdResetWay;

	/**
	 * \if ENGLISH_LANG
	 * phone number of receiving security code, if bSetContact is TRUE, it as reserve cellphone
	 * \else
	 * 用户输入安全码需输入接收安全码的联系方式，如果bSetContact为true，则该联系方式将作为预留联系方式
	 * \endif
	 */
	public byte[]                 szContact = new byte[FinalVar.MAX_CONTACT_LEN];

	/**
	 * \if ENGLISH_LANG
	 * set as reserve cellphone, TRUE: agree; FALSE:disagree
	 * \else
	 * 是否同意设置为预留手机号, TRUE:同意; FALSE:不同意
	 * \endif
	 */
	public boolean                bSetContact;
}

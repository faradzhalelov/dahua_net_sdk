package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail configuration
 * \else
 * 邮件配置
 * \endif
 */
public class SDK_MAIL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The IP address of the mail server
	 * \else
	 * 邮件服务器IP地址
	 * \endif
	 */
	public byte                sMailIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mail server port
	 * \else
	 * 邮件服务器端口
	 * \endif
	 */
	public int                wMailPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Send address
	 * \else
	 * 发送地址
	 * \endif
	 */
    public byte                sSenderAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * 用户名
	 * \endif
	 */
    public byte                sUserName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * User password
	 * \else
	 * 用户密码
	 * \endif
	 */
    public byte                sUserPsw[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Destination address
	 * \else
	 * 目的地址
	 * \endif
	 */
    public byte                sDestAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * CC address
	 * \else
	 * 抄送地址
	 * \endif
	 */
    public byte                sCcAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Dark copied address
	 * \else
	 * 暗抄地址
	 * \endif
	 */
    public byte                sBccAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Title
	 * \else
	 * 标题
	 * \endif
	 */
    public byte                sSubject[] = new byte[FinalVar.SDK_MAX_MAIL_SUBJECT_LEN];
}

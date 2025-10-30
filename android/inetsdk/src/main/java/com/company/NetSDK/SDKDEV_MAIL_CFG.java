package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail configuration structure 
 * \else
 * 邮件配置结构体
 * \endif
 */
public class SDKDEV_MAIL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mail server address(IP and domain name )
	 * \else
	 * 邮件服务器地址(IP或者域名)
	 * \endif
	 */
	public byte                sMailIPAddr[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
	
	public byte                sSubMailIPAddr[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mail server port
	 * \else
	 * 邮件服务器端口
	 * \endif
	 */
	public short                wMailPort;
	
    public short                wSubMailPort;
    
    /**
	 * \if ENGLISH_LANG
	 * From
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
	public byte                sUserName[] = new byte[FinalVar.SDK_MAX_MAIL_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 用户密码
	 * \endif
	 */
	public byte                sUserPsw[] = new byte[FinalVar.SDK_MAX_MAIL_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * To
	 * \else
	 * 目的地址
	 * \endif
	 */
	public byte                sDestAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * CC
	 * \else
	 * 抄送地址
	 * \endif
	 */
	public byte                sCcAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * BCC
	 * \else
	 * 暗抄地址
	 * \endif
	 */
	public byte                sBccAddr[] = new byte[FinalVar.SDK_MAX_MAIL_ADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Subject
	 * \else
	 * 标题
	 * \endif
	 */
	public byte                sSubject[] = new byte[FinalVar.SDK_MAX_MAIL_SUBJECT_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 0:false,	1:true
	 * \else
	 * 使能0:false,    1:true
	 * \endif
	 */
	public byte                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SSL enable
	 * \else
	 * SSL使能
	 * \endif
	 */
	public byte                bSSLEnable;

	/**
	 * \if ENGLISH_LANG
	 * Send interval,[0,3600]s
	 * \else
	 * 发送时间间隔,[0,3600]秒
	 * \endif
	 */
	public short                wSendInterval;

	/**
	 * \if ENGLISH_LANG
	 * Anonymous Options[0,1], 0:FALSE,1:TRUE.
	 * \else
	 * 匿名选项[0,1], 0表示FALSE,1表示TRUE.
	 * \endif
	 */
	public byte                bAnonymous;

	/**
	 * \if ENGLISH_LANG
	 * Attach enable[0,1], 0:FALSE,1:TRUE.
	 * \else
	 * 附件使能[0,1], 0表示FALSE,1表示TRUE.
	 * \endif
	 */
	public byte                bAttachEnable;
}

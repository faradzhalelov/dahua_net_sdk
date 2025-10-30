package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail sending config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_EMAIL}
 * \else
 * 邮件发送配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_EMAIL}
 * \endif
 */
public class CFG_EMAIL_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
    public boolean		   bEnable;				                            
    
    /**
     * \if ENGLISH_LANG
     * If SSL encrypt 
     * \else
     * 是否需要SSL加密
     * \endif
     */
    public boolean         bSslEnable;                                        
    
    /**
     * \if ENGLISH_LANG
     * If TLS encrypt
     * \else
     * 是否需要TLS加密
     * \endif
     */
    public boolean         bTlsEnable;                                         
    
    /**
     * \if ENGLISH_LANG
     * SMTP Server IP address or network name
     * \else
     * SMTP服务器IP地址或网络名
     * \endif
     */
    public byte            szAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];   
    
    /**
     * \if ENGLISH_LANG
     * port no.
     * \else
     * 端口号
     * \endif
     */
    public int             nPort;                                              
    
    /**
     * \if ENGLISH_LANG
     * Account
     * \else
     * 帐户名
     * \endif
     */
    public byte            szUserName[] = new byte[FinalVar.MAX_USERNAME_LEN]; 
    
    /**
     * \if ENGLISH_LANG
     * Password
     * \else
     * 密码
     * \endif
     */
    public byte            szPassword[] = new byte[FinalVar.MAX_PASSWORD_LEN]; 
    
    /**
     * \if ENGLISH_LANG
     * Anonymous mail, true is anonymous, false is non-anonymous
     * \else
     * 匿名邮件，true匿名，false非匿名
     * \endif
     */
    public boolean         bAnonymous;                                         
    
    /**
     * \if ENGLISH_LANG
     * Sender address
     * \else
     * 发件人地址
     * \endif
     */
    public byte            szSendAddress[]  = new byte[FinalVar.MAX_ADDRESS_LEN];
    
    /**
     * \if ENGLISH_LANG
     * Valid receiver quantity
     * \else
     * 有效收件人数
     * \endif
     */
    public int             nRetReciversNum;                                      
    
    /**
     * \if ENGLISH_LANG
     * Receiver list
     * \else
     * 收件人列表
     * \endif
     */
    public byte            szReceivers[][] = new byte[FinalVar.MAX_RECEIVER_NUM][FinalVar.MAX_ADDRESS_LEN];     
    
    /**
     * \if ENGLISH_LANG
     * Mail title keywork
     * \else
     * 邮件标题关键字
     * \endif
     */
    public byte            szTitle[] = new byte[FinalVar.MAX_MAILTITLE_LEN];     
    
    /**
     * \if ENGLISH_LANG
     * Event link mail, only send mail with attachment
     * \else
     * 事件联动邮件，只发送带附件的邮件
     * \endif
     */
    public boolean         bOnlyAttachment;                                      
    
    /**
     * \if ENGLISH_LANG
     *  Enable attachment
     * \else
     * 邮件附件使能
     * \endif
     */
    public boolean         bAttachEnable;                                        
    
    /**
     * \if ENGLISH_LANG
     * Same event min main sending interval, unit is s
     * \else
     * 同一事件的最小邮件发送间隔，单位为秒
     * \endif
     */
    public int             nSendInterv;                                          
    
    /**
     * \if ENGLISH_LANG
     * Capacity,is true ,stuHealthReport is valiud
     * \else
     * 能力,为true时,stuHealthReport有效
     * \endif
     */
    public boolean         abHealthReport;                                    	  
    
    /**
     * \if ENGLISH_LANG
     * Mail report device status
     * \else
     * 邮件上报设备状况
     * \endif
     */
    public CFG_HEALTHREPORT_INFO   stuHealthReport = new CFG_HEALTHREPORT_INFO();

    /**
     * \if ENGLISH_LANG
     * Whether to enbale mail authentication.
     * TRUE means you need a username and password to login to SMTP server.
     * FALSE means you don't need a username and password,through the SMTP server to send mail directly.
     * \else
     * 是否开启邮件鉴权,TRUE表示需要有用户名和密码先登入到SMTP服务器;FALSE表示不需要用户名和密码，直接通过SMTP服务器转发发送邮件
     * \endif
     */
    public boolean         bAuthentication;
}

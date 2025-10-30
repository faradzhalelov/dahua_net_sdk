package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Multi-DDNS Configuration
 * \else
 * 多ddns配置结构体
 * \endif
 */
public class SDK_DDNS_SERVER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DDNS Server ID
	 * \else
	 * ddns服务器id号
	 * \endif
	 */
	public int               dwId;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable, only one DDNS server can be set to enabled in the same time
	 * \else
	 * 使能，同一时间只能有一个ddns服务器处于使能状态
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Server type 
	 * \else
	 * 服务器类型，希网.. 
	 * \endif
	 */
    public byte                szServerType[] = new byte[FinalVar.SDK_MAX_SERVER_TYPE_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server IP
	 * \else
	 * 服务器ip或者域名
	 * \endif
	 */
    public byte                szServerIp[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server Port
	 * \else
	 * 服务器端口
	 * \endif
	 */
    public int               dwServerPort;
    
    /**
	 * \if ENGLISH_LANG
	 * DVR Domain,ie jeckean.3322.org
	 * \else
	 * dvr域名，如jeckean.3322.org
	 * \endif
	 */
    public byte                szDomainName[] = new byte[FinalVar.SDK_MAX_DOMAIN_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Username
	 * \else
	 * 用户名
	 * \endif
	 */
    public byte                szUserName[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
    public byte                szUserPsw[] = new byte[FinalVar.SDK_MAX_HOST_PSWLEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Server alias,ie "private inter ddns"
	 * \else
	 * 服务器别名，如"private inter ddns"
	 * \endif
	 */
    public byte                szAlias[] = new byte[FinalVar.SDK_MAX_DDNS_ALIAS_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * DDNS Alive Period
	 * \else
	 * DDNS 保活时间
	 * \endif
	 */
    public int               dwAlivePeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * Domain Mode :0-Manually input, szDomainName valid; 1-Default Domain szDefaultDomainName valid
	 * \else
	 * 域名模式:0-手动输入域名,szDomainName有效; 1-默认域名szDefaultDomainName有效
	 * \endif
	 */
    public byte                ByMode;
    
    /**
	 * \if ENGLISH_LANG
	 * Default Domain, Read only
	 * \else
	 * 默认域名,只读
	 * \endif
	 */
    public byte                szDefaultDomainName[] = new byte[FinalVar.SDK_MAX_DEFAULT_DOMAIN_LEN];


	/**
	 * \if ENGLISH_LANG
	 *  Mail username
	 * \else
	 *  邮箱用户名
	 * \endif
	 */
	public byte					szEmailUserName[] = new byte[FinalVar.SDK_MAX_MAIL_NAME_LEN];
}

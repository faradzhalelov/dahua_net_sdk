package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ISCSI Target Info
 * \else
 * ISCSI Target信息
 * \endif
 */

public class SDK_ISCSI_TARGET implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * name 
	 * \else
	 * 名称
	 * \endif
	 */
    public byte[]                szName = new byte[FinalVar.SDK_MAX_ISCSI_NAME_LEN];   
    
	/**
	 * \if ENGLISH_LANG
	 * service address 
	 * \else
	 * 服务器地址
	 * \endif
	 */
    public byte[]                szAddress = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];     
    
	/**
	 * \if ENGLISH_LANG
	 * user name 
	 * \else
	 * 用户名
	 * \endif
	 */
    public byte[]                 szUser = new byte[FinalVar.SDK_NEW_USER_NAME_LENGTH];            
    
	/**
	 * \if ENGLISH_LANG
	 * port 
	 * \else
	 * 端口
	 * \endif
	 */
    public int                   nPort;                                    
    
	/**
	 * \if ENGLISH_LANG
	 * status, 0- unknow, 1-connected, 2-un connected, 3-connect failed, 4-authentication failed, 5-connect time out	 
	 * \else
	 * 状态, 0-未知, 1-已连接, 2-未连接, 3-连接失败, 4-认证失败, 5-连接超时, 6-不存在    
	 * \endif
	 */
    public int                  nStatus;                                    
}

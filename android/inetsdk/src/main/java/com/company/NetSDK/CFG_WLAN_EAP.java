package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * EAP of one WLAN
 * \else
 * 单个WLAN配置EAP
 * \endif
 */
public class CFG_WLAN_EAP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * EAP method, refer to {@link EM_CFG_EAP_METHOD}
	 * \else
	 * EAP方法, 取值参考 {@link EM_CFG_EAP_METHOD}
	 * \endif
	 */
	public int        emMethod;                          
	
	/**
	 * \if ENGLISH_LANG
	 * EAP auth, refer to {@link EM_CFG_EAP_AUTH_TYPE}
	 * \else
	 * EAP身份验证方法, 取值参考 {@link EM_CFG_EAP_AUTH_TYPE}
	 * \endif
	 */
	public int        emAuthType;                         
	
	/**
	 * \if ENGLISH_LANG
	 * Identity
	 * \else
	 * 身份
	 * \endif
	 */
	public byte                    szIdentity[] = new byte[FinalVar.MAX_USERNAME_LEN];       
	
	/**
	 * \if ENGLISH_LANG
	 * AnonymousID
	 * \else
	 * 匿名身份
	 * \endif
	 */
	public byte                    szAnonymousID[] = new byte[FinalVar.MAX_USERNAME_LEN];    
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte                    szPassword[] = new byte[FinalVar.MAX_PASSWORD_LEN];       
	
	/**
	 * \if ENGLISH_LANG
	 * CA Cert
	 * \else
	 * CA证书
	 * \endif
	 */
	public byte                    szCaCert[] = new byte[512];                      
	
	/**
	 * \if ENGLISH_LANG
	 * User Cert
	 * \else
	 * 用户证书 
	 * \endif
	 */
	public byte                    szUserCert[] = new byte[512];                   
}

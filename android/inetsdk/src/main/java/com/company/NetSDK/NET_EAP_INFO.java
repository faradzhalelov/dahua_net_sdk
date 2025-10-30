package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WPA/WPA2 info
 * \else
 * WPA/WPA2配置
 * \endif
 */
public class NET_EAP_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * EAP method, refer to {@link EM_EAP_METHOD}
	 * \else
	 * EAP方法,取值参考{@link EM_EAP_METHOD}
	 * \endif
	 */
    public int           			 emMethod;                           
    
	/**
	 * \if ENGLISH_LANG
	 * EAP  authentication method, refer to {@link EM_EAP_AUTH_TYPE}
	 * \else
	 * EAP身份验证方法,取值参考 {@link EM_EAP_AUTH_TYPE}
	 * \endif
	 */
    public int        				 emAuthType;                         
    
	/**
	 * \if ENGLISH_LANG
	 * identify
	 * \else
	 * 身份
	 * \endif
	 */
    public byte[]                    szIdentity = new byte[FinalVar.MAX_COMMON_STRING_64];   
    
	/**
	 * \if ENGLISH_LANG
	 * anonymousID
	 * \else
	 * 匿名身份
	 * \endif
	 */
    public byte[]                    szAnonymousID = new byte[FinalVar.MAX_COMMON_STRING_64];
    
	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 密码
	 * \endif
	 */
    public byte[]                    szPassword = new byte[FinalVar.MAX_COMMON_STRING_64];   
    
	/**
	 * \if ENGLISH_LANG
	 * CA certificate
	 * \else
	 * CA证书
	 * \endif
	 */
    public byte[]                    szCaCert = new byte[FinalVar.MAX_COMMON_STRING_512];    
    
	/**
	 * \if ENGLISH_LANG
	 * user certificate
	 * \else
	 * 用户证书  
	 * \endif
	 */
    public byte[]                    szUserCert = new byte[FinalVar.MAX_COMMON_STRING_512]; 
}

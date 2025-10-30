package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Https Server configuration,the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_HTTPS}
 * \else
 * Https服务配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_HTTPS}
 * \endif
 */
public class CFG_HTTPS_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * server enable
	 * \else
	 * 服务使能
	 * \endif
	 */
    public boolean	bEnable;                                    
    
    /**
     * \if ENGLISH_LANG
     * port
     * \else
     * 端口号
     * \endif
     */
    public int      nPort;                                      
    
    /**
     * \if ENGLISH_LANG
     * Root Certificate Path
     * \else
     * 根证书绝对路径
     * \endif
     */
    public byte[]   szRootCertificatePath = new byte[FinalVar.CFG_COMMON_STRING_128];                 
    
    /**
     * \if ENGLISH_LANG
     * country
     * \else
     * 国家
     * \endif
     */
    public byte[]   szCountry = new byte[FinalVar.CFG_COMMON_STRING_8];                               
    
    /**
     * \if ENGLISH_LANG
     * state name
     * \else
     * 洲名或省名
     * \endif
     */
    public byte[]   szState = new byte[FinalVar.CFG_COMMON_STRING_64];                                
    
    /**
     * \if ENGLISH_LANG
     * local city
     * \else
     * 位置
     * \endif
     */
    public byte[]   szLocatity = new byte[FinalVar.CFG_COMMON_STRING_64];                            
    
    /**
     * \if ENGLISH_LANG
     * Organization name
     * \else
     * 组织名称
     * \endif
     */
    public byte[]   szOrganization = new byte[FinalVar.CFG_COMMON_STRING_64];                         
    
    /**
     * \if ENGLISH_LANG
     * Organization Unit
     * \else
     * 组织单元名称
     * \endif
     */
    public byte[]   szOrganizationUnit = new byte[FinalVar.CFG_COMMON_STRING_64];                    
    
    /**
     * \if ENGLISH_LANG
     * Common Name
     * \else
     * CN字段，是域名或者IP
     * \endif
     */
    public byte[]   szCommonName = new byte[FinalVar.CFG_COMMON_STRING_128];                          
    
    /**
     * \if ENGLISH_LANG
     * email
     * \else
     * 邮箱
     * \endif
     */
    public byte[]   szEmail = new byte[FinalVar.CFG_COMMON_STRING_128];                               
    
    /**
     * \if ENGLISH_LANG
     * company name
     * \else
     * 公司名称
     * \endif
     */
    public byte[]   szName = new byte[FinalVar.CFG_COMMON_STRING_128];                             
    
    /**
     * \if ENGLISH_LANG
     * server Certificate Path
     * \else
     * 服务器证书地址
     * \endif
     */
    public byte[]   szPath = new byte[FinalVar.CFG_COMMON_STRING_128];                                
    
    /**
     * \if ENGLISH_LANG
     * validity
     * \else
     * 证书有效期
     * \endif
     */
    public int      nUsefulLife;                                
}

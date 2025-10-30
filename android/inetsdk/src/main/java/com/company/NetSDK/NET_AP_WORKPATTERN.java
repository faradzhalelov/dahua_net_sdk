package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Accesspoint work pattern
 * \else
 * AP工作模式配置
 * \endif
 */
public class NET_AP_WORKPATTERN implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * work pattern type:2.4G/5G, refer to {@link EM_WORKPATTERN}
	 * \else
	 * 工作模式:2.4G/5G,取值参考{@link EM_WORKPATTERN}
	 * \endif
	 */
    public int          		      emWorkPatternType;                  
    
	/**
	 * \if ENGLISH_LANG
	 * WIFI enable switch: TRUE(enable), FALSE(unable)
	 * \else
	 * WIFI网卡使能开关, TRUE打开, FALSE关闭
	 * \endif
	 */
    public boolean                    bEnable;                            
    
	/**
	 * \if ENGLISH_LANG
	 * hide SSID,TRUE(yes),FALSE(no)
	 * \else
	 * 是否隐藏SSID, TRUE 隐藏, FALSE 显示
	 * \endif
	 */
    public boolean                    bHideSSID;                          
    
	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * 网络名称(SSID)
	 * \endif
	 */
    public byte[]                     szSSID = new byte[FinalVar.SDK_COMMON_STRING_36];
    
	/**
	 * \if ENGLISH_LANG
	 * link mode, refer to {@link EM_LINK_MODE}
	 * \else
	 * 网络连接模式,取值参考{@link EM_LINK_MODE}
	 * \endif
	 */
    public int            			  emLinkMode;                         
    
	/**
	 * \if ENGLISH_LANG
	 * priority(1-32)
	 * \else
	 * 优先级 (范围 1-32)
	 * \endif
	 */
    public int                     	  nPriority;                         
    
	/**
	 * \if ENGLISH_LANG
	 * channel(1-13) 
	 * \else
	 * 信道号 (范围 1-13)
	 * \endif
	 */
    public int                        nChannel;                           
    
	/**
	 * \if ENGLISH_LANG
	 * channel bandwidth,unit:M
	 * \else
	 * 信道带宽 单位: M
	 * \endif
	 */
    public int                        nChannelBandwidth;                  
    
	/**
	 * \if ENGLISH_LANG
	 * authentication, refer to {@link EM_AP_AUTHENTICATION}
	 * \else
	 * 认证方式, 取值参考 {@link EM_AP_AUTHENTICATION}
	 * \endif
	 */
    public int    					  emAuthentication;                   
    
	/**
	 * \if ENGLISH_LANG
	 * data encryption method, refer to {@link EM_AP_DATA_ENCRYPT}
	 * \else
	 * 数据加密方式,取值参考{@link EM_AP_DATA_ENCRYPT}
	 * \endif
	 */
    public int      				  emDataEncryption;                   
    
	/**
	 * \if ENGLISH_LANG
	 * power mode, refer to {@link EM_AP_POWER_MODE}
	 * \else
	 * 功率模式,取值参考{@link EM_AP_POWER_MODE}
	 * \endif
	 */
    public int        				  emPowerMode;                        
    
	/**
	 * \if ENGLISH_LANG
	 * DHCP enable
	 * \else
	 * 是否开启DHCP方式分配IP地址
	 * \endif
	 */
    public boolean                    bDHCPEnable;                        
    
	/**
	 * \if ENGLISH_LANG
	 * DHCP info
	 * \else
	 * DHCP详细配置信息
	 * \endif
	 */
    public NET_DHCP_INFO           	 stuDHCP = new NET_DHCP_INFO();                             
    
	/**
	 * \if ENGLISH_LANG
	 * IP address
	 * \else
	 * IP地址
	 * \endif
	 */
    public byte[]                    szIPAddresss = new byte[FinalVar.NET_IPADDRSTR_LEN];    
    
	/**
	 * \if ENGLISH_LANG
	 * subnetmask
	 * \else
	 * 子网掩码
	 * \endif
	 */
    public byte[]                    szSubnetMask = new byte[FinalVar.MAX_COMMON_STRING_16]; 
    
	/**
	 * \if ENGLISH_LANG
	 * default gateway
	 * \else
	 * 默认网关
	 * \endif
	 */
    public byte[]                    szDefaultGateway = new byte[FinalVar.MAX_COMMON_STRING_16]; 
    
	/**
	 * \if ENGLISH_LANG
	 * WEP info
	 * \else
	 * WEP认证配置
	 * \endif
	 */
    public NET_WEP_INFO              stuWEP = new NET_WEP_INFO();                             
    
	/**
	 * \if ENGLISH_LANG
	 * WPA/WPA2 PSK info
	 * \else
	 * WPA/WPA2 PSK配置
	 * \endif
	 */
    public NET_WPA_PSK_INFO        	stuWPAPSK = new NET_WPA_PSK_INFO();                          
    
	/**
	 * \if ENGLISH_LANG
	 * WPA/WPA2 info
	 * \else
	 * WPA/WPA2 配置
	 * \endif
	 */
    public NET_EAP_INFO            	stuEAP = new NET_EAP_INFO();                             
    
	/**
	 * \if ENGLISH_LANG
	 * WPS info
	 * \else
	 * WPS 安全保护配置
	 * \endif
	 */
    public NET_WPS_INFO            	stuWPS = new NET_WPS_INFO();                             
    
	/**
	 * \if ENGLISH_LANG
	 * access filter info
	 * \else
	 * 接入过滤配置
	 * \endif
	 */  
    public NET_AP_FILTER           	stuFilter;       
    
    public NET_AP_WORKPATTERN(int nMaxListNum) {
    	stuFilter = new NET_AP_FILTER(nMaxListNum);
    }
}

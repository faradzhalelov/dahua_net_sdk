package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WLAN configure
 * \else
 * 单个WLAN配置
 * \endif
 */
public class CFG_WLAN_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Wlan name, read only
	 * \else
	 * Wlan名称, 只能获取不能修改
	 * \endif
	 */
	public byte                    szWlanName[] = new byte[FinalVar.CFG_COMMON_STRING_32];   
	
	/**
	 * \if ENGLISH_LANG
	 * WIFI interface enable
	 * \else
	 * WIFI网卡使能开关, TRUE打开, FALSE关闭
	 * \endif
	 */
	public boolean                    bEnable;                           
	
	/**
	 * \if ENGLISH_LANG
	 * Network name(SSID)
	 * \else
	 * 网络名称(SSID)
	 * \endif
	 */
    public byte                    szSSID[] = new byte[FinalVar.CFG_MAX_SSID_LEN];           
    
    /**
     * \if ENGLISH_LANG
     * manual connect to WLAN, TRUE: connect, FALSE: disconnect
     * \else
     * 手动连接开关, TRUE手动连接, FALSE手动断开
     * \endif
     */
    public boolean                    bConnectEnable;                     
    
    /**
     * \if ENGLISH_LANG
     * auto connect to WALN, TRUE: no, FALSE: yes, no scene for IPC
     * \else
     * 自动连接开关, TRUE不自动连接, FALSE自动连接, IPC无意义
     * \endif
     */
    public boolean                    bLinkEnable;                        
    
    /**
     * \if ENGLISH_LANG
     * link mode, 0: auto, 1: adhoc, 2: Infrastructure
     * \else
     * 连接模式, 0: auto, 1: adhoc, 2: Infrastructure
     * \endif
     */
    public int                     nLinkMode;                          
    
    /**
     * \if ENGLISH_LANG
     * Encryption, 0: off, 1: on, 2: WEP-OPEN, 3: WEP-SHARED, 4: WPA-TKIP, 5: WPA-PSK-TKIP, 6: WPA2-TKIP, 7: WPA2-PSK-TKIP, 8: WPA-AES, 9: WPA-PSK-AES, 10: WPA2-AES, 11: WPA2-PSK-AES, 12:Auto
	 * byAuthMode  , byEncrAlgr  reference to nEncryption
	 * Authentication          DataEncryption			   Encryption
	 * OPEN                    NONE                        "On" 
	 * OPEN                    WEP                         "WEP-OPEN"
	 * SHARD                   WEP                         "WEP-SHARED"
	 * WPA                     TKIP                        "WPA-TKIP"
     * WPA-PSK                 TKIP                        "WPA-PSK-TKIP"
	 * WPA2                    TKIP                        "WPA2-TKIP"
     * WPA2-PSK                TKIP                        "WPA2-PSK-TKIP"
	 * WPA                     AES(CCMP)                   "WPA-AES"
	 * WPA-PSK                 AES(CCMP)                   "WPA-PSK-AES"
	 * WPA2                    AES(CCMP)                   "WPA2-AES"
     * WPA2-PSK                AES(CCMP)                   "WPA2-PSK-AES"
	 * WPA                     TKIP+AES( mix Mode)         "WPA-TKIP" or "WPA-AES"
     * WPA-PSK                 TKIP+AES( mix Mode)         "WPA-PSK-TKIP" or "WPA-PSK-AES"
	 * WPA2                    TKIP+AES( mix Mode)         "WPA2-TKIP" or "WPA2-AES"
	 * WPA2-PSK                TKIP+AES( mix Mode)         "WPA2-PSK-TKIP" or "WPA2-PSK-AES"
	 * WPA3-SAE				   AES(CCMP)				   "WPA3-SAE-CCMP"
	 * WPA3-SAE/PSK			   AES(CCMP)				   "WPA3-SAE/PSK-CCMP" Compatible Mode
     * \else
     * 加密模式, 0: off, 1: on, 2: WEP-OPEN, 3: WEP-SHARED, 4: WPA-TKIP, 5: WPA-PSK-TKIP, 6: WPA2-TKIP, 7: WPA2-PSK-TKIP, 8: WPA-AES, 9: WPA-PSK-AES, 10: WPA2-AES, 11: WPA2-PSK-AES
	 * 二代byAuthMode  , byEncrAlgr  与三代映射关系
	 * Authentication认证方式  DataEncryption数据加密方式  Encryption加密模式
	 * OPEN                    NONE                        "On" 
	 * OPEN                    WEP                         "WEP-OPEN"
	 * SHARD                   WEP                         "WEP-SHARED"
	 * WPA                     TKIP                        "WPA-TKIP"
     * WPA-PSK                 TKIP                        "WPA-PSK-TKIP"
	 * WPA2                    TKIP                        "WPA2-TKIP"
     * WPA2-PSK                TKIP                        "WPA2-PSK-TKIP"
	 * WPA                     AES(CCMP)                   "WPA-AES"
	 * WPA-PSK                 AES(CCMP)                   "WPA-PSK-AES"
	 * WPA2                    AES(CCMP)                   "WPA2-AES"
     * WPA2-PSK                AES(CCMP)                   "WPA2-PSK-AES"
	 * WPA                     TKIP+AES( mix Mode)         "WPA-TKIP"或者"WPA-AES"
     * WPA-PSK                 TKIP+AES( mix Mode)         "WPA-PSK-TKIP"或者"WPA-PSK-AES"
	 * WPA2                    TKIP+AES( mix Mode)         "WPA2-TKIP"或者"WPA2-AES"
	 * WPA2-PSK                TKIP+AES( mix Mode)         "WPA2-PSK-TKIP"或者"WPA2-PSK-AES"
	 * WPA3-SAE				   AES(CCMP)				   "WPA3-SAE-CCMP"
	 * WPA3-SAE/PSK			   AES(CCMP)				   "WPA3-SAE/PSK-CCMP"兼容模式
     * \endif
     */
    public int                     nEncryption;                      															
    
    /**
     * \if ENGLISH_LANG
     * Authentication, unused, refer to {@link EM_CFG_WIRELESS_AUTHENTICATION}
     * \else
     * 认证方式, 暂时没用, 取值参考 {@link EM_CFG_WIRELESS_AUTHENTICATION}
     * \endif
     */
    public int                     emAuthentication;            
    
    /**
     * \if ENGLISH_LANG
     * Data Encryption, unused, refer to {@link EM_CFG_WIRELESS_DATA_ENCRYPT}
     * \else
     * 数据加密方式, 暂时没用, 取值参考 {@link EM_CFG_WIRELESS_DATA_ENCRYPT}
     * \endif
     */
    public int                     emDataEncryption;            
    
    /**
     * \if ENGLISH_LANG
     * Key Type, 0: Hex, 1: ASCII
     * \else
     * 密码类型, 0: Hex, 1: ASCII
     * \endif
     */
    public int                     nKeyType;                           
    
    /**
     * \if ENGLISH_LANG
     * Key index, range of 0~3
     * \else
     * 秘钥索引, 取值0~3
     * \endif
     */
    public int                     nKeyID;                             
    
    /**
     * \if ENGLISH_LANG
     * four keys
     * \else
     * 四组密码
     * \endif
     */
    public byte                    szKeys[][] = new byte[4][128];
    
    /**
     * \if ENGLISH_LANG
     * is key set or not
     * \else
     * 密码是否已经设置
     * \endif
     */
    public boolean                    bKeyFlag;                           
    
    /**
     * \if ENGLISH_LANG
     * EAP
     * \else
     * EAP
     * \endif
     */
    public CFG_WLAN_EAP            stuEap = new CFG_WLAN_EAP();                             
    
    /**
     * \if ENGLISH_LANG
     * Network
     * \else
     * Network
     * \endif
     */
    public CFG_WLAN_NETWORK        stuNetwork = new CFG_WLAN_NETWORK();                   
}

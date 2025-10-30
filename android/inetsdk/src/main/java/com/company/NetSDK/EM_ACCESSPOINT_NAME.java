package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Point name 
 * \else
 * 热点功能的网卡配置名
 * \endif
 */
public class EM_ACCESSPOINT_NAME implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
    public static final int EM_ACCESSPOINT_NAME_UNKNOWN = 0;                          
    
    /**
     * \if ENGLISH_LANG
     * "eth2"
     * \else
     * "eth2" : 前端使用的软AP网卡名
     * \endif
     */
    public static final int EM_ACCESSPOINT_NAME_ETH2 = 1;                             
    
    /**
     * \if ENGLISH_LANG
     * "wlan0" 
     * \else
     * "wlan0" : 存储使用的软AP网卡名
     * \endif
     */
    public static final int EM_ACCESSPOINT_NAME_WALN0 = 2;                            
    
    /**
     * \if ENGLISH_LANG
     * "apra0"
     * \else
     * "apra0" :  提供硬AP功能的网卡名
     * \endif
     */
    public static final int EM_ACCESSPOINT_NAME_APRA0 = 3;                           
}

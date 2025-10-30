package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AccessPoint info
 * \else
 * AccessPoint 配置信息
 * \endif
 */
public class NET_ACCESSPOINT_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * access point name, refer to {@link EM_ACCESSPOINT_NAME}
	 * \else
	 * 提供热点功能的网卡配置名,取值参考 {@link EM_ACCESSPOINT_NAME}
	 * \endif
	 */
     public int    					emAccessPointName;                  
    
	/**
	 * \if ENGLISH_LANG
	 * valid pattern number
	 * \else
	 * 有效工作模式个数
	 * \endif
	 */
    public int                     nValidPatternNum;                   
    
	/**
	 * \if ENGLISH_LANG
	 * work pattern configuration:2.4G(default)/5G
	 * \else
	 * 工作模式配置:2.4G(默认)/5G
	 * \endif
	 */
    public NET_AP_WORKPATTERN[]      stuWorkPattern = new NET_AP_WORKPATTERN[FinalVar.MAX_WORKPATTERN_NUM];
    
    public NET_ACCESSPOINT_INFO(int nMaxListNum) {
    	for(int i = 0; i < FinalVar.MAX_WORKPATTERN_NUM; i++) {
    		stuWorkPattern[i] = new NET_AP_WORKPATTERN(nMaxListNum);
    	}
    }
}

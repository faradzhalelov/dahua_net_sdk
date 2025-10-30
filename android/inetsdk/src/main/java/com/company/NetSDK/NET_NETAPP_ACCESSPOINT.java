package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WIFI server configuration(access point)
 * \else
 *  WIFI服务器端配置 (热点功能)
 * \endif
 */
public class NET_NETAPP_ACCESSPOINT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * AccessPoints number
	 * \else
	 * AccessPoints 有效个数
	 * \endif
	 */
    public int                     nValidAPNum;                       
    
	/**
	 * \if ENGLISH_LANG
	 * Accesspoint info 
	 * \else
	 * AP 配置信息
	 * \endif
	 */
   public NET_ACCESSPOINT_INFO[]    stuAccessPoints = new NET_ACCESSPOINT_INFO[FinalVar.NET_MAX_AP_NUM];    
   
   public NET_NETAPP_ACCESSPOINT(int nMaxListNum) {
	   for(int i = 0; i < FinalVar.NET_MAX_AP_NUM; i++) {
		   stuAccessPoints[i] = new NET_ACCESSPOINT_INFO(nMaxListNum);
	   }
   }
}

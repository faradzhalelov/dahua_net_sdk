package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * all WLAN configure, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_WLAN}
 * \else
 * WLAN配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_WLAN}
 * \endif
 */
public class CFG_NETAPP_WLAN implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * valid WLAN info in stuWlanInfo
	 * \else
	 * stuWlanInfo有效的WLAN配置个数
	 * \endif
	 */
	public int                     nNum;                               
	
	/**
	 * \if ENGLISH_LANG
	 * WLAN info
	 * \else
	 * WLAN配置信息
	 * \endif
	 */
    public CFG_WLAN_INFO           stuWlanInfo[] = new CFG_WLAN_INFO[8];                     
    
    public CFG_NETAPP_WLAN() {
    	for (int i = 0; i < 8; i++) {
    		stuWlanInfo[i] = new CFG_WLAN_INFO();
    	}
    }
}

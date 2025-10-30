package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * initiative register configuration
 * \else
 * 主动注册配置
 * \endif
 */
public class CFG_REGISTER_SERVER_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * initiative register enable
	 * \else
	 * 主动注册使能
	 * \endif
	 */
	public boolean             bEnable;                            						
	
	/**
	 * \if ENGLISH_LANG
	 * device ID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public byte                szDeviceID[] = new byte[FinalVar.MAX_ADDRESS_LEN];       
	
	/**
	 * \if ENGLISH_LANG
	 * server num
	 * \else
	 * 服务器个数
	 * \endif
	 */
	public int                 nServersNum;                        						
	
	/**
	 * \if ENGLISH_LANG
	 * servers
	 * \else
	 * 服务器数组
	 * \endif
	 */
	public CFG_SERVER_INFO     stuServers[] = new CFG_SERVER_INFO[FinalVar.MAX_SERVER_NUM];         						// 服务器数组
	
	public CFG_REGISTER_SERVER_INFO() {
		for(int i = 0; i < FinalVar.MAX_SERVER_NUM; ++i) {
			stuServers[i] = new CFG_SERVER_INFO();
		}
	}
}

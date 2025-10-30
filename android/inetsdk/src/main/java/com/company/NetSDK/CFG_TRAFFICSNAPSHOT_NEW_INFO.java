package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ITC, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_TRAFFICSNAPSHOT_MULTI}
 * \else
 * 智能交通抓拍, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_TRAFFICSNAPSHOT_MULTI}
 * \endif
 */
public class CFG_TRAFFICSNAPSHOT_NEW_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Valid members
	 * \else
	 * 有效成员个数
	 * \endif
	 */
	public int							nCount;								
	
 	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot info group
	 * \else
	 * 交通抓拍表数组
	 * \endif
	 */
	public CFG_TRAFFICSNAPSHOT_INFO[]	stInfo = new CFG_TRAFFICSNAPSHOT_INFO[8];							
	
	public CFG_TRAFFICSNAPSHOT_NEW_INFO() {
		for(int i=0; i<8; i++) {
			stInfo[i] = new CFG_TRAFFICSNAPSHOT_INFO();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Order serial data config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_COMMSUBSCRIBE}
 * \else
 * 订阅串口数据配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_COMMSUBSCRIBE}
 * \endif
 */
public class CFG_DEVCOMM_SUBSCRIBE implements Serializable{
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Serial data config number
	 * \else
	 * 串口数据配置个数
	 * \endif
	 */
	public int                             nSubscribeInfoNum;                  
	
	/**
	 * \if ENGLISH_LANG
	 * Order serial data config is a group?ê?each element represents a serial       
	 * \else
	 * 订阅串口数据配置，是一个数组，每个元素对应一个串口 
	 * \endif
	 */
	public CFG_DEVCOMM_SUBSCRIBE_INFO      stuSubscribeInfo[] = new CFG_DEVCOMM_SUBSCRIBE_INFO[FinalVar.MAX_DEVCOMM_NUM]; 
	
	public CFG_DEVCOMM_SUBSCRIBE() {
		for (int i = 0; i < FinalVar.MAX_DEVCOMM_NUM; i++) {
			stuSubscribeInfo[i] = new CFG_DEVCOMM_SUBSCRIBE_INFO();
		}
	}
}

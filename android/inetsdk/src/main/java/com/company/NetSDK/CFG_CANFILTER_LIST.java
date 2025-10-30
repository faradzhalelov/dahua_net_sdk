package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CAN list, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_CANFILTER}
 * \else
 * CAN列表, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_CANFILTER}
 * \endif
 */
public class CFG_CANFILTER_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The number of CAN
	 * \else
	 * CAN个数
	 * \endif
	 */
	public int						nCANCount;			 
	
	/**
	 * \if ENGLISH_LANG
	 * Equipment Return CAN Count 
	 * \else
	 * 设备返回CAN个数
	 * \endif
	 */
	public int						nRetCANCount;		 
	
	/**
	 * \if ENGLISH_LANG
	 * CAN info
	 * \else
	 * CAN信息
	 * \endif
	 */
	public CFG_CANFILTER_INFO		stuCANFilter[]  = new CFG_CANFILTER_INFO[FinalVar.MAX_CAN_COUNT];
	
	public CFG_CANFILTER_LIST() {
		for (int i=0 ; i < FinalVar.MAX_CAN_COUNT; i++) {
			stuCANFilter[i] = new CFG_CANFILTER_INFO();
		}
	}
}

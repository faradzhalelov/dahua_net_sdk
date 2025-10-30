package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm decoder configuration
 * \else
 * 报警解码器配置
 * \endif
 */
public class SDK_ALARMDEC_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder address
	 * \else
	 * 报警解码器地址
	 * \endif
	 */
	public int               dwAddr;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder enable
	 * \else
	 * 报警解码器使能
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Now only support 8
	 * \else
	 * 现在只支持8个.
	 * \endif
	 */
	public int                dwOutSlots[] = new int[FinalVar.DECODER_OUT_SLOTS_MAX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Effective number of array elements.
	 * \else
	 * dwOutSlots数组有效元素个数.
	 * \endif
	 */
	public int                 nOutSlotNum;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Now only support 8
	 * \else
	 * 现在只支持8个.
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle[] = new SDK_MSG_HANDLE[FinalVar.DECODER_IN_SLOTS_MAX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Effective number of array elements.
	 * \else
	 * stuHandle数组有效元素个数.
	 * \endif
	 */
	public int                 nMsgHandleNum;
	
	public SDK_ALARMDEC_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
		
		for (int i = 0; i < FinalVar.DECODER_IN_SLOTS_MAX_NUM; i++) {
			struHandle[i] = new SDK_MSG_HANDLE();
		}
	}
}

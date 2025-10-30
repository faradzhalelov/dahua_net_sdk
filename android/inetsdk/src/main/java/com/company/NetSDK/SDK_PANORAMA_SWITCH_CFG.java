package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Panorama switch alarm configuration, corresponding to command {@link FinalVar#SDK_DEV_PANORAMA_SWITCH_CFG}
 * \else
 * 全景切换报警配置, 对应命令 {@link FinalVar#SDK_DEV_PANORAMA_SWITCH_CFG}
 * \endif
 */
public class SDK_PANORAMA_SWITCH_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enabled
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * Time period structure 
	 * \else
	 * 时间段结构
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Process way
	 * \else
	 * 报警联动
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE(); 
	
	public SDK_PANORAMA_SWITCH_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}

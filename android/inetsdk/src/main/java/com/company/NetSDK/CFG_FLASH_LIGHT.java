package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Compensation Light, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_FLASH}
 * \else
 * 补光灯配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_FLASH}
 * \endif
 */
public class CFG_FLASH_LIGHT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean                bEnable;                        

	/**
	 * \if ENGLISH_LANG
	 * Brightness  0~100
	 * \else
	 * 亮度 0~100
	 * \endif
	 */
	public int                	  nBrightness;                    

	/**
	 * \if ENGLISH_LANG
	 * Compensation light working period
	 * \else
	 * 补光灯工作时间段
	 * \endif
	 */
	public CFG_TIME_SECTION		  stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	public CFG_FLASH_LIGHT() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}

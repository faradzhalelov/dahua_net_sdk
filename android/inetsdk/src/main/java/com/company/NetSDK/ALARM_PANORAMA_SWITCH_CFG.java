package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_PANORAMA_SWITCH_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Number of alarm channels
	 * \else
	 * 报警通道个数
	 * \endif
	 */
	public int                    nAlarmChnNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Panorama switch alarm configuration
	 * \else
	 * 全景切换报警配置
	 * \endif
	 */
	public SDK_PANORAMA_SWITCH_CFG stuPanoramaSwitch[] = new SDK_PANORAMA_SWITCH_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
	
	public ALARM_PANORAMA_SWITCH_CFG() {
		for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
			stuPanoramaSwitch[i] = new SDK_PANORAMA_SWITCH_CFG();
		}
	}
}

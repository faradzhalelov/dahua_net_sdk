package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_LOST_FOCUS_CFG implements Serializable {
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
	public int                 nAlarmChnNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Lose focus alarm configuration
	 * \else
	 * 失去焦点报警配置
	 * \endif
	 */
    public SDK_LOST_FOCUS_CFG   stuLostFocus[] = new SDK_LOST_FOCUS_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    public ALARM_LOST_FOCUS_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
    		stuLostFocus[i] = new SDK_LOST_FOCUS_CFG();
    	}
    }
}

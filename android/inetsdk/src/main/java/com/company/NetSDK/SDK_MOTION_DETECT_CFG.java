package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Dynamic detection alarm
 * \else
 * 动态检测报警
 * \endif
 */
public class SDK_MOTION_DETECT_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Dynamic detection alarm Enable
	 * \else
	 * 动态检测报警使能
	 * \endif
	 */
	public byte                byMotionEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Sensitivity 1 ~~ 6,1 is the minimum,6 is the maximum
	 * \else
	 * 灵敏度1~6，1是最低，6是最高
	 * \endif
	 */
	public int                wSenseLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of rows of the dynamic detection area
	 * \else
	 * 动态检测区域的行数
	 * \endif
	 */
	public int                wMotionRow;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of columns of the dynamic detection area
	 * \else
	 * 动态检测区域的列数
	 * \endif
	 */
	public int                wMotionCol;
	
	/**
	 * \if ENGLISH_LANG
	 * Detection region, up to 32 * 32 block region
	 * \else
	 * 检测区域，最多32*32块区域
	 * \endif
	 */
    public byte                byDetected[][] = new byte[FinalVar.SDK_MOTION_ROW][FinalVar.SDK_MOTION_COL];
    
    /**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
    public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Handle Mode
	 * \else
	 * 处理方式
	 * \endif
	 */
    public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
    
    public SDK_MOTION_DETECT_CFG() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
    			stSect[i][j] = new SDK_TSECT();
    		}
    	}
    }
}

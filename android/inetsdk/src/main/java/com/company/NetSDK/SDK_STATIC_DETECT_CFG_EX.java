package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Static detection alarm
 * \else
 * 静态检测报警 
 * \endif
 */
public class SDK_STATIC_DETECT_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Static detection alarm enabling
	 * \else
	 * 静态检测报警使能
	 * \endif
	 */
	public byte                byStaticEn;

	/**
	 * \if ENGLISH_LANG
	 * detect delay (old struct)
	 * \else
	 * 检测延时(范围0-127，若超出范围则用nLatch)
	 * \endif
	 */
	public byte                byLatch;

	/**
	 * \if ENGLISH_LANG
	 * Sensitivity
	 * \else
	 * 灵敏度
	 * \endif
	 */
	public short                wSenseLevel;

	/**
	 * \if ENGLISH_LANG
	 * Static detection area rows
	 * \else
	 * 静态检测区域的行数
	 * \endif
	 */
	public short                wStaticRow;

	/**
	 * \if ENGLISH_LANG
	 * Static detection area lines
	 * \else
	 * 静态检测区域的列数
	 * \endif
	 */
	public short                wStaticCol;
	
	/**
	 * \if ENGLISH_LANG
	 * Static detection area,most 32*32
	 * \else
	 * 检测区域，最多32*32块区域
	 * \endif
	 */
    public byte                byDetected[][] = new byte[FinalVar.SDK_STATIC_ROW][FinalVar.SDK_STATIC_COL];
    
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
	 * Handle method
	 * \else
	 * 处理方式
	 * \endif
	 */
    public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX();
    
    /**
	 * \if ENGLISH_LANG
	 * detect delay (new struct)
	 * \else
	 * 检测延时
	 * \endif
	 */
    public int                 nLatch;
    
    public SDK_STATIC_DETECT_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
    			stSect[i][j] = new SDK_TSECT();
    		}
    	}
    }
}

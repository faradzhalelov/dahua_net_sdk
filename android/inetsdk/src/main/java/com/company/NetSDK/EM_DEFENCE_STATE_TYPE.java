package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Type
 * \else
 * 防区状态类型
 * \endif
 */
public class EM_DEFENCE_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_UNKNOWN  = 0 ;
    
    /**
	 * \if ENGLISH_LANG
	 * Bypass
	 * \else
	 * 旁路
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_BYPASS   = 1 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Open, for alarm under disarming
	 * \else
	 * 打开, 指撤防情况下发生报警
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_OPEN     = 2 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Close
	 * \else
	 * 关闭
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_CLOSE    = 3 ; 
    
    /**
	 * \if ENGLISH_LANG
	 * Alarm, for alarm under arming
	 * \else
	 * 报警, 指布防情况下发生报警
	 * \endif
	 */
    public final static int EM_DEFENCE_STATE_ALARMING = 4 ; 
}

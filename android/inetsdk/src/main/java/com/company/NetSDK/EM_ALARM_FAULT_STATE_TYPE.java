package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Failure Type
 * \else
 * 故障类型
 * \endif
 */
public class EM_ALARM_FAULT_STATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All Types
	 * \else
	 * 所有类型
	 * \endif
	 */
    public static final int EM_ALARM_FAULT_STATE_ALL = 0;
    
    /**
     * \if ENGLISH_LANG
     * Connection Failure
     * \else
     * 连接故障
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_CONNECTFAULT = 1; 
    
    /**
     * \if ENGLISH_LANG
     * Bell Failure
     * \else
     * 警号故障
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_BELLFAULT = 2; 
    
    /**
     * \if ENGLISH_LANG
     * Keyboard Failure
     * \else
     * 键盘故障
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_KBFAULT = 3; 
    
    /**
     * \if ENGLISH_LANG
     * Keyboard Vandal-proof
     * \else
     * 键盘防拆
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_KBTAMPER = 4; 
    
    /**
     * \if ENGLISH_LANG
     * Sensor Short circuit
     * \else
     * 传感器短路
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_SENSORSHORTOUT = 5; 
    
    /**
     * \if ENGLISH_LANG
     * Sensor Vandal-proof
     * \else
     * 传感器防拆
     * \endif
     */
    public static final int EM_ALARM_FAULT_STATE_SENSORTAMPER = 6;
}

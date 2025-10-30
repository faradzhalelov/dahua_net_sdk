package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Room Rule
 * \else
 * 门口机呼叫规则
 * \endif
 */
public class EM_CFG_ROOM_RULE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
    public static final int EM_CFG_ROOM_RULE_UNKNOW = 0;                                      
    
    /**
     * \if ENGLISH_LANG
     * Serial room 
     * \else
     * Serial 连续房间号，有些国外使用1~100的房号
     * \endif
     */
    public static final int EM_CFG_ROOM_RULE_SERIAL = 1;                                        
    
    /**
     * \if ENGLISH_LANG
     * No Serial room
     * \else
     * NoSerial 非连续房间号，比如国内的301,502
     * \endif
     */
    public static final int EM_CFG_ROOM_RULE_NOSERIAL = 2;                                     
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor Type, Block List Only
 * \else
 * 布控类型 ,禁止名单仅有
 * \endif
 */
public class EM_NET_TRAFFIC_CAR_CONTROL_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * other control
	 * \else
	 * 其他布控
	 * \endif
	 */
    public static final int NET_CAR_CONTROL_OTHER = 0;
    
	/**
	 * \if ENGLISH_LANG
	 * Back inspection    "OverdueNoCheck"
	 * \else
	 * 过期未检    "OverdueNoCheck"
	 * \endif
	 */
    public static final int NET_CAR_CONTROL_OVERDUE_NO_CHECK = 1;                   
    
	/**
	 * \if ENGLISH_LANG
	 * steal    "BrigandageCar"
	 * \else
	 * 盗抢车辆    "BrigandageCar"
	 * \endif
	 */
    public static final int NET_CAR_CONTROL_BRIGANDAGE_CAR = 2;                      
    
	/**
	 * \if ENGLISH_LANG
	 * hit-and-run   "CausetroubleEscape"
	 * \else
	 * ARGZSTY    "CausetroubleEscape"
	 * \endif
	 */
    public static final int NET_CAR_CONTROL_BREAKING = 3;                          
    
	/**
	 * \if ENGLISH_LANG
	 * break rules and regulations	 "Breaking"
	 * \else
	 *    "Breaking"
	 * \endif
	 */
    public static final int NET_CAR_CONTROL_CAUSETROUBLE_ESCAPE = 4;                 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* zone status
* \else
* 分区状态
* \endif
*/
public class NET_PARTITION_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * zone status, 0-normal, 1-error 
	 * \else
	 * 分区状态，0-正常，1-错误 
	 * \endif
	 */
	public int               nStatus;                  
	
	 /**
	 * \if ENGLISH_LANG
	 * zone total capacity, byte is unit
	 * \else
	 * 分区总容量，字节为单位
	 * \endif
	 */
	public double            dbTotalSize;              
	
	 /**
	 * \if ENGLISH_LANG
	 * free capacity, byte is unit
	 * \else
	 * 剩余容量，字节为单位
	 * \endif
	 */
	public double            dbRemainSize;            
}

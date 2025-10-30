package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * HDD status
 * \else
 * 硬盘状态
 * \endif
 */
public class NET_HDD_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * HDD status, 0-normal, 1-error 
	 * \else
	 * 硬盘状态，0-正常，1-错误  
	 * \endif
	 */
	public int               nState;                   
	
	/**
	 * \if ENGLISH_LANG
	 * HDD total capacity, byte is unit
	 * \else
	 * 硬盘总容量，字节为单位
	 * \endif
	 */
	public double            dbTotalSize;              
	
	/**
	 * \if ENGLISH_LANG
	 *  zone status
	 * \else
	 * 分区状态
	 * \endif
	 */
	public NET_PARTITION_STATE stuPartitions[] = new NET_PARTITION_STATE[FinalVar.SDK_MAX_STORAGE_PARTITION_NUM]; 
    
	/**
	 * \if ENGLISH_LANG
	 * zone quantity
	 * \else
	 * 分区数
	 * \endif
	 */
	public int               nPartitionNum;              
    
    public NET_HDD_STATE() {
    	for (int i = 0; i < FinalVar.SDK_MAX_STORAGE_PARTITION_NUM; i++) {
    		stuPartitions[i] = new NET_PARTITION_STATE();
    	}
    }
}

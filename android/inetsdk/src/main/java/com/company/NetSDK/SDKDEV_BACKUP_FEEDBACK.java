package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device backup feedback 
 * \else
 * 备份设备反馈 
 * \endif
 */

public class SDKDEV_BACKUP_FEEDBACK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup device name
	 * \else
	 * 设备名 
	 * \endif
	 */ 
    public byte[]       	 szName = new byte[32];       
    
    /**
	 * \if ENGLISH_LANG
	 * Capability
	 * \else
	 * 总容量, 以kBytes为单位
	 * \endif
	 */ 
    public int               nCapability;              
    
    /**
	 * \if ENGLISH_LANG
	 * Remain capability
	 * \else
	 * 当前备份剩余容量,以kBytes为单位
	 * \endif
	 */
    public int               nRemain;                       
}

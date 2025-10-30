package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device backup list 
 * \else
 * 备份设备列表  
 * \endif
 */
public class SDKDEV_BACKUP_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup device number
	 * \else
	 * 实际的备份设备数量
	 * \endif
	 */ 
    public int                 nBackupDevNum;   
    
	/**
	 * \if ENGLISH_LANG
	 * Backup device name
	 * \else
	 * 备份设备的名称
	 * \endif
	 */ 
    public byte[][]   szBackupDevNames = new byte[FinalVar.SDK_MAX_BACKUPDEV_NUM][FinalVar.SDK_MAX_BACKUP_NAME]; 
}

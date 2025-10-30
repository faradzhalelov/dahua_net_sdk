package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Backup device type
 * \else
 * 备份设备介质类型
 * \endif
 */
public class SDKDEV_BACKUP_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	 /**
  	 * \if ENGLISH_LANG
  	 * Private file system
  	 * \else
  	 * 私有文件系统
  	 * \endif
  	 */
    public static final int                 BT_DHFS = 0;    
    /**
  	 * \if ENGLISH_LANG
  	 * Mobile hard disk drive 
  	 * \else
  	 * 移动硬盘
  	 * \endif
  	 */
   	public static final int                BT_DISK = 1;      
   	/**
  	 * \if ENGLISH_LANG
  	 * CD record 
  	 * \else
  	 * 光盘刻录
  	 * \endif
  	 */
    public static final int                BT_CDRW = 2;                                 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device backup list 
 * \else
 * 备份设备详细信息  
 * \endif
 */
public class SDKDEV_BACKUP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * 设备名
	 * \endif
	 */ 
    public byte[]             szName = new byte[32];  
	/**
	 * \if ENGLISH_LANG
	 * Backup device type, refer to {@link SDKDEV_BACKUP_TYPE}
	 * \else
	 * 备份设备的介质类型(枚举值见 {@link SDKDEV_BACKUP_TYPE})
	 * \endif
	 */ 
    public byte               byType; 
	/**
	 * \if ENGLISH_LANG
	 * Interface type of backup device, refer to {@link SDKDEV_BACKUP_BUS}
	 * \else
	 * 备份设备的接口类型(枚举值见 {@link SDKDEV_BACKUP_BUS})
	 * \endif
	 */
    public byte               byBus;    
    /**
	 * \if ENGLISH_LANG
	 * Capability 
	 * \else
	 * 总容量, 以kBytes为单位
	 * \endif
	 */
    public int              nCapability;   
    /**
  	 * \if ENGLISH_LANG
  	 * Remain capability 
  	 * \else
  	 * 剩余容量,以kBytes为单位
  	 * \endif
  	 */
    public int              nRemain;                    
    /**
  	 * \if ENGLISH_LANG
  	 * Remote backup directory
  	 * \else
  	 * 远程备份的目录
  	 * \endif
  	 */
    public byte[]          szDirectory = new byte[128];               
}

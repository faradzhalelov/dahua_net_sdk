package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage device info
 * \else
 * 存储设备信息
 * \endif
 */
public class SDK_STORAGE_DEVICE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 名称
	 * \endif
	 */
    public byte[]                 szName = new byte[FinalVar.SDK_STORAGE_NAME_LEN];      
    
	/**
	 * \if ENGLISH_LANG
	 * Total space (MB) 
	 * \else
	 * 总空间, byte
	 * \endif
	 */
    public long                   nTotalSpace;
    
	/**
	 * \if ENGLISH_LANG
	 * free space (MB)
	 * \else
	 * 剩余空间, byte
	 * \endif
	 */
    public long                  nFreeSpace;
    
	/**
	 * \if ENGLISH_LANG
	 * Media, 0-DISK, 1-CDROM, 2-FLASH medium
	 * \else
	 * 介质, 0-DISK, 1-CDROM, 2-FLASH
	 * \endif
	 */
    public byte                 byMedia;                                        
    
	/**
	 * \if ENGLISH_LANG
	 * BUS, 0-ATA, 1-SATA, 2-USB, 3-SDIO, 4-SCSI main line 0-ATA, 1-SATA, 2-USB, 3-SDIO, 4-SCSI
	 * \else
	 * 总线, 0-ATA, 1-SATA, 2-USB, 3-SDIO, 4-SCSI
	 * \endif
	 */
    public byte                byBUS;                                          
    
	/**
	 * \if ENGLISH_LANG
	 * volume type, 0-physics, 1-Raid, 2- VG virtual
	 * \else
	 * 卷类型, 0-物理卷, 1-Raid卷, 2-VG虚拟卷, 3-ISCSI
	 * \endif
	 */
    public byte                byVolume;                                       
    
	/**
	 * \if ENGLISH_LANG
	 * Physics disk state, 0-physics disk offline state, 1-physics disk, 2- RAID activity, 3- RAID sync, 4-RAID hotspare, 5-RAID invalidation, 6- RAID re-creation, 7- RAID delete.
	 * \else
	 * 物理硬盘状态, 取值为 {@link FinalVar#NET_STORAGE_DEV_OFFLINE} 和  {@link FinalVar#NET_STORAGE_DEV_RUNNING} 等
	 * 
	 * \endif
	 */
    public byte                byState;                                        
    
	/**
	 * \if ENGLISH_LANG
	 * storage interface of devices of same type logic number
	 * \else
	 * 同类设备存储接口的物理编号
	 * \endif
	 */
    public int                 nPhysicNo;                                      
    
	/**
	 * \if ENGLISH_LANG
	 * storage interface of devices of same type physics number
	 * \else
	 * 同类设备存储接口的逻辑编号
	 * \endif
	 */
    public int                 nLogicNo;                                       
    
	/**
	 * \if ENGLISH_LANG
	 * superior storage group name
	 * \else
	 * 上级存储组名称
	 * \endif
	 */
    public byte[]             szParent = new byte[FinalVar.SDK_STORAGE_NAME_LEN];                  
    
	/**
	 * \if ENGLISH_LANG
	 * device module
	 * \else
	 * 设备模块
	 * \endif
	 */
    public byte[]             szModule = new byte[FinalVar.SDK_STORAGE_NAME_LEN];                  
    
	/**
	 * \if ENGLISH_LANG
	 * device serial number
	 * \else
	 * 设备序列号
	 * \endif
	 */
    public byte[]             szSerial = new byte[FinalVar.SDK_SERIALNO_LEN];                      
    
	/**
	 * \if ENGLISH_LANG
	 * Firmware version
	 * \else
	 * 固件版本
	 * \endif
	 */
    public byte[]             szFirmware = new byte[FinalVar.SDK_VERSION_LEN];                     
    
	/**
	 * \if ENGLISH_LANG
	 * partition number
	 * \else
	 * 分区数
	 * \endif
	 */
    public int                nPartitionNum;                                  
    
	/**
	 * \if ENGLISH_LANG
	 * partition info
	 * \else
	 * 分区信息
	 * \endif
	 */
    public SDK_STORAGE_PARTITION[]  stuPartitions = new SDK_STORAGE_PARTITION[FinalVar.SDK_MAX_STORAGE_PARTITION_NUM];   
    
	/**
	 * \if ENGLISH_LANG
	 * Raid info, for RAID use only(byVolume == 1) 
	 * \else
	 * RAID信息, 只对RAID有效(byVolume == 1)
	 * \endif
	 */
    public SDK_STORAGE_RAID     stuRaid = new SDK_STORAGE_RAID();                                        
    
	/**
	 * \if ENGLISH_LANG
	 * Iscsi info, for iscsi use only (byVolume == 2)
	 * \else
	 * ISCSI信息, 只对ISCSI盘有效(byVolume == 2)
	 * \endif
	 */
    public SDK_ISCSI_TARGET     stuISCSI = new SDK_ISCSI_TARGET();                                       
    
	/**
	 * \if ENGLISH_LANG
	 * tank enable
	 * \else
	 * 扩展柜使能
	 * \endif
	 */
    public boolean              abTank;                                        
    
	/**
	 * \if ENGLISH_LANG
	 * tank info, effectice when abTank = TRUE
	 * \else
	 * 硬盘所在扩展柜信息, abTank为TRUE时有效
	 * \endif
	 */
    public SDK_STORAGE_TANK     stuTank = new SDK_STORAGE_TANK();                                        
    
    public SDK_STORAGE_DEVICE() {
    	for(int i = 0; i < FinalVar.SDK_MAX_STORAGE_PARTITION_NUM; i++) {
    		stuPartitions[i] = new SDK_STORAGE_PARTITION();
    	}
    }
}

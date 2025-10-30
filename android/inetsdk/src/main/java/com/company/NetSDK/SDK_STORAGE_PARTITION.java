package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage partition info
 * \else
 * 存储分区信息
 * \endif
 */
public class SDK_STORAGE_PARTITION implements Serializable{
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
    public byte[]                szName = new byte[FinalVar.SDK_STORAGE_NAME_LEN];  
    
	/**
	 * \if ENGLISH_LANG
	 * Total space(MB)
	 * \else
	 * 总空间, byte
	 * \endif
	 */
    public long                   nTotalSpace;
    
	/**
	 * \if ENGLISH_LANG
	 * free space(MB
	 * \else
	 * 剩余空间, byte
	 * \endif
	 */
    public long                   nFreeSpace;
    
	/**
	 * \if ENGLISH_LANG
	 * Mount point
	 * \else
	 * 挂载点
	 * \endif
	 */
    public byte[]                szMountOn = new byte[FinalVar.SDK_STORAGE_MOUNT_LEN];            
    
	/**
	 * \if ENGLISH_LANG
	 * file system
	 * \else
	 * 文件系统
	 * \endif
	 */
    public byte[]                szFileSystem = new byte[FinalVar.SDK_STORAGE_FILE_SYSTEM_LEN];   
    
	/**
	 * \if ENGLISH_LANG
	 * partition state, 0-LV not available, 1-LV available
	 * \else
	 * 分区状态, 0-LV不可用, 1-LV可用
	 * \endif
	 */
    public int                 nStatus;                                    
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * hdd type
 * \else
 * 硬盘类型
 * \endif
 */
public class EM_DISK_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
	 * \if ENGLISH_LANG
	 * read write disk
	 * \else
	 * 读写驱动器
	 * \endif
	 */
	public static final int SDK_DISK_READ_WRITE = 0;                        
	
    /**
	 * \if ENGLISH_LANG
	 * read only disk
	 * \else
	 * 只读驱动器
	 * \endif
	 */
	public static final int SDK_DISK_READ_ONLY = 1;                         
	
    /**
	 * \if ENGLISH_LANG
	 * back up disk or media disk
	 * \else
	 * 备份驱动器或媒体驱动器
	 * \endif
	 */
	public static final int SDK_DISK_BACKUP = 2;                            
	
    /**
	 * \if ENGLISH_LANG
	 * edundancy disk
	 * \else
	 * 冗余驱动器
	 * \endif
	 */
	public static final int SDK_DISK_REDUNDANT = 3;                         
	
    /**
	 * \if ENGLISH_LANG
	 * snapshot disk
	 * \else
	 * 快照驱动器
	 * \endif
	 */
	public static final int SDK_DISK_SNAPSHOT = 4;                          
}

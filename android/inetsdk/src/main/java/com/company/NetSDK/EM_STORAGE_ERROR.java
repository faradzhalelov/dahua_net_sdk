package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage error
 * \else
 * 存储错误类型
 * \endif
 */
public class EM_STORAGE_ERROR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * no error
	 * \else
	 * 无
	 * \endif
	 */
	public static final int STORAGE_ERROR_NONE = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * patition error 
	 * \else
	 * 分区错误          
	 * \endif
	 */
	public static final int STORAGE_ERROR_PATITION = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * init system file error	
	 * \else
	 * 初始化文件系统错误    
	 * \endif
	 */
	public static final int STORAGE_ERROR_INIT_FS = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * read data error
	 * \else
	 * 读数据失败
	 * \endif
	 */
	public static final int STORAGE_ERROR_READ_DATA = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * write data error
	 * \else
	 * 写数据失败
	 * \endif
	 */
	public static final int STORAGE_ERROR_WRITE_DATA = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID error
	 * \else
	 * RAID错误
	 * \endif
	 */
	public static final int STORAGE_ERROR_RAID_FAILED = 5;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID degranded 
	 * \else
	 * RAID降级
	 * \endif
	 */
	public static final int STORAGE_ERROR_RAID_DEGRADED = 6;
	
 	/**
	 * \if ENGLISH_LANG
	 * iSCSI error
	 * \else
	 * iSCSI错误
	 * \endif
	 */
	public static final int STORAGE_ERROR_ISCSI_FAILED = 7;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * mode of lock for record
 * \else
 * 录像加锁方式
 * \endif
 */
public class EM_MARKFILE_MODE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * add lock for record by time mode 
	 * \else
	 * 通过时间方式对录像加锁
	 * \endif
	 */
	public static final int EM_MARK_FILE_BY_TIME_MODE = 0;                             
	
	/**
	 * \if ENGLISH_LANG
	 * add lock for record by file mode 
	 * \else
	 * 通过文件名方式对录像加锁
	 * \endif
	 */
	public static final int EM_MARK_FILE_BY_NAME_MODE = 1;                             
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * file transfer type
 * \else
 * 文件传输状态
 * \endif
 */

public class Net_EM_AIO_FILE_STATUS implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int NET_EM_AIO_FILE_STSTUS_UNKNOWN   = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin,upload start, without data
	 * \else
	 * Begin, 标识上传开始，不带数据
	 * \endif
	 */
	public static final int NET_EM_AIO_FILE_STSTUS_BEGIN     = 1;	
	
	/**
	 * \if ENGLISH_LANG
	 * Uploading
	 * \else
	 * 上传
	 * \endif
	 */
	public static final int NET_EM_AIO_FILE_STSTUS_UPLOADING = 2;			
	
	/**
	 * \if ENGLISH_LANG
	 * End,upload end, without data.
	 * \else
	 * End, 标识上传结束，不带数据
	 * \endif
	 */
	public static final int NET_EM_AIO_FILE_STSTUS_END       = 3;		
}

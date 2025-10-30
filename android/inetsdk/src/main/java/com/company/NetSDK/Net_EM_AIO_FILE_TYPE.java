package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * file type
 * \else
 * 文件类型
 * \endif
 */
public class Net_EM_AIO_FILE_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int Net_EM_AIO_FILE_TYPE_UNKNOWN   = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * "upSystem": system update
	 * \else
	 * "upSystem":系统升级包
	 * \endif
	 */
	public static final int Net_EM_AIO_FILE_TYPE_UPSYSTEM  = 1;		
	
	/**
	 * \if ENGLISH_LANG
	 * "upApp"：app update
	 * \else
	 * "upApp"：app升级包End
	 * \endif
	 */
	public static final int Net_EM_AIO_FILE_TYPE_UPAPP     = 2;					
}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* video split work mode 
* \else
* 画面分割工作模式
* \endif
*/
public class NET_SPLIT_WORK_MODE implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_SPLIT_WORK_MODE_UNKNOWN = 0;                      
	
	 /**
	 * \if ENGLISH_LANG
	 * local normal mode 
	 * \else
	 * 本地普通模式
	 * \endif
	 */
	public static final int NET_SPLIT_WORK_MODE_LOCAL = 1;                          
	
	 /**
	 * \if ENGLISH_LANG
	 * playback mode 
	 * \else
	 * 回放模式
	 * \endif
	 */
	public static final int NET_SPLIT_WORK_MODE_REPLAY = 2;                        
}

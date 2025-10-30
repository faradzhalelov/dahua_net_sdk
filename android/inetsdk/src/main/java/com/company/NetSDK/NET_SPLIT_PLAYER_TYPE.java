package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* player type 
* \else
*  播放器类型
* \endif
*/
public class NET_SPLIT_PLAYER_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_SPLIT_PLAYER_TYPE_UNKNOWN = 0;                       
	
	 /**
	 * \if ENGLISH_LANG
	 * file list player
	 * \else
	 * 文件列表播放器
	 * \endif
	 */
	public static final int NET_SPLIT_PLAYER_TYPE_FILE_LIST = 1;                    
	
	 /**
	 * \if ENGLISH_LANG
	 * file player
	 * \else
	 * 文件播放器
	 * \endif
	 */
	public static final int NET_SPLIT_PLAYER_TYPE_FILE = 2;                         
}

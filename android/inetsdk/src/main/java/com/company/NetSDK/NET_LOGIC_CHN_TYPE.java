package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * channel type
 * \else
 * 通道类型
 * \endif
 */
public class NET_LOGIC_CHN_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int LOGIC_CHN_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Local channel 
	 * \else
	 * 本地通道
	 * \endif
	 */
	public static final int LOGIC_CHN_LOCAL = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Remote access channel
	 * \else
	 * 远程通道
	 * \endif
	 */
	public static final int LOGIC_CHN_REMOTE = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * Synthesis of channel, for the judicial equipment contains picture in picture channel and mixing channel 
	 * \else
	 * 合成通道, 对于庭审设备包含画中画通道和混音通道
	 * \endif
	 */
	public static final int LOGIC_CHN_COMPOSE = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * matrix channel，including analog matrix and digital matrix
	 * \else
	 * 模拟矩阵通道
	 * \endif
	 */
	public static final int LOGIC_CHN_MATRIX = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * cascading channel
	 * \else
	 * 级联通道
	 * \endif
	 */
	public static final int LOGIC_CHN_CASCADE = 5; 
}

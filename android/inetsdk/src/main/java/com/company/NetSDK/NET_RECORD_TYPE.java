package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record file type
 * \else
 * 录像文件类型
 * \endif
 */
public class NET_RECORD_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All the video
	 * \else
	 * 所有录像
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_ALL = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * common  video
	 * \else
	 * 普通录像
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_NORMAL = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * External alarm video
	 * \else
	 * 外部报警录像
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_ALARM = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * DM alarm video
	 * \else
	 * 动检报警录像
	 * \endif
	 */
	public final static int NET_RECORD_TYPE_MOTION = 3; 
}

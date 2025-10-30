package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Analysis Resource Type
 * \else
 * 视频分析资源类型
 * \endif
 */
public class CFG_VIDEO_SOURCE_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Live Stream
	 * \else
	 * 实时流
	 * \endif
	 */
	public final static int CFG_VIDEO_SOURCE_REALSTREAM = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * File Stream 
	 * \else
	 * 文件流
	 * \endif
	 */
	public final static int CFG_VIDEO_SOURCE_FILESTREAM = 1;
}

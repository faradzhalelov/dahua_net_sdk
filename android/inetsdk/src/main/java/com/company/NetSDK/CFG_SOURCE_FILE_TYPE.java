package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Analysis of The Source File Type
 * \else
 * 分析源文件类型
 * \endif
 */
public class CFG_SOURCE_FILE_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown Type
	 * \else
	 * 未知类型
	 * \endif
	 */
	public final static int CFG_SOURCE_FILE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Video Files
	 * \else
	 * 录像文件
	 * \endif
	 */
	public final static int CFG_SOURCE_FILE_RECORD = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture File
	 * \else
	 * 图片文件
	 * \endif
	 */
	public final static int CFG_SOURCE_FILE_PICTURE = 2;
}

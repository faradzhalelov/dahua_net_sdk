package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Analysis of The Source File Information
 * \else
 * 视频分析源文件信息
 * \endif
 */
public class CFG_SOURCE_FILE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * File Path
	 * \else
	 * 文件路径
	 * \endif
	 */
	public byte                szFilePath[] = new byte[FinalVar.MAX_PATH];               
	
	/**
	 * \if ENGLISH_LANG
	 * File Type for Detail, refer to {@link CFG_SOURCE_FILE_TYPE}
	 * \else
	 * 文件类型，详见 {@link CFG_SOURCE_FILE_TYPE}
	 * \endif
	 */
	public int                 emFileType;                        
}

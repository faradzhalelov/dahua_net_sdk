package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * file info
 * \else
 * 文件信息
 * \endif
 */
public class SDK_PIC_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * file size,unit:byte
	 * \else
	 * 文件大小, 单位:字节
	 * \endif
	 */
	public int                dwFileLenth; 
	
	/**
	 * \if ENGLISH_LANG
	 * file path
	 * \else
	 * 文件路径      
	 * \endif
	 */
	public byte                 szFilePath[] = new byte[FinalVar.MAX_PATH];     
}

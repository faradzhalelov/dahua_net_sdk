package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetRingFileList} output param
 * \else
 * {@link INetSDK#GetRingFileList} 出参
 * \endif
 */

public class NET_OUT_GET_RINGFILELIST implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * return ring file num
	 * \else
	 * 返回音频文件个数
	 * \endif
	 */
	public int          nRingFileNum;                
	
	/**
	 * \if ENGLISH_LANG
	 * ring file list info
	 * \else
	 * 音频文件列表,
	 * \endif
	 */
	public byte[][]     szRingFileList = new byte[FinalVar.MAX_RINGFILE_NUM][FinalVar.SDK_COMMON_STRING_64];
}

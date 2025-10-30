package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Info of enrichment record file 
 * \else
 * 浓缩录像文件信息
 * \endif
 */
public class NET_SYNOPSISFILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * File name
	 * \else
	 * 文件名  
	 * \endif
	 */
	public byte				szFileName[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME			stuStartTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME			stuEndTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Server mark,with szFileName[] a choise
	 * \else
	 * 在服务器里的标示，与文件名2选1使用
	 * \endif
	 */
	public int					nTaskID;
	
	/**
	 * \if ENGLISH_LANG
	 * 1-record file, 2- source file
	 * \else
	 * 1-视频浓缩录像文件，2-视频浓缩源文件
	 * \endif
	 */
	public byte				bFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 下载模式: 0-按文件下载, 1-按时间下载, 2-按文件偏移下载
	 * \endif
	 */
	public byte				byMode;
	
	/**
	 * \if ENGLISH_LANG
	 * file length (byte)
	 * \else
	 * 文件大小，单位:KB
	 * \endif
	 */
	public int					nFileLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 起始文件偏移, 单位: KB
	 * \endif
	 */
	public int					nStartFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 结束文件偏移, 单位: KB
	 * \endif
	 */
	public int					nEndFileOffset;			 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event file info
 * \else
 * 事件对应文件信息
 * \endif
 */
public class SDK_EVENT_FILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The file count in the current file's group
	 * \else
	 * 当前文件所在文件组中的文件总数
	 * \endif
	 */
	public byte               	bCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The index of the file in the group
	 * \else
	 * 当前文件在文件组中的文件编号(编号1开始)
	 * \endif
	 */
	public byte               	bIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * File tag, see the enum struct {@link EM_EVENT_FILETAG}
	 * \else
	 * 文件标签，具体说明见枚举类型 {@link EM_EVENT_FILETAG}
	 * \endif
	 */
	public byte               	bFileTag;
	
	/**
	 * \if ENGLISH_LANG
	 * File type,0-normal 1-compose 2-cut picture
	 * \else
	 * 文件类型，0-普通 1-合成 2-抠图
	 * \endif
	 */
	public byte               	bFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * File time
	 * \else
	 * 文件时间
	 * \endif
	 */
	public NET_TIME_EX        	stuFileTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * The only id of one group file
	 * \else
	 * 同一组抓拍文件的唯一标识
	 * \endif
	 */
	public int              	nGroupId;
}

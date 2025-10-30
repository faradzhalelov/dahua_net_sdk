package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * way of create file name
 * \else
 * 文件名产生的方式
 * \endif
 */
public class EM_MARKFILE_NAMEMADE_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * default:need user pass record file name parameter szFilename
	 * \else
	 * 默认方式：需要用户传递录像文件名参数szFilename
	 * \endif
	 */
	public static final int EM_MARKFILE_NAMEMADE_DEFAULT = 0;							
	
	/**
	 * \if ENGLISH_LANG
	 * way of  file name split joint:pass the disk number ,pass the start cluster number,not need pass record file name
	 * \else
	 * 拼接文件名方式：用户传递磁盘号(nDriveNo)、起始簇号(nStartCluster)，不需要传递录像文件名
	 * \endif
	 */
	public static final int EM_MARKFILE_NAMEMADE_JOINT = 1;							
}

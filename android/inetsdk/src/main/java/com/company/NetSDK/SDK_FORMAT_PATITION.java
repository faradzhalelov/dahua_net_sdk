package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * format the partition information, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_CTRL_FORMAT_PATITION}
 * \else
 * 格式化分区信息, 对应接口{@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_CTRL_FORMAT_PATITION}
 * \endif
 */
public class SDK_FORMAT_PATITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * storage name
	 * \else
	 * 存储设备名称
	 * \endif
	 */
	public String		pszStorageName; 
	
	/**
	 * \if ENGLISH_LANG
	 * partition name
	 * \else
	 * 分区名
	 * \endif
	 */
	public String		pszPatitionName; 
	
	/**
	 * \if ENGLISH_LANG
	 * file system type
	 * \else
	 * 文件系统格式
	 * \endif
	 */
	public String		pszFileSystem; 
}

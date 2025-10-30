package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage Group Channel Related Structure
 * \else
 * 存储组通道相关配置
 * \endif
 */
public class AV_CFG_StorageGroupChannel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Max Pictures Storage in Each Channel Folder, Cover If Surpass 
	 * \else
	 * 每个通道文件夹图片存储上限, 超过就覆盖
	 * \endif
	 */
	public int			nMaxPictures;
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel Indicated By the String In the Naming Rule, %c Corresponding Content 
	 * \else
	 * 通道在命名规则里的字符串表示, %c对应的内容
	 * \endif
	 */
	public byte[]		szPath = new byte[FinalVar.AV_CFG_Max_ChannelRule];
}

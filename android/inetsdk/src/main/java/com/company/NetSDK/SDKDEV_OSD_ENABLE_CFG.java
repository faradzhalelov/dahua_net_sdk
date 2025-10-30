package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zhengzhou EC_U video data overlay enabling configuration
 * \else
 * 郑州威科姆EC_U视频数据叠加使能配置
 * \endif
 */
public class SDKDEV_OSD_ENABLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 端口
	 * \endif
	 */
	public int                 nPort; 
}

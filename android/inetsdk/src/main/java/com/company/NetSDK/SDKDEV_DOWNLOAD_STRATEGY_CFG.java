package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video download policy configuration
 * \else
 * 录象下载策略配置
 * \endif
 */
public class SDKDEV_DOWNLOAD_STRATEGY_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TRUE：High-speed downloads, FALSE: ordinary download
	 * \else
	 * TRUE：高速下载，FALSE：普通下载
	 * \endif
	 */
	public boolean                bEnable;
}

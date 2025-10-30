package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Fish eye detailed info config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_FISHEYE_INFO}
 * \else
 * 鱼眼详细配置信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_FISHEYE_INFO}
 * \endif
 */
public class CFG_FISHEYE_DETAIL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * module number
	 * \else
	 * 模块数
	 * \endif
	 */
	public int                nModeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * detailed module info  
	 * \else
	 * 具体模块信息  
	 * \endif
	 */
	public CFG_FISHEYE_MODE_INFO stuModes[] = new CFG_FISHEYE_MODE_INFO[FinalVar.CFG_MAX_FISHEYE_MODE_NUM];
	
	public CFG_FISHEYE_DETAIL_INFO() {
		for (int i = 0; i < FinalVar.CFG_MAX_FISHEYE_MODE_NUM; i++) {
			stuModes[i] = new CFG_FISHEYE_MODE_INFO();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Video analyze module config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ANALYSEMODULE}
 * \else
 * 物体的检测模块配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ANALYSEMODULE}
 * \endif
 */

public class CFG_ANALYSEMODULES_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Detect module number
	 * \else
	 * 检测模块数
	 * \endif
	 */
	public int					nMoudlesNum;							    
	
	/**
	 * \if ENGLISH_LANG
	 * Each video channel's kinds of object's configration of detect module
	 * \else
	 * 每个视频输入通道对应的各种类型物体的检测模块配置
	 * \endif
	 */
	public CFG_MODULE_INFO[]   stuModuleInfo = new CFG_MODULE_INFO[FinalVar.MAX_ANALYSE_MODULE_NUM];	 
	
	public CFG_ANALYSEMODULES_INFO() {
		for(int i = 0; i < FinalVar.MAX_ANALYSE_MODULE_NUM; i++) {
			stuModuleInfo[i] = new CFG_MODULE_INFO();
		}
	}
}

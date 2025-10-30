package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Light state configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_LIGHT_GLOBAL}
 * \else
 * 指示灯控制配置参数, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_LIGHT_GLOBAL}
 * \endif
 */
public class CFG_LIGHT_GLOBAL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of light global
	 * \else
	 * 指示灯数量
	 * \endif
	 */
	public    int           nLightGlobalCount;
	
	/**
	 * \if ENGLISH_LANG
	 * states array of light global
	 * \else
	 * 指示灯开关数组
	 * \endif
	 */
	public     boolean[]       bLightEnable       =    new boolean[FinalVar.MAX_LIGHT_GLOBAL_NUM];

}

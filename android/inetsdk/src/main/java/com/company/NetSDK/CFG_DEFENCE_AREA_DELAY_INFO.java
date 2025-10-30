package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * zone delay config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_DEFENCE_AREA_DELAY}
 * \else
 * 防区延时配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_DEFENCE_AREA_DELAY}
 * \endif
 */
public class CFG_DEFENCE_AREA_DELAY_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enter delay zone type, except zone type {@link EM_CFG_DEFENCEAREATYPE#EM_CFG_DefenceAreaType_Entrance2}, all use this to enter delay
	 * \else
	 * 有进入延时的防区类型，除防区类型{@link EM_CFG_DEFENCEAREATYPE#EM_CFG_DefenceAreaType_Entrance2}外, 都使用此进入延时
	 * \endif
	 */
	public int                 nEnterDelay1;
	
	/**
	 * \if ENGLISH_LANG
	 * only zone type as {@link EM_CFG_DEFENCEAREATYPE#EM_CFG_DefenceAreaType_Entrance2}, will use this to enter delay
	 * \else
	 * 只有防区类型为{@link EM_CFG_DEFENCEAREATYPE#EM_CFG_DefenceAreaType_Entrance2}, 才会使用此进入延时
	 * \endif
	 */
	public int                 nEnterDelay2;
	
	/**
	 * \if ENGLISH_LANG
	 * all exit delay zone, all use this to exit delay
	 * \else
	 * 所有有退出延时的防区, 都使用此退出延时
	 * \endif
	 */
	public int                 nExitDelay;
}

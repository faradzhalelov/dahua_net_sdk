package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CommGlobal(for arm/disarm configuration), the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_COMMGLOBAL}
 * nSceneCount and stuScense[MAX_SCENE_COUNT] are enabled only when device type is "AS5008", 
 * otherwise use "bSceneEnable" and "emCurrentScene" instead
 * \else
 * 布防撤防配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令{@link FinalVar#CFG_CMD_COMMGLOBAL}
 * 产品型号不为AS5008时, 启用bSceneEnable和emCurrentScene, 不启用nSceneCount和stuScense[MAX_SCENE_COUNT]
 * 产品型号为AS5008时, 不启用bSceneEnable和emCurrentScene, 启用nSceneCount和stuScense[MAX_SCENE_COUNT]
 * \endif
 */
public class CFG_COMMGLOBAL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TRUE: Arming; FALSE: disarm; acting on the entire device, does not distinguish between channels
	 * \else
	 * TRUE: 布防; FALSE: 撤防; 作用于整台设备，不区分通道
	 * \endif
	 */
	public boolean				bEnable;								
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to enable scene mode 
	 * \else
	 * 是否启用情景模式
	 * \endif
	 */
	public boolean				bSceneEnable;							
	
	/**
	 * \if ENGLISH_LANG
	 * The currently selected scene mode, refer to {@link emCFG_SCENE_MODE}
	 * \else
	 * 当前选择的情景模式, 取值参考  {@link emCFG_SCENE_MODE}
	 * \endif
	 */
	public int              	emCurrentScene;							
	
	/**
	 * \if ENGLISH_LANG
	 * Effective number of scenarios mode
	 * \else
	 * 情景模式有效个数
	 * \endif
	 */
	public int					nSceneCount;							
	
	/**
	 * \if ENGLISH_LANG
	 * Profiles define each mode corresponds to a configuration
	 * \else
	 * 情景模式定义，每个模式对应一个配置
	 * \endif
	 */
	public CFG_SCENE_INFO		stuScense[] = new CFG_SCENE_INFO[FinalVar.MAX_SCENE_COUNT];			 
	
	public CFG_COMMGLOBAL_INFO(int alarmInChnNum) {
		for (int i = 0; i < FinalVar.MAX_SCENE_COUNT; i++) {
			stuScense[i] = new CFG_SCENE_INFO(alarmInChnNum);
		}
	}
}

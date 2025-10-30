package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * full intellifent traffic config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_TRAFFICGLOBAL}
 * \else
 * 智能交通全局配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_TRAFFICGLOBAL}
 * \endif
 */
public class CFG_TRAFFICGLOBAL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Violation code configuration
	 * \else
	 * 代码配置表        
	 * \endif
	 */
	public VIOLATIONCODE_INFO         stViolationCode = new VIOLATIONCODE_INFO();                            
	
	/**
	 * \if ENGLISH_LANG
	 * Red List Enable Detection Is Enabled, Vehicle Violation in The List Does Not Be Reported 
	 * \else
	 * 使能红名单检测，使能后，名单内车辆不上报
	 * \endif
	 */
    public boolean                    bEnableRedList;                             
    
	/**
	 * \if ENGLISH_LANG
	 * Carry enable block list detection  info
	 * \else
	 * 是否携带使能禁止名单检测信息
	 * \endif
	 */
    public boolean                    abEnableBlackList;                          
    
	/**
	 * \if ENGLISH_LANG
	 * Enable block list detection
	 * \else
	 * 使能禁止名单检测
	 * \endif
	 */
    public boolean                    bEnableBlackList;                           

}

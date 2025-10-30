package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power failure information, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_POWERFAULT}
 * \else
 * 电源故障信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_POWERFAULT}
 * \endif
 */
public class CFG_POWERFAULT_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Power Number
	 * \else
	 * 电源个数
	 * \endif
	 */
	public int   nPowerCount;
	
	/**
	 * \if ENGLISH_LANG
	 * alarmLinkage
	 * \else
	 * 报警联动
	 * \endif
	 */
	public CFG_POWERFAULT_ONE[] stuPowerFault = new CFG_POWERFAULT_ONE[FinalVar.MAX_POWER_NUM];

	
	public CFG_POWERFAULT_INFO(){
		for(int i=0;i<FinalVar.MAX_POWER_NUM;i++){
			stuPowerFault[i] = new CFG_POWERFAULT_ONE();
		}
	}
	
}

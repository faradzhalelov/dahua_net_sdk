package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ATM Withdraw Overtime Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ATMMOTION}
 * \else
 * ATM取款超时配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ATMMOTION}
 * \endif
 */
public class CFG_ATMMOTION_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Withdraw Overtime Time,Unit:Second 
	 * \else
	 * 取款超时时间,单位:秒
	 * \endif
	 */
	public int				nTimeLimit;
}

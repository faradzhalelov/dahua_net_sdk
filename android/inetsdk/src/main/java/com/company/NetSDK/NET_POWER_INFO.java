package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * define problem, please do not use
 * \else
 * 定义有问题，请勿再使用
 * \endif
 */
public class NET_POWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电源状态, 0-关闭, 1-打开, 2-打开但有故障
	 * \endif
	 */
	 public boolean                bPowerOn;                       			
	 
	 /**
	 * \if ENGLISH_LANG
	 * power current status type, refer to {@link EM_CURRENT_STATE_TYPE}
	 * \else
	 * 电源电流状态,参考 {@link EM_CURRENT_STATE_TYPE}
	 * \endif
	 */
	 public int  emCurrentState ;            
}

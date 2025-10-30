package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/diarm control expansion, the corresponding interface {@link INetSDK#ControlDevice}, the corresponding command {@link CtrlType#SDK_CTRL_ARMED_EX}
 * \else
 * 报警布撤防控制扩展, 对应接口 {@link INetSDK#ControlDevice},对应命令 {@link CtrlType#SDK_CTRL_ARMED_EX}
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * alarm arm/disarm control input
	 * \else
	 * 报警布撤防控制输入
	 * \endif
	 */
	public CTRL_ARM_DISARM_PARAM_EX_IN  stuIn = new CTRL_ARM_DISARM_PARAM_EX_IN(); 
	
	/**
	 * \if ENGLISH_LANG
	 * alarm arm/diarm control output
	 * \else
	 * 报警布撤防控制输出
	 * \endif
	 */
	public CTRL_ARM_DISARM_PARAM_EX_OUT stuOut = new CTRL_ARM_DISARM_PARAM_EX_OUT(); 
}

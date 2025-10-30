package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video diagnosis global list, each channel supports one diagnosis config
 * \else
 * 视频诊断全局表, 每个通道支持一个诊断配置
 * \endif
 */
public class CFG_VIDEODIAGNOSIS_GLOBAL_CHNNL implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Plan name is valid or not 
	 * \else
	 * 计划名称是否有效 
	 * \endif
	 */
	public boolean					abProjectName;
	
 	/**
	 * \if ENGLISH_LANG
	 * Plan name，Ansi code
	 * \else
	 * 计划名称，Ansi编码
	 * \endif
	 */
	public byte[]					szProjectName = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Real time plan name is valid or not
	 * \else
	 * 实时计划名称是否有效
	 * \endif
	 */
	public boolean					abRealProjectName;
	
 	/**
	 * \if ENGLISH_LANG
	 * Real time plan name，Ansi code
	 * \else
	 * 实时计划名称，Ansi编码
	 * \endif
	 */
	public byte[]					szRealProjectName = new byte[FinalVar.MAX_PATH];
}

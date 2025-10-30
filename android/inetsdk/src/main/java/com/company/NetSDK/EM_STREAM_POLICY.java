package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Bit stream strategy when bandwitch is insufficient
 * \else
 * 带宽不足时码流策略
 * \endif
 */
public class EM_STREAM_POLICY implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int 	STREAM_POLICY_UNKNOWN    = 0;	
	
	/**
	 * \if ENGLISH_LANG
	 * No strategy, diable "None"
	 * \else
	 * 无策略,不开启使能"None"
	 * \endif
	 */
	public static final int    	STREAM_POLICY_NONE       = 1;	
	
	/**
	 * \if ENGLISH_LANG
	 * Qualiy first "Quality"
	 * \else
	 * 画质优先"Quality"  
	 * \endif
	 */
	public static final int    	STREAM_POLICY_QUALITY    = 2;	
	
	/**
	 * \if ENGLISH_LANG
	 * Fliency first"Fluency"
	 * \else
	 * 流畅度优先"Fluency"
	 * \endif
	 */
	public static final int    	STREAM_POLICY_FLUENCY    = 3;	
	
	/**
	 * \if ENGLISH_LANG
	 * Auto "AutoAdapt"
	 * \else
	 * 自动"AutoAdapt"
	 * \endif
	 */
	public static final int	    STREAM_POLICY_AUTOADAPT  = 4;	
}

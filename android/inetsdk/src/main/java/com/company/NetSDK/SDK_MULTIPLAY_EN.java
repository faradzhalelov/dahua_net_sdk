package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Structure of multi-screen preview capability
 * \else
 * 多画面预览能力结构体
 * \endif
 */
public class SDK_MULTIPLAY_EN implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 support; 0 does not support 
	 * \else
	 * 1 支持；0 不支持
	 * \endif
	 */
	public int			nEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-screen preview mask, this parameter does not work 
	 * \else
	 * 多画面预览掩码
	 * \endif
	 */
	public int			dwMultiPlayMask;
}

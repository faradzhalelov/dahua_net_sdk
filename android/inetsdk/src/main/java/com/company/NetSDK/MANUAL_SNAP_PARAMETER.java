package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Manual snap parameter
 * \else
 * 手动抓拍参数
 * \endif
 */
public class MANUAL_SNAP_PARAMETER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * snap channel,start with 0
	 * \else
	 * 抓图通道,从0开始
	 * \endif
	 */
	public int                 nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * snap sequence string
	 * \else
	 * 抓图序列号字符串
	 * \endif
	 */
	public byte                bySequence[] = new byte[64]; 
}

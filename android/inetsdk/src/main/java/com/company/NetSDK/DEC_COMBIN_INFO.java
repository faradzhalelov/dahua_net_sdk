package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * 解码器画面组合信息
 * \endif
 */
public class DEC_COMBIN_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Combin ID
	 * \else
	 * 组合ID
	 * \endif
	 */
	public int				nCombinID;
	
	/**
	 * \if ENGLISH_LANG
	 * Partition number
	 * \else
	 * 画面分割数 
	 * \endif
	 */
	public int             nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * Display channel
	 * \else
	 * 显示通道
	 * \endif
	 */
	public byte            bDisChn[]		= new byte[16];
}

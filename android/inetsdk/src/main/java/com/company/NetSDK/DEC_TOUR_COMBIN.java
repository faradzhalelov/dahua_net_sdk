package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Tour Information
 * \else
 * 解码器轮巡信息
 * \endif
 */
public class DEC_TOUR_COMBIN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Tour Interval(s)
	 * \else
	 * 轮巡间隔(秒)
	 * \endif
	 */
	public int				nTourTime;
	
	/**
	 * \if ENGLISH_LANG
	 * the number of combination
	 * \else
	 * 组合个数
	 * \endif
	 */
	public int				nCombinNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Combination Table
	 * \else
	 * 组合表
	 * \endif
	 */
	public byte			bCombinID[]		= new byte[FinalVar.DEC_COMBIN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Combination option state,0:close;1:open
	 * \else
	 * 组合项的使能状态，0：关；1：开
	 * \endif
	 */
	public byte			bCombinState[] 	= new byte[FinalVar.DEC_COMBIN_NUM];
}

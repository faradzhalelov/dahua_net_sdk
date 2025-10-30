package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Lower matrix information
 * \else
 * 下位矩阵信息
 * \endif
 */
public class CFG_LOWER_MATRIX_OUTPUT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Output Channel Name
	 * \else
	 * 输出通道名称
	 * \endif
	 */
	public  byte szName[] = new byte[FinalVar.CFG_COMMON_STRING_128];
	
	/**
	 * \if ENGLISH_LANG
	 * Split mode，refer to {@link CFG_SPLITMODE}
	 * \else
	 * 分割模式, 取值对应类 {@link CFG_SPLITMODE}
	 * \endif
	 */
	public int			emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Input Channel Group 
	 * \else
	 * 输入通道组
	 * \endif
	 */
	public int						szInputs[] = new  int[FinalVar.CFG_MAX_LOWER_MATRIX_INPUT];
	
	/**
	 * \if ENGLISH_LANG
	 * Input Channel Number
	 * \else
	 * 输入通道数
	 * \endif
	 */
	public int						nInputCount;
	
} 

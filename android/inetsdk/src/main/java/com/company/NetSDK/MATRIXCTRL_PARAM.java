package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Matrix control
 * \else
 * 矩阵控制
 * \endif
 */
public class MATRIXCTRL_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video input number. It begins from  0.
	 * \else
	 * 视频输入号，从0开始
	 * \endif
	 */
	public 	int					nChannelNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Matrix output number. It begins from 0
	 * \else
	 * 矩阵输出号，从0开始
	 * \endif
	 */
	public  int					nMatrixNo; 
}



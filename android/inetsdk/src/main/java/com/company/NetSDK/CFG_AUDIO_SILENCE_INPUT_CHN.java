package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the info of inputchannels
 * \else
 * 一个音频输出通道对应的静音输入通道
 * \endif
 */
public class CFG_AUDIO_SILENCE_INPUT_CHN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the index of matrix, start from 0s
	 * \else
	 * 此音频输出通道所处的矩阵号，从0开始
	 * \endif
	 */
	public int 						    nMatrix;
	
	/**
	 * \if ENGLISH_LANG
	 * the output channel, start from 0
	 * \else
	 * 此音频输出通道号，从0开始
	 * \endif
	 */
     public int 					   nOutChannel;
     
 	/**
 	 * \if ENGLISH_LANG
 	 * the counts of input channels
 	 * \else
 	 * 被静音的输入通道的个数
 	 * \endif
 	 */
     public int 						nInputChnConut;
     
 	/**
  	 * \if ENGLISH_LANG
  	 * the counts of input channels
  	 * \else
  	 * 被静音的输入通道
  	 * \endif
  	 */
     public short							snInputChannel[] = new short[FinalVar.CFG_MAX_AUDIO_MATRIX_INPUT];
}

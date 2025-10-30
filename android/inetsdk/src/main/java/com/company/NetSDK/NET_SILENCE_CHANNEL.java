package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the output channesl which should to be silenced
 * \else
 *  音频矩阵上控制静音的输出通道
 * \endif
 */
public class NET_SILENCE_CHANNEL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the index of matrix
	 * \else
	 *  需要静音的矩阵号
	 * \endif
	 */
	public int				nMatrix;
	
	/**
	 * \if ENGLISH_LANG
	 * the counts of  output channels which should to be  silenced
	 * \else
	 *  需要静音的输出通道数
	 * \endif
	 */
	public int 				nOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * the output channels which should to be  silenced
	 * \else
	 *  该矩阵下需要静音的输出通道
	 * \endif
	 */
	public int				nOutPutChannel[] = new int[FinalVar.SDK_MAX_AUDIO_MATRIX_OUTPUT];

}

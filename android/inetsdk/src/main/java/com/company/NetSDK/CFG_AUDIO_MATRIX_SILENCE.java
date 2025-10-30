package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the configuration of audio matrix silence, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_AUDIO_MATRIX_SILENCE}
 * \else
 * 静音矩阵配置信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_AUDIO_MATRIX_SILENCE}
 * \endif
 */
public class CFG_AUDIO_MATRIX_SILENCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the max numbers of input channels lists
	 * \else
	 * 需要获取/设置的静音的输出通道数量
	 * \endif
	 */
	public int 						    nMaxInputListCount;
	
	/**
	 * \if ENGLISH_LANG
	 * the numbers of  effective input channels lists
	 * \else
	 * 实际获取到的输出通道数量，设置配置时此成员无意义
	 * \endif
	 */
	public int							nRetInputListCountOut;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  the input channels lists which is need to set silence
	 * \else
	 * 各个音频输出通道对应的静音输入通道，用户分配
	 * \endif
	 */
	public CFG_AUDIO_SILENCE_INPUT_CHN  pstSilenceInputChn[];
	
	
	public CFG_AUDIO_MATRIX_SILENCE(int nMaxInputListCount)
	{
		this.nMaxInputListCount = nMaxInputListCount;
		
		pstSilenceInputChn = new CFG_AUDIO_SILENCE_INPUT_CHN[this.nMaxInputListCount];
		for(int i = 0; i < this.nMaxInputListCount; i++)
		{
			pstSilenceInputChn[i] = new CFG_AUDIO_SILENCE_INPUT_CHN();
		}
	} 
}

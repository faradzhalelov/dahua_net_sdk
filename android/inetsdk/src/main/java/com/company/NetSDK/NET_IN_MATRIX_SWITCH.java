package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#MatrixSwitch} The input parameters
 * \else
 * {@link INetSDK#MatrixSwitch} 输入参数
 * \endif
 */
public class NET_IN_MATRIX_SWITCH implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Segmentation Model, value corresponding to {@link SDK_SPLIT_MODE}
	 * \else
	 * 分割模式, 值对应类 {@link SDK_SPLIT_MODE}
	 * \endif
	 */
	public int			emSplitMode;	
	
	
	/**
	 * \if ENGLISH_LANG
	 *  Output channel, can specify multiple output channel switch together at the same time, the content is consistent
	 * \else
	 * 输出通道, 可同时指定多个输出通道一起切换, 内容一致
	 * \endif
	 */
	public int 		    szOutputChannels[];
	
	
	/**
	 * \if ENGLISH_LANG
	 * Output channel number
	 * \else
	 * 输出通道数
	 * \endif
	 */
	
	public  int 		nOutputChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Input channel, each split window corresponding to one input channel 
	 * \else
	 * 输入通道, 每个分割窗口一个对应一个输入通道
	 * \endif
	 */
	
	public int 			szInputChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * Input channel number
	 * \else
	 * 输入通道数
	 * \endif
	 */
	public int 			nInputChannelCount;
	
	
	public NET_IN_MATRIX_SWITCH(int nOutputChannelCount, int nInputChannelCount)
	{
		this.nOutputChannelCount = nOutputChannelCount;
		for(int i = 0; i < nOutputChannelCount; i++)
		{
			szOutputChannels = new int[nOutputChannelCount];
		}
		
		this.nInputChannelCount = nInputChannelCount;
		for(int i = 0; i < nInputChannelCount; i++)
		{
			szInputChannels = new int[nInputChannelCount];
		}
	}
}

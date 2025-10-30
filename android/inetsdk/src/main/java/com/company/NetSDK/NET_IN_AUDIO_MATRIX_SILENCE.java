package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio matrix silence input parameter
 * \else
 *  音频矩阵一键静音操作输入参数
 * \endif
 */
public class NET_IN_AUDIO_MATRIX_SILENCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enbale(true:close voice     false:open voice)
	 * \else
	 *  一键静音使能开启或关闭(true:静音 false:开启声音)
	 * \endif
	 */
	public boolean					bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * the counts of  output channels lists which should to be  silenced
	 * \else
	 *  需要控制静音的输出通道数
	 * \endif
	 */
	public int						nListCount;
	
	/**
	 * \if ENGLISH_LANG
	 * the output channels lists which should to be silenced
	 * \else
	 *  需要控制静音的输出通道信息，用户分配内存
	 * \endif
	 */
	public NET_SILENCE_CHANNEL stSlienceChannel[];
	
	public NET_IN_AUDIO_MATRIX_SILENCE(int nListCount)
	{
		this.nListCount = nListCount;
		
		if(this.nListCount > 0)
		{
			stSlienceChannel = new NET_SILENCE_CHANNEL[this.nListCount];
			for(int i = 0; i < this.nListCount; i++)
			{
				stSlienceChannel[i] = new NET_SILENCE_CHANNEL();
			}
		}
	}
	
	
}

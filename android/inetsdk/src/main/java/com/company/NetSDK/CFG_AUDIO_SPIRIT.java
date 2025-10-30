package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice incentive, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_AUDIO_SPIRIT}
 * \else
 * 语音激励, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_AUDIO_SPIRIT}
 * \endif
 */
public class CFG_AUDIO_SPIRIT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Excitation volume threshold, 0 ~ 100
	 * \else
	 * 激励音量阈值, 0~100
	 * \endif
	 */
	public int					nAudioLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Incentive delay time, unit: seconds
	 * \else
	 * 激励延时时间, 单位: 秒
	 * \endif
	 */
	public int					nDelayTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Speech excitation audio channel properties 
	 * \else
	 * 语音激励音频通道属性
	 * \endif
	 */
	public CFG_AUDIO_SPIRIT_CHANNEL stuChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * Number of audio channels，stuChannels valiad number
	 * \else
	 * 音频通道数，stuChannels有效个数
	 * \endif
	 */
	public int					    nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Encourage collaboration entry
	 * \else
	 * 激励联动项
	 * \endif
	 */
	public CFG_AUDIO_SPIRIT_LINKAGE stuLinkage = new CFG_AUDIO_SPIRIT_LINKAGE();
	
	
	public CFG_AUDIO_SPIRIT(int nCount)
	{
		this.nChannelCount = nCount;
		
		stuChannels = new CFG_AUDIO_SPIRIT_CHANNEL[nChannelCount];
		for(int i = 0; i < nChannelCount; i++)
		{
			stuChannels[i] = new CFG_AUDIO_SPIRIT_CHANNEL();
		}
	}
}

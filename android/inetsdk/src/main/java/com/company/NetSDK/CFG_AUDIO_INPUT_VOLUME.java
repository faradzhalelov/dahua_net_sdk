package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio Volume input parameter., the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_AUDIO_INPUT_VOLUME}
 * \else
 * 音量输入参数, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_AUDIO_INPUT_VOLUME}
 * \endif
 */
public class CFG_AUDIO_INPUT_VOLUME implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * the actual number of audio input channels
	 * \else
	 * 实际音频输入通道个数
	 * \endif
	 */
	public     int             nAudioInputCount;
	
	/**
	 * \if ENGLISH_LANG
	 * every element corresponds to a volume value of the audio input channels,the range [0,100]
	 * \else
	 * 每个元素对应一个音频输入通道的音量值，范围[0，100]
	 * \endif
	 */
	public     byte[]          szAudioInputVolume  =  new byte[FinalVar.MAX_AUDIO_INPUT_NUM];

}

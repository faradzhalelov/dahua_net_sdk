package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Volume output configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_AUDIO_OUTPUT_VOLUME}
 * \else
 * 音量输出参数, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_AUDIO_OUTPUT_VOLUME}
 * \endif
 */
public class CFG_AUDIO_OUTPUT_VOLUME implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The actual number of audio output channels
	 * \else
	 * 数组中有效的个数
	 * \endif
	 */
	public     int               nAudioOutputCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Each element corresponds to a volume value of the audio output channels, the range [0, 100]
	 * \else
	 * 每个元素对应一个音频输出通道的音量值，范围[0，100]
	 * \endif
	 */
	public     byte[]            szAudioOutputVolume = new byte[FinalVar.MAX_AUDIO_OUTPUT_NUM];

}

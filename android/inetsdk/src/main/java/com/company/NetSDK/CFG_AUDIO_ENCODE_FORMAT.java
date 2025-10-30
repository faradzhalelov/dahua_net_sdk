package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio Format
 * \else
 * 音频格式
 * \endif
 */
public class CFG_AUDIO_ENCODE_FORMAT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ability
	 * \else
	 * 能力
	 * \endif
	 */
	public boolean				abCompression;
	public boolean				abDepth;
	public boolean				abFrequency;
	public boolean				abMode;
	public boolean				abFrameType;
	public boolean				abPacketPeriod;
	public boolean                abChannels;
	public boolean                abMix;

	/**
	 * \if ENGLISH_LANG
	 * Audio Compression Format，refer to {@link CFG_AUDIO_FORMAT} 
	 * \else
	 * 音频压缩模式, 取值参考 {@link CFG_AUDIO_FORMAT}
	 * \endif
	 */
	public int					emCompression;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Depth 
	 * \else
	 * 音频采样深度
	 * \endif
	 */
	public int					nDepth;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Frequency 
	 * \else
	 * 音频采样频率
	 * \endif
	 */
	public int					nFrequency;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Sample Mode 
	 * \else
	 * 音频编码模式
	 * \endif
	 */
	public int					nMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Packet Mode, 0-DHAV, 1-PS 
	 * \else
	 * 音频打包模式, 0-DHAV, 1-PS
	 * \endif
	 */
	public int					nFrameType;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio Packet Period, ms 
	 * \else
	 * 音频打包周期, ms
	 * \endif
	 */
	public int					nPacketPeriod;

	/**
	 * \if ENGLISH_LANG
	 * Sound channels list num of video
	 * \else
	 * 视频通道的伴音通道号列表个数
	 * \endif
	 */
	public int					nChannelsNum;

	/**
	 * \if ENGLISH_LANG
	 * Sound channels list of video
	 * \else
	 * 视频通道的伴音通道号列表
	 * \endif
	 */
	public int[]				arrChannels = new int[FinalVar.MAX_AUDIOCHANNELS_ARRAY_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Whether homology
	 * \else
	 * 是否同源
	 * \endif
	 */
	public boolean			bMix;
}

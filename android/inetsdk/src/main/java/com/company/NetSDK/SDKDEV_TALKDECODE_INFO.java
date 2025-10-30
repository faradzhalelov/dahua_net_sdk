package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio encode information
 * \else
 * 语音编码信息
 * \endif
 */
public class SDKDEV_TALKDECODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Encode type, refer to {@link SDK_TALK_CODING_TYPE}
	 * \else
	 * 编码类型,取值参考 {@link SDK_TALK_CODING_TYPE}
	 * \endif
	 */
	public int					encodeType;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit:8/16
	 * \else
	 * 6位数，如8或16
	 * \endif
	 */
	public int					nAudioBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling rate such as 8000 or 16000
	 * \else
	 * 采样率，如8000或16000
	 * \endif
	 */
	public int					dwSampleRate;
	
	/**
	 * \if ENGLISH_LANG
	 * Pack Period,Unit ms
	 * \else
	 * 打包周期, 单位ms
	 * \endif
	 */
	public int                  nPacketPeriod;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryDevInfo} port {@link FinalVar#NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE} command to output parameter
 * \else
 * {@link INetSDK#QueryDevInfo} 接口 {@link FinalVar#NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE} 命令出参
 * \endif
 */
public class NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * valid number of audio coding
	 * \else
	 * 有效音频编码个数
	 * \endif
	 */
	public int                         nValidNum;

	/**
	 * \if ENGLISH_LANG
	 * audio coding list
	 * \else
	 * 音频编码列表
	 * \endif
	 */
	public SDKDEV_TALKDECODE_INFO       stuListAudioEncode[] = new SDKDEV_TALKDECODE_INFO[FinalVar.MAX_AUDIO_ENCODE_NUM];

	public NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO() {
		for (int i = 0; i < stuListAudioEncode.length; ++i) {
			stuListAudioEncode[i] = new SDKDEV_TALKDECODE_INFO();
		}
	}
}

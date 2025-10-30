package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryDevInfo} port {@link FinalVar#NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE} command to input parameter
 * \else
 * {@link INetSDK#QueryDevInfo} 接口 {@link FinalVar#NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE} 命令入参
 * \endif
 */
public class NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannel;

	/**
	 * \if ENGLISH_LANG
	 * stream type, 0: main stream; 1: sub stream 1; 2: sub stream 2; 3: sub stream 3; 4: talk stream
	 * \else
	 * 码流类型,0：主码流；1：辅码流1；2：辅码流2；3：辅码流3；4：对讲流
	 * \endif
	 */
	public int                 nStreamType;
}

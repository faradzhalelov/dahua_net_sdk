package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * query audio input channel caps input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_AUDIO_IN_CAPS}
 * \else
 *  获取音频输入通道能力集入参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_AUDIO_IN_CAPS}
 * \endif
 */
public class NET_IN_AUDIO_IN_CAPS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel NO.
	 * \else
	 *  通道号
	 * \endif
	 */
	public  int                nChannel;

}

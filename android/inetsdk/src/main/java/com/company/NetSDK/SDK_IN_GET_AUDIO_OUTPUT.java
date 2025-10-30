package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#GetSplitAudioOuput} 's interface input param(get mode of audio output)
* \else
* {@link INetSDK#GetSplitAudioOuput} 接口输入参数(获取音频输出模式)
* \endif
*/
public class SDK_IN_GET_AUDIO_OUTPUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                  nChannel;              
}

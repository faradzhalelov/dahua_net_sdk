package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#SetSplitAudioOuput} 's interface input param(set mode of audio output)
* \else
* {@link INetSDK#SetSplitAudioOuput} 接口输入参数(设置音频输出模式)
* \endif
*/
public class SDK_IN_SET_AUDIO_OUTPUT implements Serializable {

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
    
    /**
    * \if ENGLISH_LANG
    * audio output mode, refer to {@link SDK_AUDIO_OUTPUT_MODE}
    * \else
    * 音频输出模式, 取值参考 {@link SDK_AUDIO_OUTPUT_MODE}
    * \endif
    */
    public int 				 	emMode;                
    
    /**
    * \if ENGLISH_LANG
    *  window no. , effect when emMode = SDK_AUDIO_FORCE/SDK_AUDIO_ENABLE_ONE/SDK_AUDIO_DISABLE_ONE.
    * \else
    * 输出窗口号, emMode为SDK_AUDIO_FORCE/SDK_AUDIO_ENABLE_ONE/SDK_AUDIO_DISABLE_ONE时有效, 指定输出音频的窗口号
    * \endif
    */
    public int                  nWindow;               

}

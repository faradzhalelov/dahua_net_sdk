package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* audio output mode
* \else
* 音频输出模式
* \endif
*/
public class SDK_AUDIO_OUTPUT_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * automatic switch
	 * \else
	 * 自动切换音频输出, 只有一个音频窗口
	 * \endif
	 */
    public static final int SDK_AUDIO_AUTO = 0;                           
    
	 /**
	 * \if ENGLISH_LANG
	 * all output unable
	 * \else
	 * 禁止所有音频输出 
	 * \endif
	 */
    public static final int SDK_AUDIO_DISABLE = 1;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * mandatory audio output to the user to specify a window
	 * \else
	 * 强制输出用户指定的某个窗口的音频, 只有一个音频窗口
	 * \endif
	 */
    public static final int SDK_AUDIO_FORCE = 2;                          
    
	 /**
	 * \if ENGLISH_LANG
	 * Open the audio of target window, multi-channel of audio output is available  
	 * \else
	 * 开启指定窗口音频, 可以有多路音频输出   
	 * \endif
	 */
    public static final int SDK_AUDIO_ENABLE_ONE = 3;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * Close the audio of target window, multi-channel of audio output is available    
	 * \else
	 * 关闭指定窗口音频, 可以有多路音频输出
	 * \endif
	 */
    public static final int SDK_AUDIO_DISABLE_ONE = 4;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * Multi-channel of audio output, be used when inquire not setting
	 * \else
	 * 多路音频输出, 查询时可用, 设置时该值无效
	 * \endif
	 */
    public static final int SDK_AUDIO_MULTI  = 5;                         
}

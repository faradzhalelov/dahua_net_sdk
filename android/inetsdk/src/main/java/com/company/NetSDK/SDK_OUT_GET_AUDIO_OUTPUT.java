package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#GetSplitAudioOuput} 's interface output param(get mode of audio output)
* \else
* {@link INetSDK#GetSplitAudioOuput} 接口输出参数(获取音频输出模式)
* \endif
*/
public class SDK_OUT_GET_AUDIO_OUTPUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * mode of audio output, refer to  {@link SDK_AUDIO_OUTPUT_MODE}
	 * \else
	 * 音频输出模式, 取值参考  {@link SDK_AUDIO_OUTPUT_MODE}
	 * \endif
	 */
    public int  				emMode;                
    
	 /**
	 * \if ENGLISH_LANG
	 * window no., effect when emMode = {@link SDK_AUDIO_OUTPUT_MODE#SDK_AUDIO_FORCE}
	 * \else
	 * 输出窗口号, emMode为{@link SDK_AUDIO_OUTPUT_MODE#SDK_AUDIO_FORCE}时有效
	 * \endif
	 */
    public int                  nWindow;               
    
	 /**
	 * \if ENGLISH_LANG
	 * The list of output windows number, valid when emMode = {@link SDK_AUDIO_OUTPUT_MODE#SDK_AUDIO_MULTI}, user assign the memory,apply to sizeof(int)*nMaxMultiWindowCount
	 * \else
	 * 输出窗口号列表, emMode为{@link SDK_AUDIO_OUTPUT_MODE#SDK_AUDIO_MULTI}时有效, 用户分配内存
	 * \endif
	 */
    public int[]                pMultiWindows;         
    
	 /**
	 * \if ENGLISH_LANG
	 * ouput the maximum number of window list, filled by user
	 * \else
	 * 输出窗口号列表最大数量, 用户填写
	 * \endif
	 */
    public int                  nMaxMultiWindowCount;  
    
	 /**
	 * \if ENGLISH_LANG
	 * Output the number of windows, effect  when  emMode = {@link SDK_AUDIO_OUTPUT_MODE#SDK_AUDIO_MULTI}
	 * \else
	 * 输出窗口号数量, emMode为{@link SDK_AUDIO_OUTPUT_MODE#SDK_AUDIO_MULTI}时有效
	 * \endif
	 */
    public int                  nRetMultiWindowCount;  
	
    public SDK_OUT_GET_AUDIO_OUTPUT(int nMaxMultiWindowCount) {
		this.nMaxMultiWindowCount = nMaxMultiWindowCount;
		
		pMultiWindows = new int[nMaxMultiWindowCount];
	}
}

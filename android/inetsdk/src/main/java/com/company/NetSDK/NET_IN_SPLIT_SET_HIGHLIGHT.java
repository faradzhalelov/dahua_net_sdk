package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Set source frame brightness switch input parameter
* \else
* 设置源边框高亮使能开关输入参数
* \endif
*/
public class NET_IN_SPLIT_SET_HIGHLIGHT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * video output channel
	 * \else
	 * 视频输出通道
	 * \endif
	 */
    public int             nChannel;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * window no.
	 * \else
	 * 窗口号
	 * \endif
	 */
    public int             nWindow;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * frame brightness,TRUE-high brightness
	 * \else
	 * 边框高亮使能,TRUE-表示高亮
	 * \endif
	 */
    public boolean         bHighLightEn;               
    
	 /**
	 * \if ENGLISH_LANG
	 * frame color 
	 * \else
	 * 边框颜色 
	 * \endif
	 */
    public SDK_COLOR_RGBA  stuColor = new SDK_COLOR_RGBA();                   
}

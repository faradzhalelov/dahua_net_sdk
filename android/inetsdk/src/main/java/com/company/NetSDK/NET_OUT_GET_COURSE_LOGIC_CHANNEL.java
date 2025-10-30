package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* get course real channel out parameter, accrossoing interface {@link INetSDK#GetLogicChannel}
* \else
* 获取录播主机默认真实通道号出参，对应接口 {@link INetSDK#GetLogicChannel}
* \endif
*/
public class NET_OUT_GET_COURSE_LOGIC_CHANNEL implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * logic channel count 
	 * \else
	 * 获取到的逻辑通道数
	 * \endif
	 */
    public int                         nChannelCount;                                         
    
	 /**
	 * \if ENGLISH_LANG
	 * logic channel info
	 * \else
	 * 逻辑通道信息，下标为将要获取的真实通道数
	 * \endif
	 */
    public NET_LOGIC_CHANNEL_INFO      stuChannelInfo[] = new NET_LOGIC_CHANNEL_INFO[FinalVar.MAX_PREVIEW_CHANNEL_NUM];               

    public NET_OUT_GET_COURSE_LOGIC_CHANNEL() {
    	for (int i = 0; i < stuChannelInfo.length; i++) {
    		stuChannelInfo[i] = new NET_LOGIC_CHANNEL_INFO();
		}
    }
}

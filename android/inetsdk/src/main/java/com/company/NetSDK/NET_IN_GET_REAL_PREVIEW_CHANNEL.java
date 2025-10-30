package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* get real channel input parameter, corresponding to interface {@link INetSDK#GetRealPreviewChannel}
* \else
* 获取真实通道号入参，对应接口 {@link INetSDK#GetRealPreviewChannel}
* \endif
*/
public class NET_IN_GET_REAL_PREVIEW_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * channel count
	 * \else
	 * 需要获取的通道数
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

    public NET_IN_GET_REAL_PREVIEW_CHANNEL() {
    	for (int i = 0; i < stuChannelInfo.length; i++) {
    		stuChannelInfo[i] = new NET_LOGIC_CHANNEL_INFO();
		}
    }
}

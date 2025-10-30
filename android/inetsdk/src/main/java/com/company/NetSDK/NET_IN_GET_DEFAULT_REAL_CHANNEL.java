package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get default real channel input parameter, accrossoing interface {@link INetSDK#GetDefaultRealChannel}
 * \else
 * 获取默认真实通道号入参，对应接口 {@link INetSDK#GetDefaultRealChannel}
 * \endif
 */
public class NET_IN_GET_DEFAULT_REAL_CHANNEL implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * classroom count
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
    
    public NET_IN_GET_DEFAULT_REAL_CHANNEL() {
    	for (int i = 0; i < stuChannelInfo.length; i++) {
    		stuChannelInfo[i] = new NET_LOGIC_CHANNEL_INFO();
		}
    }
}

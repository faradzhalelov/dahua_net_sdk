package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* input parameter, corresponding to interface {@link INetSDK#SetBlindRealChannel}
* \else
* 设置逻辑通道号和真实通道号的绑定关系入参 ，对应接 {@link INetSDK#SetBlindRealChannel}
* \endif
*/
public class NET_IN_SET_BLIND_REAL_CHANNEL implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * channel count
	 * \else
	 * 通道数量
	 * \endif
	 */
    public int                         nChannelNum;                                            
    
	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                         nChannel[] = new int[FinalVar.MAX_PREVIEW_CHANNEL_NUM];                     
    
	 /**
	 * \if ENGLISH_LANG
	 * logic channel info
	 * \else
	 * 逻辑通道信息，下标为将要设置的真实通道数
	 * \endif
	 */
    public NET_LOGIC_CHANNEL_INFO      stuChannelInfo[] = new NET_LOGIC_CHANNEL_INFO[FinalVar.MAX_PREVIEW_CHANNEL_NUM];                

    public NET_IN_SET_BLIND_REAL_CHANNEL() {
    	for (int i = 0; i < stuChannelInfo.length; i++) {
    		stuChannelInfo[i] = new NET_LOGIC_CHANNEL_INFO();
		}
    }
}

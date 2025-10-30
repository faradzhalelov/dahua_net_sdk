package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* get real channel out parameter, accrossoing interface  {@link INetSDK#GetRealPreviewChannel}
* \else
* 获取真实通道号出参，对应接口 {@link INetSDK#GetRealPreviewChannel}
* \endif
*/
public class NET_OUT_GET_REAL_PREVIEW_CHANNEL implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * 通道数量
	 * \endif
	 */
    public int                      nChannelNum;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                      nChannel[] = new int[FinalVar.MAX_PREVIEW_CHANNEL_NUM]; 
}

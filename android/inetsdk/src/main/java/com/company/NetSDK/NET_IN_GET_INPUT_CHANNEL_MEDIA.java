package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* get media channel input parameter, corresponding to interface {@link INetSDK#GetInputChannelMedia}
* \else
* 获取录播主机通道输入媒体介质入参 ，对应接口 {@link INetSDK#GetInputChannelMedia}
* \endif
*/
public class NET_IN_GET_INPUT_CHANNEL_MEDIA implements Serializable{

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
	public int                             nChannelNum;                       
	
	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                             nChannel[] = new int[FinalVar.MAX_PREVIEW_CHANNEL_NUM]; 

}

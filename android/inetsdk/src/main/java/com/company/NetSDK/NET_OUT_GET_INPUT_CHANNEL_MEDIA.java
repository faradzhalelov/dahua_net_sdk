package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* out parameter, accrossoing interface {@link INetSDK#GetInputChannelMedia}
* \else
* 获取录播主机通道输入媒体介质出参 ，对应接口 {@link INetSDK#GetInputChannelMedia}
* \endif
*/
public class NET_OUT_GET_INPUT_CHANNEL_MEDIA implements Serializable {

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
    * input media, refer to {@link NET_ENUM_INPUT_CHANNEL_MEDIA}
    * \else
    * 输入媒体介质, 参考 {@link NET_ENUM_INPUT_CHANNEL_MEDIA}
    * \endif
    */
    public int    						   emInputMedia[] = new int[FinalVar.MAX_PREVIEW_CHANNEL_NUM];   

}

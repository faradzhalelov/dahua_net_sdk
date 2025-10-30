package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * in parameter, accrossoing interface {@link INetSDK#GetLogicChannel}
 * \else
 * 获取录播主机默认真实通道号入参，对应接口 {@link INetSDK#GetLogicChannel}
 * \endif
 */
public class NET_IN_GET_COURSE_LOGIC_CHANNEL implements Serializable {

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

}

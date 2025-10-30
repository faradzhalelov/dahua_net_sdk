package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SIP,RTSP Ability
 * \else
 * SIP,RTSP能力
 * \endif
 */
public class SDK_STREAM_MEDIA_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Stream type capability set 
	 * 0 无 ;1 SIP;2 RTSP 
	 * \else
	 * 码流类型能力集  0,无 1,SIP 2,RTSP
	 * \endif
	 */
	public int			nStreamType;			
}

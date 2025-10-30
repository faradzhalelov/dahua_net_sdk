package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * channel status
 * \else
 * 通道状态
 * \endif
 */
public class NET_CHANNLE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * record status, 1-record, 0-close
	 * \else
	 * 录像状态，1-录像，0-关闭
	 * \endif
	 */
	public byte              byRecState;               
	
	/**
	 * \if ENGLISH_LANG
	 * video input status, 1-video in, 0-no video  
	 * \else
	 * 视频输入状态，1-有视频接入，0-无视频  
	 * \endif
	 */
	public byte              byVideoInState;           
}

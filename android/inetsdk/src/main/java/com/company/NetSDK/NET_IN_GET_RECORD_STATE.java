package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetRecordState} in parameter
 * \else
 * {@link INetSDK#GetRecordState} 入参
 * \endif
 */
public class NET_IN_GET_RECORD_STATE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * \if ENGLISH_LANG
	 * channel 
	 * \else
	 * 通道号
	 * \endif
	 */
	public int  nChannel; 
}

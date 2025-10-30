package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetRecordState} out parameter
 * \else
 * {@link INetSDK#GetRecordState} 出参
 * \endif
 */
public class NET_OUT_GET_RECORD_STATE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * \if ENGLISH_LANG
	 * record state
	 * \else
	 * 是否在录像
	 * \endif
	 */
	public boolean bState = true;  
	

}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get player actual output parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_PLAYER}
* \else
* Get player actual output parameter, 对应  {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_PLAYER}
* \endif
*/
public class NET_OUT_SPLIT_GET_PLAYER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * player actual ID
	 * \else
	 * 播放器实例ID
	 * \endif
	 */
	public long           lPlayerID;                      
}

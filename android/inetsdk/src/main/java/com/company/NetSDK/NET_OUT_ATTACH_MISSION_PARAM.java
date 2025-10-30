package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* interface {@link INetSDK#DetachMission} output parameter
* \else
* 接口 {@link INetSDK#DetachMission} 接口输出参数
* \endif
*/
public class NET_OUT_ATTACH_MISSION_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	* \if ENGLISH_LANG
	* subscribe handle
	* \else
	* 订阅句柄
	* \endif
	*/
	public long lAttachHandle;           
}

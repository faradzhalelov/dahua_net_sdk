package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get window corridor mode output parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_CORRIDOR_MODE}
* \else
* 获取窗口走廊模式输出参数，对应 {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_CORRIDOR_MODE}
* \endif
*/
public class NET_OUT_WM_GET_CORRIDOR_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	* \if ENGLISH_LANG
	* Gethe corridor mode of window(TRUE:open FALSE:close)
	* \else
	* 窗口走廊模式(TRUE:打开  FALSE:关闭)
	* \endif
	*/
	public boolean	  			  bIsCorridor;		
}

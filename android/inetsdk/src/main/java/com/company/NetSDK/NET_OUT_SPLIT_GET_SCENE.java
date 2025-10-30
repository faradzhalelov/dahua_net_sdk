package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get screen window info output parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_SCENE}
* \else
* 获取屏内窗口信息输出参数, 对应 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_SCENE}
* \endif
*/
public class NET_OUT_SPLIT_GET_SCENE implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * window info 
	 * \else
	 * 窗口信息
	 * \endif
	 */
	public SDK_SPLIT_SCENE      stuScene;                       
	
    // windowCount:窗口信息数组大小
	public NET_OUT_SPLIT_GET_SCENE(int windowCount) {
		this(windowCount, 0);
	}

	public NET_OUT_SPLIT_GET_SCENE(int windowCount, int videoInputCount) {
		this.stuScene = new SDK_SPLIT_SCENE(windowCount, videoInputCount);
	}
}

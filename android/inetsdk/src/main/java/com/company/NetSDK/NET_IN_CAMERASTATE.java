package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input arguments of {@link INetSDK#AttachCameraState}
 * \else
 * {@link INetSDK#AttachCameraState} 输入参数
 * \endif
 */
public class NET_IN_CAMERASTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channels, -1 means all channel
	 * \else
	 * 观察的通道号,数组元素中，有一个是-1，则观察所有通道
	 * \endif
	 */
	public int                        pChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * number of channels
	 * \else
	 * pChannels指针长度
	 * \endif
	 */
	public int                        nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * callback function for state
	 * \else
	 * 状态回调函数
	 * \endif
	 */
    public CB_fCameraStateCallBack    cbCamera; 
    
    public NET_IN_CAMERASTATE(int nChannels) {
    	this.nChannels = nChannels;
    	pChannels = new int[nChannels];
    }
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * callback prototype of attach Camera state
 * \else
 * 注册相机状态回调函数原型
 * \endif
 */
public interface CB_fCameraStateCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * Callback prototype of attach Camera state
	 * @param lLoginID Login Handler, return from{@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param lAttachHandle Attach Handler
	 * @param pBuf {@link NET_CB_CAMERASTATE }
	 * \else
	 * 注册相机状态回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lAttachHandle 注册句柄
	 * @param pBuf 参数信息，{@link NET_CB_CAMERASTATE }
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, final NET_CB_CAMERASTATE pBuf);
}

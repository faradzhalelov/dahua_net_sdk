package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * The callback function prototypes of subscribe to video phone
 * \else
 * 订阅视频电话状态信息回调函数原型
 * \endif
 */
public interface CB_fVTPCallStateCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * callback function prototypes of subscribe to video phone
	 * @param lAttachHandle return from{@link INetSDK#AttachVTPCallState}
	 * @param pInfo Video phone status informations
	 * \else
	 * 订阅视频电话状态信息回调函数
	 * @param lAttachHandle {@link INetSDK#AttachVTPCallState}返回值
	 * @param pInfo 视频电话状态信息
	 * \endif
	 */
	public void invoke(long lAttachHandle, NET_VTP_CALL_STATE_INFO pInfo);
}

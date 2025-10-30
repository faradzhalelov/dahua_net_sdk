package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * burning device callback function original
 * \else
 * 刻录设备回调函数原型, lAttachHandle
 * \endif
 */

public interface CB_fAttachBurnStateCB {
	
	/**
	 * \if ENGLISH_LANG
	 * Callback function when burned device
	 * @param lLoginID Login Handler, return from{@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param lAttachHandle return from{@link INetSDK#AttachBurnState}
	 * @param lBurnSession Burn session
	 * @param burnState Interface return parameter {@link NET_OUT_BURN_GET_STATE}
	 * \else
	 * 刻录设备回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lAttachHandle {@link INetSDK#AttachBurnState}返回值
	 * @param lBurnSession 刻录会话
	 * @param burnState 接口输出参数 {@link NET_OUT_BURN_GET_STATE}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle,  long lBurnSession,  NET_OUT_BURN_GET_STATE burnState);
}

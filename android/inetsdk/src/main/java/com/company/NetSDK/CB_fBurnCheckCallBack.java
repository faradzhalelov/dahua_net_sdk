package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Writing calibration call function
 * \else
 * 刻录校验回调函数原形
 * \endif
 */
public interface CB_fBurnCheckCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Writing calibration call function
	 * @param lLoginID  login handle, {@link INetSDK#LoginEx} or{@link INetSDK#Login} return value
	 * @param lAttachHandle writing handle, {@link INetSDK#AttachBurnCheckState} return value
	 * @param pstState writing status info，see {@link NET_CB_BURN_CHECK_STATE }
	 * \else
	 * 刻录校验回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lAttachHandle 刻录句柄, {@link INetSDK#AttachBurnCheckState}的返回值
	 * @param pstState 刻录状态信息，详见 {@link NET_CB_BURN_CHECK_STATE}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_BURN_CHECK_STATE pstState);

}

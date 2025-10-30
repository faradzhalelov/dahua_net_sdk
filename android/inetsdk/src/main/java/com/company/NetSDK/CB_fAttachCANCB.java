package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Network disconnect deal interface
 * \else
 * 监听CAN总线数据回调函数原形
 * \endif
 */
public interface CB_fAttachCANCB {
	/**
	 * \if ENGLISH_LANG
	 * Callback function when network disconnect
	 * @param lLoginID login handle, return from {@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param lAttachHandle return from {@link INetSDK#AttachCAN}
	 * @param pBuf data info {@link NET_CB_CANDATA}
	 * \else
	 * 监听CAN总线数据回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lAttachHandle {@link INetSDK#AttachCAN}返回值
	 * @param pBuf 数据信息，{@link NET_CB_CANDATA }
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_CANDATA pBuf);
}

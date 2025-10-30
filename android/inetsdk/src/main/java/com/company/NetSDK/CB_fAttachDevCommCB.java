package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * callback prototype of listening to data from trans comm, lAttachHandle is return value of AttachDevComm
 * \else
 * 监听透明串口数据回调函数原形，lAttachHandle是AttachDevComm返回值
 * \endif
 */
public interface CB_fAttachDevCommCB {
	
	/**
	 * \if ENGLISH_LANG
	 * Callback prototype of listening to data from trans comm
	 * @param lLoginID Login Handler, return from{@link INetSDK#LoginEx}Or{@link INetSDK#Login}
	 * @param lAttachHandle return from{@link INetSDK#AttachDevComm}
	 * @param pBuf {@link NET_CB_DEVCOMMDATA}
	 * \else
	 * 监听透明串口数据的回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lAttachHandle {@link INetSDK#AttachDevComm}返回值
	 * @param pBuf 数据信息，{@link NET_CB_DEVCOMMDATA}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_CB_DEVCOMMDATA pBuf);
}

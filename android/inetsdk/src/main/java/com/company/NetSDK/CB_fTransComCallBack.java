package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Transparent COM callback function original shape
 * \else
 * 透明串口回调 
 * \endif
 */
public interface CB_fTransComCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Transparent COM callback function original shape
	 * @param lLoginID login handle, return from {@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param lTransComChannel handle, return from{@link INetSDK#CreateTransComChannel}
	 * @param pBuffer Transparent data buffer 
	 * @param dwBufSize Transparent data buffer length 
	 * \else
	 * 透明串口回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lTransComChannel {@link INetSDK#CreateTransComChannel}的返回值
	 * @param pBuffer 透明数据缓冲 
	 * @param dwBufSize 透明数据缓冲长度
	 * \endif
	 */
	public void invoke(long lLoginID, long lTransComChannel, byte pBuffer[], int dwBufSize);
}

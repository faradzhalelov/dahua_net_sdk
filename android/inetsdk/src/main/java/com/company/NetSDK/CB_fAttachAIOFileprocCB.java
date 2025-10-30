package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Registration update file processing recall function, lAttachHandle is attachAIOFileProc return value
 * \else
 * 注册升级文件处理回调函数原形,lAttachHandle是 attachAIOFileProc返回值, 每次1条,pBuf->dwSize == nBufLen
 * \endif
 */
public interface CB_fAttachAIOFileprocCB {
	/**
	 * \if ENGLISH_LANG
	 * Callback function when Register upgrade file
	 * @param lAttachHandle return from{@link INetSDK#attachAIOFileProc}
	 * @param pBuf Parameter information，{@link NET_CB_AIOFILEPROC}
	 * @param pbFileBuf  File Buffered
	 * @param nFileLen  File length
	 * \else
	 * 注册升级文件时回调
	 * @param lAttachHandle {@link INetSDK#attachAIOFileProc}的返回值
	 * @param pBuf 参数信息，{@link NET_CB_AIOFILEPROC}
	 * @param pbFileBuf 文件缓存
	 * @param nFileLen  文件长度
	 * \endif
	 */
	public void invoke(long lAttachHandle, NET_CB_AIOFILEPROC pBuf, byte[] pbFileBuf, int nFileLen);
	
}

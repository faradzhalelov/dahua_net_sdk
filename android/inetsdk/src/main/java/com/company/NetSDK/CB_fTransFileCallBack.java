package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * File Transfer callback
 * \else
 * 文件传输回调
 * \endif
 */
public interface CB_fTransFileCallBack {
	/**
	 * \if ENGLISH_LANG
	 * File Transfer callback
	 * @param lHandle handle, return from {@link INetSDK#FileTransmit}
	 * @param nTransType File transfer type，currently only SDK_DEV_FILETRANS_BURN
	 * @param nState File transfer status 
	 * @param nSendSize Length of file sent 
	 * @param nTotalSize Total file size 
	 * \else
	 * 文件传输回调函数
	 * @param lHandle 文件传输句柄 {@link INetSDK#FileTransmit}
	 * @param nTransType 文件传输类型，现在只有 SDK_DEV_FILETRANS_BURN 
	 * @param nState 文件传输状态 
	 * @param nSendSize 发送的文件长度
	 * @param nTotalSize 文件总的大小
	 * \endif
	 */
	public void invoke(long lHandle, int nTransType, int nState, int nSendSize, int nTotalSize);
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Upload remote file callback function
 * \else
 * 异步上传文件回调函数
 * \endif
 */
public interface CB_fUploadFileCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * Callback prototype of listening to data from trans comm
	 * @param lUploadFileHandler return from{@link INetSDK#StartUploadRemoteFile}
	 * @param nTotalSize  File total size
	 * @param nSendSize  Send size
	 * @param dwUser  User data
	 * \else
	 * 监听透明串口数据的回调函数
	 * @param lUploadFileHandler {@link INetSDK#StartUploadRemoteFile}返回值
	 * @param nTotalSize 文件总大小
	 * @param nSendSize  已发送大小
	 * @param dwUser  用户数据
	 * \endif
	 */
	public void invoke(long lUploadFileHandler, int nTotalSize, int nSendSize, long dwUser);
	
}

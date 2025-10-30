package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback process callback function original shape 
 * \else
 * 按进度下载回调函数原型
 * \endif
 */
public interface CB_fDownLoadPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback process callback function original shape 
	 * @param lPlayHandle handle, return from {@link INetSDK#DownloadMediaFile}
	 * @param dwTotalSize means total size of the play,unit KB
	 * @param dwDownLoadSize means played part size,unit KB,when its value is-1 means play ends
	 * \else
	 * 按进度下载回调函数
	 * @param lPlayHandle 句柄, {@link INetSDK#DownloadMediaFile}的返回值
	 * @param dwTotalSize 指本次下载总大小，单位为KB
	 * @param dwDownLoadSize 指已经下载的大小，单位为KB，当其值为-1时表示本次下载结束  
	 * \endif
	 */
	public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize);
}

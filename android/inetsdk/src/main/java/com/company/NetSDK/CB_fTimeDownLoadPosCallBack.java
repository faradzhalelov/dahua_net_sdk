package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback process by time callback function original shape
 * \else
 * 按时间下载回调函数原型
 * \endif
 */
public interface CB_fTimeDownLoadPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback process by time callback function original shape
	 * @param lPlayHandle handle, return from {@link INetSDK#PlayBackByTime}
	 * @param dwTotalSize Means total size of the play,unit KB 
	 * @param dwDownLoadSize Means played part size,unit KB,when its value is-1 means play ends 
	 * @param index 
	 * @param recordfileinfo Record info
	 * \else
	 * 按时间下载回调函数
	 * @param lPlayHandle {@link INetSDK#PlayBackByTime} 的返回值
	 * @param dwTotalSize 指本次播放总大小，单位为KB 
	 * @param dwDownLoadSize 指已经播放的大小，单位为KB，当其值为-1时表示本次回放结束，-2表示写文件失败 
	 * @param index 序号
	 * @param recordfileinfo 录像内容信息
	 * \endif
	 */
	public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo);
}

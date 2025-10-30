package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback data callback function original shape 
 * \else
 * 回放数据回调函数原形
 * \endif
 */
public interface CB_fDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback data callback function original shape 
	 * @param lRealHandle handle, return from {@link INetSDK#PlayBackByRecordFileEx}
	 * @param dwDataType here as 0(original data) 
	 * @param buffer data buffering 
	 * @param dwBufferSize buffering length(unit byte)
	 * \else
	 * 回放数据回调函数
	 * @param lRealHandle 句柄, {@link INetSDK#PlayBackByRecordFileEx}的返回值
	 * @param dwDataType 这里为0(原始数据) 
	 * @param buffer 数据缓冲
	 * @param dwBufferSize 缓冲长度(单位字节) 
	 * \endif
	 */
	public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize);
}

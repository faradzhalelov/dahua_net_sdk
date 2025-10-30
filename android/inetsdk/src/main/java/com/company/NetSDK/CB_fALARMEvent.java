package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Alarm event type depends on alarm type analyzed
 * \else
 * 报警事件类型根据netsdk.h解析出来的报警类型
 * \endif
 */
public interface CB_fALARMEvent {
	/**
	 * \if ENGLISH_LANG
	 * alarm event type depends on alarm type analyzed
	 * @param dwAlarmType alarm type 
	 * @param pAlarmInfo alarm parameter 
	 * @param dwStructSize structure size 
	 * @param pBuffer buffering
	 * @param dwBufSize buffering size 
	 * @see {@link INetSDK#ParseData}
	 * \else
	 * 报警事件回调函数
	 * @param dwAlarmType 报警类型
	 * @param pAlarmInfo 报警参数 
	 * @param dwStructSize 结构体大小 
	 * @param pBuffer 缓冲 
	 * @param dwBufSize 缓冲大小
	 * @see {@link INetSDK#ParseData}
	 * \endif
	 */
	public int invoke(double dwAlarmType, Object pAlarmInfo, double dwStructSize, byte[] pBuffer, double dwBufSize);
}

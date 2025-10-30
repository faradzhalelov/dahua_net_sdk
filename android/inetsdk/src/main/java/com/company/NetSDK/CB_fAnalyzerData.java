package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * alarm event type, analyzed alarm type 
 * \else
 * 回调方式进行数据解析，dwDataType表示数据解析得到类型
 * \endif
 */
public interface CB_fAnalyzerData {

	/**
	 * \if ENGLISH_LANG
	 * alarm event type, analyzed alarm type 
	 * @param dwDataType parameter type 
	 * @param pDataInfo data parameter 
	 * @param dwStructSize structure size 
	 * @param pBuffer buffering 
	 * @param dwBufSize buffering size 
	 * @see {@link INetSDK#SetNewDevConfig} {@link INetSDK#ParseData}
	 * \else
	 * 录像报警事件回调函数
	 * @param dwDataType 数据类型 
	 * @param pDataInfo 数据参数
	 * @param dwStructSize 结构体大小 
	 * @param pBuffer 缓冲 
	 * @param dwBufSize 缓冲大小
	 * @see {@link INetSDK#SetNewDevConfig} {@link INetSDK#ParseData}
	 * \endif
	 */
	public int invoke(double dwDataType, Object pDataInfo, double dwStructSize, byte[] pBuffer, double dwBufSize);
}

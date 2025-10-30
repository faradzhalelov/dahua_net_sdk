package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Real-time video analysis progress status callback function ;lAttachHandle is return value of AttachVideoAnalyseState
 * \else
 * 视频分析进度状态实时回调函数 ;lAttachHandle是AttachVideoAnalyseState返回值
 * \endif
 */
public interface CB_fVideoAnalyseState {

	/**
	 * \if ENGLISH_LANG
	 * Callback prototype of lReal-time video analysis progress status 
	 * @param lAttachHandle return from{@link INetSDK#AttachVideoAnalyseState}
	 * @param pAnalyseStateInfos {@link NET_VIDEOANALYSE_STATE}
	 * @param pReserved 
	 * \else
	 * 监听透明串口数据的回调函数
	 * @param lAttachHandle {@link INetSDK#AttachVideoAnalyseState}返回值
	 * @param pAnalyseStateInfos {@link NET_VIDEOANALYSE_STATE}
	 * @param pReserved 保留
	 * \endif
	 */
	public int invoke(long lAttachHandle, NET_VIDEOANALYSE_STATE pAnalyseStateInfos, Object pReserved);
}

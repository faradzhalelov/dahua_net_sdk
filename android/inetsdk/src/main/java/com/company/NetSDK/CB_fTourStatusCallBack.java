package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * tour status call function origin, lAttachHandle is AttachSplitTour return value
 * \else
 * 轮巡状态回调函数原形, lAttachHandle是 AttachSplitTour的返回值
 * \endif
 */
public interface CB_fTourStatusCallBack{
	
	/**
	 * \if ENGLISH_LANG
	 * tour status call function
	 * @param lLoginID Login Handler, return from{@link INetSDK#LoginEx}Or{@link INetSDK#Login}
	 * @param lAttachHandle return from{@link INetSDK#AttachSplitTour}
	 * @param pstStatus {@link NET_SPLIT_TOUR_STATUS_INFO}
	 * \else
	 * 轮训状态回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lAttachHandle {@link INetSDK#AttachSplitTour}返回值
	 * @param pstStatus 状态信息，{@link NET_SPLIT_TOUR_STATUS_INFO}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_SPLIT_TOUR_STATUS_INFO pstStatus);
}

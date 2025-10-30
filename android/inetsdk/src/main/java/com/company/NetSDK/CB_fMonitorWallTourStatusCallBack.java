package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * ctv wall scheme tour status call function origin, lAttachHandle is CLIENT_MonitorWallAttachTour return value 
 * \else
 * 电视墙预案轮训状态回调函数，lAttachHandle是MonitorWallAttachTour返回值
 * \endif
 */
public interface CB_fMonitorWallTourStatusCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall scheme tour status call function 
	 * @param lLoginID Login Handler, return from{@link INetSDK#LoginEx}Or{@link INetSDK#Login}
	 * @param lAttachHandle return from{@link INetSDK#MonitorWallAttachTour}
	 * @param pstStatus {@link NET_WM_TOUR_STATUS_INFO}
	 * \else
	 * 电视墙预案轮训状态回调函数
	 * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param lAttachHandle {@link INetSDK#MonitorWallAttachTour}返回值
	 * @param pstStatus {@link NET_WM_TOUR_STATUS_INFO}
	 * \endif
	 */
	public void invoke(long lLoginID, long lAttachHandle, NET_WM_TOUR_STATUS_INFO pstStatus);
}

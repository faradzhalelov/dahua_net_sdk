package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#MonitorWallAttachTour} port input parameter
 * \else
 * {@link INetSDK#MonitorWallAttachTour} 接口输入参数
 * \endif
 */
public class NET_IN_WM_ATTACH_TOUR implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall ID
	 * \else
	 * 电视墙ID
	 * \endif
	 */
    public int             nMonitorWallID;            
    
	/**
	 * \if ENGLISH_LANG
	 * tour status  call function
	 * \else
	 * 轮巡状态回调函数
	 * \endif
	 */
    public CB_fMonitorWallTourStatusCallBack cbStatus;    
}

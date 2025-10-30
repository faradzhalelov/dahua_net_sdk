package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SnapPictureByEvent} interface paramter input
 * \else
 * {@link INetSDK#SnapPictureByEvent} 输入参数
 * \endif
 */
public class NET_IN_SNAP_BY_EVENT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * nChannel
	 * \else
	 * 视频通道号, 从0开始
	 * \endif
	 */
	public int nChannel;
		
	/**
	 * \if ENGLISH_LANG
	 * dwEventID, refer to {@link INetSDK#RealLoadPictureEx}
	 * \else
	 * 参考 {@link INetSDK#RealLoadPictureEx}的事件类型
	 * \endif
	 */
	public int dwEventID;
}

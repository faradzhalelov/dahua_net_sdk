package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachSplitTour} input parameter
 * \else
 * {@link INetSDK#AttachSplitTour} 接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_SPLIT_TOUR implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * output channel no., pszCompsiteIDis NULL, it is valid 
	 * \else
	 * 输出通道号, pszCompsiteID为NULL时有效
	 * \endif
	 */
	public int                 nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * splicing video wall ID
	 * \else
	 * 拼接屏ID
	 * \endif
	 */
	public String         	   pszCompositeID; 
	
	/**
	 * \if ENGLISH_LANG
	 * tour status call interface 
	 * \else
	 * 轮巡状态回调函数
	 * \endif
	 */
	public CB_fTourStatusCallBack cbStatus;  
}

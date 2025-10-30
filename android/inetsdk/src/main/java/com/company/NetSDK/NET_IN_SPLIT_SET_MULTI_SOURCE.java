package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SplitSetMultiSource} The Input Parameters of the Interface
 * \else
 * {@link INetSDK#SplitSetMultiSource} 接口的输入参数
 * \endif
 */
public class NET_IN_SPLIT_SET_MULTI_SOURCE implements Serializable {

	/**
	 * SplitSetMultiSource input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output control method， value corresponding to {@link EM_VIDEO_OUT_CTRL_TYPE}
	 * \else
	 *  视频输出控制方式, 值对应类 {@link EM_VIDEO_OUT_CTRL_TYPE}
	 * \endif
	 */
	public 	int  emCtrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output logical channel number,Effective When emCtrlType is EM_VIDEO_OUT_CTRL_CHANNEL
	 * \else
	 *  视频输出逻辑通道号, emCtrlType为EM_VIDEO_OUT_CTRL_CHANNEL时有效
	 * \endif
	 */
	public int nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID,When emCtrlType is EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_COMPOSITE_ID
	 * \else
	 *  拼接屏ID, emCtrlType为EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_COMPOSITE_ID时有效有效
	 * \endif
	 */
	public String szCompositeID;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to change segmentation model 
	 * \else
	 *  是否改变分割模式
	 * \endif
	 */
	public boolean bSplitModeEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Segmentation model,Enable when bSplitModeEnable=TRUE，  value corresponding to SDK_SPLIT_MODE
	 * \else
	 *  分割模式, bSplitModeEnable=TRUE时有效,值对应 SDK_SPLIT_MODE
	 * \endif
	 */
	public int 	emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 *  Segmentation group number,Effective when bSplitModeEnable=TRUE
	 * \else
	 *  分割分组号, bSplitModeEnable=TRUE时有效
	 * \endif
	 */
	public int   nGroupID;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  Window Number Array
	 * \else
	 *  窗口号数组
	 * \endif
	 */
	public int szWindows[];
	
	/**
	 * \if ENGLISH_LANG
	 *  Window Number
	 * \else
	 *  窗口数量
	 * \endif
	 */
	public int nWindowCount;
	
	/**
	 * \if ENGLISH_LANG
	 *  Video source information, corresponding to each window, the number with the number of window 
	 * \else
	 *  视频源信息, 分别对应每个窗口, 数量同窗口数
	 * \endif
	 */
	public SDK_SPLIT_SOURCE szStuSources[];
	
	
	public NET_IN_SPLIT_SET_MULTI_SOURCE(int nWindowCount)
	{
		this.nWindowCount = nWindowCount;
		
		if(nWindowCount > 0)
		{
			szWindows = new int[nWindowCount];
			szStuSources = new SDK_SPLIT_SOURCE[nWindowCount];
			for(int i = 0; i < nWindowCount; i++)
			{
				szStuSources[i] = new SDK_SPLIT_SOURCE();
			}
			
		}
		
	}
}


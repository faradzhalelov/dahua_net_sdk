package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetSplitSourceEx} Port input parameter
 * \else
 * {@link INetSDK#SetSplitSourceEx} 接口的输入参数
 * \endif
 */
public class NET_IN_SET_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video output control {@link EM_VIDEO_OUT_CTRL_TYPE}
	 * \else
	 * 视频输出控制方式 {@link EM_VIDEO_OUT_CTRL_TYPE}
	 * \endif
	 */
	public int 					emCtrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output logic channel no., emCtrlType as EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_CHANNEL is valid
	 * \else
	 * 视频输出逻辑通道号, emCtrlType为 EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_CHANNEL时有效
	 * \endif
	 */
	public int						nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID, emCtrlType as EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_COMPOSITE_ID is valid
	 * \else
	 * 拼接屏ID, emCtrlType为 EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_COMPOSITE_ID时有效
	 * \endif
	 */
	public String					pszCompositeID;
	
	/**
	 * \if ENGLISH_LANG
	 * Window no., -1 means current split mode all windows
	 * \else
	 * 窗口号, -1表示当前分割模式下的所有窗口
	 * \endif
	 */
	public int						nWindow;
	
	/**
	 * \if ENGLISH_LANG
	 * Video source info, When nWindow=-1, video source is a group, and quantity match window
	 * \else
	 * 视频源信息, 当nWindow=-1时, 视频源是个数组, 且数量与窗口数一致
	 * \endif
	 */
	public SDK_SPLIT_SOURCE			pstuSources[];
	
	/**
	 * \if ENGLISH_LANG
	 * Video source quantity
	 * \else
	 * 视频源数量
	 * \endif
	 */
	public int						nSourceCount;	 
	
	public NET_IN_SET_SPLIT_SOURCE(int nSourceCount) {
		this.nSourceCount = nSourceCount;
		pstuSources = new SDK_SPLIT_SOURCE[nSourceCount];
		for (int i = 0; i < nSourceCount; i++) {
			pstuSources[i] = new SDK_SPLIT_SOURCE();
		}
	}
}

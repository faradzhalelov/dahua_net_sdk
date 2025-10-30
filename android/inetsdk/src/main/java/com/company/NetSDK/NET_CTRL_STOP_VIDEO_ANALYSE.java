package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ControlDevice}'s param: {@link CtrlType#SDK_CTRL_STOP_VIDEO_ANALYSE}
 * \else
 * {@link INetSDK#ControlDevice}接口的 {@link CtrlType#SDK_CTRL_STOP_VIDEO_ANALYSE} 命令参数
 * \endif
 */
public class NET_CTRL_STOP_VIDEO_ANALYSE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID  
	 * \else
	 * 通道号  
	 * \endif
	 */
	public int                 nChannelId;  
}

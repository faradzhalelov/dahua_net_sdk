package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ControlDevice}'s param {@link CtrlType#SDK_CTRL_MULTIPLAYBACK_CHANNALES}
 * \else
 * {@link INetSDK#ControlDevice} 接口的 {@link CtrlType#SDK_CTRL_MULTIPLAYBACK_CHANNALES} 命令参数
 * \endif
 */
public class NET_CTRL_MULTIPLAYBACK_CHANNALES implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Playback Handle，interface MultiPlayBack Returns the Value
	 * \else
	 * 回放句柄，MultiPlayBack接口返回值
	 * \endif
	 */
	public long     	lPlayBackHandle; 
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Channel ID
	 * \else
	 * 预览通道号
	 * \endif
	 */
	public int        	nChannels[] = new int[FinalVar.SDK_MAX_MULTIPLAYBACK_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Channel Number 
	 * \else
	 * 预览通道数 
	 * \endif
	 */
	public int      	nChannelNum; 
}

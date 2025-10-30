package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSplitWindowRect} 's interface input param(setting the window position)
 * \else
 * {@link INetSDK#GetSplitWindowRect} 输入参数(设置窗口位置)
 * \endif
 */
public class SDK_IN_SPLIT_GET_RECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道号(屏号)
	 * \endif
	 */
	public int	nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Window order
	 * \else
	 * 窗口序号
	 * \endif
	 */
	public int	nWindowID;



}

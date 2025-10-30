package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetSplitWindowRect} 's interface input param(setting the window position)
 * \else
 * {@link INetSDK#SetSplitWindowRect} 输入参数(设置窗口位置)
 * \endif
 */
public class SDK_IN_SPLIT_SET_RECT implements Serializable {
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
	public int					nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Window order
	 * \else
	 * 窗口序号
	 * \endif
	 */
	public int 				nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Wndow position, 0~8192
	 * \else
	 * 窗口位置, 0~8192
	 * \endif
	 */
	public SDK_RECT				stuRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Coordinate whether meet the confitions
	 * \else
	 * 坐标是否满足直通条件, 直通是指拼接屏方式下，此窗口区域正好为物理屏区域
	 * \endif
	 */
	public boolean				bDirectable;
}

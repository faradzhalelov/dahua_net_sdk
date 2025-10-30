package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OpenSplitWindow} 's interface input param(open window)
 * \else
 * {@link INetSDK#OpenSplitWindow} 接口输入参数(开窗)
 * \endif
 */
public class SDK_IN_SPLIT_OPEN_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel no.
	 * \else
	 * 通道号(屏号)
	 * \endif
	 */
	public int					nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Windon position, 0~8192
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

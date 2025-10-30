package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetSplitWindowLevels} 's interface output param(setting window order)
 * \else
 * {@link INetSDK#SetSplitWindowLevels} 接口输出参数(设置窗口次序)
 * \endif
 */
public class SDK_OUT_SPLIT_SET_TOP_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Window order array
	 * \else
	 * 窗口次序数组
	 * \endif
	 */
	public SDK_WND_ZORDER		pZOders[];
	
	/**
	 * \if ENGLISH_LANG
	 * Window order array size
	 * \else
	 * 窗口次序数组大小
	 * \endif
	 */
	public int					nMaxWndCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of returned window
	 * \else
	 * 返回的窗口数量
	 * \endif
	 */
	public int					nWndCount;
	
	public SDK_OUT_SPLIT_SET_TOP_WINDOW(int nMax) {
		nMaxWndCount = nMax;
		pZOders = new SDK_WND_ZORDER[nMaxWndCount];
		for (int i = 0; i < nMaxWndCount; i++) {
			pZOders[i] = new SDK_WND_ZORDER();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetSplitWindowLevels} 's interface input param(setting window order)
 * \else
 * {@link INetSDK#SetSplitWindowLevels} 接口输入参数(设置窗口次序)
 * \endif
 */
public class SDK_IN_SPLIT_SET_TOP_WINDOW implements Serializable {
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
	 * Wndown ID
	 * \else
	 * 窗口序号
	 * \endif
	 */
	public int					nWindowID;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#CloseSplitWindow} 's interface input param(close window)
 * \else
 * {@link INetSDK#CloseSplitWindow} 接口输入参数(关窗)
 * \endif
 */
public class SDK_IN_SPLIT_CLOSE_WINDOW implements Serializable {
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
	public int					nWindowID;
}

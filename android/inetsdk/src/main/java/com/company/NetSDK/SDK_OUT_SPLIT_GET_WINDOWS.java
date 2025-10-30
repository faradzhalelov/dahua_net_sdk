package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSplitWindowsInfo} 's interface output param
 * \else
 * {@link INetSDK#GetSplitWindowsInfo} 接口输出参数
 * \endif
 */
public class SDK_OUT_SPLIT_GET_WINDOWS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Windows info
	 * \else
	 * 窗口信息
	 * \endif
	 */
	public SDK_BLOCK_COLLECTION	stuWindows = new SDK_BLOCK_COLLECTION();					
}

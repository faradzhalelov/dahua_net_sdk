package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSplitWindowsInfo} 's interface input param
 * \else
 * {@link INetSDK#GetSplitWindowsInfo} 接口输入参数
 * \endif
 */
public class SDK_IN_SPLIT_GET_WINDOWS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel
	 * \else
	 * 通道号
	 * \endif
	 */
	public int					nChannel;				
}

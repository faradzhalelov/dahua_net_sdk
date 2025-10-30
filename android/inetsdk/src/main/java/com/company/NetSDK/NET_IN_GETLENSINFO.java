package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter of {@link INetSDK#GetLensInfo}
 * \else
 * {@link INetSDK#GetLensInfo} 接口输入参数
 * \endif
 */
public class NET_IN_GETLENSINFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video channel number
	 * \else
	 * 视频通道号
	 * \endif
	 */
	public int                            nChannel;
}

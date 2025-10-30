package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device channel quantity info, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_DEV_CHN_COUNT}
 * \else
 * 设备通道数量信息, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_DEV_CHN_COUNT}
 * \endif
 */
public class NET_DEV_CHN_COUNT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video input channel
	 * \else
	 * 视频输入通道
	 * \endif
	 */
	public NET_CHN_COUNT_INFO	stuVideoIn = new NET_CHN_COUNT_INFO();					

	/**
	 * \if ENGLISH_LANG
	 * Video output channel
	 * \else
	 * 视频输出通道
	 * \endif
	 */
	public NET_CHN_COUNT_INFO	stuVideoOut = new NET_CHN_COUNT_INFO();				
}

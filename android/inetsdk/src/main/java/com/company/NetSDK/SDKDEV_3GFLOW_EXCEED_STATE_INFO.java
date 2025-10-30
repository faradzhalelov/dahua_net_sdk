package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 3G traffic exceeds the threshold status information, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_3GFLOW_EXCEED}
 * \else
 * 3G流量超出阈值状态信息, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_3GFLOW_EXCEED}
 * \endif
 */
public class SDKDEV_3GFLOW_EXCEED_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 3G traffic exceeds a threshold state, and 0 indicates that does not exceed the threshold, 1 represents beyond threshold 
	 * \else
	 * 3G流量超出阈值状态，0表示未超出阀值，1表示超出阀值
	 * \endif
	 */
	public byte                bState; 
}

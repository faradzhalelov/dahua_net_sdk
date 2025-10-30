package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RTSP configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_RTSP_CFG}
 * \else
 * RTSP 配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_RTSP_CFG}
 * \endif
 */
public class SDKDEV_RTSP_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * port number(can't be the same as tcp or udp's port number)
	 * \else
	 * 端口号
	 * \endif
	 */
    public short               wPort; 
}

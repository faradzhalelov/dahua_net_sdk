package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decoder protocol rtsp url configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_DECODER_URL_CFG}
 * \else
 * 解码器rtsp url配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_DECODER_URL_CFG}
 * \endif
 */
public class SDKDEV_DECODER_URL_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * main stream url
	 * \else
	 * 主码流url
	 * \endif
	 */
	public byte            szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * extra stream url
	 * \else
	 * 辅码流url
	 * \endif
	 */
	public byte            szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel video input color config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEOCOLOR}
 * \else
 * 通道视频输入颜色配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VIDEOCOLOR}
 * \endif
 */
public class AV_CFG_ChannelVideoColor implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel color config amount
	 * \else
	 * 通道颜色配置数
	 * \endif
	 */
	public int			nColorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel color config. Each input video has several corresponding color setups.
	 * \else
	 * 通道颜色配置, 每个通道对应多个颜色配置
	 * \endif
	 */
	public AV_CFG_VideoColor	stuColor[] = new AV_CFG_VideoColor[FinalVar.AV_CFG_Max_VideoColor];
	
	public AV_CFG_ChannelVideoColor() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_VideoColor; i++) {
			stuColor[i] = new AV_CFG_VideoColor();
		}
	}
}

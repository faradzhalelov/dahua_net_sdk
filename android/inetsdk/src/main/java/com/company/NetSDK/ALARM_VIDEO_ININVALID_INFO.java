package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input channel failed, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_VIDEO_ININVALID} (i.e. config video input channel's bit stram but it exceeds device processing capacity)
 * \else
 * 视频输入通道失效事件,  对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_VIDEO_ININVALID} (例：配置的视频输入通道码流，超出设备处理能力)
 * \endif
 */
public class ALARM_VIDEO_ININVALID_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel no.,form 0
	 * \else
	 * 通道号，从0开始
	 * \endif
	 */
	public int                 nChannelID;
}

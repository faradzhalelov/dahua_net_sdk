package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice-activated audio channel configuration
 * \else
 * 语音激励音频通道配置
 * \endif
 */
public class CFG_AUDIO_SPIRIT_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Voice incentives linked video channel number
	 * \else
	 * 语音激励联动视频通道号
	 * \endif
	 */
	public int				nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice incentive priorities, 1 ~ 10
	 * \else
	 * 语音激励优先级, 1~10
	 * \endif
	 */
	public int				nPriority;
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding video camera preset point, consistent with the 0 to 255 PTZ
	 * \else
	 *  对应的视频摄像机的预置点, 与云台一致0~255
	 * \endif
	 */
	public int				nPreset;
	
}

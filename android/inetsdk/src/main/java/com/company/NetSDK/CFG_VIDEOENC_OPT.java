package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Encoding Options
 * \else
 * 视频编码参数
 * \endif
 */
public class CFG_VIDEOENC_OPT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean				abVideoEnable;
	public boolean				abAudioEnable;
	public boolean				abSnapEnable;
	public boolean              abAudioAdd;                 
	public boolean				abAudioFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * Video Enable 
	 * \else
	 * 视频使能
	 * \endif
	 */
	public boolean				bVideoEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Video Format 
	 * \else
	 * 视频格式
	 * \endif
	 */
	public CFG_VIDEO_FORMAT		stuVideoFormat = new CFG_VIDEO_FORMAT();				

	/**
	 * \if ENGLISH_LANG
	 * Audio Enable 
	 * \else
	 * 音频使能
	 * \endif
	 */
	public boolean				bAudioEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Snap Enable 
	 * \else
	 * 定时抓图使能
	 * \endif
	 */
	public boolean				bSnapEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Audio Add Enable 
	 * \else
	 * 音频叠加使能
	 * \endif
	 */
	public boolean              bAudioAddEnable;            

	/**
	 * \if ENGLISH_LANG
	 * Audio Format 
	 * \else
	 * 音频格式
	 * \endif
	 */
	public CFG_AUDIO_ENCODE_FORMAT	stuAudioFormat = new CFG_AUDIO_ENCODE_FORMAT();			
}

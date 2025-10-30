package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * 解码器回放控制类型
 * \endif
 */
public class DEC_CTRL_PLAYBACK_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Drag
	 * \else
	 * 拖动
	 * \endif
	 */
	public static final int     Dec_Playback_Seek = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Play
	 * \else
	 * 播放
	 * \endif
	 */
	public static final int     Dec_Playback_Play = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Pause
	 * \else
	 * 暂停
	 * \endif
	 */
	public static final int     Dec_Playback_Pause = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop
	 * \else
	 * 停止
	 * \endif
	 */
	public static final int     Dec_Playback_Stop = 3;
}

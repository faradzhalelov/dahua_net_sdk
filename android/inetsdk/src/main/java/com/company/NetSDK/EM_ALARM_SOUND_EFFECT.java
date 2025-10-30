package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm sound effect
 * \else
 * 报警音类型
 * \endif
 */
public class EM_ALARM_SOUND_EFFECT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown sound effect
	 * \else
	 * 未知的音效
	 * \endif
	 */
	public static final int EM_ALARM_SOUND_EFFECT_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * Mute
	 * \else
	 * 静音
	 * \endif
	 */
	public static final int EM_ALARM_SOUND_EFFECT_MUTE = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * Notice
	 * \else
	 * 较为轻柔的报警音, 起到提示作用
	 * \endif
	 */
	public static final int EM_ALARM_SOUND_EFFECT_NOTICE = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Alert
	 * \else
	 * 尖锐响亮的报警音, 起到警示作用
	 * \endif
	 */
	public static final int EM_ALARM_SOUND_EFFECT_ALERT = 3;
}

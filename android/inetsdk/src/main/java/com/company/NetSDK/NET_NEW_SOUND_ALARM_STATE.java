package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New audio detect alarm
 * \else
 * 新音频检测报警信息
 * \endif
 */
public class NET_NEW_SOUND_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel No. 
	 * \else
	 * 报警通道号
	 * \endif
	 */
	public int                 channel;                        
	/**
	 * \if ENGLISH_LANG
	 * Alarm type；0：Audio value is too long，1：Audio value is too high 
	 * \else
	 * 报警类型；0：音频值过低，1：音频值过高
	 * \endif
	 */
	public int                 alarmType;                      
	/**
	 * \if ENGLISH_LANG
	 * Volume value 
	 * \else
	 * 音量值
	 * \endif
	 */
	public int        			volume;                        
	/**
	 * \if ENGLISH_LANG
	 * Audio alarm status, 0:Audio alarm occurred , 1: Audio alarm disappear 
	 * \else
	 * 音频报警状态, 0: 音频报警出现, 1: 音频报警消失
	 * \endif
	 */
	public byte                byState;                        
}

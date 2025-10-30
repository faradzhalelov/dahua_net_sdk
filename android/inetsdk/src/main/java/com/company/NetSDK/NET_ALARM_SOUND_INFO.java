package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm sound configuration of device
 * \else
 * 报警网关语音配置
 * \endif
 */
public class NET_ALARM_SOUND_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * alarm sound effect, refer to {@link EM_ALARM_SOUND_EFFECT}
	 * \else
	 * 声音效果, 取值参考{@link EM_ALARM_SOUND_EFFECT}
	 * \endif
	 */

    public int emSoundEffect;

}

package com.company.NetSDK;

import java.io.Serializable;

public class SDK_AUDIO_DETECT_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public int                     AlarmNum;
	public SDK_AUDIO_DETECT_INFO    AudioDetectAlarm[] = new SDK_AUDIO_DETECT_INFO[FinalVar.SDK_MAX_AUDIO_IN_NUM];
	
	public SDK_AUDIO_DETECT_CFG() {
		for (int i = 0; i < FinalVar.SDK_MAX_AUDIO_IN_NUM; i++) {
			AudioDetectAlarm[i] = new SDK_AUDIO_DETECT_INFO();
		}
	}
}

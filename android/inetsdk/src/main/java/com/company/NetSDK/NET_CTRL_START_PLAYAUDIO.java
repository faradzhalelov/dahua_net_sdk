package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ControlDevice} interface {@link CtrlType#SDK_CTRL_START_PLAYAUDIO} Order Parameter
 * \else
 * {@link INetSDK#ControlDevice}接口的 {@link CtrlType#SDK_CTRL_START_PLAYAUDIO} 命令参数
 * \endif
 */
public class NET_CTRL_START_PLAYAUDIO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public char				szAudioPath[] = new char[FinalVar.SDK_MAX_AUDIO_PATH_1];
}

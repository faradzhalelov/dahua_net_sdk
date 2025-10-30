package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Three generations of equipment parameters of voice intercom, corresponding to the {@link INetSDK#SetDeviceMode}, command {@link EM_USEDEV_MODE#SDK_TALK_MODE3}
 * \else
 * 三代设备的语音对讲参数，对应{@link INetSDK#SetDeviceMode}的命令{@link EM_USEDEV_MODE#SDK_TALK_MODE3}
 * \endif
 */
public class NET_TALK_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel number 
	 * \else
	 * 通道号
	 * \endif
	 */
	public int					nChannel; 
	
	/**
	 * \if ENGLISH_LANG
	 * Audio transmission listener ports
	 * \else
	 * 音频传输侦听端口
	 * \endif
	 */
	public int                 	nAudioPort; 
	
	/**
	 * \if ENGLISH_LANG
	 * Ms wait time, unit, use the default value is 0
	 * \else
	 * 等待时间, 单位ms,为0则使用默认值
	 * \endif
	 */
	public int					nWaitTime; 
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Audio data of audio talk callback function original shape 
 * \else
 * 发起语音回调
 * \endif
 */
public interface CB_pfAudioDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Audio data of audio talk callback function original shape
	 * @param lTalkHandle handle, return from{@link INetSDK#StartTalkEx}
	 * @param pDataBuf Recalled audio data length(unit:byte) 
	 * @param byAudioFlag Audio data home sign, 0:means audio data collected by local audio recording list;
	 * 1:means received audio data sent by devie
	 * \else
	 * 发起语音回调函数
	 * @param lTalkHandle {@link INetSDK#StartTalkEx}的返回值
	 * @param pDataBuf 回调出来的音频数据的内容 
	 * @param byAudioFlag 音频数据归属标志,0:表示是本地录音库采集的音频数据;1:表示收到的设备发过来的音频数据
	 * \endif
	 */
	public void invoke(long lTalkHandle, byte pDataBuf[], byte byAudioFlag);
}

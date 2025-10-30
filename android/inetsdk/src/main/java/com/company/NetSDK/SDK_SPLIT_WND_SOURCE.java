package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 *  source of window display info 
 * \else
 * 窗口显示源信息
 * \endif
 */
public class SDK_SPLIT_WND_SOURCE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * enable 
	 * \else
	 * 显示源是否有效
	 * \endif
	 */
	public boolean                 bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 *  device ID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public byte[]                  szDeviceID = new byte[FinalVar.SDK_DEV_ID_LEN];      
    
	/**
	 * \if ENGLISH_LANG
	 *  control ID
	 * \else
	 * 控制ID
	 * \endif
	 */
	public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     
    
	/**
	 * \if ENGLISH_LANG
	 * video channel ID
	 * \else
	 * 视频通道号
	 * \endif
	 */
	public int                     nVideoChannel;
    
	/**
	 * \if ENGLISH_LANG
	 *  video stream type
	 * \else
	 * 视频码流类型
	 * \endif
	 */
	public int                     nVideoStream;
    
	/**
	 * \if ENGLISH_LANG
	 *  audio channel ID
	 * \else
	 * 音频通道
	 * \endif
	 */
	public int                     nAudioChannel; 
    
	/**
	 * \if ENGLISH_LANG
	 * audio stream type
	 * \else
	 * 音频码流类型
	 * \endif
	 */
	public int                     nAudioStream;
    
	/**
	 * \if ENGLISH_LANG
	 *  unique channel,read only
	 * \else
	 * 设备内统一编号的唯一通道号, 只读
	 * \endif
	 */
	public int                     nUniqueChannel;
    
	/**
	 * \if ENGLISH_LANG
	 *  support remote device
	 * \else
	 *  是否远程设备
	 * \endif
	 */
	public boolean                 bRemoteDevice;                 
    
	/**
	 * \if ENGLISH_LANG
	 *  info of remote device
	 * \else
	 * 远程设备信息  
	 * \endif
	 */
	public SDK_REMOTE_DEVICE       stuRemoteDevice;       
	
	public SDK_SPLIT_WND_SOURCE(int videoInputCount) {
		stuRemoteDevice = new SDK_REMOTE_DEVICE(videoInputCount);
	}
}

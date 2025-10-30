package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device VIRTUALCAMERA informaiton, the corresponding interface {@link INetSDK#QueryDevState}, the corresponding command {@link FinalVar#SDK_DEVSTATE_VIRTUALCAMERA}
 * \else
 * 虚拟摄像头状态查询, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_VIRTUALCAMERA}
 * \endif
 */
public class SDKDEV_VIRTUALCAMERA_STATE_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel
	 * \else
	 * 通道号
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * connect state, see {@link CONNECT_STATE}
	 * \else
	 * 连接状态，查看 {@link CONNECT_STATE}
	 * \endif
	 */
    public int                 emConnectState;
	
	/**
	 * \if ENGLISH_LANG
	 * uiPOEPort
	 * \else
	 * 此虚拟摄像头所连接的POE端口号，0表示不是POE连接 
	 * \endif
	 */
	public int					uiPOEPort;
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceName
	 * \else
	 * 设备名称
	 * \endif
	 */
	public byte                	szDeviceName[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceType
	 * \else
	 * 设备类型
	 * \endif
	 */
	public byte                	szDeviceType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * SystemType
	 * \else
	 * 系统版本
	 * \endif
	 */
	public byte                	szSystemType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * SerialNumber
	 * \else
	 * 序列号
	 * \endif
	 */
	public byte                	szSerialNo[] = new byte[48];
	
	/**
	 * \if ENGLISH_LANG
	 * VideoInput
	 * \else
	 * 视频输入通道数
	 * \endif
	 */
	public int					nVideoInput;
	
	/**
	 * \if ENGLISH_LANG
	 * AudioInput
	 * \else
	 * 音频输入通道数
	 * \endif
	 */
	public int					nAudioInput;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmOutput
	 * \else
	 * 外部报警通道数
	 * \endif
	 */
	public int					nAlarmOutput;

}

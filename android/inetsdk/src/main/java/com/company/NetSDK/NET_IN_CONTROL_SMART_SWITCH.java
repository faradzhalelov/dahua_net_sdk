package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * control smart switch input , {@link CtrlType#SDK_CTRL_CONTROL_SMART_SWITCH} control type of {@link INetSDK#ControlDeviceEx}
 * \else
 * 控制智能开关, {@link INetSDK#ControlDeviceEx} 入参, 对应 {@link CtrlType#SDK_CTRL_CONTROL_SMART_SWITCH}
 * \endif
 */
public class NET_IN_CONTROL_SMART_SWITCH implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * serial number
	 * \else
	 * 设备序列号 
	 * \endif
	 */
    public byte[]		szSerialNumber = new byte[FinalVar.SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN]; 
    
	/**
	 * \if ENGLISH_LANG
	 * TRUE - switch on, FALSE - switch off
	 * \else
	 * TRUE - 开, FALSE - 关
	 * \endif
	 */
    public boolean      bEnable; 
    
	/**
	 * \if ENGLISH_LANG
	 * delay time ,  equal to zero means immediately. unit: min
	 * \else
	 * 延时时间, 等于0时，表示立即打开或关闭. unit: min
	 * \endif
	 */
    public int          nDelayTime; 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video wall output channel info
 * \else
 * 电视墙
 * \endif
 */
public class AV_CFG_MonitorWallTVOut implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID. It is "null" or "Local"(local device)
	 * \else
	 * 设备ID, 为空或"Local"表示本地设备
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道ID
	 * \endif
	 */
	public int		nChannelID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Screen name
	 * \else
	 * 屏幕名称
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.AV_CFG_Channel_Name_Len];

}

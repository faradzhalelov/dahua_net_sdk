package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel Name Structure, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_CHANNELTITLE}
 * \else
 * 通道名称, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_CHANNELTITLE}
 * \endif
 */
public class AV_CFG_ChannelName implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Camera Unique Number 
	 * \else
	 * 摄像头唯一编号 
	 * \endif
	 */
	public int				nSerial;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel
	 * \else
	 * 通道名
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.CFG_MAX_CHANNEL_NAME_LEN];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Working State, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_TRAFFIC_WORKSTATE}
 * \else
 * 设备工作状态信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_TRAFFIC_WORKSTATE}
 * \endif
 */
public class CFG_TRAFFIC_WORKSTATE_INFO implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道号
	 * \endif
	 */
	public int						nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Snapshot Mode Types, refer to {@link CFG_TRAFFIC_SNAP_MODE}
	 * \else
	 * 抓拍模式, 取值参考 {@link CFG_TRAFFIC_SNAP_MODE}
	 * \endif
	 */
	public int                  	emSnapMode;
	
 	/**
	 * \if ENGLISH_LANG
	 * Match Mode: 0-Non-realtime，; 1-Realtime
	 * \else
	 * 抓拍匹配模式: 0-非实时匹配方式，先报警后抓拍，抓拍帧不是报警帧;  1-实时匹配模式，报警帧和抓拍帧是同一帧 
	 * \endif
	 */
	public int						nMatchMode;
}

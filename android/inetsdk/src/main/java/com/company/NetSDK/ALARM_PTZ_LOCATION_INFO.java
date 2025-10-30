package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ Positioning Info Alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_PTZ_LOCATION_EX}
 * \else
 * 云台定位信息报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_PTZ_LOCATION_EX}
 * \endif
 */
public class ALARM_PTZ_LOCATION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号 
	 * \endif
	 */
	public int     nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ horizontal motion position，valid within：[0,3600]
	 * \else
	 * 云台水平运动位置，有效范围：[0,3600]
	 * \endif
	 */
	public int     nPTZPan;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ vertical motion position, valid within：[-1800,1800]
	 * \else
	 * 云台垂直运动位置，有效范围：[-1800,1800]
	 * \endif
	 */
	public int     nPTZTilt;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ iris change position, valid within：[0,128]
	 * \else
	 * 云台光圈变动位置，有效范围：[0,128]
	 * \endif
	 */
	public int     nPTZZoom;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ motion status, 0-unknow 1-motion 2-idle 
	 * \else
	 * 云台运动状态, 0-未知 1-运动 2-空闲 
	 * \endif
	 */
	public byte    bState;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ motion，0-preset，1-line，2-tour，3-pattern，4-horizontal rotate
	 * \else
	 * 云台动作，0-预置点，1-线扫，2-巡航，3-巡迹，4-水平旋转
	 * \endif
	 */
	public byte    bAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ focus status, 0-unknown, 1-motion status, 2-idle
	 * \else
	 * 云台聚焦状态, 0-未知, 1-运动状态, 2-空闲
	 * \endif
	 */
	public byte    bFocusState;
	
 	/**
	 * \if ENGLISH_LANG
	 * in period preset status is valid or not
	 * If currently report preset is preset within period, then it is 1，others are 0
	 * \else
	 * 在时间段内预置点状态是否有效
	 * 如果当前上报的预置点是时间段内的预置点，则为1，其他情况为0
	 * \endif
	 */
	public byte    bEffectiveInTimeSection;
                                        
 	/**
	 * \if ENGLISH_LANG
	 * Tour ID
	 * \else
	 * 巡航ID号
	 * \endif
	 */
	public int     nPtzActionID;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ position preset no.
	 * \else
	 * 云台所在预置点编号
	 * \endif
	 */
	public int     dwPresetID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Focus position
	 * \else
	 * 聚焦位置
	 * \endif
	 */
	public float   fFocusPosition;
	
 	/**
	 * \if ENGLISH_LANG
	 * PTZ ZOOM status，0-unknown，1-ZOOM，2-idle
	 * \else
	 * 云台ZOOM状态，0-未知，1-ZOOM，2-空闲
	 * \endif
	 */
	public byte    bZoomState;
	
 	/**
	 * \if ENGLISH_LANG
	 * No.，for calibration of loss
	 * \else
	 * 包序号，用于校验是否丢包
	 * \endif
	 */
	public int     dwSequence;
	
 	/**
	 * \if ENGLISH_LANG
	 * Corresponding UTC(1970-1-1 00:00:00) second.
	 * \else
	 * 对应的UTC(1970-1-1 00:00:00)秒数。
	 * \endif
	 */
	public int     dwUTC;
}

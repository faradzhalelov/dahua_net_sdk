package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ property information
 * \else
 * 云台属性信息
 * \endif
 */
public class PTZ_OPT_ATTR implements Serializable {	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Operation mask high bit 
	 * \else
	 * 操作的掩码高位
	 * \endif
	 */
	public int				dwHighMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation mask low bit 
	 * \else
	 * 操作的掩码低位
	 * \endif
	 */
	public int				dwLowMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation protocol name 
	 * \else
	 * 操作的协议名
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.NAME_MAX_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel address min value
	 * \else
	 * 通道地址的最小值
	 * \endif
	 */
	public int				wCamAddrMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel address max value
	 * \else
	 * 通道地址的最大值
	 * \endif
	 */
	public int				wCamAddrMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor address min value
	 * \else
	 * 预览地址的最小值
	 * \endif
	 */
	public int				wMonAddrMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor address max value
	 * \else
	 * 预览地址的最大值
	 * \endif
	 */
	public int				wMonAddrMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset min value
	 * \else
	 * 预置点的最小值
	 * \endif
	 */
	public byte				bPresetMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset max value
	 * \else
	 * 预置点的最大值
	 * \endif
	 */
	public byte				bPresetMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto tour min value
	 * \else
	 * 自动巡航线路的最小值
	 * \endif
	 */
	public byte				bTourMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto tour max value
	 * \else
	 * 自动巡航线路的最大值
	 * \endif
	 */
	public byte				bTourMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Pattern min value
	 * \else
	 * 轨迹线路的最小值
	 * \endif
	 */
	public byte				bPatternMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Pattern max value
	 * \else
	 * 轨迹线路的最大值
	 * \endif
	 */
	public byte				bPatternMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Tilt speed min value
	 * \else
	 * 垂直速度的最小值
	 * \endif
	 */
	public byte				bTileSpeedMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Tilt speed max value
	 * \else
	 * 垂直速度的最大值
	 * \endif
	 */
	public byte				bTileSpeedMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Pan speed min value
	 * \else
	 * 水平速度的最小值
	 * \endif
	 */
	public byte				bPanSpeedMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Pan speed max value
	 * \else
	 * 水平速度的最大值
	 * \endif
	 */
	public byte				bPanSpeedMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Aux function min value
	 * \else
	 * 辅助功能的最小值
	 * \endif
	 */
	public byte				bAuxMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Aux function max value
	 * \else
	 * 辅助功能的最大值
	 * \endif
	 */
	public byte				bAuxMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Command interval
	 * \else
	 * 发送命令的时间间隔
	 * \endif
	 */
	public int				nInternal;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type
	 * \else
	 * 协议的类型
	 * \endif
	 */
	public byte				bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Function mask :0x01 - support PTZ-inside function
	 * \else
	 * 协议功能掩码,按位表示,置１表示支持,第一位表示内置云台功能，其它７位暂时保留
	 * \endif
	 */
	public byte				bFuncMask;
}

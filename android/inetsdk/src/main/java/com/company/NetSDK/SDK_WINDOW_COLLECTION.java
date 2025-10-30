package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infomation window areas
 * \else
 * 区块窗口信息
 * \endif
 */
public class SDK_WINDOW_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * 窗口ID
	 * \endif
	 */
	public int					nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 窗口是否有效
	 * \endif
	 */
	public boolean				bWndEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Rect, effect when free split mode
	 * \else
	 * 窗口区域, 自由分割模式下有效
	 * \endif
	 */
	public SDK_RECT				stuRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Coordinate whether meet the conditions
	 * \else
	 * 坐标是否满足直通条件
	 * \endif
	 */
	public boolean				bDirectable;
	
	/**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * 窗口Z次序
	 * \endif
	 */
	public int					nZOrder;
	
	/**
	 * \if ENGLISH_LANG
	 * Source enable
	 * \else
	 * 显示源是否有效
	 * \endif
	 */
	public boolean				bSrcEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public byte				szDeviceID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Video channel
	 * \else
	 * 视频通道号
	 * \endif
	 */
	public int					nVideoChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Video stream type
	 * \else
	 * 视频码流类型
	 * \endif
	 */
	public int					nVideoStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio channel
	 * \else
	 * 音频通道
	 * \endif
	 */
	public int					nAudioChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio stream type
	 * \else
	 * 音频码流类型
	 * \endif
	 */
	public int					nAudioStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Unique channel
	 * \else
	 * 设备内统一编号的唯一通道号
	 * \endif
	 */
	public int					nUniqueChannel;
}

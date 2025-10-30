package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot Mode Types 
 * \else
 * 抓拍模式
 * \endif
 */
public class CFG_TRAFFIC_SNAP_MODE implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Mode Types 
	 * \else
	 * 自动抓拍
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_AUTO = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * Coil Snapshot
	 * \else
	 * 线圈抓拍
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_COIL = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Coil Snapshot, Picture Analysis
	 * \else
	 * 线圈抓拍, 图片分析
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_COIL_PICANALYSIS = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Snapshot
	 * \else
	 * 视频抓拍
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_STREAM = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Snapshot, Identicifcation
	 * \else
	 * 视频抓拍, 并且识别
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_STREAM_IDENTIFY = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * Mix, Identicifcation
	 * \else
	 * 混合抓拍, 并且识别
	 * \endif
	 */
	public static final int TRAFFIC_SNAP_MODE_MIX_IDENTIFY = 5;
}

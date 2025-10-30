package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snap function configuration
 * \else
 * 抓图功能配置
 * \endif
 */
public class SDKDEV_SNAP_CFG implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * \if ENGLISH_LANG
	 * Schedule snap button. (Go to alarm activation setup interface to enable alarm snap function.)
	 * \else
	 * 定时抓图开关(报警抓图开关在各报警联动配置中体现)
	 * \endif
	 */
	public byte             bTimingEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * timing snapshot interval hour
	 * \else
	 * 定时抓图时间间隔小时数
	 * \endif
	 */
	public byte             bPicIntervalHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Schedule snap interval. Unit is second. Now device max supports 30 minutes interval. 
	 * \else
	 * 定时抓图时间间隔，单位为秒,目前设备支持最大的抓图时间间隔为30分钟
	 * \endif
	 */
	public short            PicTimeInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap encode setup. Now supports resolution, video quality, frame rate setup. The frame rate here is negative number. It stands for the snap amount in one second.
	 * \else
	 * 抓图编码配置，现支持其中的分辨率、画质、帧率设置，帧率在这里是负数，表示一秒抓图的次数。
	 * \endif
	 */
	public SDK_VIDEOENC_OPT  struSnapEnc[] = new SDK_VIDEOENC_OPT[SNAP_TYPE.SNAP_TYP_NUM];     // 抓图编码配置，现支持其中的分辨率、画质、帧率设置，帧率在这里是负数，表示一秒抓图的次数。
	
	public SDKDEV_SNAP_CFG() {
		for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
			struSnapEnc[i] = new SDK_VIDEOENC_OPT();
		}
	}
}

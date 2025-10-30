package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap function extern configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_SNAP_CFG_EX}
 * \else
 * 抓图功能配置扩展, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_SNAP_CFG_EX}
 * \endif
 */
public class SDKDEV_SNAP_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * timing diagram switch(in tach of the alarm configuration)
	 * \else
	 * 定时抓图开关(报警抓图开关在各报警联动配置中体现)
	 * \endif
	 */
	public byte             bTimingEnable;

	/**
	 * \if ENGLISH_LANG
	 * the number of hours interval
	 * \else
	 * 定时抓图时间间隔小时数
	 * \endif
	 */
	public byte             bPicIntervalHour;

	/**
	 * \if ENGLISH_LANG
	 * time interval(s),the biggest capture device support interval 30min now
	 * \else
	 * 定时抓图时间间隔，单位为秒,目前设备支持最大的抓图时间间隔为30分钟
	 * \endif
	 */
	public short            PicTimeInterval;

	/**
	 * \if ENGLISH_LANG
	 * snap encode configuration,support resolution ,image quality and frame rate setting,frame rate is negative,say for a second to grasp figure number
	 * \else
	 * 抓图编码配置，现支持其中的分辨率、画质、帧率设置，帧率在这里是负数，表示一秒抓图的次数。
	 * \endif
	 */
	public SDK_VIDEOENC_OPT  struSnapEnc[] = new SDK_VIDEOENC_OPT[SNAP_TYPE.SNAP_TYP_NUM];

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 报警触发后每次抓图时间间隔时间 单位秒
	 * \endif
	 */
	public int            dwTrigPicIntervalSecond;
    
    public SDKDEV_SNAP_CFG_EX() {
    	for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
    		struSnapEnc[i] = new SDK_VIDEOENC_OPT();
    	}
    }
}

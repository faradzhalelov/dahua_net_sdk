package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arming parameters
 * \else
 * 报警布防参数
 * \endif
 */
public class SDKDEV_ALARM_SCHEDULE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Local alarm input
	 * \else
	 * 本地报警输入
	 * \endif
	 */
	public SDK_ALARMIN_CFG          struLocalAlmIn[] = new SDK_ALARMIN_CFG[FinalVar.SDK_MAX_ALARM_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Network alarm input
	 * \else
	 * 网络报警输入
	 * \endif
	 */
	public SDK_ALARMIN_CFG          struNetAlmIn[] = new SDK_ALARMIN_CFG[FinalVar.SDK_MAX_ALARM_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Dynamic detection alarm
	 * \else
	 * 动态检测报警
	 * \endif
	 */
	public SDK_MOTION_DETECT_CFG    struMotion[] = new SDK_MOTION_DETECT_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss alarm
	 * \else
	 * 视频丢失报警
	 * \endif
	 */
	public SDK_VIDEO_LOST_CFG       struVideoLost[] = new SDK_VIDEO_LOST_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Video tampering alarm
	 * \else
	 * 视频遮挡报警
	 * \endif
	 */
	public SDK_BLIND_CFG            struBlind[] = new SDK_BLIND_CFG[FinalVar.SDK_MAX_VIDEO_IN_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Hard disk alarm
	 * \else
	 * 硬盘报警
	 * \endif
	 */
	public SDK_DISK_ALARM_CFG       struDiskAlarm = new SDK_DISK_ALARM_CFG();
	
	/**
	 * \if ENGLISH_LANG
	 * Network Anomaly alarm
	 * \else
	 * 网络异常报警
	 * \endif
	 */
	public SDK_NETBROKEN_ALARM_CFG  struNetBrokenAlarm = new SDK_NETBROKEN_ALARM_CFG();
	
	public SDKDEV_ALARM_SCHEDULE() {
		for (int i = 0; i < FinalVar.SDK_MAX_ALARM_IN_NUM; i++) {
			struLocalAlmIn[i] = new SDK_ALARMIN_CFG();
			struNetAlmIn[i] = new SDK_ALARMIN_CFG();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
			struMotion[i] = new SDK_MOTION_DETECT_CFG();
			struVideoLost[i] = new SDK_VIDEO_LOST_CFG();
			struBlind[i] = new SDK_BLIND_CFG();
		}
	}
}

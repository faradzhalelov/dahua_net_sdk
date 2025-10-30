package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD Information for Each Channel
 * \else
 * 每个通道的OSD信息
 * \endif
 */
public class SDK_DVR_VIDEOOSD_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * OSD information for each channel
	 * \else
	 * 每个通道的OSD信息
	 * \endif
	 */
	public SDK_DVR_VIDEOITEM 	StOSDTitleOpt[] = new SDK_DVR_VIDEOITEM[FinalVar.SDK_VIDEO_CUSTOM_OSD_NUM];
	
	public SDK_DVR_VIDEOOSD_CFG() {
		for (int i = 0; i < FinalVar.SDK_VIDEO_CUSTOM_OSD_NUM; i++) {
			StOSDTitleOpt[i] = new SDK_DVR_VIDEOITEM();
		}
	}
}

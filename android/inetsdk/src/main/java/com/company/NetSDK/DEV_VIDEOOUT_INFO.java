package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device TV display info
 * \else
 * 设备TV输出参数信息
 * \endif
 */
public class DEV_VIDEOOUT_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP,video standard mask,according to the bit which shows video format(not support now)
	 * \else
	 * NSP,视频制式掩码，按位表示设备能够支持的视频制式(暂不支持)
	 * \endif
	 */
	public int           dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP,current format(not support now,please use {@link SDKDEV_SYSTEM_ATTR_CFG} by VideoStandard to read and config the video format)
	 * \else
	 * NSP,当前的制式(暂不支持，请使用 {@link SDKDEV_SYSTEM_ATTR_CFG} 的 byVideoStandard 对制式读取和配置)
	 * \endif
	 */
	public int             nVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask,according the bit which shows video resolution
	 * \else
	 * 分辨率掩码，按位表示设备能够支持的分辨率
	 * \endif
	 */
	public int           dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Current resolution
	 * \else
	 * 当前的分辨率
	 * \endif
	 */
	public int             nImageSize;
}

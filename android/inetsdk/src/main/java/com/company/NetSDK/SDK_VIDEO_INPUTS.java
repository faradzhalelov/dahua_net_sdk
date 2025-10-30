package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * channel info of video input
 * \else
 * 视频输入通道信息
 * \endif
 */
public class SDK_VIDEO_INPUTS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel name
	 * \else
	 * 通道名称
	 * \endif
	 */
	public byte                szChnName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * control ID
	 * \else
	 * 控制ID
	 * \endif
	 */
	public byte                szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * main stream url
	 * \else
	 * 主码流url地址
	 * \endif
	 */
	public byte                szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * extra stream url
	 * \else
	 * 辅码流url地址
	 * \endif
	 */
	public byte                szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * spare main stream address quantity
	 * \else
	 * 备用主码流地址数量
	 * \endif
	 */
	public int                 nOptionalMainUrlCount;
	
	/**
	 * \if ENGLISH_LANG
	 * spare main stream address list
	 * \else
	 * 备用主码流地址列表
	 * \endif
	 */
    public byte                szOptionalMainUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];
    
    /**
	 * \if ENGLISH_LANG
	 * spare sub stream address quantity
	 * \else
	 * 备用辅码流地址数量
	 * \endif
	 */
    public int                 nOptionalExtraUrlCount;
    
    /**
	 * \if ENGLISH_LANG
	 * spare substream address list
	 * \else
	 * 备用辅码流地址列表
	 * \endif
	 */
    public byte                szOptionalExtraUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];
}

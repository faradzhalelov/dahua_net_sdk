package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ability of record information, the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_RECORD}
 * \else
 * 录像能力信息, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_RECORD}
 * \endif
 */
public class CFG_CAP_RECORD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video does plan to support the holidat function
	 * \else
	 * 录像计划是否支持假日功能
	 * \endif
	 */
	public boolean  bSupportHoliday;
	
	/**
	 * \if ENGLISH_LANG
	 * whether to support setting extra stream video mode
	 * \else
	 * 是否支持设置辅码流录像模式
	 * \endif
	 */
	public boolean  bSupportExtraRecordMode;
	
	/**
	 * \if ENGLISH_LANG
	 * max record time
	 * \else
	 * 最大预录时间
	 * \endif
	 */
	public int dwMaxPreRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * total access code stream(kbps)
	 * \else
	 * 最大接入总码流,单位kbps
	 * \endif
	 */
	public int dwMaxRemoteBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * maximum access to the bare code stream (include decause,resolution,frame rate,deep calculated on 16bpp)
	 * \else
	 * 最大接入祼码流（包括路数、分辨率、帧率，色深按16bpp计算）
	 * \endif
	 */
	public int dwMaxRemoteRawBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Maximum number of video stream 
	 * \else
	 * 最大录像码流个数
	 * \endif
	 */
	public int dwMaxStreams;
}

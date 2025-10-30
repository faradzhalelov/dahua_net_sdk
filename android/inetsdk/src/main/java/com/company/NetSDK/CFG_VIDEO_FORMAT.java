package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Format
 * \else
 * 视频格式
 * \endif
 */
public class CFG_VIDEO_FORMAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Capacity 
	 * \else
	 * 能力
	 * \endif
	 */
	public boolean				abCompression;
	public boolean				abWidth;
	public boolean				abHeight;
	public boolean				abBitRateControl;
	public boolean				abBitRate;
	public boolean				abFrameRate;
	public boolean				abIFrameInterval;
	public boolean				abImageQuality;
	public boolean				abFrameType;
	public boolean				abProfile;

	/**
	 * \if ENGLISH_LANG
	 * Compression Format , refer to {@link CFG_VIDEO_COMPRESSION}
	 * \else
	 * 视频压缩格式, 取值参考 {@link CFG_VIDEO_COMPRESSION}
	 * \endif
	 */
	public int					emCompression;			

	/**
	 * \if ENGLISH_LANG
	 * Video Width
	 * \else
	 * 视频宽度
	 * \endif
	 */
	public int					nWidth;						

	/**
	 * \if ENGLISH_LANG
	 * Video Height 
	 * \else
	 * 视频高度
	 * \endif
	 */
	public int					nHeight;					

	/**
	 * \if ENGLISH_LANG
	 * Bit Rate Control, refer to {@link CFG_BITRATE_CONTROL}
	 * \else
	 * 码流控制模式, 取值参考 {@link CFG_BITRATE_CONTROL}
	 * \endif
	 */
	public int					emBitRateControl;			

	/**
	 * \if ENGLISH_LANG
	 * Bit Rate(kbps) 
	 * \else
	 * 视频码流(kbps)
	 * \endif
	 */
	public int					nBitRate;					

	/**
	 * \if ENGLISH_LANG
	 * Frame Rate 
	 * \else
	 * 视频帧率
	 * \endif
	 */
	public float				nFrameRate;					

	/**
	 * \if ENGLISH_LANG
	 * I Frame Interval 
	 * \else
	 * I帧间隔(1-100)，比如50表示每49个B帧或P帧，设置一个I帧。
	 * \endif
	 */
	public int					nIFrameInterval;			

	/**
	 * \if ENGLISH_LANG
	 * Image Quality（VBR, value：1-6 6：best image quality, refer to {@link CFG_IMAGE_QUALITY}
	 * \else
	 * 图像质量, 取值参考 {@link CFG_IMAGE_QUALITY}
	 * \endif
	 */
	public int					emImageQuality;				

	/**
	 * \if ENGLISH_LANG
	 * Frame Type 0－DHAV，1－"PS"
	 * \else
	 * 打包模式.0－DHAV，1－"PS"
	 * \endif
	 */
	public int					nFrameType;					

	/**
	 * \if ENGLISH_LANG
	 * CFG_H264_PROFILE_RANK, refer to {@link CFG_H264_PROFILE_RANK}
	 * \else
	 * H.264编码级别, 取值参考 {@link CFG_H264_PROFILE_RANK}
	 * \endif
	 */
	public int					emProfile;                
}

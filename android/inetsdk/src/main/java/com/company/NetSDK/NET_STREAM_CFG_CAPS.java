package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream config corresponding capacity
 * \else
 * 码流配置对应能力
 * \endif
 */
public class NET_STREAM_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * supported audio encode type，see {@link SDK_TALK_CODING_TYPE}
	 * \else
	 * 支持的音频编码类型，详见 {@link SDK_TALK_CODING_TYPE}
	 * \endif
	 */
	public int                 nAudioCompressionTypes[] = new int[FinalVar.SDK_MAX_AUDIO_ENCODE_TYPE];
	
	/**
	 * \if ENGLISH_LANG
	 * audio compression quantity
	 * \else
	 * 音频压缩格式个数
	 * \endif
	 */
	public int                 nAudioCompressionTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * video encode mode mask，see "encode mode"
	 * \else
	 * 视频编码模式掩码，详见"编码模式"
	 * \endif
	 */
	public int                 dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * supportedvideo resolution, discard
	 * \else
	 * 支持的视频分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolutionTypes[] = new SDK_RESOLUTION_INFO[FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * different resolution max frame, subscript nResolutionTypescorresponding
	 * \else
	 * 不同分辨率下帧率最大值，下标与nResolutionTypes对应
	 * \endif
	 */
	public int                 nResolutionFPSMax[] = new int[FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * video resolution quantity
	 * \else
	 * 视频分辨率个数
	 * \endif
	 */
	public int                 nResolutionTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * max video stream(kbps)
	 * \else
	 * 最大视频码流(kbps)
	 * \endif
	 */
	public int                 nMaxBitRateOptions; 
	
	/**
	 * \if ENGLISH_LANG
	 * min video stream(kbps)
	 * \else
	 * 最小视频码流(kbps)
	 * \endif
	 */
	public int                 nMinBitRateOptions;
	
	/**
	 * \if ENGLISH_LANG
	 * supported的H.264 Profile level,refer to enumeration type {@link EM_H264_PROFILE_RANK};
	 * \else
	 * 支持的H.264 Profile等级，参照枚举类型 {@link EM_H264_PROFILE_RANK};
	 * \endif
	 */
	public byte                bH264ProfileRank[] = new byte[EM_H264_PROFILE_RANK.SDK_PROFILE_HIGH];
	
	/**
	 * \if ENGLISH_LANG
	 * supported H.264 Profile level
	 * \else
	 * 支持的H.264 Profile等级个数
	 * \endif
	 */
	public int                 nH264ProfileRankNum;
	
	/**
	 * \if ENGLISH_LANG
	 * when resolution is  cif, max p frame(Kbps)
	 * \else
	 * 当分辨率为cif时最大p帧(Kbps)
	 * \endif
	 */
	public int                 nCifPFrameMaxSize;
	
	/**
	 * \if ENGLISH_LANG
	 * when currentresolution is cif, min p frame(Kbps)
	 * \else
	 * 当分辨率为cif时最小p帧(Kbps)
	 * \endif
	 */
	public int                 nCifPFrameMinSize;
	
	/**
	 * \if ENGLISH_LANG
	 * video max frame rate，as 0 ，make nResolutionFPSMax as standard
	 * \else
	 * 视频帧率最大值，为0时，以nResolutionFPSMax为准
	 * \endif
	 */
	public int                 nFPSMax;
	
	/**
	 * \if ENGLISH_LANG
	 * supportedvideo resolution
	 * \else
	 * 支持的视频分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuIndivResolutionTypes[][] = new SDK_RESOLUTION_INFO[FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM][FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * 0: stuResolutionTypes is valid 1: stuIndivResolutionTypes is valid
	 * \else
	 * 0: stuResolutionTypes,nResolutionTypeNum 有效
	 * \endif
	 */
	public boolean             abIndivResolution;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 不同编码模式分别支持的视频分辨率个数
	 * \endif
	 */
	public int                 nIndivResolutionNums[] = new int[FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM];
	
	public NET_STREAM_CFG_CAPS() {
		for (int i = 0; i < FinalVar.SDK_MAX_CAPTURE_SIZE_NUM; i++) {
			stuResolutionTypes[i] = new SDK_RESOLUTION_INFO();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM; i++) {
			for (int j = 0; j < FinalVar.SDK_MAX_CAPTURE_SIZE_NUM; j++) {
				stuIndivResolutionTypes[i][j] = new SDK_RESOLUTION_INFO();
			}
		}
	}
}

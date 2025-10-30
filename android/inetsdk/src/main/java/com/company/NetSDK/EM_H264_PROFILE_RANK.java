package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * H264 profile rank
 * \else
 * H264 编码级别
 * \endif
 */
public class EM_H264_PROFILE_RANK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * offer I/P frame, only support progressive and CAVLC
	 * \else
	 * 提供I/P帧，仅支持progressive(逐行扫描)和CAVLC
	 * \endif
	 */
	public static final int SDK_PROFILE_BASELINE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * offer I/P/B frame, support progressiv and interlaced,offer CAVLC and CABAC
	 * \else
	 * 提供I/P/B帧，支持progressiv和interlaced，提供CAVLC或CABAC
	 * \endif
	 */
	public static final int SDK_PROFILE_MAIN = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * offer I/P/B/SP/SI frame,only support progressive and CAVLC
	 * \else
	 * 提供I/P/B/SP/SI帧，仅支持progressive(逐行扫描)和CAVLC
	 * \endif
	 */
	public static final int SDK_PROFILE_EXTENDED = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * FRExt,base on Main_Profile:8x8 intra prediction, quant, lossless video coding, more yuv
	 * \else
	 * 即FRExt，Main_Profile基础上新增：8x8 intra prediction(8x8 帧内预测), 
	 * quant(自定义量化), lossless video coding(无损视频编码), 更多的yuv格式
	 * \endif
	 */
	public static final int SDK_PROFILE_HIGH = 4;
}

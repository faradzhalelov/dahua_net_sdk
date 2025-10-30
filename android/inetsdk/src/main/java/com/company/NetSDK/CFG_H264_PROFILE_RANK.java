package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * H264 code level
 * \else
 * H264 编码级别
 * \endif
 */
public class CFG_H264_PROFILE_RANK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P frame，only support progressive and CAVLC
	 * \else
	 * 提供I/P帧，仅支持progressive(逐行扫描)和CAVLC
	 * \endif
	 */
	public static final int PROFILE_BASELINE = 1;                       

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P/B frame，support progressiv and interlaced，provide CAVLC or CABAC
	 * \else
	 * 提供I/P/B帧，支持progressiv和interlaced，提供CAVLC或CABAC
	 * \endif
	 */
	public static final int PROFILE_MAIN = 2;                               

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P/B/SP/SI frame, only support progressive and CAVLC
	 * \else
	 * 提供I/P/B/SP/SI帧，仅支持progressive(逐行扫描)和CAVLC
	 * \endif
	 */
	public static final int PROFILE_EXTENDED = 3;                           

	/**
	 * \if ENGLISH_LANG
	 * As FRExt，Main_Profile new：8x8 intra prediction(8x8 frame forecast), 
	 * quant(custom), lossless video coding, more yuv formats
	 * \else
	 * 即FRExt，Main_Profile基础上新增：8x8 intra prediction(8x8 帧内预测), custom\n
	 * quant(自定义量化), lossless video coding(无损视频编码), 更多的yuv格式
	 * \endif
	 */
	public static final int PROFILE_HIGH = 4;                               
												
}

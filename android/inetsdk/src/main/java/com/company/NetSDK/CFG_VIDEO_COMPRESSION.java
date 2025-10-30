package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Compression Format 
 * \else
 * 视频压缩格式
 * \endif
 */
public class CFG_VIDEO_COMPRESSION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * MPEG4
	 * \else
	 * MPEG4
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_MPEG4 = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * MS-MPEG4
	 * \else
	 * MS-MPEG4
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_MS_MPEG4 = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * MPEG2
	 * \else
	 * MPEG2
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_MPEG2 = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * MPEG1
	 * \else
	 * MPEG1
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_MPEG1 = 3;

	/**
	 * \if ENGLISH_LANG
	 * H.263
	 * \else
	 * H.263
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_H263 = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * MJPG
	 * \else
	 * MJPG
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_MJPG = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * FCC-MPEG4
	 * \else
	 * FCC-MPEG4
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_FCC_MPEG4 = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * H.264
	 * \else
	 * H.264
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_H264 = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * H.265
	 * \else
	 * H.265
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_H265 = 8;

	/**
	 * \if ENGLISH_LANG
	 * SVAC
	 * \else
	 * SVAC
	 * \endif
	 */
	public static final int     VIDEO_FORMAT_SVAC = 9;
}

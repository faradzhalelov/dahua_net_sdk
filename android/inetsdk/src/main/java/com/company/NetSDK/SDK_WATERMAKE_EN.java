package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The structure of the image watermarking capabilities
 * \else
 * 图象水印能力结构体
 * \endif
 */
public class SDK_WATERMAKE_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1 support; 0 does not support.
	 * \else
	 * 1 支持;0 不支持
	 * \endif
	 */
	public char		isSupportWM;
	
	/**
	 * \if ENGLISH_LANG
	 * 0: text watermark; 1: picture watermark; 2: supports both text watermark and image watermark
	 * \else
	 * 0:文字水印;1:图片水印;2:同时支持文字水印和图片水印
	 * \endif
	 */
	public char		supportWhat;
}

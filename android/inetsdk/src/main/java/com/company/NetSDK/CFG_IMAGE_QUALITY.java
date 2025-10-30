package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Quality
 * \else
 * 画质
 * \endif
 */
public class CFG_IMAGE_QUALITY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Caputre Quality 10%
	 * \else
	 * 图像质量10%
	 * \endif
	 */
	public static final int     IMAGE_QUALITY_Q10 = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Caputre Quality 30%
	 * \else
	 * 图像质量30%
	 * \endif
	 */
	public static final int     IMAGE_QUALITY_Q30 = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Caputre Quality 50%
	 * \else
	 * 图像质量50%
	 * \endif
	 */
	public static final int     IMAGE_QUALITY_Q50 = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Caputre Quality 60%
	 * \else
	 * 图像质量60%
	 * \endif
	 */
	public static final int     IMAGE_QUALITY_Q60 = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Caputre Quality 80%r
	 * \else
	 * 图像质量80%
	 * \endif
	 */
	public static final int     IMAGE_QUALITY_Q80 = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Caputre Quality 100%
	 * \else
	 * 图像质量100%
	 * \endif
	 */
	public static final int     IMAGE_QUALITY_Q100 = 6;
}

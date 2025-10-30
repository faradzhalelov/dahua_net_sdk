package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * image info
 * \else
 * 图片信息
 * \endif
 */
public class DEV_ACCESS_CTL_IMAGE_INFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Image type {@link EM_ACCESS_CTL_IMAGE_TYPE}
	 * \else
	 * 图片类型 {@link EM_ACCESS_CTL_IMAGE_TYPE}
	 * \endif
	 */
	public int	emType;

	/**
	 * \if ENGLISH_LANG
	 * Offset in binary block
	 * \else
	 * 二进制块偏移字节
	 * \endif
	 */
	public int						nOffSet;

	/**
	 * \if ENGLISH_LANG
	 * Image size
	 * \else
	 * 图片大小
	 * \endif
	 */
	public int						nLength;

	/**
	 * \if ENGLISH_LANG
	 * Image width(Unit:pixel)
	 * \else
	 * 图片宽度(单位:像素)
	 * \endif
	 */
	public int						nWidth;

	/**
	 * \if ENGLISH_LANG
	 * Image height(Unit:pixel)
	 * \else
	 * 图片高度(单位:像素)
	 * \endif
	 */
	public int						nHeight;
}

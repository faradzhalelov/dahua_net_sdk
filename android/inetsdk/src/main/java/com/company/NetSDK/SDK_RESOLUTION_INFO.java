package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Pic resolution 
 * \else
 * 图片分辨率
 * \endif
 */
public class SDK_RESOLUTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Width
	 * \else
	 * 宽
	 * \endif
	 */
	public short   snWidth;
	
	/**
	 * \if ENGLISH_LANG
	 * Hight
	 * \else
	 * 高
	 * \endif
	 */
	public short   snHight;
}

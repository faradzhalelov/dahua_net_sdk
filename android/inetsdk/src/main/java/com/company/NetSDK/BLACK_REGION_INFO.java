package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD Black Border
 * \else
 * OSD黑边
 * \endif
 */
public class BLACK_REGION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Black border height, range:0 ~ ( 8192-original height)
	 * \else
	 * 黑边高度 取值范围：0 ~ ( 8192-原图片高度)
	 * \endif
	 */
	public int nHeight;			
	
	/**
	 * \if ENGLISH_LANG
	 * Black border 0=unknown , 1=top , 2=bottom
	 * \else
	 * 黑边位置 0=未知 , 1=顶部 , 2=底部
	 * \endif
	 */
	public int nOSDPosition;		
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * face image comparative data
 * \else
 * 目标图片比较信息
 * \endif
 */
public class NET_IMAGE_COMPARE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * original width
	 * \else
	 * 图片宽度
	 * \endif
	 */
	public int					dwWidth;		
	
	/**
	 * \if ENGLISH_LANG
	 * original height
	 * \else
	 * 图片高度
	 * \endif
	 */
	public int					dwHeight;		
	
	
}

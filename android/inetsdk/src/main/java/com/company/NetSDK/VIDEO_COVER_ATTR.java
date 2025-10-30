package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Privacy mask info
 * \else
 * 遮挡信息
 * \endif
 */
public class VIDEO_COVER_ATTR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask area coordinates
	 * \else
	 * 覆盖的区域坐标
	 * \endif
	 */
	public SDK_RECT             rcBlock = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask color
	 * \else
	 * 覆盖的颜色
	 * \endif
	 */
	public int                 nColor;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask mode；0: black block,1: Mosaic
	 * \else
	 * 覆盖方式；0：黑块，1：马赛克
	 * \endif
	 */
	public byte                bBlockType;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask when encode；1：Enable,0：Unable
	 * \else
	 * 编码级遮挡；1：生效，0：不生效
	 * \endif
	 */
	public byte                bEncode;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask when preview； 1：Enable,0：Unable
	 * \else
	 * 预览遮挡； 1：生效，0：不生效
	 * \endif
	 */
	public byte                bPriview;
}

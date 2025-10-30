package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone
 * \else
 * 区域
 * \endif
 */
public class AV_CFG_Rect implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * left
	 * \else
	 * 左
	 * \endif
	 */
	public int		nLeft;
	
	/**
	 * \if ENGLISH_LANG
	 * Top
	 * \else
	 * 上
	 * \endif
	 */
	public int		nTop;

	/**
	 * \if ENGLISH_LANG
	 * Right
	 * \else
	 * 右
	 * \endif
	 */
	public int		nRight;
	
	/**
	 * \if ENGLISH_LANG
	 * Bottom
	 * \else
	 * 下
	 * \endif
	 */
	public int		nBottom;	
}

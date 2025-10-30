package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rectangle Information
 * \else
 * 区域信息
 * \endif
 */
public class CFG_RECT implements Serializable {
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
	public int					nLeft;
	/**
	 * \if ENGLISH_LANG
	 * top
	 * \else
	 * 上
	 * \endif
	 */
	public int					nTop;
	/**
	 * \if ENGLISH_LANG
	 * right
	 * \else
	 * 右
	 * \endif
	 */
	public int					nRight;
	
	/**
	 * \if ENGLISH_LANG
	 * bottom
	 * \else
	 * 下
	 * \endif
	 */
	public int					nBottom;	
}

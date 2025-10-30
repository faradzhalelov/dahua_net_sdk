package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RGB Information
 * \else
 * RGBA信息
 * \endif
 */
public class CFG_RGBA implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * red
	 * \else
	 * 红
	 * \endif
	 */
	public int					nRed;
	
	/**
	 * \if ENGLISH_LANG
	 * green
	 * \else
	 * 绿
	 * \endif
	 */
	public int					nGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * blue
	 * \else
	 * 蓝
	 * \endif
	 */
	public int					nBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * alpha
	 * \else
	 * 透明
	 * \endif
	 */
	public int					nAlpha;
}

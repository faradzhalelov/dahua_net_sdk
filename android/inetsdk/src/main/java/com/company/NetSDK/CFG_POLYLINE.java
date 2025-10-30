package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Line point info
 * \else
 * 折线的端点信息
 * \endif
 */
public class CFG_POLYLINE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Abscissa 0~8191
	 * \else
	 * 横坐标 0~8191
	 * \endif
	 */
	public int					nX;
	
	/**
	 * \if ENGLISH_LANG
	 * Ordinate 0~8191
	 * \else
	 * 纵坐标 0~8191
	 * \endif
	 */
	public int					nY;
}

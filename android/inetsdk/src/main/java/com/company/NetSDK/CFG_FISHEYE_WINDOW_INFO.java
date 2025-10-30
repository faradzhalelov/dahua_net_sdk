package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye window location info
 * \else
 * 鱼眼窗口位置信息
 * \endif
 */
public class CFG_FISHEYE_WINDOW_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * 窗口ID
	 * \endif
	 */
	public int               dwWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz, focus x axis
	 * \else
	 * EPtz（电子云台）的焦点横坐标
	 * \endif
	 */
	public int               nFocusX;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz, focus y axis   
	 * \else
	 * EPtz (电子云台）的焦点纵坐标
	 * \endif
	 */
	public int               nFocusY;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz h-angle
	 * \else
	 * EPtz的水平角度
	 * \endif
	 */
	public int               nHorizontalAngle;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz v-angle
	 * \else
	 * EPtz的垂直角度
	 * \endif
	 */
	public int               nVerticalAngle;
}

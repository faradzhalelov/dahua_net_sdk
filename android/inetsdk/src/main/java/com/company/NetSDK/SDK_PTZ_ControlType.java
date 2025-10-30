package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General PTZ control command
 * \else
 * 通用云台控制命令
 * \endif
 */
public class SDK_PTZ_ControlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Up
	 * \else
	 * 上
	 * \endif
	 */
	public static final int     SDK_PTZ_UP_CONTROL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Down
	 * \else
	 * 下
	 * \endif
	 */
	public static final int     SDK_PTZ_DOWN_CONTROL = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Left
	 * \else
	 * 左
	 * \endif
	 */
	public static final int     SDK_PTZ_LEFT_CONTROL = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Right
	 * \else
	 * 右
	 * \endif
	 */
	public static final int     SDK_PTZ_RIGHT_CONTROL = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * +Zoom in 
	 * \else
	 * 变倍+
	 * \endif
	 */
	public static final int     SDK_PTZ_ZOOM_ADD_CONTROL = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * -Zoom out
	 * \else
	 * 变倍-
	 * \endif
	 */
	public static final int     SDK_PTZ_ZOOM_DEC_CONTROL = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * -Zoom in
	 * \else
	 * 调焦-
	 * \endif
	 */
	public static final int     SDK_PTZ_FOCUS_ADD_CONTROL = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * +Zoom out
	 * \else
	 * 调焦+
	 * \endif
	 */
	public static final int     SDK_PTZ_FOCUS_DEC_CONTROL = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * + Aperture 
	 * \else
	 * 光圈+
	 * \endif
	 */
	public static final int     SDK_PTZ_APERTURE_ADD_CONTROL = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * - Aperture
	 * \else
	 * 光圈-
	 * \endif
	 */
	public static final int     SDK_PTZ_APERTURE_DEC_CONTROL = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Go to preset 
	 * \else
	 * 转至预置点
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_MOVE_CONTROL = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Set
	 * \else
	 * 设置
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_SET_CONTROL = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete
	 * \else
	 * 删除
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_DEL_CONTROL = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * Tour
	 * \else
	 * 点间巡航
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_LOOP_CONTROL = 13;
	
	/**
	 * \if ENGLISH_LANG
	 * Light and wiper 
	 * \else
	 * 灯光雨刷
	 * \endif
	 */
	public static final int     SDK_PTZ_LAMP_CONTROL = 14;
}

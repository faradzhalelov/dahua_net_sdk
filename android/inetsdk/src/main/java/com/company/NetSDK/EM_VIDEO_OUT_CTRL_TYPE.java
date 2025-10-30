package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video output control method
 * \else
 * 视频输出控制方式
 * \endif
 */
public class EM_VIDEO_OUT_CTRL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Logic channel no. control method, for physical screen and splicing screen both valid
	 * \else
	 * 逻辑通道号控制方式, 对物理屏和拼接屏都有效
	 * \endif
	 */
	public static final int     EM_VIDEO_OUT_CTRL_CHANNEL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID control method,for splicing screen only
	 * \else
	 * 拼接屏ID控制方式, 只对拼接屏有效
	 * \endif
	 */
	public static final int     EM_VIDEO_OUT_CTRL_COMPOSITE_ID = 1;
}

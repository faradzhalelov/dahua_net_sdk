package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * 轮巡控制类型
 * \endif
 */
public class DEC_CTRL_TOUR_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * stop
	 * \else
	 * 停止
	 * \endif
	 */
	public static final int     Dec_Tour_Stop = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * start
	 * \else
	 * 开始
	 * \endif
	 */
	public static final int     Dec_Tour_Start = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * pause
	 * \else
	 * 暂停
	 * \endif
	 */
	public static final int     Dec_Tour_Pause = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * resume
	 * \else
	 * 恢复
	 * \endif
	 */
	public static final int     Dec_Tour_Resume = 3;
}

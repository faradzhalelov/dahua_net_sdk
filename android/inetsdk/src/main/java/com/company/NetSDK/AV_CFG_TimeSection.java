package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Period
 * \else
 * 时间段
 * \endif
 */
public class AV_CFG_TimeSection implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Sub Mask
	 * \else
	 * 掩码
	 * \endif
	 */
	public int			nMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin hour
	 * \else
	 * 开始时间
	 * \endif
	 */
	public int			nBeginHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin minute
	 * \else
	 * 开始 分钟
	 * \endif
	 */
	public int			nBeginMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin second
	 * \else
	 * 开始秒
	 * \endif
	 */
	public int			nBeginSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * End hour
	 * \else
	 * 结束时间
	 * \endif
	 */
	public int			nEndHour;
	
	/**
	 * \if ENGLISH_LANG
	 * End minute
	 * \else
	 * 结束 分钟
	 * \endif
	 */
	public int			nEndMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * End second
	 * \else
	 * 结束 秒
	 * \endif
	 */
	public int			nEndSecond;
}

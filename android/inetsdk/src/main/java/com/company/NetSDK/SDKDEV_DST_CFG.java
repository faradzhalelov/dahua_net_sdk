package com.company.NetSDK;

import java.io.Serializable;


public class SDKDEV_DST_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DST position way. 0: position in date  , 1:position in week
	 * \else
	 * 夏令时定位方式 0:按日期定位方式, 1:按周定位方式
	 * \endif
	 */
	public int                 nDSTType;

	/**
	 * \if ENGLISH_LANG
	 * Enable DTS
	 * \else
	 * 开始夏令时
	 * \endif
	 */
	public SDK_DST_POINT        stDSTStart = new SDK_DST_POINT();

	/**
	 * \if ENGLISH_LANG
	 * End DTS
	 * \else
	 * 结束夏令时
	 * \endif
	 */
	public SDK_DST_POINT        stDSTEnd = new SDK_DST_POINT();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * cascading order window
 * \else
 * 窗口层叠次序
 * \endif
 */
public class SDK_WND_ZORDER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * 窗口序号
	 * \endif
	 */
	public int				nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * Z次序
	 * \endif
	 */
	public int				nZOrder;
}

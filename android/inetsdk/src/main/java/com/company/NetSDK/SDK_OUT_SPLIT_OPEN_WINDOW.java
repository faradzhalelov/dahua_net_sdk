package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OpenSplitWindow} 's interface output param(open window)
 * \else
 * {@link INetSDK#OpenSplitWindow} 接口输出参数(开窗)
 * \endif
 */
public class SDK_OUT_SPLIT_OPEN_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Window ID
	 * \else
	 * 窗口序号
	 * \endif
	 */
	public int			nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Wndow order	
	 * \else
	 * 窗口次序
	 * \endif
	 */
	public int			nZOrder;
}

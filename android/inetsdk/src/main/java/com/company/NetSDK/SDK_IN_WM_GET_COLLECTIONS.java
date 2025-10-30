package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMonitorWallCollections} 's interface input param(get plan infomation of monitor wall)
 * \else
 * {@link INetSDK#GetMonitorWallCollections} 接口输入参数(获取电视墙预案信息)
 * \endif
 */
public class SDK_IN_WM_GET_COLLECTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor wall ID
	 * \else
	 * 电视墙ID
	 * \endif
	 */
	public int					nMonitorWallID;				
}

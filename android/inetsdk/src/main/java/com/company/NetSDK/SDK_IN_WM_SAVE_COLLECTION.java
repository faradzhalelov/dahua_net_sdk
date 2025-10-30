package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SaveMonitorWallCollection} 's interface input param(save monitor wall plans)
 * \else
 * {@link INetSDK#SaveMonitorWallCollection} 接口输入参数(保存电视墙预案)
 * \endif
 */
public class SDK_IN_WM_SAVE_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor wall ID
	 * \else
	 * 电视墙序号
	 * \endif
	 */
	public int					nMonitorWallID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name pf plan
	 * \else
	 * 预案名称
	 * \endif
	 */
	public String				pszName;
}

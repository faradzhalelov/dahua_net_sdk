package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#PowerControl} 's interface input param(monitor wall power control)
 * \else
 * {@link INetSDK#PowerControl} 接口输入参数(电视墙电源控制)
 * \endif
 */
public class SDK_IN_WM_POWER_CTRL implements Serializable {
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
	 * Block ID, NULL/""- means all
	 * \else
	 * 区块ID, NULL/""-所有区块
	 * \endif
	 */
	public String				pszBlockID;
	
	/**
	 * \if ENGLISH_LANG
	 * TV ID, -1 means all
	 * \else
	 * 显示单元序号, -1表示区块中所有显示单元
	 * \endif
	 */
	public int					nTVID;
	
	/**
	 * \if ENGLISH_LANG
	 * Power on or not
	 * \else
	 * 是否打开电源
	 * \endif
	 */
	public boolean				bPowerOn;
}

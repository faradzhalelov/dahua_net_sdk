package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#MonitorWallGetScene} 's interface input param(get monitor wall scene)
* \else
* {@link INetSDK#MonitorWallGetScene} 接口输入参数(获取电视墙场景)
* \endif
*/
public class SDK_IN_MONITORWALL_GET_SCENE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * monitor wall ID
	 * \else
	 * 电视墙序号
	 * \endif
	 */
    public int                     nMonitorWallID;                 
}

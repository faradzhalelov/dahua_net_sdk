package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#MonitorWallSetScene} 's interface input param(set monitor wall scene)
* \else
* {@link INetSDK#MonitorWallSetScene} 接口输入参数(设置电视墙场景)
* \endif
*/
public class SDK_IN_MONITORWALL_SET_SCENE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * TV Wall No. 
	 * \else
	 * 电视墙序号
	 * \endif
	 */
    public int                     nMonitorWallID;                
    
	 /**
	 * \if ENGLISH_LANG
	 * TV Wall Scene
	 * \else
	 * 电视墙场景
	 * \endif
	 */
    public SDK_MONITORWALL_SCENE   stuScene;                      
}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#MonitorWallGetScene} 's interface output param(get monitor wall scene)
* \else
* {@link INetSDK#MonitorWallGetScene} 接口输出参数(获取电视墙场景)
* \endif
*/
public class SDK_OUT_MONITORWALL_GET_SCENE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * name of plan, can be null
	 * \else
	 * 当前预案名称, 可以为空
	 * \endif
	 */
    public byte[]           szName = new byte[FinalVar.SDK_DEV_NAME_LEN];
   
	 /**
	 * \if ENGLISH_LANG
	 * minotor wall scene
	 * \else
	 * 电视墙场景
	 * \endif
	 */
    public SDK_MONITORWALL_SCENE    stuScene;                      	 
}

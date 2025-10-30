package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateMonitorWall} input parameter =>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_SET_ENABLE}
 * \else
 * {@link INetSDK#OperateMonitorWall} 接口输入参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_SET_ENABLE}
 * \endif
 */
public class NET_IN_MONITORWALL_SET_ENABLE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall quantity to set
	 * \else
	 * 要设置的电视墙数量
	 * \endif
	 */
	public int                 nMonitorWallNum;                
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall enable 
	 * \else
	 * 电视墙使能
	 * \endif
	 */
	public NET_MONITORWALL_ENABLE_INFO[] stuEnable = new NET_MONITORWALL_ENABLE_INFO[FinalVar.SDK_MAX_MONITORWALL_NUM];  

	public NET_IN_MONITORWALL_SET_ENABLE() {
		for(int i = 0; i < FinalVar.SDK_MAX_MONITORWALL_NUM; ++i) {
			stuEnable[i] = new NET_MONITORWALL_ENABLE_INFO();
		}	
	}
}

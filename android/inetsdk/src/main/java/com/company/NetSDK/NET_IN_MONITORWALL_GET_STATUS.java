package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateMonitorWall} input parameter=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_STATUS}
 * \else
 * {@link INetSDK#OperateMonitorWall} 接口输入参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_STATUS}
 * \endif
 */
public class NET_IN_MONITORWALL_GET_STATUS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                nChannel;                        

}

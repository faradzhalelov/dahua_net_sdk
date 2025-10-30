package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateMonitorWall} input parameter =>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_NAME_EXIST}
 * \else
 * {@link INetSDK#OperateMonitorWall} 接口输入参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_NAME_EXIST}
 * \endif
 */
public class NET_IN_MONITORWALL_NAME_EXIST implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitorwall name
	 * \else
	 * 电视墙名称
	 * \endif
	 */
  	public String         pszName;                        

}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#OperateMonitorWall} output parameter =>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_NAME_EXIST}
* \else
* {@link INetSDK#OperateMonitorWall} 接口输出参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_NAME_EXIST}
* \endif
*/
public class NET_OUT_MONITORWALL_NAME_EXIST implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * tv wall exists or not
	 * \else
	 * 电视墙是否已存在
	 * \endif
	 */
	public boolean                bExist;                        

}

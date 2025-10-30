package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#OperateMonitorWall} output parameter=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_STATUS}
* \else
* {@link INetSDK#OperateMonitorWall} 接口输出参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_STATUS}
* \endif
*/
public class NET_OUT_MONITORWALL_GET_STATUS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * operation status, refer to {@link NET_MATRIX_STATUS}
	 * \else
	 * 运行状态 ,取值参考 {@link NET_MATRIX_STATUS}
	 * \endif
	 */
    public int                emMatrixStatus;     
    
	 /**
	 * \if ENGLISH_LANG
	 * status info
	 * \else
	 * 状态信息
	 * \endif
	 */
    public NET_MONITORWALL_STATUS_INFO     stuStatusInfo = new NET_MONITORWALL_STATUS_INFO();
}

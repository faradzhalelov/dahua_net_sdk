package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateMonitorWall} input parameter =>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_ENABLE}
 * \else
 * {@link INetSDK#OperateMonitorWall} 接口输入参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_ENABLE}
 * \endif
 */
public class NET_IN_MONITORWALL_GET_ENABLE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall quantity to search, -1 means search alltv wall
	 * \else
	 * 要查询的电视墙数量, -1表示查询所有电视墙
	 * \endif
	 */
    public int                 nMonitorWallNum;                
    
    /**
     * \if ENGLISH_LANG
     * tv wall  name , nMonitorWallNum>0 is valid 
     * \else
     * 电视墙名称, nMonitorWallNum>0时有效
     * \endif
     */
    public byte[][]            szNames = new byte[FinalVar.SDK_MAX_MONITORWALL_NUM][FinalVar.SDK_COMMON_STRING_128];  
}

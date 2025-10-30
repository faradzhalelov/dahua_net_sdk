package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateMonitorWall} input parameter =>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_REMOVE}
 * \else
 * {@link INetSDK#OperateMonitorWall} 接口输入参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_REMOVE}
 * \endif
 */
public class NET_IN_MONITORWALL_REMOVE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall quantity to delete
	 * \else
	 * 要删除的电视墙数量
	 * \endif
	 */
    public int                 nMonitorWallNum;                
    
    /**
     * \if ENGLISH_LANG
     * tv wall  name
     * \else
     * 电视墙名称
     * \endif
     */
    public byte[][]            szNames = new byte[FinalVar.SDK_MAX_MONITORWALL_NUM][FinalVar.SDK_COMMON_STRING_128];  

}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateMonitorWall} input parameter=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_CTRL_TOUR}
 * \else
 * {@link INetSDK#OperateMonitorWall} 接口输入参数=> {@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_CTRL_TOUR}
 * \endif
 */
public class NET_IN_CTRL_COLLECTIONTOUR implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                nChannel;                       
    
    /**
     * \if ENGLISH_LANG
     * tour action, 0:ebd, 1:start
     * \else
     * 轮巡动作, 0:结束, 1:开始
     * \endif
     */
    public int                nAction;                        
}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#OperateMonitorWall} input parameter=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_COLL_SCHD}
* \else
* {@link INetSDK#OperateMonitorWall} 接口输出参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_COLL_SCHD}
* \endif
*/
public class NET_OUT_MONITORWALL_GET_COLL_SCHD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * scheme number
	 * \else
	 * 预案数
	 * \endif
	 */
    public int                 nCollectionNum;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * scheme schedule
	 * \else
	 * 预案时间表
	 * \endif
	 */
    public MONITORWALL_COLLECTION_SCHEDULE[] stuCollShedule = new MONITORWALL_COLLECTION_SCHEDULE[FinalVar.SDK_MAX_COLLECTION_NUM];  

    public NET_OUT_MONITORWALL_GET_COLL_SCHD() {
    	for(int i = 0; i < FinalVar.SDK_MAX_COLLECTION_NUM; ++i) {
    		stuCollShedule[i] = new MONITORWALL_COLLECTION_SCHEDULE();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_GET_CAMERA_STATE}
* \else
* 出参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_GET_CAMERA_STATE}
* \endif
*/
public class NET_OUT_GET_CAMERA_STATEINFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * valid number of camera channel state, returned by sdk
	 * \else
	 * 查询到的摄像机通道状态有效个数,由sdk返回
	 * \endif
	 */
    public int                         nValidNum;              
    
	 /**
	 * \if ENGLISH_LANG
	 * max number of array, filled in by user
	 * \else
	 * pCameraStateInfo 数组最大个数,由用户填写
	 * \endif
	 */
    public int                         nMaxNum;                
    
	 /**
	 * \if ENGLISH_LANG
	 * camera channel info array, distributed by user,apply to sizeof(NET_CAMERA_STATE_INFO)*nMaxNum
	 * \else
	 * 像机通道信息数组,由用户分配,大小为sizeof(NET_CAMERA_STATE_INFO)*nMaxNum
	 * \endif
	 */
    public NET_CAMERA_STATE_INFO       pCameraStateInfo[];       
    
    public NET_OUT_GET_CAMERA_STATEINFO(int nMaxNum) {
    	this.nMaxNum = nMaxNum;
    	pCameraStateInfo = new NET_CAMERA_STATE_INFO[nMaxNum];
    	for (int i = 0; i < nMaxNum; i++) {
    		pCameraStateInfo[i] = new NET_CAMERA_STATE_INFO();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * Video storage point mapping info, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_RECORD_STORAGEPOINT}
 * \else
 * 录像存储点映射配置信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_RECORD_STORAGEPOINT}
 * \endif
 */
public class CFG_RECORDTOSTORAGEPOINT_INFO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * storage point number
	 * \else
	 * 存储点数目
	 * \endif
	 */
	public int nStoragePointNum;
	
	/**
	 * \if ENGLISH_LANG
	 * storage point info
	 * \else
	 * 存储点配置信息 
	 * \endif
	 */
	public CFG_STORAGEPOINT_INFO[] stStoragePoints = new CFG_STORAGEPOINT_INFO[FinalVar.MAX_STORAGEPOINT_NUM];
	
	public CFG_RECORDTOSTORAGEPOINT_INFO(){
		for(int i=0;i<FinalVar.MAX_STORAGEPOINT_NUM;i++){
			stStoragePoints[i] = new CFG_STORAGEPOINT_INFO();
		}
	}
}

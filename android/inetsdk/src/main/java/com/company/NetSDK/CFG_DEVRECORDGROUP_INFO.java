package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_DEVRECORDGROUP}
 * \else
 * 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_DEVRECORDGROUP}
 * \endif
 */
public class CFG_DEVRECORDGROUP_INFO implements Serializable{
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channnel number
	 * \else
	 * 通道个数
	 * \endif
	 */
	public int                     nChannelNum;                          
	
	/**
	 * \if ENGLISH_LANG
	 * channel record state info
	 * \else
	 * 通道录像状态信息
	 * \endif
	 */
	public CFG_DEVRECORD_INFO[]     stuDevRecordInfo = new CFG_DEVRECORD_INFO[FinalVar.MAX_CHAN_NUM];  
	
	public CFG_DEVRECORDGROUP_INFO() {
		for(int i = 0; i < FinalVar.MAX_CHAN_NUM; i++) {
			stuDevRecordInfo[i] = new CFG_DEVRECORD_INFO();
		}
	}
}

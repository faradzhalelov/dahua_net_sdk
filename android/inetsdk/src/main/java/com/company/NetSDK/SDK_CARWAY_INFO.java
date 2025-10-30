package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Car way info
 * \else
 * 每个车道的相关信息
 * \endif
 */
public class SDK_CARWAY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current car way id 
	 * \else
	 * 当前车道号 
	 * \endif
	 */
	public byte                bCarWayID;
	
	/**
	 * \if ENGLISH_LANG
	 * Being snapshotted
	 * \else
	 * 被触发抓拍的个数
	 * \endif
	 */
	public byte                bSigCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The snapshot info
	 * \else
	 * 当前车道上，被触发抓拍对应的抓拍信息
	 * \endif
	 */
	public SDK_SIG_CARWAY_INFO  stuSigInfo[] = new SDK_SIG_CARWAY_INFO[FinalVar.SDK_MAX_SNAP_SIGNAL_NUM];
	
	public SDK_CARWAY_INFO() {
		for (int i=0 ; i<FinalVar.SDK_MAX_SNAP_SIGNAL_NUM; i++) {
			stuSigInfo[i] = new SDK_SIG_CARWAY_INFO();
		}
	}
}

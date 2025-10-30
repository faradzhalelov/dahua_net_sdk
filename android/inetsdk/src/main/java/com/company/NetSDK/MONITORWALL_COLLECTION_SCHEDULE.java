package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall scheme schedule
 * \else
 * 电视墙预案时间表
 * \endif
 */
public class MONITORWALL_COLLECTION_SCHEDULE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * schedule name
	 * \else
	 * 预案名称
	 * \endif
	 */
	public byte[] 			szName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];   
	
	/**
	 * \if ENGLISH_LANG
	 * schedule, first each element means sunday~Saturday and holiday
	 * \else
	 * 时间表, 第一维各元素表示周日~周六和节假日
	 * \endif
	 */
	public SDK_TSECT[][]    stuSchedule = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM];   

	public MONITORWALL_COLLECTION_SCHEDULE() {
		for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; ++i){
			for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; ++j) {
				stuSchedule[i][j] = new SDK_TSECT();
			}
		}
	}
}

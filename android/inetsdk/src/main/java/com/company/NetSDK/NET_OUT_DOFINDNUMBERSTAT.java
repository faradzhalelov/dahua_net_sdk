package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* interface {@link INetSDK#DoFindNumberStat} 's ouput param
* \else
* 接口 {@link INetSDK#DoFindNumberStat} 输出参数
* \endif
*/
public class NET_OUT_DOFINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * count
	 * \else
	 * 查询返回的人数统计信息个数
	 * \endif
	 */
	public int                 nCount;                         
	
	 /**
	 * \if ENGLISH_LANG
	 * state array, the space application by the user
	 * \else
	 * 返回的人数统计信息数组
	 * \endif
	 */
	public SDK_NUMBERSTAT      pstuNumberStat[];                 
    
    public NET_OUT_DOFINDNUMBERSTAT(int nMaxStat) {
    	pstuNumberStat = new SDK_NUMBERSTAT[nMaxStat];
    	for (int i = 0; i < nMaxStat; i++) {
    		pstuNumberStat[i] = new SDK_NUMBERSTAT();
    	}
    }
}

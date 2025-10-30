package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_RADIOMETRY_TEMPER}
* \else
* 入参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_DEV_RADIOMETRY_TEMPER}
* \endif
*/
public class NET_IN_RADIOMETRY_GETTEMPER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * acquire the temperature condition of ARGtemp_meas 
	 * \else
	 * 获取测温项温度的条件
	 * \endif
	 */
    public NET_RADIOMETRY_CONDITION    stCondition = new NET_RADIOMETRY_CONDITION();                
}

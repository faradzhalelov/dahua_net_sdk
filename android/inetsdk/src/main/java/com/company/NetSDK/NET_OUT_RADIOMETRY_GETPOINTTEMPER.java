package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER}
* \else
* 出参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER}
* \endif
*/
public class NET_OUT_RADIOMETRY_GETPOINTTEMPER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * acquire the parameter value of ARGtemp_meas spot
	 * \else
	 * 获取测温点的参数值
	 * \endif
	 */
    public NET_RADIOMETRYINFO  stPointTempInfo = new NET_RADIOMETRYINFO();                    

}

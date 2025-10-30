package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER}
 * \else
 * 入参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER}
 * \endif
 */
public class NET_IN_RADIOMETRY_GETPOINTTEMPER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                 nChannel;                           
    
	/**
	 * \if ENGLISH_LANG
	 * ARGtemp_meas spot coordinate, coordinate value 0~8192 
	 * \else
	 * 测温点的坐标,坐标值 0~8192
	 * \endif
	 */
    public SDK_POINT           stCoordinate = new SDK_POINT();     
}

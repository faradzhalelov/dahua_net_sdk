package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless network signal intensity structure,the corresponding interface {@link INetSDK#QueryDevState}, the corresponding command {@link FinalVar#SDK_DEVSTATE_NET_RSSI}
 * \else
 * 无线网络信号强度结构体,对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_NET_RSSI}
 * \endif
 */
public class SDKDEV_WIRELESS_RSS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TD-SCDMA intensity,range:0－100 
	 * \else
	 * TD-SCDMA强度,范围:0－100
	 * \endif
	 */
	public int				dwTDSCDMA;
	
	/**
	 * \if ENGLISH_LANG
	 * WCDMA intensity,range:0－100 
	 * \else
	 * WCDMA强度,范围:0－100
	 * \endif
	 */
	public int				dwWCDMA;
	
	/**
	 * \if ENGLISH_LANG
	 * CDMA1x intensity,intensity:0－100 
	 * \else
	 * CDMA1x强度,范围:0－100
	 * \endif
	 */
	public int				dwCDMA1x;
	
	/**
	 * \if ENGLISH_LANG
	 * EDGE intensity,range:0－100 
	 * \else
	 * EDGE强度,范围:0－100
	 * \endif
	 */
	public int				dwEDGE;
	
	/**
	 * \if ENGLISH_LANG
	 * EVDO intensity,range:0－100 
	 * \else
	 * EVDO强度,范围:0－100
	 * \endif
	 */
	public int				dwEVDO;
	
	/**
	 * \if ENGLISH_LANG
	 * Current type
	 * <pre>
	 *  0	Device does not support this item
	 *  1   TD-SCDMA
	 *  2	WCDMA
	 *  3	CDMA_1x
	 *  4	EDGE
	 *  5	EVDO
	 *  6	TD-LTE
	 *  </pre>
	 * \else
	 * 当前类型
	 * <pre>
	 *  0	设备不支持这一项
	 *  1   TD-SCDMA
	 *  2	WCDMA
	 *  3	CDMA_1x
	 *  4	EDGE
	 *  5	EVDO
	 *  6	TD-LTE
	 *  </pre>
	 * \endif
	 */
	public int				nCurrentType;
												
	/**
	 * \if ENGLISH_LANG
	 * TD-LTE intensity,range:0－100 
	 * \else
	 * TD-LTE强度,范围:0－100
	 * \endif
	 */
	public int				dwTDLTE;				
}

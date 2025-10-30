package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* get city and road code info, interface {@link INetSDK#QueryDevState}, corresponding to command {@link FinalVar#SDK_DEVSTATE_GET_ROAD_LIST}
* \else
* 获取城市及路段编码信息, {@link INetSDK#QueryDevState}接口, 对应命令{@link FinalVar#SDK_DEVSTATE_GET_ROAD_LIST}
* \endif
*/
public class NET_ROAD_LIST_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * city info
	 * \else
	 * 车辆所处的城市信息
	 * \endif
	 */
	public byte                     szCity[] = new byte[32];             
	
	 /**
	 * \if ENGLISH_LANG
	 * road code info
	 * \else
	 * 道路编码信息
	 * \endif
	 */
	public byte                     szRoadList[][] = new byte[2048][256];  
	
	 /**
	 * \if ENGLISH_LANG
	 * number of road code, first dimension of szRoadList
	 * \else
	 * 道路信息个数, 指示szRoadList的第1维
	 * \endif
	 */
	public int                      nRoadNum;               
}

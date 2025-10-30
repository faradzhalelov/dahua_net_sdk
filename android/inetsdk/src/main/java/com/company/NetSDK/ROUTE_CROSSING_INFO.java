package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Route crossing information, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_CTRL_ROUTE_CROSSING}
 * \else
 * 路线点位信息, 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_CTRL_ROUTE_CROSSING}
 * \endif
 */
public class ROUTE_CROSSING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * valid number is 1~{@link FinalVar#SDK_MAX_CROSSING_NUM}
	 * \else
	 * 路口有效数量范围1~{@link FinalVar#SDK_MAX_CROSSING_NUM}
	 * \endif
	 */
	public byte 			    byCrossingNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Crossing range(m)
	 * \else
	 * 定位精度范围单位m
	 * \endif
	 */
	public int                	wCrossingRange; 
	
	/**
	 * \if ENGLISH_LANG
	 * Crossing information struct array
	 * \else
	 * 路口信息最大支持128个路口
	 * \endif
	 */
	public CROSSING_INFO 	    stCrossingInfo[] 		= new CROSSING_INFO[FinalVar.SDK_MAX_CROSSING_NUM];
	
	public ROUTE_CROSSING_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_CROSSING_NUM; i++) {
			stCrossingInfo[i] = new CROSSING_INFO();
		}
	}
}

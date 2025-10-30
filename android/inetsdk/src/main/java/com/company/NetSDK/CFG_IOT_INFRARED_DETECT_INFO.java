package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of IOT infrared  detection, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_IOT_INFRARED_DETECT}
 * \else
 * 物联网红外检测配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_IOT_INFRARED_DETECT}
 * \endif
 */
public class CFG_IOT_INFRARED_DETECT_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable, it indicates whether to open the detection function
	 * \else
	 * 使能，表示是否开启检测
	 * \endif
	 */
	public boolean[]				bEnable = new boolean[FinalVar.MAX_AREA_COUNT];	
	
	/**
	 * \if ENGLISH_LANG
	 * detecting radius, unit:centimeter
	 * \else
	 * 检测半径，单位厘米
	 * \endif
	 */
	public int						nDetectRadius;							
}

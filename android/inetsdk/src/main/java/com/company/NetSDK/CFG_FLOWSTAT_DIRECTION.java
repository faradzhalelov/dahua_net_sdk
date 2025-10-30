package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Driving Direction
 * \else
 * 车行驶方向
 * \endif
 */
public class CFG_FLOWSTAT_DIRECTION implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Upstream, The vehicle is getting closer and closer to equipment deployment point
	 * \else
	 * 上行，即车辆离设备部署点越来越近
	 * \endif
	 */
	public static final int CFG_DRIVING_DIR_APPROACH = 0;	 
	
	/**
	 * \if ENGLISH_LANG
	 * Downstream, The vehicle is getting farther and farther to equipment deployment point
	 * \else
	 * 下行，即车辆离设备部署点越来越远
	 * \endif
	 */
	public static final int CFG_DRIVING_DIR_LEAVE    = 1;   
}

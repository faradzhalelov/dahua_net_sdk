package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Vehicle Flow Statistics Lane Direction Information
 * \else
 * 车辆流量统计车道方向信息
 * \endif
 */
public class CFG_TRAFFIC_FLOWSTAT_DIR_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Driving Direction, refer to {@link CFG_FLOWSTAT_DIRECTION}
	 * \else
	 * 行驶方向,对应  {@link CFG_FLOWSTAT_DIRECTION}
	 * \endif
	 */
	public int				emDrivingDir;										
	
	/**
	 * \if ENGLISH_LANG
	 * Upstream Location
	 * \else
	 * 上行地点 
	 * \endif
	 */
	public byte[]		    szUpGoing = new byte[FinalVar.CFG_FLOWSTAT_ADDR_NAME];	
	
	/**
	 * \if ENGLISH_LANG
	 * Downstream Location
	 * \else
	 * 下行地点
	 * \endif
	 */
	public byte[]			szDownGoing = new byte[FinalVar.CFG_FLOWSTAT_ADDR_NAME];  
}

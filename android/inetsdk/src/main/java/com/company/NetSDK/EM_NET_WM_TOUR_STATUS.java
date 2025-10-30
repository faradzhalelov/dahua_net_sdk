package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall tour status
 * \else
 * 电视墙轮巡状态
 * \endif
 */
public class EM_NET_WM_TOUR_STATUS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_NET_WM_TOUR_STATUS_UNKNOWN = 0;     
	
	/**
	 * \if ENGLISH_LANG
	 * touring
	 * \else
	 * 轮巡中
	 * \endif
	 */
	public static final int EM_NET_WM_TOUR_STATUS_START = 1;            
	
	/**
	 * \if ENGLISH_LANG
	 * tour stop
	 * \else
	 * 轮巡停止
	 * \endif
	 */
	public static final int EM_NET_WM_TOUR_STATUS_STOP = 2;            
}

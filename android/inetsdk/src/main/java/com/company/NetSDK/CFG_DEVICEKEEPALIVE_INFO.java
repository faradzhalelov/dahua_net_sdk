package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * 设备保活配置
 * \endif
 */
public class CFG_DEVICEKEEPALIVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 开启保活使能
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 保活时间间隔，必须是>=10的值，单位：秒
	 * \endif
	 */
	public int					nInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 保活失败次数，保活失败次数到达该值认为设备断线
	 * \endif
	 */
	public int					nFailTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 等待外设加电后启动后检测保活心跳，单位：秒
	 * \endif
	 */
	public int					nWaitBootTime;
}

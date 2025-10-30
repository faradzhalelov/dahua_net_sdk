package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail Report Device Status
 * \else
 * 邮件上报设备状况
 * \endif
 */
public class CFG_HEALTHREPORT_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean			bEnable;				
	
	/**
	 * \if ENGLISH_LANG
	 * Mail sending interval, unit is s, range?êo0~3600
	 * \else
	 * 邮件发送间隔,单位为秒,范围：0~3600
	 * \endif
	 */
    public int             nInterval;              
}

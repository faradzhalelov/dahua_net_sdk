package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power failure configuration
 * \else
 * 电源故障配置
 * \endif
 */
public class CFG_POWERFAULT_ONE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Enable switch
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean  bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * alarmLinkage
	 * \else
	 * 报警联动
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler  = new CFG_ALARM_MSG_HANDLE();
	
	/**
	 * \if ENGLISH_LANG
	 * power failure detection period, unit:second
	 * \else
	 * 电源故障检测周期， 单位秒
	 * \endif
	 */
	public int nDetectionPeriod;
	
	/**
	 * \if ENGLISH_LANG
	 * if enable encode blend
	 * \else
	 * 是否叠加OSD报警图标
	 * \endif
	 */
	public boolean  bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * position
	 * \else
	 * 位置
	 * \endif
	 */
	public CFG_RECT   stuPosition = new CFG_RECT();

}

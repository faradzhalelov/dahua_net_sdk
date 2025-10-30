package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless Alarm Output Configuration
 * \else
 * 无线报警输出配置
 * \endif
 */
public class SDK_INFRARED_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm Input quantity
	 * \else
	 * 无线报警输入数
	 * \endif
	 */
	public byte                    bAlarmInNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output quantity
	 * \else
	 * 无线报警输出数
	 * \endif
	 */
	public byte                    bAlarmOutNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Address
	 * \else
	 * 报警输出地址
	 * \endif
	 */
	public SDK_WI_CONFIG_ALARM_OUT  AlarmOutAddr[] = new SDK_WI_CONFIG_ALARM_OUT[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Remote Control quantity
	 * \else
	 * 遥控器个数
	 * \endif
	 */
    public byte                    bRobotNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Remote Control Address
	 * \else
	 * 遥控器地址
	 * \endif
	 */
    public SDK_WI_CONFIG_ROBOT      RobotAddr[] = new SDK_WI_CONFIG_ROBOT[16];
    
    /**
	 * \if ENGLISH_LANG
	 * Infrared Alarm config
	 * \else
	 * 红外报警配置
	 * \endif
	 */
    public SDK_INFRARED_INFO        InfraredAlarm[] = new SDK_INFRARED_INFO[16];
    
    public SDK_INFRARED_CFG() {
    	for (int i = 0; i < 16; i++) {
    		AlarmOutAddr[i] = new SDK_WI_CONFIG_ALARM_OUT();
    		RobotAddr[i] = new SDK_WI_CONFIG_ROBOT();
    		InfraredAlarm[i] = new SDK_INFRARED_INFO();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_ALARM}
 * \else
 * 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_ALARM}
 * \endif
 */
public class CFG_CAP_ALARM_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device support PIR alarm or not(thermal sensors),a kind of external alarm
	 * \else
	 * 设备是否支持PIR(人体热式感应器)报警,外部报警的一种
	 * \endif
	 */
	public boolean                 bAlarmPir;
	
	/**
	 * \if ENGLISH_LANG
	 * Device support flash light of not
	 * \else
	 * 设备是否支持补光灯
	 * \endif
	 */
	public boolean                 bFlashLight;
	
	/**
	 * \if ENGLISH_LANG
	 * DefenceArea Type Number ,0 Indicates No Such Alarm Input does not Use as a DefenceArea
	 * \else
	 * 防区类型种类数,为0表示无此字段时报警输入不作为防区使用。
	 * \endif
	 */
	public int					 nDefenceAreaTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported DefenceArea Type, refer to {@link EM_CFG_DEFENCEAREATYPE}
	 * \else
	 * 支持防区类型 , 取值参考 {@link EM_CFG_DEFENCEAREATYPE}
	 * \endif
	 */
	public int     			emDefenceAreaType[] = new int[FinalVar.MAX_ALARM_DEFENCE_TYPE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Delay DefenceArea Maximum Time,Unit:Second, Only Support Delay DefenceArea is Effective
	 * \else
	 * 延时防区的最大延时时间,单位为秒，只有支持延时防区时此字段才有效。
	 * \endif
	 */
	public int				 	 nMaxDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel,In Order to Maintain Compatibility, 0 Indicates that Each Channel  Support All Types of Sensors
	 * \else
	 * 报警通道数,为了保持兼容性,此为0时表示每个通道支持所有类型的传感器
	 * \endif
	 */
	public int					 nAlarmChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Set
	 * \else
	 * 报警通道集合
	 * \endif
	 */
	public CFG_ALARM_SENSE_METHOD stuAlarmChannel[] = new CFG_ALARM_SENSE_METHOD[FinalVar.MAX_ALARM_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Number of Alarm
	 * \else
	 * 警号个数
	 * \endif
	 */
	public int					 nAlarmBellCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The Maximum number of alarms backup center,The default is 0 when no such field,0 indicates no support for alternate Alarm Center
	 * \else
	 * 最大备用报警中心数,无此字段时默认为0,0表示不支持备用报警中心
	 * \endif
	 */
	public int					 nMaxBackupAlarmServer;
	
	/**
	 * \if ENGLISH_LANG
	 * The Maximum number of Phone alarms  center, he default is 0 when no such field,0 indicates no support for Phone Alarm Center
	 * \else
	 * 最大电话报警中心数, 无此字段时默认为0,0表示不支持电话报警中心。
	 * \endif
	 */
	public int					 nMaxPSTNAlarmServer;
	
	public CFG_CAP_ALARM_INFO() {
		for (int i = 0; i < FinalVar.MAX_ALARM_CHANNEL_NUM; i++) {
			stuAlarmChannel[i] = new CFG_ALARM_SENSE_METHOD();
		}
	}
}

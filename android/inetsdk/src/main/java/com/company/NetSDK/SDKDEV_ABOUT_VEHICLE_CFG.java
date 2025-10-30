package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ACC power off configuration
 * \else
 * 车载相关配置
 * \endif
 */
public class SDKDEV_ABOUT_VEHICLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * bAutoBootEnable
	 * \else
	 * 自动开机使能
	 * \endif
	 */
	public boolean 				bAutoBootEnable;

	/**
	 * \if ENGLISH_LANG
	 * dwAutoBootTime
	 * \else
	 * 每天自动开机时间点, 单位秒,从0算起.[0,82800]
	 * \endif
	 */
	public int					dwAutoBootTime;

	/**
	 * \if ENGLISH_LANG
	 * bAutoShutDownEnable
	 * \else
	 * 自动关机使能
	 * \endif
	 */
	public boolean				bAutoShutDownEnable;

	/**
	 * \if ENGLISH_LANG
	 * dwAutoShutDownTime
	 * \else
	 * 每天自动关机时间点, 单位秒,从0算起.[0,82800]
	 * \endif
	 */
	public int					dwAutoShutDownTime;

	/**
	 * \if ENGLISH_LANG
	 * dwShutDownDelayTime
	 * \else
	 * 延时关机时间,单位秒.
	 * \endif
	 */
	public int					dwShutDownDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * bEventNoDisk
	 * \else
	 * 1,(Ignore:忽略); 2,(Reboot:重起系统)
	 * \endif
	 */
	public int					bEventNoDisk;

	/**
	 * \if ENGLISH_LANG
	 * bWifiEnable
	 * \else
	 * 是否支持车载无线模块.
	 * \endif
	 */
	public boolean				bWifiEnable;

	/**
	 * \if ENGLISH_LANG
	 * bUpperSpeedEnable
	 * \else
	 * 是否使用超速判断
	 * \endif
	 */
	public boolean				bUpperSpeedEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * bLowerSpeedEnable
	 * \else
	 * 是否使用低速判断
	 * \endif
	 */
	public boolean				bLowerSpeedEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * dwUpperSpeedValue
	 * \else
	 * 超速值开区间(1,1000).公里/小时
	 * \endif
	 */
	public int					dwUpperSpeedValue;
	
	/**
	 * \if ENGLISH_LANG
	 * dwLowerSpeedValue
	 * \else
	 * 低速值开区间(1,1000).公里/小时
	 * \endif
	 */
	public int 					dwLowerSpeedValue;

	/**
	 * \if ENGLISH_LANG
	 * dwUpperSpeedDelayTime
	 * \else
	 * 设置超速持续值
	 * \endif
	 */
	public int					dwUpperSpeedDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * dwLowerSpeedDelayTime
	 * \else
	 * 设置低速持续值
	 * \endif
	 */
	public int					dwLowerSpeedDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * dwAlarmMaskEnable
	 * \else
	 * 查询/设置叠加报警信息使能,0:关闭,1:打开, 每一位从低到高表示各个外部报警通道0-N使能
	 * \endif
	 */	
	public int					dwAlarmMaskEnable;

	/**
	 * \if ENGLISH_LANG
	 * bSpeedOverAlarmRecordEnable
	 * \else
	 * 超速报警联动录像使能
	 * \endif
	 */	
	public boolean				bSpeedOverAlarmRecordEnable;

	/**
	 * \if ENGLISH_LANG
	 * bSpeedLowAlarmRecordEnable
	 * \else
	 * 低速报警联动录像使能 
	 * \endif
	 */	
	public boolean				bSpeedLowAlarmRecordEnable;
}

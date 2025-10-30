package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor Enumeration Type
 * \else
 * 传感器感应方式枚举类型
 * \endif
 */
public class NET_SENSE_METHOD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Type
	 * \else
	 * 未知类型
	 * \endif
	 */
	public static final int NET_SENSE_UNKNOWN = -1;

	/**
	 * \if ENGLISH_LANG
	 * Door Sensor
	 * \else
	 * 门磁
	 * \endif
	 */
	public static final int NET_SENSE_DOOR = 0;

	/**
	 * \if ENGLISH_LANG
	 * Passive IR
	 * \else
	 * 被动红外
	 * \endif
	 */
	public static final int NET_SENSE_PASSIVEINFRA = 1;

	/**
	 * \if ENGLISH_LANG
	 * Gas Sensor
	 * \else
	 * 气感
	 * \endif
	 */
	public static final int NET_SENSE_GAS = 2;

	/**
	 * \if ENGLISH_LANG
	 * Smoke Sensor
	 * \else
	 * 烟感
	 * \endif
	 */
	public static final int NET_SENSE_SMOKING = 3;

	/**
	 * \if ENGLISH_LANG
	 * Water Sensor
	 * \else
	 * 水感
	 * \endif
	 */
	public static final int NET_SENSE_WATER = 4;

	/**
	 * \if ENGLISH_LANG
	 * Active IR
	 * \else
	 * 主动红外
	 * \endif
	 */
	public static final int NET_SENSE_ACTIVEFRA = 5;

	/**
	 * \if ENGLISH_LANG
	 * Broken Glass
	 * \else
	 * 玻璃破碎
	 * \endif
	 */
	public static final int NET_SENSE_GLASS = 6;

	/**
	 * \if ENGLISH_LANG
	 * Emergency
	 * \else
	 * 紧急开关
	 * \endif
	 */
	public static final int NET_SENSE_EMERGENCYSWITCH = 7;

	/**
	 * \if ENGLISH_LANG
	 * Shock
	 * \else
	 * 震动
	 * \endif
	 */
	public static final int NET_SENSE_SHOCK = 8;

	/**
	 * \if ENGLISH_LANG
	 * Double Method(Infrare+Microwave)
	 * \else
	 * 双鉴(红外+微波)
	 * \endif
	 */
	public static final int NET_SENSE_DOUBLEMETHOD = 9;

	/**
	 * \if ENGLISH_LANG
	 * Three Method
	 * \else
	 * 三技术
	 * \endif
	 */
	public static final int NET_SENSE_THREEMETHOD = 10;

	/**
	 * \if ENGLISH_LANG
	 * Temperature
	 * \else
	 * 温度
	 * \endif
	 */
	public static final int NET_SENSE_TEMP = 11;

	/**
	 * \if ENGLISH_LANG
	 * Humidity
	 * \else
	 * 湿度
	 * \endif
	 */
	public static final int NET_SENSE_HUMIDITY = 12;

	/**
	 * \if ENGLISH_LANG
	 * Wind
	 * \else
	 * 风速
	 * \endif
	 */
	public static final int NET_SENSE_WIND = 13;

	/**
	 * \if ENGLISH_LANG
	 * Call Button
	 * \else
	 * 呼叫按钮
	 * \endif
	 */
	public static final int NET_SENSE_CALLBUTTON = 14;

	/**
	 * \if ENGLISH_LANG
	 * Gas Pressure
	 * \else
	 * 气体压力
	 * \endif
	 */
	public static final int NET_SENSE_GASPRESSURE = 15;

	/**
	 * \if ENGLISH_LANG
	 * Gas Concentration
	 * \else
	 * 燃气浓度
	 * \endif
	 */
	public static final int NET_SENSE_GASCONCENTRATION = 16;

	/**
	 * \if ENGLISH_LANG
	 * Gas Flow
	 * \else
	 * 气体流量
	 * \endif
	 */
	public static final int NET_SENSE_GASFLOW = 17;

	/**
	 * \if ENGLISH_LANG
	 * Other
	 * \else
	 * 其他
	 * \endif
	 */
	public static final int NET_SENSE_OTHER = 18;

	/**
	 * \if ENGLISH_LANG
	 * oil detection, gasoline, diesel vehicles detection
	 * \else
	 * 油量检测,汽油、柴油等车辆用油检测
	 * \endif
	 */
	public static final int NET_SENSE_OIL = 19;

	/**
	 * \if ENGLISH_LANG
	 * mileage detection
	 * \else
	 * 里程数检测
	 * \endif
	 */
	public static final int NET_SENSE_MILEAGE = 20;

	/**
	 * \if ENGLISH_LANG
	 * Urgency button
	 * \else
	 * 紧急按钮
	 * \endif
	 */
	public static final int NET_SENSE_URGENCYBUTTON = 21;

	/**
	 * \if ENGLISH_LANG
	 * Steal
	 * \else
	 * 盗窃
	 * \endif
	 */
	public static final int NET_SENSE_STEAL = 22;

	/**
	 * \if ENGLISH_LANG
	 * Permeter
	 * \else
	 * 周界
	 * \endif
	 */
	public static final int NET_SENSE_PERIMETER = 23;

	/**
	 * \if ENGLISH_LANG
	 * Prevent remove
	 * \else
	 * 防拆
	 * \endif
	 */
	public static final int NET_SENSE_PREVENTREMOVE = 24;

	/**
	 * \if ENGLISH_LANG
	 * Door bell
	 * \else
	 * 门铃
	 * \endif
	 */
	public static final int NET_SENSE_DOORBELL = 25;

	/**
	 * \if ENGLISH_LANG
	 * Alter voltage sensor
	 * \else
	 * 交流电压传感器
	 * \endif
	 */
	public static final int NET_SENSE_ALTERVOLT = 26;

	/**
	 * \if ENGLISH_LANG
	 * Direct voltage sensor
	 * \else
	 * 直流电压传感器
	 * \endif
	 */
	public static final int NET_SENSE_DIRECTVOLT = 27;

	/**
	 * \if ENGLISH_LANG
	 * Alter current sensor
	 * \else
	 * 交流电流传感器
	 * \endif
	 */
	public static final int NET_SENSE_ALTERCUR = 28;

	/**
	 * \if ENGLISH_LANG
	 * Direct current sensor
	 * \else
	 * 直流电流传感器
	 * \endif
	 */
	public static final int NET_SENSE_DIRECTCUR = 29;

	/**
	 * \if ENGLISH_LANG
	 * RSU general analog sensor, 4~20mA or 0~5V
	 * \else
	 * 通用模拟量	4~20mA或0~5V
	 * \endif
	 */
	public static final int NET_SENSE_RSUGENERAL = 30;

	/**
	 * \if ENGLISH_LANG
	 * RSU door sensor
	 * \else
	 * 门禁感应
	 * \endif
	 */
	public static final int NET_SENSE_RSUDOOR = 31;

	/**
	 * \if ENGLISH_LANG
	 * RSU power off sensor
	 * \else
	 * 断电感应
	 * \endif
	 */
	public static final int NET_SENSE_RSUPOWEROFF = 32;

	/**
	 * \if ENGLISH_LANG
	 * 1500 temperature sensor
	 * \else
	 * 1500温度传感器
	 * \endif
	 */
	public static final int NET_SENSE_TEMP1500 = 33;

	/**
	 * \if ENGLISH_LANG
	 * DS18B20 temperature sensor
	 * \else
	 * DS18B20温度传感器
	 * \endif
	 */
	public static final int NET_SENSE_TEMPDS18B20 = 34;

	/**
	 * \if ENGLISH_LANG
	 * 1500 humidity sensor
	 * \else
	 * 1500湿度传感器
	 * \endif
	 */
	public static final int NET_SENSE_HUMIDITY1500 = 35;

	/**
	 * \if ENGLISH_LANG
	 * Infrared sensor
	 * \else
	 * 红外报警
	 * \endif
	 */
	public static final int NET_SENSE_INFRARED = 36;

	/**
	 * \if ENGLISH_LANG
	 * firealarm sensor
	 * \else
	 * 火警
	 * \endif
	 */
	public static final int NET_SENSE_FIREALARM = 37;

	/**
	 * \if ENGLISH_LANG
	 * Determination of CO2, typical value:0~5000ppm
	 * \else
	 * CO2浓度检测,典型值:0~5000ppm
	 * \endif
	 */
	public static final int NET_SENSE_CO2 = 38;

	/**
	 * \if ENGLISH_LANG
	 * Noise detection,typical value:30~130dB
	 * \else
	 * 噪音检测,典型值:30~130dB
	 * \endif
	 */
	public static final int NET_SNESE_SOUND = 39;

	/**
	 * \if ENGLISH_LANG
	 * PM2.5 detection,typical value:0~1000ug/m3
	 * \else
	 * PM2.5检测,典型值:0~1000ug/m3
	 * \endif
	 */
	public static final int NET_SENSE_PM25 = 40;

	/**
	 * \if ENGLISH_LANG
	 * Determination of SF6,typical value:0~3000ppm
	 * \else
	 * SF6浓度检测,典型值:0~3000ppm
	 * \endif
	 */
	public static final int NET_SENSE_SF6 = 41;

	/**
	 * \if ENGLISH_LANG
	 * O3 detection,typical value:0~100ppm
	 * \else
	 * 臭氧浓度检测,典型值:0~100ppm
	 * \endif
	 */
	public static final int NET_SENSE_O3 = 42;

	/**
	 * \if ENGLISH_LANG
	 * ambient light detection,typical value:0~20000Lux
	 * \else
	 * 环境光照检测,典型值:0~20000Lux
	 * \endif
	 */
	public static final int NET_SENSE_AMBIENTLIGHT = 43;

	/**
	 * \if ENGLISH_LANG
	 * sign in button
	 * \else
	 * 签入按钮
	 * \endif
	 */
	public static final int NET_SENSE_SIGNINBUTTON = 44;

	/**
	 * \if ENGLISH_LANG
	 * LiquidLevel
	 * \else
	 * 液位
	 * \endif
	 */
	public static final int NET_SENSE_LIQUIDLEVEL = 45;

	/**
	 * \if ENGLISH_LANG
	 * distance
	 * \else
	 * 测距
	 * \endif
	 */
	public static final int NET_SENSE_DISTANCE = 46;

	/**
	 * \if ENGLISH_LANG
	 * water flow
	 * \else
	 * 水流量
	 * \endif
	 */
	public static final int NET_SENSE_WATERFLOW = 47;

	/**
	 * \if ENGLISH_LANG
	 * enum total
	 * \else
	 * 枚举类型总数
	 * \endif
	 */
	public static final int NET_SENSE_NUM = 48;

}

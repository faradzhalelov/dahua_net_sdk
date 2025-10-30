package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Sensor enumeration type
 * \else
 * 传感器感应方式枚举类型
 * \endif
 */
public class EM_SENSE_METHOD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Door Sensor
	 * \else
	 * 门磁
	 * \endif
	 */
	public static final int EM_SENSE_DOOR = 0;         

	/**
	 * \if ENGLISH_LANG
	 * Passive IR
	 * \else
	 * 被动红外
	 * \endif
	 */
	public static final int EM_SENSE_PASSIVEINFRA = 1;   

	/**
	 * \if ENGLISH_LANG
	 * Gas Sensor 
	 * \else
	 * 气感
	 * \endif
	 */
	public static final int EM_SENSE_GAS = 2;            

	/**
	 * \if ENGLISH_LANG
	 * Smoke Sensor 
	 * \else
	 * 烟感
	 * \endif
	 */
	public static final int EM_SENSE_SMOKING = 3;        

	/**
	 * \if ENGLISH_LANG
	 * Water Sensor
	 * \else
	 * 水感
	 * \endif
	 */
	public static final int EM_SENSE_WATER = 4;          

	/**
	 * \if ENGLISH_LANG
	 * Active IR 
	 * \else
	 * 主动红外
	 * \endif
	 */
	public static final int EM_SENSE_ACTIVEFRA = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Glass Broken
	 * \else
	 * 玻璃破碎
	 * \endif
	 */
	public static final int EM_SENSE_GLASS = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * SOS
	 * \else
	 * 紧急开关
	 * \endif
	 */
	public static final int EM_SENSE_EMERGENCYSWITCH = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Vibrate
	 * \else
	 * 震动
	 * \endif
	 */
	public static final int EM_SENSE_SHOCK = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Dual(IR+Microwave)
	 * \else
	 * 双鉴(红外+微波)
	 * \endif
	 */
	public static final int EM_SENSE_DOUBLEMETHOD = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Tritechnology
	 * \else
	 * 三技术
	 * \endif
	 */
	public static final int EM_SENSE_THREEMETHOD = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Temperature
	 * \else
	 * 温度
	 * \endif
	 */
	public static final int EM_SENSE_TEMP = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * Humidity
	 * \else
	 * 湿度
	 * \endif
	 */
	public static final int EM_SENSE_HUMIDITY = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * Call button
	 * \else
	 * 呼叫按钮
	 * \endif
	 */
	public static final int EM_SENSE_CALLBUTTON = 13;
	
	/**
	 * \if ENGLISH_LANG
	 * Gas pressure
	 * \else
	 * 气体压力
	 * \endif
	 */
	public static final int EM_SENSE_GASPRESSURE = 14;
	
	/**
	 * \if ENGLISH_LANG
	 * Gas concentration
	 * \else
	 * 燃气浓度
	 * \endif
	 */
	public static final int EM_SENSE_GASCONCENTRATION = 15;
	
	/**
	 * \if ENGLISH_LANG
	 * Gas flow
	 * \else
	 * 气体流量
	 * \endif
	 */
	public static final int EM_SENSE_GASFLOW = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * Other
	 * \else
	 * 其他
	 * \endif
	 */
	public static final int EM_SENSE_OTHER = 17;

	/**
	 * \if ENGLISH_LANG
	 * infra red
	 * \else
	 * 红外报警
	 * \endif
	 */
	public static final int EM_SEHSE_INFRARED = 18;

	/**
	 * \if ENGLISH_LANG
	 * temp 1500
	 * \else
	 * 1500温度传感器
	 * \endif
	 */
	public static final int EM_SEHSE_TEMP1500 =  19;

	/**
	 * \if ENGLISH_LANG
	 * temp DS18B20
	 * \else
	 * DS18B20温度传感器
	 * \endif
	 */
	public static final int EM_SEHSE_TEMPDS18B20 = 20;

	/**
	 * \if ENGLISH_LANG
	 *  humidity 1500
	 * \else
	 * 1500湿度传感器
	 * \endif
	 */
	public static final int EM_SEHSE_HUMIDITY1500 =  21;

	/**
	 * \if ENGLISH_LANG
	 * urgency button
	 * \else
	 * 紧急按钮
	 * \endif
	 */
	public static final int EM_SEHSE_URGENCYBUTTON =  22;

	/**
	 * \if ENGLISH_LANG
	 * steal
	 * \else
	 * 盗窃
	 * \endif
	 */
	public static final int EM_SEHSE_STEAL =  23;

	/**
	 * \if ENGLISH_LANG
	 * perimeter
	 * \else
	 * 周界
	 * \endif
	 */
	public static final int EM_SEHSE_PERIMETER =  24;

	/**
	 * \if ENGLISH_LANG
	 * prevent remove
	 * \else
	 * 防拆
	 * \endif
	 */
	public static final int EM_SEHSE_PREVENTREMOVE =  25;

	/**
	 * \if ENGLISH_LANG
	 * doorbell
	 * \else
	 * 门铃
	 * \endif
	 */
	public static final int EM_SEHSE_DOORBELL =  26;

	/**
	 * \if ENGLISH_LANG
	 * alter volt
	 * \else
	 * 交流电压传感器
	 * \endif
	 */
	public static final int EM_SEHSE_ALTERVOLT =  27;

	/**
	 * \if ENGLISH_LANG
	 * direct volt
	 * \else
	 * 直流电压传感器
	 * \endif
	 */
	public static final int EM_SEHSE_DIRECTVOLT =  28;

	/**
	 * \if ENGLISH_LANG
	 * alter cur
	 * \else
	 * 交流电流传感器
	 * \endif
	 */
	public static final int EM_SEHSE_ALTERCUR = 29;

	/**
	 * \if ENGLISH_LANG
	 * direct cur
	 * \else
	 * 直流电流传感器
	 * \endif
	 */
	public static final int EM_SEHSE_DIRECTCUR =  30;

	/**
	 * \if ENGLISH_LANG
	 * RSU general
	 * \else
	 * 通用模拟量
	 * \endif
	 */
	public static final int EM_SEHSE_RSUGENERAL =  31;

	/**
	 * \if ENGLISH_LANG
	 * RSU door
	 * \else
	 * 门禁感应
	 * \endif
	 */
	public static final int EM_SEHSE_RSUDOOR =  32;

	/**
	 * \if ENGLISH_LANG
	 * RSU power off
	 * \else
	 * 断电感应
	 * \endif
	 */
	public static final int EM_SEHSE_RSUPOWEROFF =  33;

	/**
	 * \if ENGLISH_LANG
	 * curtain sensor
	 * \else
	 * 幕帘传感器
	 * \endif
	 */
	public static final int EM_SEHSE_CURTAINSENSOR =  34;

	/**
	 * \if ENGLISH_LANG
	 * mobile sensor
	 * \else
	 * 移动传感器
	 * \endif
	 */
	public static final int EM_SEHSE_MOBILESENSOR =  35;

	/**
	 * \if ENGLISH_LANG
	 * fire alarm
	 * \else
	 * 火警
	 * \endif
	 */
	public static final int EM_SEHSE_FIREALARM =  36;
}

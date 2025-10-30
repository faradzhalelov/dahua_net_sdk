package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The type of sense method
 * \else
 * 传感器方式
 * \endif
 */
public class EM_CODEID_SENSE_METHOD_TYPE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知的
	 * \endif
	 */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_UNKOWN = 0;         
   
    /**
     * \if ENGLISH_LANG
     * Door Magnetism
     * \else
     * 门磁
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_DOOR_MAGNETISM = 1; 
    
    /**
     * \if ENGLISH_LANG
     * Gas Sensor
     * \else
     * 燃气传感
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_GAS_SENSOR = 2;
    
    /**
     * \if ENGLISH_LANG
     * Curtain Sensor
     * \else
     * 幕帘传感器
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_CURTAIN_SENSOR = 3;
    
    /**
     * \if ENGLISH_LANG
     * Mobile Sensor
     * \else
     * 移动传感器
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_MOBILE_SENSOR = 4; 
    
    /**
     * \if ENGLISH_LANG
     * Passive Infrared Sensor
     * \else
     * 被动红外传感器
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_PASSIVEINFRA = 5;  

    /**
     * \if ENGLISH_LANG
     * urgency button
     * \else
     * 紧急按钮
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_URGENCY_BUTTON = 6;
    
    /**
     * \if ENGLISH_LANG
     * Smoking Sensor
     * \else
     * 烟雾传感器
     * \endif
     */   
    public static final int EM_CODEID_SENSE_METHOD_TYPE_SMOKING_SENSOR = 7;

    /**
     * \if ENGLISH_LANG
     * DoubleMethod(Infrare+Microwave)
     * \else
     * 双鉴传感器(红外+微波)
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_DOUBLEMETHOD = 8;

    /**
     * \if ENGLISH_LANG
     * Water Sensor
     * \else
     * 水浸传感器
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_WATER_SENSOR = 9;

    /**
     * \if ENGLISH_LANG
     * Three Sensor
     * \else
     * 三技术
     * \endif
     */
    public static final int EM_CODEID_SENSE_METHOD_TYPE_THREEMETHOD = 10;
}

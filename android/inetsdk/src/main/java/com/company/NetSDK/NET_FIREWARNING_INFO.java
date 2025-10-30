package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* firewarning info
* \else
* 热成像火情的报警信息
* \endif
*/
public class NET_FIREWARNING_INFO implements Serializable {
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * preset number is selected from the ARGtemp_meas rule config refer to {@link CFG_RADIOMETRY_RULE_INFO}
	 * \else
	 * 预置点编号, 从测温规则配置 {@link CFG_RADIOMETRY_RULE_INFO}中选择
	 * \endif
	 */
	public int						nPresetId; 						 
	
	 /**
	 * \if ENGLISH_LANG
	 * kindling point rectangular box
	 * \else
	 * 着火点矩形框	
	 * \endif
	 */
	public NET_RECT		    		stuBoundingBox = new NET_RECT(); 
	
	 /**
	 * \if ENGLISH_LANG
	 * temperature unit (currently configured temperature unit), refer to {@link NET_TEMPERATURE_UNIT}
	 * \else
	 * 温度单位(当前配置的温度单位), 取值参考 {@link NET_TEMPERATURE_UNIT}
	 * \endif
	 */
	public int              		nTemperatureUnit;				 
	
	 /**
	 * \if ENGLISH_LANG
	 * max spot temperature value provided by same frame detection and differential detection 
	 * \else
	 * 最高点温度值	同帧检测和差分检测提供
	 * \endif
	 */
	public float                	fTemperature;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * kindling point distance, unit is meter, 0 means invalid
	 * \else
	 * 着火点距离,单位米 0表示无效
	 * \endif
	 */
	public int		            	nDistance;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * kindling point longitude and latitude
	 * \else
	 * 着火点经纬度
	 * \endif
	 */
	public GPS_POINT            	stuGpsPoint = new GPS_POINT();   
}

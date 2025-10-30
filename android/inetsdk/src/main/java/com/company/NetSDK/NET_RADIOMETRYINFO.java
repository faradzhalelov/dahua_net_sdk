package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* ARGtemp_meas info
* \else
* 测温信息
* \endif
*/
public class NET_RADIOMETRYINFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * return to ARGtemp_meas type, refer to {@link NET_RADIOMETRY_METERTYPE}
	 * \else
	 * 返回测温类型,见 {@link NET_RADIOMETRY_METERTYPE}
	 * \endif
	 */
    public int        		   nMeterType;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * temperature unit (currently configured temperature unit), refer to {@link NET_TEMPERATURE_UNIT}
	 * \else
	 * 温度单位(当前配置的温度单位),见  {@link NET_TEMPERATURE_UNIT}
	 * \endif
	 */
    public int                 nTemperUnit;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * only return to this field when it is spot temperature or average temperature
	 * \else
	 * 点的温度或者平均温度   点的时候 只返回此字段
	 * \endif
	 */
    public float               fTemperAver;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * max temperature 
	 * \else
	 * ARGZGWD
	 * \endif
	 */
    public float               fTemperMax;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * min temperature 
	 * \else
	 * ARGZDWD
	 * \endif
	 */
    public float               fTemperMin;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * middle temperature value        
	 * \else
	 * 中间温度值   
	 * \endif
	 */
    public float               fTemperMid;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * standard deviation value
	 * \else
	 * 标准方差值
	 * \endif
	 */
    public float               fTemperStd;                        

}

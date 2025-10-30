package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* thermal ARGtemp_meas spot temperature abnormity alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_HEATIMG_TEMPER}
* \else
* 热成像测温点温度异常报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_HEATIMG_TEMPER}
* \endif
*/
public class ALARM_HEATIMG_TEMPER_INFO implements Serializable {

	 /**
	  * 
	  */
	 private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * temperature abnormal spot name, select from the ARGtemp_meas rule config
	 * \else
	 * 温度异常点名称  从测温规则配置项中选择
	 * \endif
	 */
     public byte                szName[] = new byte[64];                         
    
	 /**
	 * \if ENGLISH_LANG
	 * alarm number
	 * \else
	 * 报警项编号    
	 * \endif
	 */
     public int                 nAlarmId;                           
    
	 /**
	 * \if ENGLISH_LANG
	 * alarm result value nValue type, refer to {@link NET_RADIOMETRY_RESULT}
	 * \else
	 * 报警结果值 fTemperatureValue 的类型,取值参考{@link NET_RADIOMETRY_RESULT}
	 * \endif
	 */
     public int                 nResult;                            
    
	 /**
	 * \if ENGLISH_LANG
	 * alarm condition, refer to {@link NET_RADIOMETRY_ALARMCONTION}
	 * \else
	 * 报警条件,取值参考 {@link NET_RADIOMETRY_ALARMCONTION}
	 * \endif
	 */
     public int                 nAlarmContion;                      
    
	 /**
	 * \if ENGLISH_LANG
	 * alarm temperature value 
	 * \else
	 * 报警温度值
	 * \endif
	 */
     public float               fTemperatureValue;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * temperature unit, refer to {@link CFG_TEMPERATURE_UNIT}
	 * \else
	 * 温度单位(当前配置的温度单位)，取值参考 {@link CFG_TEMPERATURE_UNIT}
	 * \endif
	 */
     public int                 nTemperatureUnit;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * alarm spot coordinate, relative coordinate system, value is 0~8191 
	 * \else
	 * 报警点的坐标   相对坐标体系,取值均为0~8191
	 * \endif
	 */
     public SDK_POINT            stCoordinate = new SDK_POINT();                       
    
	 /**
	 * \if ENGLISH_LANG
	 * preset
	 * \else
	 * 预置点
	 * \endif
	 */
     public int                 nPresetID;                          
    
	 /**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * 通道号
	 * \endif
	 */
     public int                 nChannel;                           
    
	 /**
	 * \if ENGLISH_LANG
	 * 0:start 1: stop
	 * \else
	 * 0:开始 1:停止 -1:无意义
	 * \endif
	 */
     public int                 nAction;                            
}

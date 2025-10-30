package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* target overheating, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_FACE_OVERHEATING}
* \else
* 热成像温度预警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_FACE_OVERHEATING}
* \endif
*/
public class ALARM_FACE_OVERHEATING_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * picture id of face,refer to {@link NET_FACE_INFO#nRelativeID}
	 * \else
	 * 目标图片ID,与 {@link NET_FACE_INFO#nRelativeID}相同
	 * \endif
	 */
    public int                     nRelativeId;                                        
    
	 /**
	 * \if ENGLISH_LANG
	 * temperature unit(currently configured temperature unit), refer to {@link NET_TEMPERATURE_UNIT}
	 * \else
	 * 温度单位(当前配置的温度单位), 取值参考 {@link NET_TEMPERATURE_UNIT}
	 * \endif
	 */
    public int                     nTemperatureUnit;                                   
    
	 /**
	 * \if ENGLISH_LANG
	 * temperature value of the target
	 * \else
	 * 目标温度值
	 * \endif
	 */
    public float                   fTemperature;                                      

}

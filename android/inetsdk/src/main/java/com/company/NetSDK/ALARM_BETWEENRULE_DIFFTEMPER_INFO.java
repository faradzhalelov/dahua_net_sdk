package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* TemperatureDifference Between Rule, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_BETWEENRULE_TEMP_DIFF}
* \else
* 热成像规则间温差异常报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_BETWEENRULE_TEMP_DIFF}
* \endif
*/
public class ALARM_BETWEENRULE_DIFFTEMPER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
    public int                             nAction;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * config of TemperatureDifference OSD(OSDId)
	 * \else
	 * 温差OSD配置中的OSD编号
	 * \endif
	 */
    public int                             nOsdId;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 视频通道号
	 * \endif
	 */
    public int                             nChannelID;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * alarm condition, refer to {@link NET_RADIOMETRY_ALARMCONTION}
	 * \else
	 * 报警条件 0:小于 1:等于 2:大于,取值参考 {@link NET_RADIOMETRY_ALARMCONTION}
	 * \endif 
	 */
    public int                             emAlarmContion;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * ThermometryRule1, refer to {@link CFG_RADIOMETRY_RULE_INFO}
	 * \else
	 * 测温规则1,取值参考 {@link CFG_RADIOMETRY_RULE_INFO}
	 * \endif
	 */
    public int                             nRuleId1;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * ThermometryRule2, refer to {@link CFG_RADIOMETRY_RULE_INFO}
	 * \else
	 * 测温规则2,取值参考 {@link CFG_RADIOMETRY_RULE_INFO}
	 * \endif
	 */
    public int                             nRuleId2;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * Difference value between rules
	 * \else
	 * 规则间温差值
	 * \endif
	 */
    public float                           fDiffValue;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * Temperature Unit, refer to {@link CFG_TEMPERATURE_UNIT}
	 * \else
	 * 温度单位(当前配置的温度单位),取值参考 {@link CFG_TEMPERATURE_UNIT}
	 * \endif
	 */
    public int                             nTemperatureUnit;               
    
	 /**
	 * \if ENGLISH_LANG
	 * Preset id
	 * \else
	 * 预置点
	 * \endif
	 */
    public int                             nPresetID;                      
}

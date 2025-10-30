package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * private radar configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_DHRADER_PP}
 * \else
 * 私有雷达配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_DHRADER_PP}
 * \endif
 */
public class CFG_DAHUA_RADAR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Angle, useful when correcting speed error from radar sensor installation angle. Unit: degree, range: 0~45
	 * \else
	 * 角度，用于修正雷达探头安装的角度造成的速度误差 单位度，范围0~45
	 * \endif
	 */
    public int                    nAngle;                         
    
	/**
	 * \if ENGLISH_LANG
	 * whether or not enable lowerbounds. if TRUE, the lowerbounds in {@link CFG_RADAR_CARSPEED} are valid
	 * \else
	 * 是否启用低限速，为 TRUE 时，{@link CFG_RADAR_CARSPEED} 结构中各下限值有效
	 * \endif
	 */
    public boolean                bLowSpeed;                      
    
	/**
	 * \if ENGLISH_LANG
	 * whether or not discriminate different car size, if FALSE, only small car speed config (stuSmallCarSpeed) is valid
	 * \else
	 * 是否启用大小车限速，为 FALSE 时仅小车速度配置（stuSmallCarSpeed）有效
	 * \endif
	 */
    public boolean                bSpeedForSize;                  
    
	/**
	 * \if ENGLISH_LANG
	 * small car speed, if bSpeedForSize is TRUE, nTriggerLower member is ALSO lowerbounds for medium car and large car
	 * \else
	 * 小车速度配置，bSpeedForSize 为 TRUE 时 nTriggerLower 成员同时也代表中车和大车的触发值下限
	 * \endif
	 */
    public CFG_RADAR_CARSPEED  	  stuSmallCarSpeed = new CFG_RADAR_CARSPEED();               
    
	/**
	 * \if ENGLISH_LANG
	 * medium car speed, valid only if bSpeedForSize is TRUE, but nTriggerLower member is ALWAYS invalid.
	 * \else
	 * 中车速度配置，bSpeedForSize 为 TRUE 时有效，但 nTriggerLower 成员始终无效
	 * \endif
	 */
    public CFG_RADAR_CARSPEED     stuMediumCarSpeed = new CFG_RADAR_CARSPEED();              
    
	/**
	 * \if ENGLISH_LANG
	 * large car speed, valid only if bSpeedForSize is TRUE, but nTriggerLower member is ALWAYS invalid.
	 * \else
	 * 大车速度配置，bSpeedForSize 为 TRUE 时有效，但 nTriggerLower 成员始终无效
	 * \endif
	 */
    public CFG_RADAR_CARSPEED     stuBigCarSpeed = new CFG_RADAR_CARSPEED();                 
     
	/**
	 * \if ENGLISH_LANG
	 * device installation address
	 * \else
	 * 设备安装地址
	 * \endif
	 */
    public byte[]                 szName = new byte[256];                   
    
	/**
	 * \if ENGLISH_LANG
	 * Sensitivity, range: 0~5, 0 is most sensitive
	 * \else
	 * 灵敏度 范围0~5，0最高
	 * \endif
	 */
    public int                 	  nSensitivity;                   
  
	/**
	 * \if ENGLISH_LANG
	 * Detect Mode, values: -1:nonsense, 0:approaching in front, 1:leaving in front, 2:approaching behind, 3:leaving behind, 4:in front (approaching or leaving), 5:behind (approaching or leaving)
	 * \else
	 * 检测模式，取值：-1:无意义 , 0:前向来车, 1:前向去车, 2: 后向来车, 3:后向去车, 4:前向双向, 5:后向双向.
	 * \endif
	 */
    public int                 	  nDetectMode;                    
}

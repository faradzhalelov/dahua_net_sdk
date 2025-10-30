package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot special config
 * \else
 * 抓拍参数特殊配置
 * \endif
 */
public class CFG_VIDEO_IN_SNAPSHOT_OPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Red gain red. Valid when WB is "Custom" mode (0~100)    
	 * \else
	 * 红色增益调节，白平衡为"Custom"模式下有效 0~100
	 * \endif
	 */
	public byte				byGainRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue gain setup. Valid when WB is "Custom" mode (0~100)
	 * \else
	 * 绿色增益调节，白平衡为"Custom"模式下有效 0~100
	 * \endif
	 */
	public byte				byGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain. Valid when WB is "Custom" mode  (0~100)
	 * \else
	 * 蓝色增益调节，白平衡为"Custom"模式下有效 0~100
	 * \endif
	 */
	public byte				byGainGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Exposure mode; range value depends on device capacity set; 0-automatic, 1- exposure level1,2-exposure level 2.  Mn-1:Max exposure level  n auto exposure of max and min time. n+1 exposure time (n==byExposureEn)
	 * \else
	 * 曝光模式；取值范围取决于设备能力集：0-自动曝光，1-曝光等级1，2-曝光等级2…n-1最大曝光等级数 n带时间上下限的自动曝光 n+1自定义时间手动曝光 (n==byExposureEn）
	 * \endif
	 */
	public byte				byExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto exposure value min limit or manual axposure custom, unit is millisecond (0.1ms~80ms).
	 * \else
	 * 自动曝光时间下限或者手动曝光自定义时间,毫秒为单位，取值0.1ms~80ms
	 * \endif
	 */
	public float				fExposureValue1;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto exposure time max limit, unit is millisecond (0.1ms~80ms)
	 * \else
	 * 自动曝光时间上限,毫秒为单位，取值0.1ms~80ms
	 * \endif
	 */
	public float				fExposureValue2;
	
	/**
	 * \if ENGLISH_LANG
	 * WB. 0-"Unable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \else
	 * 白平衡, 0-"Unable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \endif
	 */
	public byte				byWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * Color temperature level. valid when WB is "CustomColorTemperature" . 
	 * \else
	 * 色温等级, 白平衡为"CustomColorTemperature"模式下有效
	 * \endif
	 */
	public byte				byColorTemperature;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto gain 
	 * \else
	 * 自动增益
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * When GainAuto is true, it is max auto gain limit, otherwise, it is fixed value gain
	 * \else
	 * 增益调节, GainAuto为true时表示自动增益的上限，否则表示固定的增益值
	 * \endif
	 */
	public byte				byGain;
}

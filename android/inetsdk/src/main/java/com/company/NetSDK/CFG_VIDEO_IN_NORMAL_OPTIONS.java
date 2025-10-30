package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Video input normal options
 * \else
 * 视频输入普通参数选项
 * \endif
 */
public class CFG_VIDEO_IN_NORMAL_OPTIONS implements Serializable {
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
	 * 蓝色增益调节，白平衡为"Custom"模式下有效 0~100
	 * \endif
	 */
	public byte				byGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain. Valid when WB is "Custom" mode  (0~100)
	 * \else
	 * 绿色增益调节，白平衡为"Custom"模式下有效 0~100
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
	 * WB. White 0-"Unable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \else
	 * 白平衡, 0-"Unable", 1-"Auto", 2-"Custom", 3-"Sunny", 4-"Cloudy", 5-"Home", 6-"Office", 7-"Night", 8-"HighColorTemperature", 9-"LowColorTemperature", 10-"AutoColorTemperature", 11-"CustomColorTemperature"
	 * \endif
	 */
	public byte				byWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * When gainAuto is true, it is max auto gain limit, otherwise, it is fixed value gain.
	 * \else
	 * 0~100, GainAuto为true时表示自动增益的上限，否则表示固定的增益值
	 * \endif
	 */
	public byte				byGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Gain
	 * \else
	 * 自动增益
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Iris
	 * \else
	 * 自动光圈
	 * \endif
	 */
	public boolean				bIrisAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * 0~360 LL Phase
	 * \else
	 * 外同步的相位设置 0~360
	 * \endif
	 */
	public float               fExternalSyncPhase;
	
	/**
	 * \if ENGLISH_LANG
	 * gain min
	 * \else
	 * 增益下限
	 * \endif
	 */
	public byte				byGainMin;
	
	/**
	 * \if ENGLISH_LANG
	 * gain max
	 * \else
	 * 增益上限
	 * \endif
	 */
	public byte				byGainMax;
	
	/**
	 * \if ENGLISH_LANG
	 * backlight:ability to set value range depends on the device,0-close 1-open 2-backlingt compensation specified area
	 * \else
	 * 背光补偿：取值范围取决于设备能力集：0-关闭1-启用2-指定区域背光补偿
	 * \endif
	 */
	public byte				byBacklight;
	
	/**
	 * \if ENGLISH_LANG
	 * prevent flashing mode,0- out door, 1-50HZ prevent flashing,2-60HZ prevent flashing
	 * \else
	 * 防闪烁模式 0-Outdoor 1-50Hz防闪烁 2-60Hz防闪烁
	 * \endif
	 */
	public byte				byAntiFlicker;
	
	/**
	 * \if ENGLISH_LANG
	 * day or night,0-colour,1-according to the brightness auromatically switches,2-black and white
	 * \else
	 * 日/夜模式；0-总是彩色，1-根据亮度自动切换，2-总是黑白
	 * \endif
	 */
	public byte				byDayNightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * exposure mode, effective exposure levels for automatic exposure,0-auto,1-plus,2-shutter
	 * \else
	 * 曝光模式调节 曝光等级为自动曝光时有效，取值：0-默认自动，1-增益优先，2-快门优先
	 * \endif
	 */
	public byte				byExposureMode;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-not rotate,1-deasil 90,2-deasil 90
	 * \else
	 * 0-不旋转，1-顺时针90°，2-逆时针90°
	 * \endif
	 */
	public byte				byRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * mirror
	 * \else
	 * 镜像
	 * \endif
	 */
	public boolean				bMirror;
	
	/**
	 * \if ENGLISH_LANG
	 * wide dynamic range[1~100],0-close
	 * \else
	 * 宽动态值 0-关闭，1~100-为真实范围值
	 * \endif
	 */
	public byte                byWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * glare inhibition,0-close,[1-100]
	 * \else
	 * 强光抑制 0-关闭， 1~100为范围值
	 * \endif
	 */
	public byte                byGlareInhibition;
	
	/**
	 * \if ENGLISH_LANG
	 * backlight region
	 * \else
	 * 背光补偿区域
	 * \endif
	 */
	public CFG_RECT			stuBacklightRegion = new CFG_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-off￡?1-easy focus￡?2-auto focus
	 * \else
	 * 0-关闭，1-辅助聚焦，2-自动聚焦
	 * \endif
	 */
	public byte                byFocusMode; 
}

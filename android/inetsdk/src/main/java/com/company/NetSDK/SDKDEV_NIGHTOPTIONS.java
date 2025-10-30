package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Night special configuration
 * \else
 * 夜晚特殊配置
 * \endif
 */
public class SDKDEV_NIGHTOPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0 - switch 1- Switch
	 * \else
	 * 0-不切换，1-切换
	 * \endif
	 */
	public byte  bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Approximate sunrise and sunset times, after sunset and before sunrise, the night special configuration.00:00:00 ~23:59:59
	 * \else
	 * 大致日出和日落时间，日落之后日出之前，将采用夜晚特殊的配置。00:00:00 ~23:59:59
	 * \endif
	 */
	public byte  bSunriseHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * 同上
	 * \endif
	 */
	public byte  bSunriseMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * 同上
	 * \endif
	 */
	public byte  bSunriseSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * 同上
	 * \endif
	 */
	public byte  bSunsetHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * 同上
	 * \endif
	 */
	public byte  bSunsetMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * Ditto
	 * \else
	 * 同上
	 * \endif
	 */
	public byte  bSunsetSecond;
	
	/**
	 * \if ENGLISH_LANG
	 * White Balance 0:Unabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night 7: Custom
	 * \else
	 * 白平衡 0:Unabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night 7: Custom
	 * \endif
	 */
	public byte  bWhiteBalance ;
	
	/**
	 * \if ENGLISH_LANG
	 * Red gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * 红色增益调节，白平衡为"Custom"模式下有效 0~100
	 * \endif
	 */
	public byte  bGainRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * 蓝色增益调节，白平衡为"Custom"模式下有效 0~100
	 * \endif
	 */
	public byte  bGainBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Green gain adjustment, white balance "Custom" mode effectively 0 to 100
	 * \else
	 * 绿色增益调节，白平衡为"Custom"模式下有效 0~100
	 * \endif
	 */
	public byte  bGainGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * 0~100
	 * \else
	 * 0~100
	 * \endif
	 */
	public byte  bGain;
	
	/**
	 * \if ENGLISH_LANG
	 * 0 -Dose not automatic gain 1 - automatic gain
	 * \else
	 * 0-不自动增益 1-自动增益
	 * \endif
	 */
	public byte  bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness values 0~100
	 * \else
	 * 亮度值 0~100
	 * \endif
	 */
	public byte  bBrightnessThreshold ;
	
	/**
	 * \if ENGLISH_LANG
	 * Level reference value 0~100
	 * \else
	 * 电平参考值 0~100
	 * \endif
	 */
	public byte  ReferenceLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * The range depends on the device capability set: 0 - AE 1 ~ n-1-manual exposure and lower limits on the level n-band time automatic exposure n +1- time manual exposure (n represents the number of exposure level support) 
	 * \else
	 * 取值范围取决于设备能力集：0-自动曝光 1~n-1-手动曝光等级 n-带时间上下限的自动曝光 n+1-自定义时间手动曝光 (n表示支持的曝光等级数) 
	 * \endif
	 */
	public byte  bExposureSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatic exposure to the lower limit of or manual exposure time, in milliseconds, the value 0.1ms ~ 80ms
	 * \else
	 * 自动曝光时间下限或者手动曝光自定义时间,毫秒为单位，取值0.1ms~80ms
	 * \endif
	 */
	public float ExposureValue1;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatic exposure time limit milliseconds, the value of 0.1ms ~ 80ms
	 * \else
	 * 自动曝光时间上限,毫秒为单位，取值0.1ms~80ms
	 * \endif
	 */
	public float ExposureValue2;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable auto iris, 1 Open, 0 Close
	 * \else
	 * 自动光圈使能,1开启,0关闭
	 * \endif
	 */
	public byte  bAutoApertureEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Wide dynamic value Range is determined by the ability
	 * \else
	 * 宽动态值 取值范围由能力决定
	 * \endif
	 */
	public byte  bWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * Night phase 0~360 
	 * \else
	 * 夜晚相位 0~360
	 * \endif
	 */
	public short  wNightSyncValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Night phase of 0 to 999 (thousandth of a degree), in combination with wNightSyncValue constituting the phase values ??in the evening
	 * \else
	 * 夜晚相位0~999(千分之一度),与wNightSyncValue组合构成夜晚相位值
	 * \endif
	 */
	public short  wNightSyncValueMillValue;
}

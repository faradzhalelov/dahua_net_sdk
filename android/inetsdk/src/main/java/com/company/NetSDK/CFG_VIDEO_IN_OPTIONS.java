package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input options, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEOINOPTIONS}
 * \else
 * 视频输入前端选项, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VIDEOINOPTIONS}
 * \endif
 */
public class CFG_VIDEO_IN_OPTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * BLC:Range value depends on device capacity set, 0-off, 1-BLC level 1, 2- BLC level 2...n-max BLC level
	 * \else
	 * 背光补偿：取值范围取决于设备能力集：0-关闭1-启用2-指定区域背光补偿
	 * \endif
	 */
	public byte				byBacklight;
	
	/**
	 * \if ENGLISH_LANG
	 * Day/night mode; 0-color.1-automatic switch according to the brightness.2- black/white
	 * \else
	 * 日/夜模式；0-总是彩色，1-根据亮度自动切换，2-总是黑白
	 * \endif
	 */
	public byte				byDayNightColor;
	
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
	 * Mirror
	 * \else
	 * 镜像
	 * \endif
	 */
	public boolean				bMirror;
	
	/**
	 * \if ENGLISH_LANG
	 * Flip
	 * \else
	 * 翻转
	 * \endif
	 */
	public boolean				bFlip;
	
	/**
	 * \if ENGLISH_LANG
	 * Iris automatic
	 * \else
	 * 自动光圈
	 * \endif
	 */
	public boolean				bIrisAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto enable IR compensation light according to the environment.
	 * \else
	 * 根据环境光自动开启红外补偿灯
	 * \endif
	 */
	public boolean				bInfraRed;
	
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
	 * Exposure mode; range value depends on device capacity set; 0-automatic, 1- exposure level1, 2-exposure level 2.  Mn-1:Max exposure level  n auto exposure of max and min time. n+1 exposure time (n==byExposureEn)
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
	 * Auto gain 
	 * \else
	 * 自动增益
	 * \endif
	 */
	public boolean				bGainAuto;
	
	/**
	 * \if ENGLISH_LANG
	 * When gainAuto is true, it is max gain automatic limit, otherwise, it is fixed value gain
	 * \else
	 * 增益调节, GainAuto为true时表示自动增益的上限，否则表示固定的增益值
	 * \endif
	 */
	public byte				byGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal format, 0-Inside (internal input).1-BT656 2-720p 3-1080p  4-1080i  5-1080sF 
	 * \else
	 * 信号格式, 0-Inside(内部输入) 1-BT656 2-720p 3-1080p  4-1080i  5-1080sF
	 * \endif
	 */
	public byte				bySignalFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-non-rotate, 1- rotate 90 clockwise, 2-rotate 90 counterclockwise
	 * \else
	 * 0-不旋转，1-顺时针90°，2-逆时针90°
	 * \endif
	 */
	public byte				byRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * External sych phase set up.0~360	
	 * \else
	 * 外同步的相位设置 0~360
	 * \endif
	 */
	public float               fExternalSyncPhase;
	
	/**
	 * \if ENGLISH_LANG
	 * External sync signal input, 0-INT. 1- LL
	 * \else
	 * 外部同步信号输入,0-内部同步 1-外部同步
	 * \endif
	 */
	public byte                byExternalSync;

	/**
	 * \if ENGLISH_LANG
	 *	External synchronization signal input, 0-Internal synchronization, 1-External synchronization.
	 * \else
	 * 外部同步信号输入,0-内部同步 1-外部同步
	 * \endif
	 */
	public byte 				bySwitchMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Double exposure, 0-not use, 1-double exposure with full frame, as image and video differentiated only in parameter  2- double  exposure with half frame, as image and and video differentiated completely
	 * \else
	 * 双快门, 0-不启用，1-双快门全帧率，即图像和视频只有快门参数不同，2-双快门半帧率，即图像和视频快门及白平衡参数均不同
	 * \endif
	 */
	public byte				byDoubleExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * WDR value
	 * \else
	 * 宽动态值
	 * \endif
	 */
	public byte                byWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * Night config
	 * \else
	 * 夜晚参数
	 * \endif
	 */
	public CFG_VIDEO_IN_NIGHT_OPTIONS stuNightOptions = new CFG_VIDEO_IN_NIGHT_OPTIONS();
	
	/**
	 * \if ENGLISH_LANG
	 * Flashling config 
	 * \else
	 * 闪光灯配置
	 * \endif
	 */
	public CFG_FLASH_CONTROL	stuFlash = new CFG_FLASH_CONTROL();
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot option, doule exposure only
	 * \else
	 * 抓拍参数, 双快门时有效
	 * \endif
	 */
	public CFG_VIDEO_IN_SNAPSHOT_OPTIONS stuSnapshot = new CFG_VIDEO_IN_SNAPSHOT_OPTIONS();
	
	/**
	 * \if ENGLISH_LANG
	 * fish eye
	 * \else
	 * 鱼眼镜头
	 * \endif
	 */
	public CFG_FISH_EYE        stuFishEye = new CFG_FISH_EYE();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-off, 1-easy focus, 2-auto focus
	 * \else
	 * 0-关闭，1-辅助聚焦，2-自动聚焦
	 * \endif
	 */
	public byte                byFocusMode;
	
	/**
	 * \if ENGLISH_LANG
	 * min gain
	 * \else
	 * 增益下限
	 * \endif
	 */
	public byte				byGainMin;
	
	/**
	 * \if ENGLISH_LANG
	 * max gain
	 * \else
	 * 增益上限
	 * \endif
	 */
	public byte				byGainMax;
	
	/**
	 * \if ENGLISH_LANG
	 * prevent flashing mode 0-Outdoor 1-50Hz prevent flashing 2-60Hz prevent flashing
	 * \else
	 * 防闪烁模式 0-Outdoor 1-50Hz防闪烁 2-60Hz防闪烁
	 * \endif
	 */
	public byte				byAntiFlicker;
	
	/**
	 * \if ENGLISH_LANG
	 * exposure mode, effective exposure levels for automatic exposure,0-auto,1-plus,4-manual
	 * \else
	 * 曝光模式调节 曝光等级为自动曝光时有效，取值：0-默认自动，1-增益优先，2-快门优先,4-手动
	 * \endif
	 */
	public byte				byExposureMode;
	
	/**
	 * \if ENGLISH_LANG
	 * glare inhibition[1~100] 0-close
	 * \else
	 * 强光抑制 0-关闭， 1~100为范围值
	 * \endif
	 */
	public byte                byGlareInhibition;
	
	/**
	 * \if ENGLISH_LANG
	 * back light region       
	 * \else
	 * 背光补偿区域
	 * \endif
	 */
	public CFG_RECT			stuBacklightRegion = new CFG_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * normal option
	 * \else
	 * 普通参数
	 * \endif
	 */
	public CFG_VIDEO_IN_NORMAL_OPTIONS stuNormalOptions = new CFG_VIDEO_IN_NORMAL_OPTIONS();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Properties of the camera configuration
 * \else
 * 摄像头属性配置
 * \endif
 */
public class SDKDEV_CAMERA_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Exposure mode; range depends on the device capability set: 0 - auto exposure, 1 - exposure level 1,2 - exposure level 2 ... n-maximum exposure level number
	 * \else
	 * 曝光模式；取值范围取决于设备能力集：0-自动曝光，1-曝光等级1，2-曝光等级2…n-最大曝光等级数
	 * \endif
	 */
	public byte                bExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Backlight compensation: BLC Level range depends on the device capability set, 0 - off, 1 - backlight compensation intensity 1,2 - backlight compensation strength ... n-backlight compensation level number
	 * \else
	 * 背光补偿：背光补偿等级取值范围取决于设备能力集，0-关闭，1-背光补偿强度1，2-背光补偿强度2…n-最大背光补偿等级数
	 * \endif
	 */
    public byte                bBacklight;
    
    /**
     * \if ENGLISH_LANG
     * Day / Night mode (color); 2: open (black and white), 1: Auto: Off
     * \else
     * 日/夜模式；2：开(黑白)，1：自动，0：关(彩色) 
     * \endif
     */
    public byte                bAutoColor2BW;
    
    /**
     * \if ENGLISH_LANG
     * Mirror; 1: open, 0: Off
     * \else
     * 镜像；1：开，0：关
     * \endif
     */
    public byte                bMirror;
    
    /**
     * \if ENGLISH_LANG
     * Flip; 1: ON, 0: OFF
     * \else
     * 翻转；1：开，0：关
     * \endif
     */
    public byte                bFlip;
    
    /**
     * \if ENGLISH_LANG
     * Auto iris function capability: 1: support; 0: does not support
     * \else
     * 自动光圈功能能力: 1：支持；0 ：不支持
     * \endif
     */
    public byte                bLensEn;
    
    /**
     * \if ENGLISH_LANG
     * Auto iris function: 1: Open the auto iris; 0: Turn off auto iris
     * \else
     * 自动光圈功能: 1:开启自动光圈；0: 关闭自动光圈
     * \endif
     */
    public byte                bLensFunction;
    
    /**
     * \if ENGLISH_LANG
     * White Balance 0:Unabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night
     * \else
     * 白平衡 0:Unabled,1:Auto 2:sunny 3:cloudy 4:home 5:office 6:night
     * \endif
     */
    public byte                bWhiteBalance;
    
    /**
     * \if ENGLISH_LANG
     * Signal format0-Inside(Internal input) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF
     * \else
     * 信号格式0-Inside(内部输入) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF
     * \endif
     */
    public byte                bSignalFormat;
    
    /**
     * \if ENGLISH_LANG
     * 0 - does not rotate, 1 - clockwise 90 °, 2 - counterclockwise 90 °
     * \else
     * 0-不旋转，1-顺时针90°，2-逆时针90°
     * \endif
     */
    public byte                bRotate90;
    
    /**
     * \if ENGLISH_LANG
     * Level reference value 0~100
     * \else
     * 电平参考值 0~100
     * \endif
     */
    public byte                bReferenceLevel;
    
    /**
     * \if ENGLISH_LANG
     * Automatic exposure to the lower limit of or manual exposure time, in milliseconds, the value 0.1ms ~ 80ms
     * \else
     * 自动曝光时间下限或者手动曝光自定义时间,毫秒为单位，取值0.1ms~80ms
     * \endif
     */
    public float               ExposureValue1;
    
    /**
     * \if ENGLISH_LANG
     * Automatic exposure time limit milliseconds, the value of 0.1ms ~ 80ms
     * \else
     * 自动曝光时间上限,毫秒为单位，取值0.1ms~80ms
     * \endif
     */
    public float               ExposureValue2;
    
    /**
     * \if ENGLISH_LANG
     * The night configuration parameter options
     * \else
     * 夜晚配置参数选项
     * \endif
     */
    public SDKDEV_NIGHTOPTIONS  stuNightOptions = new SDKDEV_NIGHTOPTIONS();
    
    /**
     * \if ENGLISH_LANG
     * Red gain adjustment, white balance "Custom" mode effectively 0 to 100
     * \else
     * 红色增益调节，白平衡为"Custom"模式下有效 0~100
     * \endif
     */
    public byte                bGainRed;
    
    /**
     * \if ENGLISH_LANG
     * Blue gain adjustment,White balance "Custom" mode effective 0~100
     * \else
     * 蓝色增益调节，白平衡为"Custom"模式下有效 0~100
     * \endif
     */
    public byte                bGainBlue;
    
    /**
     * \if ENGLISH_LANG
     * Green gain adjustment,White balance "Custom" mode effective 0~100
     * \else
     * 绿色增益调节，白平衡为"Custom"模式下有效 0~100
     * \endif
     */
    public byte                bGainGreen;
    
    /**
     * \if ENGLISH_LANG
     * Flash mode, 0 - Close, 1 - always, 2 - Automatic 
     * \else
     * 闪光灯工作模式，0-关闭，1-始终，2-自动
     * \endif
     */
    public byte                bFlashMode;
    
    /**
     * \if ENGLISH_LANG
     * The the flash work values, 0-0us 1-64us-128us, ... 15-960us
     * \else
     * 闪光灯工作值, 0-0us, 1-64us, 2-128us,...15-960us
     * \endif
     */
    public byte                bFlashValue;
    
    /**
     * \if ENGLISH_LANG
     * Flash trigger mode 0 - low level - high level
     * \else
     * 闪光灯触发模式0-低电平 1-高电平
     * \endif
     */
    public byte                bFlashPole;
    
    /**
     * \if ENGLISH_LANG
     * External sync signal input, 0 - internal sync - external synchronization
     * \else
     * 外部同步信号输入,0-内部同步 1-外部同步
     * \endif
     */
    public byte                bExternalSyncPhase;
    
    /**
     * \if ENGLISH_LANG
     * Flash brightness default values ??range from 0 to 100
     * \else
     * 闪光灯亮度预设值 区间0~100
     * \endif
     */
    public byte                bFlashInitValue;
    
    /**
     * \if ENGLISH_LANG
     * Outside the synchronization phase set 0~360
     * \else
     * 外同步的相位设置 0~360
     * \endif
     */
    public short                wExternalSyncValue ;
    
    /**
     * \if ENGLISH_LANG
     * 0 to 999 external synchronization phase (thousandth of a degree), and wExternalSyncValue combination constitute the external synchronization phase value
     * \else
     * 外同步的相位设置0~999(千分之一度),与wExternalSyncValue组合构成外同步的相位值
     * \endif
     */
    public short                wExternalSyncValueMillValue;
    
    /**
     * \if ENGLISH_LANG
     * Wide dynamic value Range is determined by the ability
     * \else
     * 宽动态值 取值范围由能力决定
     * \endif
     */
    public byte                bWideDynamicRange;
    
    /**
     * \if ENGLISH_LANG
     * exposure compensation value,default is 7,range0~14
     * \else
     * 曝光补偿值，默认为7，范围0~14
     * \endif
     */
    public byte                byExposureCompensation;
}

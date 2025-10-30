package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Camera properties, the corresponding interface {@link INetSDK#QueryDevState},the correspongding command {@link FinalVar#SDK_DEVSTATE_CAMERA}
 * \else
 * 摄像头属性,对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_CAMERA}
 * \endif
 */
public class SDKDEV_CAMERA_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Adjustable brightness 1：Can，0：No 
	 * \else
	 * 亮度可调；1：可，0：不可
	 * \endif
	 */
	public byte				bBrightnessEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable contrast 
	 * \else
	 * 对比度可调
	 * \endif
	 */
	public byte				bContrastEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Color adjustable 
	 * \else
	 * 色度可调
	 * \endif
	 */
	public byte				bColorEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable Gain 
	 * \else
	 * 增益可调
	 * \endif
	 */
	public byte				bGainEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Saturation adjustable 
	 * \else
	 * 饱和度可调
	 * \endif
	 */
	public byte				bSaturationEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Backlight compensation,0 means no backlight compensation,1 expressed support for a compensation (on, off) 
	 * \else
	 * 背光补偿 0表示不支持背光补偿,1表示支持一级补偿（开,关），2表示支持两级补偿（关,高,低），3表示支持三级补偿（关,高,中,低）
	 * \endif
	 */
	public byte				bBacklightEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Exposure select 0 indicates no support Exposure Control，1 indicates that only support automatic exposure，Number of other expressed support for the exposure speed rating，+1 Level of manual control 
	 * \else
	 * 曝光选择: 0:表示不支持曝光控制 1:表示只支持自动曝光 n:曝光的等级数(1表示支持自动曝光 2~n表示支持的手动控制曝光的等级)
	 * \endif
	 */
	public byte				bExposureEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Adjustable automatic color black conversion 
	 * \else
	 * 自动彩黑转换可调
	 * \endif
	 */
	public byte				bColorConvEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Attribute options; 1: can 0: not 
	 * \else
	 * 属性选项；1：可，0：不可
	 * \endif
	 */
	public byte				bAttrEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Mirror; 1: Support,0: does not support 
	 * \else
	 * 镜像；1：支持，0：不支持
	 * \endif
	 */
	public byte				bMirrorEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Turn；1: Support,0: does not support 
	 * \else
	 * 翻转；1：支持，0：不支持
	 * \endif
	 */
	public byte				bFlipEn;
	
	/**
	 * \if ENGLISH_LANG
	 * White Balance 2 Support Profile， 1 Support for white balance ，0 does not support 
	 * \else
	 * 白平衡 0-不支持白平衡，1-支持自动白平衡，2-支持预置白平衡（即情景模式） 3-支持自定义白平衡
	 * \endif
	 */
	public byte				iWhiteBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal format mask，Bitwise respectively, from low to high：0-Inside(Inside) 1- BT656 2-720p 3-1080i 4-1080p 5-1080sF 
	 * \else
	 * 信号格式掩码，按位从低到高位分别为：0-Inside(内部输入) 1- BT656 2-720p 3-1080i  4-1080p  5-1080sF
	 * \endif
	 */
	public byte				iSignalFormatMask;
	
	/**
	 * \if ENGLISH_LANG
	 * 90 degree rotation 0 - do not support, 1 - Support 
	 * \else
	 * 90度旋转 0-不支持 1-支持
	 * \endif
	 */
	public byte				bRotate90;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the auto exposure with time the upper and lower limits 
	 * \else
	 * 是否支持带时间上下限的自动曝光
	 * \endif
	 */
	public byte				bLimitedAutoExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support user-defined manual exposure time 
	 * \else
	 * 是否支持用户自定义手动曝光时间
	 * \endif
	 */
	public byte				bCustomManualExposure;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the flash adjustment 
	 * \else
	 * 是否支持闪光灯调节
	 * \endif
	 */
	public byte				bFlashAdjustEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support night options 
	 * \else
	 * 是否支持夜晚选项
	 * \endif
	 */
	public byte				bNightOptions;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the reference level set 
	 * \else
	 * 是否支持参考电平设置
	 * \endif
	 */
	public byte             iReferenceLevel;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support external sync signal input, 0 - not support, 1 - Support 
	 * \else
	 * 是否支持外部同步信号输入，0-不支持，1-支持
	 * \endif
	 */
	public byte             bExternalSyncInput;
	
	/**
	 * \if ENGLISH_LANG
	 * Custom exposure the interval maximum exposure time, in milliseconds 
	 * \else
	 * 自定义曝光区间最大曝光时间，单位毫秒         
	 * \endif
	 */
	public short      		usMaxExposureTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Custom exposure the interval mainimum exposure time, in milliseconds
	 * \else
	 * 自定义曝光区间最小曝光时间，单位毫秒
	 * \endif
	 */
	public short      		usMinExposureTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Ability to wide dynamic range, 0 - indicates no support, 2 ~ n represents the maximum range values 
	 * \else
	 * 宽动态能力范围,0-表示不支持,2~n表示最大的范围值
	 * \endif
	 */
	public byte             bWideDynamicRange;
	
	/**
	 * \if ENGLISH_LANG
	 * The double shutter 0 does not support 1 - full frame rate supports dual shutter images and video only shutter parameter - Supports dual shutter half frame rate, image and video shutter 
	 * and white balance parameters are different - Supports dual shutter Full frame rate and half of the frame rate  
	 * \else
	 * 双快门0不支持,1-支持双快门全帧率，即图像和视频只有快门参数不同，2-支持双快门半帧率，即图像和视频快门及白平衡参数均不同，3-支持双快门全帧率和半帧率
	 * \endif
	 */
	public byte             bDoubleShutter;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 yes， 0 no 
	 * \else
	 * 1支持， 0 不支持
	 * \endif
	 */
	public byte				byExposureCompensation;
}

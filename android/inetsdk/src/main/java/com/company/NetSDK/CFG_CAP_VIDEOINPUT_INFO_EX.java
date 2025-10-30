package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video input capability sets ,extension configuration, the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_VIDEOINPUT_EX}
 * \else
 * 视频输入能力集,扩展配置, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_VIDEOINPUT_EX}
 * \endif
 */
public class CFG_CAP_VIDEOINPUT_INFO_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * whether to support the function to penetrate the fog
	 * \else
	 * 是否支持透雾功能
	 * \endif
	 */
	public boolean             bSupportDefog;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the auto-focus function
	 * \else
	 * 是否支持自动调后焦功能
	 * \endif
	 */
	public boolean             bSupportABFFunction;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the electronic image stabilization function
	 * \else
	 * 是否支持电子防抖功能
	 * \endif
	 */
	public boolean             bSupportImageStabilization;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether to support the elimination of shutter function
	 * \else
	 * 是否支持消除快门线功能
	 * \endif
	 */
	public boolean             bSupportKillShutLine;
	
	/**
	 * \if ENGLISH_LANG
	 * The minimum value can match
	 * \else
	 * 可配的最小值
	 * \endif
	 */
	public int                 nMinKillShutLine;
	
	/**
	 * \if ENGLISH_LANG
	 * The maximum Can match
	 * \else
	 * 可配的最大值
	 * \endif
	 */
	public int                 nMaxKillShutLine;
	
	/**
	 * \if ENGLISH_LANG
	 * Support image setup capacity or not
	 * \else
	 * 是否支持图像设置能力
	 * \endif
	 */
	public boolean             bSupportVideoInColor;
	
	/**
	 * \if ENGLISH_LANG
	 * Support brightness or not
	 * \else
	 * 是否支持亮度
	 * \endif
	 */
	public boolean             bSupportBrightness;
	
	/**
	 * \if ENGLISH_LANG
	 * Support contrast or not
	 * \else
	 * 是否支持对比度
	 * \endif
	 */
	public boolean             bSupportContrast;
	
	/**
	 * \if ENGLISH_LANG
	 * Support saturation or not
	 * \else
	 * 是否支持饱和度
	 * \endif
	 */
	public boolean             bSupportSaturation;
	
	/**
	 * \if ENGLISH_LANG
	 * Support HUE or not
	 * \else
	 * 是否支持色度
	 * \endif
	 */
	public boolean             bSupportHue;
	
	/**
	 * \if ENGLISH_LANG
	 * Support VideoinFocus or not
	 * \else
	 * 是否支持聚焦设置
	 * \endif
	 */
	public boolean             bSupportVideoInFocus;
	
	

}

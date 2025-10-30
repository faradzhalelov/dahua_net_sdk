package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Out Attribute Structure, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEOOUT}
 * \else
 * 视频输出属性, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VIDEOOUT}
 * \endif
 */
public class AV_CFG_VideoOutAttr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Left, Ratio, 0~100 
	 * \else
	 * 左边距, 比率, 0~100
	 * \endif
	 */
	public int				nMarginLeft;
	
 	/**
	 * \if ENGLISH_LANG
	 * MarginT op, Ratio, 0~100 
	 * \else
	 * 上边距, 比率, 0~100
	 * \endif
	 */
	public int				nMarginTop;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Right, Ratio, 0~100
	 * \else
	 * 右边距, 比率, 0~100
	 * \endif
	 */
	public int				nMarginRight;
	
 	/**
	 * \if ENGLISH_LANG
	 * Margin Bottom, Ratio, 0~100 
	 * \else
	 * 下边距, 比率, 0~100
	 * \endif
	 */
	public int				nMarginBottom;
	
 	/**
	 * \if ENGLISH_LANG
	 * Brightness, 0~100 
	 * \else
	 * 亮度, 0~100
	 * \endif
	 */
	public int				nBrightness;
	
 	/**
	 * \if ENGLISH_LANG
	 * Contrast, 0~100 
	 * \else
	 * 对比度, 0~100
	 * \endif
	 */
	public int				nContrast;
	
 	/**
	 * \if ENGLISH_LANG
	 * Saturation, 0~100 
	 * \else
	 * 饱和度, 0~100
	 * \endif
	 */
	public int				nSaturation;
	
 	/**
	 * \if ENGLISH_LANG
	 * Hue, 0~100 
	 * \else
	 * 色调, 0~100
	 * \endif
	 */
	public int				nHue;
	
 	/**
	 * \if ENGLISH_LANG
	 * Horizontal Resolution 
	 * \else
	 * 水平分辨率
	 * \endif
	 */
	public int				nWidth;
	
 	/**
	 * \if ENGLISH_LANG
	 * Vertical Resolution
	 * \else
	 * 垂直分辨率
	 * \endif
	 */
	public int				nHeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * Color Depth 
	 * \else
	 * 颜色深度
	 * \endif
	 */
	public int				nBPP;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-Auto, 1-TV, 2-VGA, 3-DVI 
	 * \else
	 * 0-Auto, 1-TV, 2-VGA, 3-DVI
	 * \endif
	 */
	public int				nFormat;
	
 	/**
	 * \if ENGLISH_LANG
	 * Refresh Rate 
	 * \else
	 * 刷新频率
	 * \endif
	 */
	public int				nRefreshRate;
	
 	/**
	 * \if ENGLISH_LANG
	 * Picture Out Gain 
	 * \else
	 * 输出图像增强
	 * \endif
	 */
	public boolean			bIQIMode;
	
 	/**
	 * \if ENGLISH_LANG
	 * Scan mode, 0-progressive, 1-interlacing
	 * \else
	 * 扫描模式, 0-逐行, 1-隔行
	 * \endif
	 */
	public int				nScanFormat;
}

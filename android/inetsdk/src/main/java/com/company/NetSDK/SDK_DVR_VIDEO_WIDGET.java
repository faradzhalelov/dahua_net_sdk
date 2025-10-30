package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video OSD overlay
 * \else
 * 视频OSD叠加配置
 * \endif
 */
public class SDK_DVR_VIDEO_WIDGET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front ground
	 * \else
	 * 物件的前景；按字节表示，分别为红、绿、蓝和透明度
	 * \endif
	 */
	public int   rgbaFrontground;
	
	/**
	 * \if ENGLISH_LANG
	 * Background
	 * \else
	 * 物件的背景；按字节表示，分别为红、绿、蓝和透明度
	 * \endif
	 */
	public int   rgbaBackground;
	
	/**
	 * \if ENGLISH_LANG
	 * Position
	 * \else
	 * 位置,物件边距与整长的比例*8191 
	 * \endif
	 */
	public RECT    rcRelativePos = new RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Preview Blend
	 * \else
	 * 预览叠加使能
	 * \endif
	 */
	public boolean    bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode Blend
	 * \else
	 * 编码叠加使能
	 * \endif
	 */
	public boolean    bEncodeBlend;
}

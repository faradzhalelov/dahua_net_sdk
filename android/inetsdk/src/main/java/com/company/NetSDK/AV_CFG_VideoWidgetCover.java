package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-Privacy mask setup
 * \else
 * 编码物件-区域覆盖配置
 * \endif
 */
public class AV_CFG_VideoWidgetCover implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Overlay to main stream 
	 * \else
	 * 叠加到主码流
	 * \endif
	 */
	public boolean			bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 1
	 * \else
	 * 叠加到辅码流1
	 * \endif
	 */
	public boolean			bEncodeBlendExtra1;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 2
	 * \else
	 * 叠加到辅码流2
	 * \endif
	 */
	public boolean			bEncodeBlendExtra2;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 3
	 * \else
	 * 叠加到辅码流3
	 * \endif
	 */
	public boolean			bEncodeBlendExtra3;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to snap
	 * \else
	 * 叠加到抓图
	 * \endif
	 */
	public boolean			bEncodeBlendSnapshot;
	
	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * 前景色
	 * \endif
	 */
	public AV_CFG_Color		stuFrontColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Background color 
	 * \else
	 * 背景色
	 * \endif
	 */
	public AV_CFG_Color		stuBackColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Zone. The coordinates value ranges from  0 to 8191
	 * \else
	 * 区域, 坐标取值0~8191
	 * \endif
	 */
	public AV_CFG_Rect		stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to preview mode
	 * \else
	 * 叠加到预览视频
	 * \endif
	 */
	public boolean			bPreviewBlend;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-Time title 
 * \else
 * 编码物件-时间标题
 * \endif
 */
public class AV_CFG_VideoWidgetTimeTitle implements Serializable {
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
	public boolean		bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 1
	 * \else
	 * 叠加到辅码流1
	 * \endif
	 */
	public boolean		bEncodeBlendExtra1;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 2
	 * \else
	 * 叠加到辅码流2
	 * \endif
	 */
	public boolean		bEncodeBlendExtra2;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to extra stream 3
	 * \else
	 * 叠加到辅码流3
	 * \endif
	 */
	public boolean		bEncodeBlendExtra3;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to snap
	 * \else
	 * 叠加到抓图
	 * \endif
	 */
	public boolean		bEncodeBlendSnapshot;
	
	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * 前景色
	 * \endif
	 */
	public AV_CFG_Color	stuFrontColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Background color 
	 * \else
	 * 背景色
	 * \endif
	 */
	public AV_CFG_Color	stuBackColor = new AV_CFG_Color();
	
	/**
	 * \if ENGLISH_LANG
	 * Zone. The coordinates value ranges from  0 to 8191. Only use left value and top value.The point (left,top) shall be the same as the point(right,bottom).
	 * \else
	 * 区域, 坐标取值0~8191, 仅使用left和top值, 点(left,top)应和(right,bottom)设置成同样的点
	 * \endif
	 */
	public AV_CFG_Rect	stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * Display week or not 
	 * \else
	 * 是否显示星期
	 * \endif
	 */
	public boolean		bShowWeek;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay to preview mode
	 * \else
	 * 叠加到预览视频
	 * \endif
	 */
	public boolean		bPreviewBlend;
}

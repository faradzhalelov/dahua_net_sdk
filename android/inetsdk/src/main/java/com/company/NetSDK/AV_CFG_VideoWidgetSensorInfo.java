package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encoding object - overlay sensor information
 * \else
 * 编码物件-叠加传感器信息
 * \endif
 */
public class AV_CFG_VideoWidgetSensorInfo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Overlay the preview video 
	 * \else
	 * 叠加到预览视频
	 * \endif
	 */
	public boolean		bPreviewBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Stack to the main stream of video coding 
	 * \else
	 * 叠加到主码流视频编码
	 * \endif
	 */
	public boolean		bEncodeBlend;
	
	/**
	 * \if ENGLISH_LANG
	 * Area, coordinates ranging from 0 to 8191
	 * \else
	 * 区域, 坐标取值0~8191
	 * \endif
	 */
	public AV_CFG_Rect	stuRect = new AV_CFG_Rect();
	
	/**
	 * \if ENGLISH_LANG
	 * The Description number of stacking area 
	 * \else
	 * 叠加区域描述数目
	 * \endif
	 */
	public int			nDescriptionNum;

	/**
	 * \if ENGLISH_LANG
	 * Stacking area description information 
	 * \else
	 * 叠加区域描述信息
	 * \endif
	 */
	public AV_CFG_VideoWidgetSensorInfo_Description 
		stuDescription[] = new AV_CFG_VideoWidgetSensorInfo_Description[FinalVar.AV_CFG_Max_Description_Num];
	
	public AV_CFG_VideoWidgetSensorInfo() {
		for (int i=0 ; i<FinalVar.AV_CFG_Max_Description_Num ; i++) {
			stuDescription[i] = new AV_CFG_VideoWidgetSensorInfo_Description();
		}
	}
}

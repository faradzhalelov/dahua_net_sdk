package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Encoding ROI(Region of Intrest)Configuration
 * \else
 * 视频编码ROI(Region of Intrest)配置
 * \endif
 */
public class CFG_VIDEOENCODEROI_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Region Number
	 * \else
	 * 优化区域个数
	 * \endif
	 */
	public int				nRegionNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimization Regions Coordinate System[0~8191]
	 * \else
	 * 优化区域 支持多个优化区域，使用相对坐标体系，取值均为0~8191
	 * \endif
	 */
	public CFG_RECT[]		stRegions = new CFG_RECT[FinalVar.MAX_QUALITY_REGION_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Image Quality Value1~6 1:the lowes 6:the highest 
	 * \else
	 * 图像质量 取值1~6，值越大，图像质量越好
	 * \endif
	 */
	public byte				byQuality;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Main Stream1 Enable 
	 * \else
	 * 优化主码流视频编码
	 * \endif
	 */
	public boolean			bMain;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream1 Enable 
	 * \else
	 * 优化辅码流1视频编码
	 * \endif
	 */
	public boolean			bExtra1;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream2 Enable 
	 * \else
	 * 优化辅码流2视频编码
	 * \endif
	 */
	public boolean			bExtra2;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Auxiliary Stream3 Enable 
	 * \else
	 * 优化辅码流3视频编码
	 * \endif
	 */
	public boolean			bExtra3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Optimize Video Encoding Capacity of Snapshot Enable 
	 * \else
	 * 优化抓图编码
	 * \endif
	 */
	public boolean			bSnapshot;


	/**
	 * \if ENGLISH_LANG
	 * Dynamic area blur status,0:No image adjustment,1:Enhance the dynamic recognition area,2:Blur the dynamic recognition area (Masek)
	 * \else
	 * 动态区域模糊状态 0-不做图像调整 1-对动态识别区域做增强 2-对动态识别区域做模糊(马塞克)
	 * \endif
	 */
	public byte			byDynamicTrack;

	/**
	 * \if ENGLISH_LANG
	 * Delay time of dynamic blur, default 60s, unit:second
	 * \else
	 * 动态模糊的延时时间, 默认60s 单位秒
	 * \endif
	 */
	public int			nDynamicDelayTime;
	
	public CFG_VIDEOENCODEROI_INFO() {
		for (int i = 0; i < FinalVar.MAX_QUALITY_REGION_NUM; ++i) {
			stRegions[i] = new CFG_RECT();
		}
	}
}

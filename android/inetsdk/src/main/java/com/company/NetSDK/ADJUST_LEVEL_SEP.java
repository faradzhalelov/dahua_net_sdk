package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Traffic light color correction configuration, sub-project
 * \else
 * 交通灯颜色校正配置，分立项
 * \endif
 */
public class ADJUST_LEVEL_SEP implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 0: Undefined, 1: Video 2: Photo
	 * \else
	 * 0：未定义，1：视频，2：图片
	 * \endif
	 */
    public int                 nType;                                  
    
	/**
	 * \if ENGLISH_LANG
	 * 0: Undefined, 1: Day 2: Night
	 * \else
	 * 0：未定义，1：白天，2：夜晚
	 * \endif
	 */
    public int                 nTime;                                  
    
	/**
	 * \if ENGLISH_LANG
	 * range of 0 to 100, the greater the value, the more obvious correction
	 * \else
	 * 范围0~100，数值越大矫正越明显
	 * \endif
	 */
    public int                 nLevel;                                 
}

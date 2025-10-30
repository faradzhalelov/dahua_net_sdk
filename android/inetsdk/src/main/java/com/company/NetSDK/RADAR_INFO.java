package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Radar Info
 * \else
 * 雷达信息
 * \endif
 */
public class RADAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Angle,used to modify radar angle cuased speed error, range[0,90]
	 * \else
	 * 角度,用于修正雷达探头安装的角度造成的速度误差,范围[0,90]
	 * \endif
	 */
    public int     nAngle;                 
    
	/**
	 * \if ENGLISH_LANG
	 * Anti-inteference threshold
	 * \else
	 * 抗干扰门槛值
	 * \endif
	 */
    public int     nAntiJammingValue;      
    
	/**
	 * \if ENGLISH_LANG
	 * Right direction enter threshold, range [0,65535]
	 * \else
	 * 来向进入门槛值,取值范围[0,65535]
	 * \endif
	 */
    public int     nComeInValue;           
    
	/**
	 * \if ENGLISH_LANG
	 * Opposite direction threshold value
	 * \else
	 * 来向离开门槛值
	 * \endif
	 */
    public int     nComeOutValue;          
    
	/**
	 * \if ENGLISH_LANG
	 * Radar delay, unit ms, range [0,255]
	 * \else
	 * 雷达延时,单位ms，范围[0,255]
	 * \endif
	 */
    public int     nDelayTime;             
    
	/**
	 * \if ENGLISH_LANG
	 * Violation type mask, from low to high bit as:0-normal,1-run the red light, 2-cross line, 3-retrogradation,4-low speed,5-over speed,6-occupied lane,7-yellow-plate in lane,8-run the yellow light,9-occupied bus lane
	 * \else
	 * 类型掩码,从低位到高位依次是:0-正常,1-闯红灯, 2-压线, 3-逆行,4-欠速,5-超速,6-有车占道,7-黄牌占道,8-闯黄灯,9-占公交车道
	 * \endif
	 */
    public int     nDetectBreaking;     
    
	/**
	 * \if ENGLISH_LANG
	 * Detection mode  0-head detect 1-tail detect 2-dual
	 * \else
	 * 检测模式  0-车头检测 1-车尾检测 2-双向检测
	 * \endif
	 */
    public int     nDetectMode;            
    
	/**
	 * \if ENGLISH_LANG
	 * Radar installaton  0-side 1-top
	 * \else
	 * 雷达安装方式  0-侧面安装 1-上方安装
	 * \endif
	 */
    public int     nInstallMode;           
    
	/**
	 * \if ENGLISH_LANG
	 * Sensitivity,0 is highest, range [0,5]
	 * \else
	 * 灵敏度,0级灵敏度最高,范围[0,5]
	 * \endif
	 */
    public int     nLevel;                
    
	/**
	 * \if ENGLISH_LANG
	 * Multiple target filter mode,0-normal, 1-filter
	 * \else
	 * 多目标过滤模式,0-正常, 1-过滤
	 * \endif
	 */
    public int     nMultiTargetFilter;     
    
	/**
	 * \if ENGLISH_LANG
	 * Opposite direction signal end threshold
	 * \else
	 * 去向信号结束门槛值
	 * \endif
	 */
    public int     nWentEndValue;         
    
	/**
	 * \if ENGLISH_LANG
	 * Right direction enter threshold
	 * \else
	 * 去向进入门槛值
	 * \endif
	 */
    public int     nWentInValue;          
    
	/**
	 * \if ENGLISH_LANG
	 * Opposite direction unlock threshold
	 * \else
	 * 去向离开门槛值
	 * \endif
	 */
    public int     nWentOutValue;          
}

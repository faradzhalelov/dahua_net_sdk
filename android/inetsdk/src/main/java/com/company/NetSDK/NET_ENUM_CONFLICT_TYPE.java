package com.company.NetSDK;

import java.io.Serializable;

public class NET_ENUM_CONFLICT_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknown 	
	 * \else
	 * 未知
	 * \endif
	 */
    public static final int NET_ENUM_CONFLICT_TYPE_UNKNOWN   = 0;                        
    
    /**
     * \if ENGLISH_LANG
     * Main
     * \else
     * 主码流
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_MAIN		 = 1;                        
    
    /**
     * \if ENGLISH_LANG
     * EXTRA1
     * \else
     * 辅码流1
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_EXTRA1    = 2;                        
    
    /**
     * \if ENGLISH_LANG
     * EXTRA2
     * \else
     * 辅码流2
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_EXTRA2    = 3;                        
    
    /**
     * \if ENGLISH_LANG
     * TVOUT
     * \else
     * 模拟输出
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_TVOUT     = 4;                        
    
    /**
     * \if ENGLISH_LANG
     * DSP
     * \else
     * 智能
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_DSP       = 5;                        
    
    /**
     * \if ENGLISH_LANG
     * Smart Enc
     * \else
     * Smart编码(长GOP)
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_SMARTENC  = 6;                        
    
    /**
     * \if ENGLISH_LANG
     * SET GOP
     * \else
     * 设置GOP
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_SETGOP    = 7;                        
    
    /**
     * \if ENGLISH_LANG
     * ROI
     * \else
     * 感兴趣区域
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_ROI       = 8;                       
    
    /**
     * \if ENGLISH_LANG
     * CBR
     * \else
     * 恒定码流编码
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_CBR       = 9;                        
    
    /**
     * \if ENGLISH_LANG
     * SVC
     * \else
     * SVC编码
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_SVC       = 10;                       
    
    /**
     * \if ENGLISH_LANG
     * MJPEG
     * \else
     * MJPEG编码
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_MJPEG     = 11;                       
    
    /**
     * \if ENGLISH_LANG
     * ROTATE 90
     * \else
     * 旋转90度
     * \endif
     */
    public static final int NET_ENUM_CONFLICT_TYPE_ROTATE_90 = 12;                       
	
}

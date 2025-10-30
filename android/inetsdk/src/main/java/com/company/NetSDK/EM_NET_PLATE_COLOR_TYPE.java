package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * License Plate Color
 * \else
 * 车牌颜色
 * \endif
 */
public class EM_NET_PLATE_COLOR_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * other colors
	 * \else
	 * 其他颜色
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_OTHER = 0;                              
    
	/**
	 * \if ENGLISH_LANG
	 * blue	  "Blue"
	 * \else
	 * 蓝色 "Blue"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_BLUE = 1;                               
    
	/**
	 * \if ENGLISH_LANG
	 * yellow   "Yellow"
	 * \else
	 * 黄色 "Yellow"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_YELLOW = 2;                                 
    
	/**
	 * \if ENGLISH_LANG
	 * white  "White"
	 * \else
	 * 白色 "White"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_WHITE = 3;                              
    
	/**
	 * \if ENGLISH_LANG
	 * black	"Black"
	 * \else
	 * 黑色 "Black"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_BLACK = 4;                              
    
	/**
	 * \if ENGLISH_LANG
	 * Yellow Bottom Positive Figure	"YellowbottomBlackText"
	 * \else
	 * 黄底黑字 "YellowbottomBlackText"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_YELLOW_BOTTOM_BLACK_TEXT = 5;           
    
	/**
	 * \if ENGLISH_LANG
	 * 	White on Blue   "BluebottomWhiteText" 
	 * \else
	 * 蓝底白字 "BluebottomWhiteText" 
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_BLUE_BOTTOM_WHITE_TEXT = 6;             
    
	/**
	 * \if ENGLISH_LANG
	 * White on Black	"BlackBottomWhiteText"
	 * \else
	 * 黑底白字 "BlackBottomWhiteText"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_BLACK_BOTTOM_WHITE_TEXT = 7;            
    
	/**
	 * \if ENGLISH_LANG
	 * Shadow Green   "ShadowGreen"
	 * \else
	 * 渐变绿 "ShadowGreen"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_SHADOW_GREEN = 8;						
    
	/**
	 * \if ENGLISH_LANG
	 * YellowGreen   "YellowGreen"
	 * \else
	 * 黄绿双拼 "YellowGreen"
	 * \endif
	 */
    public static final int NET_PLATE_COLOR_YELLOW_GREEN = 9;					
}

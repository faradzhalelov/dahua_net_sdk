package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* fisheye correct mode
* \else
* 鱼眼矫正模式
* \endif
*/
public class NET_WM_FISHEYE_CALIBRATE_MODE implements Serializable {

	/**
	 * 
	 */
	public  static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知模式
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_UNKOWN = 0;        
    
	 /**
	 * \if ENGLISH_LANG
	 * close fisheye algorithm
	 * \else
	 * 关闭鱼眼算法
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_CLOSE     = 1;         
    
	 /**
	 * \if ENGLISH_LANG
	 * original mode(square), bell scalling
	 * \else
	 * 原始模式(正方形) 带缩放比例
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_ORIGINAL  = 2;        
    
	 /**
	 * \if ENGLISH_LANG
	 * 1P
	 * \else
	 * 1P
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_PANORAMA     = 3;     
    
	 /**
	 * \if ENGLISH_LANG
	 * 1P+1
	 * \else
	 * 1P+1
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_PAN_PLUS_ONE    =4;  
    
	 /**
	 * \if ENGLISH_LANG
	 * 2P
	 * \else
	 * 2P
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_DOUBLE_PANORAMA =5;      
    
	 /**
	 * \if ENGLISH_LANG
	 * 1+2p
	 * \else
	 * 1+2p
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_ORI_DOUBLE_PAN  = 6;   
    
	 /**
	 * \if ENGLISH_LANG
	 * 1+3
	 * \else
	 * 1+3
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_ORI_PLUS_THREEE =7;  
    
	 /**
	 * \if ENGLISH_LANG
	 * 1p+3
	 * \else
	 * 1p+3
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_PAN_PLUS_THREEE = 8;   
    
	 /**
	 * \if ENGLISH_LANG
	 * 1+2
	 * \else
	 * 1+2
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_ORI_PLUS_TWO = 9;       
    
	 /**
	 * \if ENGLISH_LANG
	 * 1+4
	 * \else
	 * 1+4
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_ORI_PLUS_FOUR =10;   
    
	 /**
	 * \if ENGLISH_LANG
	 * 1p+4
	 * \else
	 * 1p+4
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_PAN_PLUS_FOUR = 11;   
    
	 /**
	 * \if ENGLISH_LANG
	 * 1p+6
	 * \else
	 * 1p+6
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_PAN_PLUS_SIX  = 12;     
    
	 /**
	 * \if ENGLISH_LANG
	 * 1+8
	 * \else
	 * 1+8
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_ORI_PLUS_EIGHT = 13;    
    
	 /**
	 * \if ENGLISH_LANG
	 * 1P+8
	 * \else
	 * 1P+8
	 * \endif
	 */
    public  static final int NET_WM_FISHEYE_CALIBRATE_MODE_PAN_PLUS_EIGHT = 14;   

}

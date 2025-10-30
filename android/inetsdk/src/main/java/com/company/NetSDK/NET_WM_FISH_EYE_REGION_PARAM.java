package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* fisheye correct window area parameter
* \else
* 鱼眼矫正窗口区域参数
* \endif
*/
public class NET_WM_FISH_EYE_REGION_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * the center of the window corresponds to the horizontal cordinate of the original cricle
	 * \else
	 * 窗口中心对应到原始圆的横坐标
	 * \endif
	 */
    public int     nCoordinateX;         
    
	 /**
	 * \if ENGLISH_LANG
	 * the center of the window corresponds to the vertical cordinate of the original cricle
	 * \else
	 * 窗口中心对应到原始圆的纵坐标
	 * \endif
	 */
    public int     nCoordinateY;         
    
	 /**
	 * \if ENGLISH_LANG
	 * to x, y as the center, correcting the horizontal angle of the area
	 * \else
	 * 以X、Y为中心,校正区域范围的水平角度
	 * \endif
	 */
    public int     nAngleH;              
    
	 /**
	 * \if ENGLISH_LANG
	 * to x, y as the center, correcting the vertical angle of the area
	 * \else
	 * 以X、Y为中心,校正区域范围的垂直角度
	 * \endif
	 */
    public int     nAngleV;              
    
	 /**
	 * \if ENGLISH_LANG
	 * is available
	 * \else
	 * 表示是否可用
	 * \endif
	 */
    public int 	nAvailable;			 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * All OSD Item Public Property
 * \else
 * 全体OSD项共用属性
 * \endif
 */
public class OSD_WHOLE_ATTR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * If position is same with black border ,true, following Position is invalid
	 * \else
	 * 位置是否同黑边相同,true时，下面的Position无效
	 * \endif
	 */
    public boolean        bPositionAsBlackRegion;     
    
	/**
	 * \if ENGLISH_LANG
	 * Position, cannot exceed picture range
	 * \else
	 * 位置,不能超过图片范围
	 * \endif
	 */
    public CFG_RECT    	  stPostion = new CFG_RECT();                 
    
	/**
	 * \if ENGLISH_LANG
	 * Exceed rectangle range, if change line ,bPositionAsBlackRegion is true valid
	 * \else
	 * 超出矩形范围是否换行,bPositionAsBlackRegion为true时有效
	 * \endif
	 */
    public boolean        bNewLine;                  
    
	/**
	 * \if ENGLISH_LANG
	 * Vehicle info independent display, true one line displays vehicle info,false allows multiple vehicle info display in one line
	 * \else
	 * 车辆信息独立显示,true 一行显示一辆车信息,false 允许多辆车信息显示在一行
	 * \endif
	 */
    public boolean        bLoneVehicle;               
}

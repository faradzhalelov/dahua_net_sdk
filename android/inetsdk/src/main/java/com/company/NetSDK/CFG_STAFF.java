package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Staff
 * \else
 * 标尺
 * \endif
 */
public class CFG_STAFF implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Start location
	 * \else
	 * 起始坐标点
	 * \endif
	 */
	public CFG_POLYLINE       stuStartLocation = new CFG_POLYLINE();    
	
	/**
	 * \if ENGLISH_LANG
	 * End location
	 * \else
	 * 终止坐标点
	 * \endif
	 */
	public CFG_POLYLINE       stuEndLocation   = new CFG_POLYLINE();    
	
	/**
	 * \if ENGLISH_LANG
	 * Lenth, in pixel unit
	 * \else
	 * 实际长度,单位米
	 * \endif
	 */
	public float              nLenth;              						
	
	/**
	 * \if ENGLISH_LANG
	 * Staff type, refer to {@link EM_STAFF_TYPE}
	 * \else
	 * 标尺类型, 对应 {@link EM_STAFF_TYPE}
	 * \endif
	 */
	public int     	          emType;               				    
}

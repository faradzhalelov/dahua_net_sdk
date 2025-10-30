package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Special detect region, refers to distinguish from the testing area, with special detection properties area
 * \else
 * 特殊检测区，是指从检测区中区分出来，有特殊检测属性的区域
 * \endif
 */

public class CFG_SPECIALDETECT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Detect num
	 * \else
	 * 检测区域顶点数
	 * \endif
	 */
	public int                nDetectNum;         
	
	/**
	 * \if ENGLISH_LANG
	 * Detect region
	 * \else
	 * 检测区域
	 * \endif
	 */
	public CFG_POLYGON[]      stDetectRegion = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];         
	
	/**
	 * \if ENGLISH_LANG
	 * Special detect attribute num
	 * \else
	 * 特殊检测区属性个数
	 * \endif
	 */
	public int                nPropertyNum;  
	
	/**
	 * \if ENGLISH_LANG
	 * Special detect attribute
	 * \else
	 * 特殊检测区属性
	 * \endif
	 */
	public int[]              nPropertys = new int[EM_SEPCIALREGION_PROPERTY_TYPE.EM_SEPCIALREGION_PROPERTY_TYPE_NUM];    
	
	public CFG_SPECIALDETECT_INFO() {
		for(int i = 0; i < FinalVar.MAX_POLYGON_NUM; i++) {
			stDetectRegion[i] = new CFG_POLYGON();
		}
	}
}

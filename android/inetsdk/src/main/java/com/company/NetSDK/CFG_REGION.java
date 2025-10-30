package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Region information
 * \else
 * 区域信息
 * \endif
 */
public class CFG_REGION implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public int         	   nPointNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone point info
	 * \else
	 * 区域顶点信息
	 * \endif
	 */
	public CFG_POLYGON[]   stuPolygon = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];
	
	public CFG_REGION() {
		for(int i=0; i<FinalVar.MAX_POLYGON_NUM; ++i) {
			stuPolygon[i] = new CFG_POLYGON();
		}
	}
}

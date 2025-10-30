package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The info of calibrate area, it is used in normal scene
 * \else
 * 标定区域,普通场景使用
 * \endif
 */
public class CFG_CALIBRATEAREA_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Horizontal staff points number
	 * \else
	 * 水平方向标尺线顶点数
	 * \endif
	 */
	public int						nLinePoint;					
	
	/**
	 * \if ENGLISH_LANG
	 * Horizontal staff points
	 * \else
	 * 水平方向标尺线
	 * \endif
	 */
	public CFG_POLYGON[]			stuLine = new CFG_POLYGON[FinalVar.MAX_POLYLINE_NUM];	
	
	/**
	 * \if ENGLISH_LANG
	 * Actual lenth
	 * \else
	 * 实际长度
	 * \endif
	 */
	public float					fLenth;                 		
	
	/**
	 * \if ENGLISH_LANG
	 * Area
	 * \else
	 * 区域
	 * \endif
	 */
	public CFG_REGION				stuArea = new CFG_REGION();     
	
	/**
	 * \if ENGLISH_LANG
	 * Vertical staff points number
	 * \else
	 * 垂直标尺数
	 * \endif
	 */
	public int                 	    nStaffNum;                 		
	
	/**
	 * \if ENGLISH_LANG
	 * Vertical staff points      
	 * \else
	 * 垂直标尺   
	 * \endif
	 */
	public CFG_STAFF[]           	stuStaffs = new CFG_STAFF[FinalVar.MAX_STAFF_NUM];		 
	
	/**
	 * \if ENGLISH_LANG
	 * Region type, refer to {@link EM_CALIBRATEAREA_TYPE}
	 * \else
	 * 区域类型. 取值参考 {@link EM_CALIBRATEAREA_TYPE}
	 * \endif
	 */
	public int 					    emType;							
	
	/**
	 * \if ENGLISH_LANG
	 * the calibrate method type, refer to {@link EM_METHOD_TYPE}
	 * \else
	 * 标定方式, 取值参考 {@link EM_METHOD_TYPE}
	 * \endif
	 */
	public int						emMethodType;					
	
	public CFG_CALIBRATEAREA_INFO() {
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; ++i) {
			stuLine[i] = new CFG_POLYGON();
		}
		
		for(int i=0; i<FinalVar.MAX_STAFF_NUM; ++i) {
			stuStaffs[i] = new CFG_STAFF();
		}
	}
}

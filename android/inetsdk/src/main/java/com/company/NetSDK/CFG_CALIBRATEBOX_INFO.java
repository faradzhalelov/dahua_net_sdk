package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Calibrate box info    
 * \else
 * 校准框信息
 * \endif
 */

public class CFG_CALIBRATEBOX_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Calibrate box center point(0,8191)
	 * \else
	 * 校准框中心点坐标(点的坐标归一化到[0,8191]区间)
	 * \endif
	 */
	public CFG_POLYGON         stuCenterPoint = new CFG_POLYGON();   
	
	/**
	 * \if ENGLISH_LANG
	 * The relative ratio of the calibrate box(such as 1 means the calibrate box,0.5 means the half size of the calibrate box)
	 * \else
	 * 相对基准校准框的比率(比如1表示基准框大小，0.5表示基准框大小的一半)
	 * \endif
	 */
	public float               fRatio;                               
}

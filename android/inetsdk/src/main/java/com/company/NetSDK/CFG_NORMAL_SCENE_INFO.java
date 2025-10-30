package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Common Scene
 * \else
 * 普遍场景
 * \endif
 */
public class CFG_NORMAL_SCENE_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Camera distance to ground	unit:m
	 * \else
	 * 摄像头离地高度    单位：米
	 * \endif
	 */
	public float				fCameraHeight;							
	
	/**
	 * \if ENGLISH_LANG
	 * Camera and vertical direction angle	unit degree:0~90
	 * \else
	 * 摄像头与垂方向的夹角	单位度:0~90，
	 * \endif
	 */
	public float				fCameraAngle;							
	
	/**
	 * \if ENGLISH_LANG
	 * Camera distance to ground center horizontal distance	  unit:m
	 * \else
	 * 摄像头离地面检测区域中心的水平距离	单位：米
	 * \endif
	 */
	public float				fCameraDistance;						
	
	/**
	 * \if ENGLISH_LANG
	 * Horizon line starting point(Point coordinate normalized to [0,8192) zone)
	 * \else
	 * 地平线线段起始点(点的坐标坐标归一化到[0,8192)区间。)
	 * \endif
	 */
	public CFG_POLYGON			stuLandLineStart = new CFG_POLYGON();	
	
	/**
	 * \if ENGLISH_LANG
	 * Horizon line terminal(Point coordinate normalized to [0,8192)zone)
	 * \else
	 * 地平线线段终止点(点的坐标坐标归一化到[0,8192)区间。)
	 * \endif
	 */
	public CFG_POLYGON			stuLandLineEnd   = new CFG_POLYGON();	
}

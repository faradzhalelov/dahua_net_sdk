package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target detection scene
 * \else
 * 目标检测场景
 * \endif
 */
public class CFG_FACEDETECTION_SCENCE_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Camera height, meter
	 * \else
	 * 摄像头离地高度 单位：米
	 * \endif
	 */
	public double			   dbCameraHeight;							
	
	/**
	 * \if ENGLISH_LANG
	 * Camera distance, meter
	 * \else
	 * 摄像头离地面检测区域中心的水平距离 单位：米
	 * \endif
	 */
	public double			   dbCameraDistance;						
	
	/**
	 * \if ENGLISH_LANG
	 * Crowd main direction points number 
	 * \else
	 * 人流主要方向顶点数
	 * \endif
	 */
	public int                 nMainDirection;                         
	
	/**
	 * \if ENGLISH_LANG
	 * Crowd main direction ,first point is start point,the secend point is end point 
	 * \else
	 * 人流主要方向，第一个点是起始点，第二个点是终止点
	 * \endif
	 */
	public CFG_POLYGON[]       stuMainDirection = new CFG_POLYGON[FinalVar.MAX_POLYLINE_NUM];    
	
	/**
	 * \if ENGLISH_LANG
	 * -45~45
	 * \else
	 * 需要检测的目标向下最大偏角, 单位度，-45~45，负数表示目标向画面上边，正数表示目标向画面下边，0表示目标垂直方向上正对着摄像头。
	 * \endif
	 */
	public byte                byFaceAngleDown;                        
	
	/**
	 * \if ENGLISH_LANG
	 * -45~45 
	 * \else
	 * 需要检测的目标向上最大偏角,单位度，-45~45，负数表示目标向画面上边，正数表示目标向画面下边，0表示目标垂直方向上正对着摄像头。
	 * \endif
	 */
	public byte                byFaceAngleUp;                          
	
	/**
	 * \if ENGLISH_LANG
	 * -45~45 
	 * \else
	 * 需要检测的目标向左最大偏角,单位度，-45~45，负数表示目标向画面左边，正数表示目标向画面右边，0表示目标水平方向上正对着摄像头
	 * \endif
	 */
	public byte                byFaceAngleLeft;                       
	
	/**
	 * \if ENGLISH_LANG
	 * -45~45 
	 * \else
	 * 需要检测的目标向右最大偏角,单位度，-45~45，负数表示目标向画面左边，正数表示目标向画面右边，0表示目标水平方向上正对着摄像头
	 * \endif
	 */
	public byte                byFaceAngleRight;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Target detect type， refer to {@link EM_FACEDETECTION_TYPE}
	 * \else
	 * 目标检测类型, 取值参考 {@link EM_FACEDETECTION_TYPE}
	 * \endif
	 */
	public int		      	   emDetectType;						
	
	public CFG_FACEDETECTION_SCENCE_INFO() {
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stuMainDirection[i] = new CFG_POLYGON();
		}
	}
}

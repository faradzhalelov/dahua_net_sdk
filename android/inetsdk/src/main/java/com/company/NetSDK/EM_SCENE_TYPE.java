package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the scene type, same as {@link EM_SCENE_CLASS_TYPE}
 * \else
 * 应用场景, 内容与 {@link EM_SCENE_CLASS_TYPE} 一致
 * \endif
 */
public class EM_SCENE_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow  
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_SCENE_UNKNOW  		  = 0;	
	
	
	/**
	 * \if ENGLISH_LANG
	 * "Normal" 
	 * \else
	 * "Normal" 普通场景
	 * \endif
	 */
	public static final int EM_SCENE_NORMAL			  = 1;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "Traffic" 
	 * \else
	 * "Traffic" 交通场景
	 * \endif
	 */
	public static final int EM_SCENE_TRAFFIC		  = 2;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "TrafficPatrol" 
	 * \else
	 * "TrafficPatrol" 交通巡视
	 * \endif
	 */
	public static final int EM_SCENE_TRAFFIC_PATROL   = 3;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "FaceDetection" 
	 * \else
	 * "FaceDetection" 目标检测/目标识别
	 * \endif
	 */
	public static final int EM_SCENE_FACEDETECTION	  = 4;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "ATM"
	 * \else
	 * "ATM"
	 * \endif
	 */
	public static final int EM_SCENE_ATM			  = 5;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "Indoor" 
	 * \else
	 * "Indoor"  室内行为分析，和普通规则相同，对室内场景的算法优化版
	 * \endif
	 */
	public static final int EM_SCENE_INDOOR			  = 6;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "TargetRecognition"
	 * \else
	 * "TargetRecognition" 目标识别
	 * \endif
	 */
	public static final int EM_SCENE_FACERECOGNITION  = 7;		    
	
	
	/**
	 * \if ENGLISH_LANG
	 * "ARGp"
	 * \else
	 * "ARGp"
	 * \endif
	 */
	public static final int EM_SCENE_PS			  = 8;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "NumberStat"
	 * \else
	 * "NumberStat" 客流量统计
	 * \endif
	 */
	public static final int EM_SCENE_NUMBERSTAT		  = 9;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "HeatMap" 
	 * \else
	 * "HeatMap" 热度图
	 * \endif
	 */
	public static final int EM_SCENE_HEAT_MAP		  = 10;		    
	
	
	/**
	 * \if ENGLISH_LANG
	 * "VideoDiagnosis" 
	 * \else
	 * "VideoDiagnosis" 视频诊断
	 * \endif
	 */
	public static final int EM_SCENE_VIDEODIAGNOSIS	  = 11;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "VehicleAnalyse" 
	 * \else
	 * "VehicleAnalyse" 车辆特征检测分析
	 * \endif
	 */
	public static final int EM_SCENE_VEHICLEANALYSE	  = 12;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "CourseRecord" 
	 * \else
	 * "CourseRecord" 自动录播
	 * \endif
	 */
	public static final int EM_SCENE_COURSERECORD     = 13;		    
	
	
	/**
	 * \if ENGLISH_LANG
	 * "Vehicle" 
	 * \else
	 * "Vehicle" 车载场景(车载行业用，不同于智能交通的Traffic)
	 * \endif
	 */
	public static final int EM_SCENE_VEHICLE		  = 14;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "StandUpDetection" 
	 * \else
	 * "StandUpDetection" 起立检测
	 * \endif
	 */
	public static final int EM_SCENE_STANDUPDETECTION = 15;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "Gate" 
	 * \else
	 * "Gate" 卡口
	 * \endif
	 */
	public static final int EM_SCENE_GATE			  = 16;		    
	
	
	/**
	 * \if ENGLISH_LANG
	 * "SDFaceDetect" 
	 * \else
	 * "SDFaceDetect"  多预置点目标检测，配置一条规则但可以在不同预置点下生效
	 * \endif
	 */
	public static final int EM_SCENE_SDFACEDETECTION  = 17;	        
	
	
	/**
	 * \if ENGLISH_LANG
	 * "HeatMapPlan" 
	 * \else
	 * "HeatMapPlan" 球机热度图计划
	 * \endif
	 */
	public static final int EM_SCENE_HEAT_MAP_PLAN    = 18;		    
	
	
	/**
	 * \if ENGLISH_LANG
	 * "NumberStatPlan" 
	 * \else
	 * "NumberStatPlan"	球机客流量统计计划
	 * \endif
	 */
	public static final int EM_SCENE_NUMBERSTAT_PLAN  = 19;	     	
	
	
	/**
	 * \if ENGLISH_LANG
	 * "ATMFD" 
	 * \else
	 * "ATMFD"金融目标检测，包括正常目标、异常目标、相邻目标、头盔目标等针对ATM场景特殊优化
	 * \endif
	 */
	public static final int EM_SCENE_ATMFD			  = 20;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "Highway " 
	 * \else
	 * "Highway" 高速交通事件检测
	 * \endif
	 */
	public static final int EM_SCENE_HIGHWAY          = 21;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "City" 
	 * \else
	 * "City" 城市交通事件检测
	 * \endif
	 */
	public static final int EM_SCENE_CITY             = 22;		    
	
	
	/**
	 * \if ENGLISH_LANG
	 * "LeTrack" 
	 * \else
	 * "LeTrack" 民用简易跟踪
	 * \endif
	 */
	public static final int EM_SCENE_LETRACK          = 23;			
	
	
	/**
	 * \if ENGLISH_LANG
	 * "SCR" 
	 * \else
	 * "SCR"打靶相机
	 * \endif
	 */
	public static final int EM_SCENE_SCR			  = 24;

	/**
	 * \if ENGLISH_LANG
	 * "OperateMonitor"
	 * \else
	 * "OperateMonitor"睿厨
	 * \endif
	 */
	public static final int EM_SCENE_OPERATE_MONITOR			  = 25;



}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video analyse global configration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ANALYSEGLOBAL}
 * \else
 * 视频分析全局配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ANALYSEGLOBAL}
 * \endif
 */
public class CFG_ANALYSEGLOBAL_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	
	/****************************************************************************
	 * 						                信息								            *
	 ****************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Application Scenes,See"Scene List of Supported", refer to {@link EM_SCENE_TYPE}
	 * \else
	 * 应用场景,详见"支持的场景列表", 取值参考 {@link EM_SCENE_TYPE}
	 * \endif
	 */
	public byte[]		           szSceneType = new byte[FinalVar.MAX_NAME_LEN];	 			 	

	
	/****************************************************************************
	 * 						          交通场景信息								    *
	 ****************************************************************************/
	 /**
	 * \if ENGLISH_LANG
	 * Camera height, meter
	 * \else
	 * 摄像头离地高度	单位：米
	 * \endif
	 */
    public double				   CameraHeight;							
    
	 /**
	 * \if ENGLISH_LANG
	 * Camera distance, meter
	 * \else
	 * 摄像头离地面检测区域中心的水平距离	单位：米
	 * \endif
	 */
	public double				   CameraDistance;						    
	
	 /**
	 * \if ENGLISH_LANG
	 * Near Detect Points
	 * \else
	 * 近景检测点
	 * \endif
	 */
	public CFG_POLYGON             stuNearDetectPoint = new CFG_POLYGON();  
	
	 /**
	 * \if ENGLISH_LANG
	 * Far Dectect Points
	 * \else
	 * 远景检测点
	 * \endif
	 */
	public CFG_POLYGON             stuFarDectectPoint = new CFG_POLYGON();  
	
	 /**
	 * \if ENGLISH_LANG
	 * The distance between NearDetectPoint and camera
	 * \else
	 * NearDetectPoint,转换到实际场景中时,离摄像头垂直线的水平距离
	 * \endif
	 */
	public int                     nNearDistance;                           
	
	 /**
	 * \if ENGLISH_LANG
	 * The distance between FarDectectPoint and camera
	 * \else
	 * FarDectectPoint,转换到实际场景中时,离摄像头垂直线的水平距离
	 * \endif
	 */
	public int                     nFarDistance;                            
	
	 /**
	 * \if ENGLISH_LANG
	 * Traffic sence's sub type, such as "Gate","Junction"
	 * \else
	 * 交通场景的子类型,"Gate",卡口类型,"Junction" 路口类型,"ParkingSpace" 车位检测类型                             
	 * \endif
	 */
	public byte[]                  szSubType = new byte[FinalVar.MAX_NAME_LEN];       				 
	
	 /**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * 车道数
	 * \endif
	 */
	public int                     nLaneNum;                               
	
	 /**
	 * \if ENGLISH_LANG
	 * Road info
	 * \else
	 * 车道信息
	 * \endif
	 */
	public CFG_LANE[]              stuLanes = new CFG_LANE[FinalVar.MAX_LANE_NUM];     
	
	 /**
	 * \if ENGLISH_LANG
	 * Plant hints chars number
	 * \else
	 * 车牌字符暗示个数
	 * \endif
	 */
    public int                     nPlateHintNum;                          
    
	 /**
	 * \if ENGLISH_LANG
	 * Plant hints char info,when the pictrue was bad to recognize the plant,then it will use these hints for the plant,the litter index, the higher priority
	 * \else
	 * 车牌字符暗示数组，在拍摄图片质量较差车牌识别不确定时，根据此数组中的字符进行匹配，数组下标越小，匹配优先级越高
	 * \endif
	 */
    public byte[][]                szPlateHints = new byte[FinalVar.MAX_PLATEHINT_NUM][FinalVar.MAX_NAME_LEN]; 
	
	 /**
	 * \if ENGLISH_LANG
	 * Light group number
	 * \else
	 * 灯组数
	 * \endif
	 */
    public int                     nLightGroupNum;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * Light group info
	 * \else
	 * 灯组配置信息
	 * \endif
	 */
	public CFG_LIGHTGROUPS[]       stLightGroups = new CFG_LIGHTGROUPS[FinalVar.MAX_LIGHTGROUP_NUM]; 
    
	 /**
	 * \if ENGLISH_LANG
	 * whether recognize work plate
	 * \else
	 * 是否识别挂字车牌
	 * \endif
	 */
	public boolean                 bHangingWordPlate;                      
	
	 /**
	 * \if ENGLISH_LANG
	 * whether recognize non-standard police plate
	 * \else
	 * 是否识别非标准警牌
	 * \endif
	 */
    public boolean                 bNonStdPolicePlate;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * whether recognize yellow plate letter
	 * \else
	 * 是否识别黄牌字母
	 * \endif
	 */
    public boolean                 bYellowPlateLetter;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * report mode, 0:undefined, 1:report all violation vehicles, 2: report plate successfully recognized violation vehicle
	 * \else
	 * 上报模式，0：未定义，1：上报所有车辆，2：上报车牌识别成功的车辆
	 * \endif
	 */
    public int                     nReportMode;                            
    
	 /**
	 * \if ENGLISH_LANG
	 * plate matching rate. 0~100, multi-recognition of plate use, means required identification of repeated plate recognition and previous plate recognition
	 * \else
	 * 车牌匹配率，0~100，多次识别车牌使用,表示重复识别车牌和前一次识别车牌的一致性要求
	 * \endif
	 */
    public int                     nPlateMatch;                            
    
	 /**
	 * \if ENGLISH_LANG
	 * violation judgment basis, 0: undefined, 1: by lane, 2:by driving direction, 3: by lane and driving direction
	 * \else
	 * 判定依据，0：未定义，1：按车道，2：按行驶方向，3：按车道和行驶方向
	 * \endif
	 */
    public int                     nJudgment;                              
    
	 /**
	 * \if ENGLISH_LANG
	 * left turn boundary point
	 * \else
	 * 左转弯分界线点数
	 * \endif
	 */
    public int                     nLeftDivisionPtCount;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * left turn boundary line
	 * \else
	 * 左转弯分界线
	 * \endif
	 */
    public CFG_POLYLINE[]          stLeftDivisionLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];   
    
	 /**
	 * \if ENGLISH_LANG
	 * right turn boundary point
	 * \else
	 * 右转弯分界线点数
	 * \endif
	 */
    public int                     nRightDivisionPtCount;                  
    
	 /**
	 * \if ENGLISH_LANG
	 * right turn boundary line
	 * \else
	 * 右转弯分界线
	 * \endif
	 */
    public CFG_POLYLINE[]          stRightDivisionLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];  
    
	 /**
	 * \if ENGLISH_LANG
	 * traffic light color correction config
	 * \else
	 * 交通灯颜色校正配置
	 * \endif
	 */
    public CFG_ADJUST_LIGHT_COLOR  stAdjustLightColor = new CFG_ADJUST_LIGHT_COLOR();                  
    
	 /**
	 * \if ENGLISH_LANG
	 * parking number
	 * \else
	 * 车位数
	 * \endif
	 */
    public int                     nParkingSpaceNum;                                      
    
	 /**
	 * \if ENGLISH_LANG
	 * parking config info, each element represents a parking
	 * \else
	 * 车位配置信息,每个元素代表一个车位
	 * \endif
	 */
    public CFG_PARKING_SPACE[]     stParkingSpaces = new CFG_PARKING_SPACE[FinalVar.MAX_PARKING_SPACE_NUM];  


	/****************************************************************************
	 * 						          一般场景信息 								    *
	 ****************************************************************************/
	 /**
	 * \if ENGLISH_LANG
	 * Staff number
	 * \else
	 * 标尺数
	 * \endif
	 */
	public int                     nStaffNum;                              
	
	 /**
	 * \if ENGLISH_LANG
	 * Staff
	 * \else
	 * 标尺
	 * \endif
	 */
	public CFG_STAFF[]             stuStaffs = new CFG_STAFF[FinalVar.MAX_STAFF_NUM]; 

	 /**
	 * \if ENGLISH_LANG
	 * Calibrate Area Number
	 * \else
	 * 标定区域数
	 * \endif
	 */
	public int                     nCalibrateAreaNum;                      
	
	 /**
	 * \if ENGLISH_LANG
	 * The calibrate area(if there is no calibrate area, then the whole sence will be the calibrate area)
	 * \else
	 * 标定区域(若该字段不存在，则以整幅场景为标定区域)
	 * \endif
	 */
	public CFG_CALIBRATEAREA_INFO[] stuCalibrateArea = new CFG_CALIBRATEAREA_INFO[FinalVar.MAX_CALIBRATEBOX_NUM]; 

	 /**
	 * \if ENGLISH_LANG
	 * Target detection efficiency or not
	 * \else
	 * 目标识别场景是否有效
	 * \endif
	 */
	public boolean                 bFaceRecognition;            
	
	 /**
	 * \if ENGLISH_LANG
	 * Target recognition scene   
	 * \else
	 * 目标识别场景
	 * \endif
	 */
	public CFG_FACERECOGNITION_SCENCE_INFO stuFaceRecognitionScene = new CFG_FACERECOGNITION_SCENCE_INFO();       
		
	public boolean                 abJitter;
	public boolean                 abDejitter;
	public boolean                 abCompatibleMode;	
	
	 /**
	 * \if ENGLISH_LANG
	 * Camera jitter frequency,0-100. It is to reflect camera's jitter level, more jitter, higher value 
	 * \else
	 * 摄像机抖动率 : 摄像机抖动率，取值0-100，反应静止摄像机抖动程度，抖动越厉害，值越大。
	 * \endif
	 */
	public int					   nJitter;							      
	
	 /**
	 * \if ENGLISH_LANG
	 * Turn on dejitter module or not   unrealistic for now 
	 * \else
	 * 是否开启去抖动模块 目前不实现
	 * \endif
	 */
	public boolean                 bDejitter;                             
	
	 /**
	 * \if ENGLISH_LANG
	 * 0:"OldTrafficRule" : Previous  traffic rule compatible mode;1:"NewTrafficRule" :  new traffic rule compatible mode:-1:string error
	 * \else
	 * 0:"OldTrafficRule" : 交通老规则兼容模式;1:"NewTrafficRule" :  交通新规则兼容模式;-1:字符串错误
	 * \endif
	 */
	public int                     nCompatibleMode;    
	
	 /**
	 * \if ENGLISH_LANG
	 * Real data length, less than 1024
	 * \else
	 * 实际数据长度，不能大于1024
	 * \endif
	 */
	public int                     nCustomDataLen;                         
	
	 /**
	 * \if ENGLISH_LANG
	 * Config data
	 * \else
	 * 第三方自定义配置数据
	 * \endif
	 */
	public byte[]                  byCustomData = new byte[1024];                     
	
	 /**
	 * \if ENGLISH_LANG
	 * Camera angle
	 * \else
	 * 摄像头与垂方向的夹角
	 * \endif
	 */
	public double				   CameraAngle;							   
	
	 /**
	 * \if ENGLISH_LANG
	 * Start land line,in [0,8192)
	 * \else
	 * 地平线线段起始点(点的坐标坐标归一化到[0,8192)区间。)
	 * \endif
	 */
	public CFG_POLYGON			   stuLandLineStart = new CFG_POLYGON();   
	
	 /**
	 * \if ENGLISH_LANG
	 * End land line,in [0,8192)
	 * \else
	 * 地平线线段终止点(点的坐标坐标归一化到[0,8192)区间。)
	 * \endif
	 */
	public CFG_POLYGON			   stuLandLineEnd = new CFG_POLYGON();	   

	 /**
	 * \if ENGLISH_LANG
	 * Target detection efficiency or not
	 * \else
	 * 目标检测场景是否有效
	 * \endif
	 */
	public boolean				   bFaceDetection;							
	
	 /**
	 * \if ENGLISH_LANG
	 * Target detection scene
	 * \else
	 * 目标检测场景
	 * \endif
	 */
	public CFG_FACEDETECTION_SCENCE_INFO    stuFaceDetectionScene = new CFG_FACEDETECTION_SCENCE_INFO();		    
	
	 /**
	 * \if ENGLISH_LANG
	 * Calibrate Time of Day.(8,20),Indicate from 8am to 8pm  is daytime
	 * \else
	 * 标定白天的时间段.(8,20),表示从8点到晚上20点为白天
	 * \endif
	 */
	public CFG_TIME_PERIOD		  		    stuDayTimePeriod = new CFG_TIME_PERIOD();										
	
	 /**
	 * \if ENGLISH_LANG
	 * Calibrate Time of Night.(20,7) Indicate from 8 pm to 7am is night
	 * \else
	 * 标定黑夜的时间段.(20,7)，表示从晚8点到凌晨7点为黑夜
	 * \endif
	 */
	public CFG_TIME_PERIOD		            stuNightTimePeriod = new CFG_TIME_PERIOD();								
	
	 /**
	 * \if ENGLISH_LANG
	 * MultiScenario Calibrate Day and night time, new {@link CFG_TIME_PERIOD_SCENE_INFO}(int dwMaxTimePeriodSceneNum), dwMaxTimePeriodSceneNum : Many Scene calibration  Day and night configuration Maximum number(Need to apply for the size of memory)
	 * \else
	 * 多场景标定白天和黑夜时间段, 要申请内存 new {@link CFG_TIME_PERIOD_SCENE_INFO}(int dwMaxTimePeriodSceneNum), dwMaxTimePeriodSceneNum : 多场景标定白天和黑夜配置最大个数(需要申请此大小内存)
	 * \endif
	 */
	public CFG_TIME_PERIOD_SCENE_INFO       stuTimePeriodSceneInfo ;        
	
	 /**
	 * \if ENGLISH_LANG
	 * MultiScenario Calibrate Area Configuration, new {@link CFG_CALIBRATEAREA_SCENE_INFO}(int dwMaxSceneCalibrateAreaNum), dwMaxSceneCalibrateAreaNum : Many Scene Calibrate Area Maximum Number(Need to apply for the size of memory)  
	 * \else
	 * 多场景标定区域配置信息,new {@link CFG_CALIBRATEAREA_SCENE_INFO}(int dwMaxSceneCalibrateAreaNum), dwMaxSceneCalibrateAreaNum : 多场景标定区域最大个数(需要申请此大小内存)
	 * \endif
	 */
	public CFG_CALIBRATEAREA_SCENE_INFO     stuCalibrateAreaSceneInfo;      
	
	 /**
	 * \if ENGLISH_LANG
	 * Day and Night Algorithm Switching Mode, refer to {@link CFG_TIMEPERIOD_SWITCH_MODE}
	 * \else
	 * 昼夜算法切换模式, 取值参考 {@link CFG_TIMEPERIOD_SWITCH_MODE}
	 * \endif
	 */
	public int       			   emSwitchMode;                            

	 /**
	 * \if ENGLISH_LANG
	 * Scene Number, When >0 ,indicate that it support Mult-Scene, stuMultiScenario effective 
	 * \else
	 * 场景数, >0时表示支持多场景, stuMultiScene有效
	 * \endif
	 */
	public int					   nSceneNum;								
	
	 /**
	 * \if ENGLISH_LANG
	 * MultiScenario Configuration
	 * \else
	 * 多场景配置
	 * \endif
	 */
	public CFG_ANALYSEGLOBAL_SCENE[]	    stuMultiScene = new CFG_ANALYSEGLOBAL_SCENE[FinalVar.MAX_ANALYSE_SCENE_NUM];	

	 /**
	 * \if ENGLISH_LANG
	 * the count of scene
	 * \else
	 * 实际场景个数
	 * \endif
	 */
	public int					  nSceneCount;								
	
	 /**
	 * \if ENGLISH_LANG
	 * the list of scene
	 * \else
	 * 场景列别，同一视频通道下启用多个场景时，表示第2个之后的方案(可选)
	 * \endif
	 */
	public byte[][]				  szSceneTypeList = new byte[FinalVar.MAX_SCENE_TYPE_LIST_SIZE][FinalVar.CFG_COMMON_STRING_16];
	
	 /**
	 * \if ENGLISH_LANG
	 * the depth of scene, refer to {@link EM_DEPTH_TYPE}
	 * \else
	 * 画面景深,取值参考 {@link EM_DEPTH_TYPE}
	 * \endif
	 */
	public int					  emDepthType;								
	
	 /**
	 * \if ENGLISH_LANG
	 * PTZ preset Id 0~255
	 * \else
	 * 云台预置点编号，0~255
	 * \endif
	 */
	public int					  nPtzPresetId;								
	
	 /**
	 * \if ENGLISH_LANG
	 *  longitude company:one in a million
	 * \else
	 * 经度 单位百万分之一度
	 * \endif
	 */
	public int					  unLongitude;								
	
	 /**
	 * \if ENGLISH_LANG
	 * dimension company:one in a million
	 * \else
	 * 纬度 单位百万分之一度
	 * \endif
	 */
	public int					  unLatitude;

	/**
	 * \if ENGLISH_LANG
	 * The scene of measure body temperature
	 * \else
	 * 人体测温场景配置
	 * \endif
	 */
	public CFG_DETAIL_DRIVEASSISTANT_INFO	stuDriveAssistant = new CFG_DETAIL_DRIVEASSISTANT_INFO();

	public CFG_ANALYSEGLOBAL_INFO(int dwMaxTimePeriodSceneNum, int dwMaxSceneCalibrateAreaNum) {
		stuTimePeriodSceneInfo = new CFG_TIME_PERIOD_SCENE_INFO(dwMaxTimePeriodSceneNum);
		stuCalibrateAreaSceneInfo = new CFG_CALIBRATEAREA_SCENE_INFO(dwMaxSceneCalibrateAreaNum);
	
		for(int i=0; i<FinalVar.MAX_LANE_NUM; ++i) {
			stuLanes[i] = new CFG_LANE();
		}

		for(int i=0; i<FinalVar.MAX_LIGHTGROUP_NUM; ++i) {
			stLightGroups[i] = new CFG_LIGHTGROUPS();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; ++i) {
			stLeftDivisionLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; ++i) {
			stRightDivisionLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_PARKING_SPACE_NUM; ++i) {
			stParkingSpaces[i] = new CFG_PARKING_SPACE();
		}
		
		for(int i=0; i<FinalVar.MAX_STAFF_NUM; ++i) {
			stuStaffs[i] = new CFG_STAFF();
		}
		
		for(int i=0; i<FinalVar.MAX_CALIBRATEBOX_NUM; ++i) {
			stuCalibrateArea[i] = new CFG_CALIBRATEAREA_INFO();
		}
		
		for(int i=0; i<FinalVar.MAX_ANALYSE_SCENE_NUM; ++i) {
			stuMultiScene[i] = new CFG_ANALYSEGLOBAL_SCENE();
		}
	}	
}

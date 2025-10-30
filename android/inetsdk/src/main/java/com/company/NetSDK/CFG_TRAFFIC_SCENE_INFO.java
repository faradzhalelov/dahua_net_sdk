package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Traffic Scene
 * \else
 * 交通场景
 * \endif
 */
public class CFG_TRAFFIC_SCENE_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public boolean            abCompatibleMode;	
	
	/**
	 * \if ENGLISH_LANG
	 * 0:"OldTrafficRule" : Traffic Old Rules Compatibility Mode;1:"NewTrafficRule" :  Traffic New Rules Compatibility Mode;-1:String Error
	 * \else
	 * 0:"OldTrafficRule" : 交通老规则兼容模式;1:"NewTrafficRule" :  交通新规则兼容模式;-1:字符串错误
	 * \endif
	 */
	public int                nCompatibleMode;                           
	
	/**
	 * \if ENGLISH_LANG
	 * The Camera Height from the Ground	Unit:meter
	 * \else
	 * 摄像头离地高度	单位：米
	 * \endif
	 */
	public float			  fCameraHeight;							  
	
	/**
	 * \if ENGLISH_LANG
	 * Camera Horizontal distance from the Center of a Ground Test Area	   Unit:meter
	 * \else
	 * 摄像头离地面检测区域中心的水平距离	单位：米
	 * \endif
	 */
	public float			  fCameraDistance;							  
	
	/**
	 * \if ENGLISH_LANG
	 * Traffic Scene Subtypes,"Gate" Bayonet Type,"Junction" Intersection Type, "Tunnel"Tunnel Type , "ParkingSpace"Parking Space Detection Type, "Bridge"Bridge Type, "Freeway"Freeway Type  
	 * \else
	 * 交通场景的子类型,"Gate" 卡口类型,"Junction" 路口类型 , "Tunnel"隧道类型 , "ParkingSpace"车位检测类型, "Bridge"桥梁类型, "Freeway"高速公路类型
	 * \endif
	 */
	public byte[]             szSubType = new byte[FinalVar.MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Near Detect Point
	 * \else
	 * 近景检测点
	 * \endif
	 */
	public CFG_POLYGON         stuNearDetectPoint = new CFG_POLYGON();    
	
	/**
	 * \if ENGLISH_LANG
	 * Far Dectect Point
	 * \else
	 * 远景检测点
	 * \endif
	 */
	public CFG_POLYGON         stuFarDectectPoint = new CFG_POLYGON();    
	
	/**
	 * \if ENGLISH_LANG
	 * NearDetectPoint,Conversion to the Actual Scene,The horizontal distance from the camera perpendicular line
	 * \else
	 * NearDetectPoint,转换到实际场景中时,离摄像头垂直线的水平距离
	 * \endif
	 */
	public int                 nNearDistance;                             
	
	/**
	 * \if ENGLISH_LANG
	 * FarDectectPoint,Conversion to the Actual Scene,The horizontal distance from the camera perpendicular line
	 * \else
	 * FarDectectPoint,转换到实际场景中时,离摄像头垂直线的水平距离
	 * \endif
	 */
	public int                 nFarDistance;                          	  
	
	/**
	 * \if ENGLISH_LANG
	 * Plate Characters Hint Number
	 * \else
	 * 车牌字符暗示个数
	 * \endif
	 */
	public int                 nPlateHintNum;                        	  
	
	/**
	 * \if ENGLISH_LANG
	 * Plate Characters Hint Array When you take a picture of poor quality and license plate recognition uncertain. According to this array of characters to match. The smaller array subscript, the higher the match priority
	 * \else
	 * 车牌字符暗示数组，在拍摄图片质量较差车牌识别不确定时，根据此数组中的字符进行匹配，数组下标越小，匹配优先级越高
	 * \endif
	 */
	public byte[][]            szPlateHints = new byte[FinalVar.MAX_PLATEHINT_NUM][FinalVar.MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Lane Number
	 * \else
	 * 车道数
	 * \endif
	 */
	public int                 nLaneNum;                                  
	
	/**
	 * \if ENGLISH_LANG
	 * Lane Information
	 * \else
	 * 车道信息
	 * \endif
	 */
	public CFG_LANE[]          stuLanes = new CFG_LANE[FinalVar.MAX_LANE_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Light group
	 * \else
	 * 灯组数
	 * \endif
	 */
	public int                 nLightGroupNum;                            
	
	/**
	 * \if ENGLISH_LANG
	 * Light group config info
	 * \else
	 * 灯组配置信息
	 * \endif
	 */
	public CFG_LIGHTGROUPS[]   stLightGroups = new CFG_LIGHTGROUPS[FinalVar.MAX_LIGHTGROUP_NUM];      	
	
	/**
	 * \if ENGLISH_LANG
	 * whether recognize work plate
	 * \else
	 * 是否识别挂字车牌
	 * \endif
	 */
    public boolean             bHangingWordPlate;                      	  
    
	/**
	 * \if ENGLISH_LANG
	 * whether recognize non-standard police plate
	 * \else
	 * 是否识别非标准警牌
	 * \endif
	 */
    public boolean             bNonStdPolicePlate;                        
    
	/**
	 * \if ENGLISH_LANG
	 * whether recognize yellow plate letter
	 * \else
	 * 是否识别黄牌字母
	 * \endif
	 */
    public boolean             bYellowPlateLetter;                        
    
	/**
	 * \if ENGLISH_LANG
	 * report mode, 0:undefined, 1:report all violation vehicles, 2: report plate successfully recognized violation vehicle
	 * \else
	 * 上报模式，0：未定义，1：上报所有车辆，2：上报车牌识别成功的车辆
	 * \endif
	 */
    public int                 nReportMode;                               
    
	/**
	 * \if ENGLISH_LANG
	 * plate matching rate. 0~100, multi-recognition of plate use, means required identification of repeated plate recognition and previous plate recognition
	 * \else
	 * 车牌匹配率，0~100，多次识别车牌使用,表示重复识别车牌和前一次识别车牌的一致性要求
	 * \endif
	 */
    public int                 nPlateMatch;                               
    
	/**
	 * \if ENGLISH_LANG
	 * violation judgment basis, 1:undefined, 1:by lane, 2: by driving direction, 3: by lane and driving direction
	 * \else
	 * 判定依据，0：未定义，1：按车道，2：按行驶方向，3：按车道和行驶方向
	 * \endif
	 */
    public int                 nJudgment;                                 
    
	/**
	 * \if ENGLISH_LANG
	 * left turn boundary point
	 * \else
	 * 左转弯分界线点数
	 * \endif
	 */
    public int                 nLeftDivisionPtCount;                      
    
	/**
	 * \if ENGLISH_LANG
	 * left turn boundary line
	 * \else
	 * 左转弯分界线
	 * \endif
	 */
    public CFG_POLYLINE[]      stLeftDivisionLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];   		
    
	/**
	 * \if ENGLISH_LANG
	 * right turn boundary point
	 * \else
	 * 右转弯分界线点数
	 * \endif
	 */
    public int                 nRightDivisionPtCount;                     
    
	/**
	 * \if ENGLISH_LANG
	 * right turn boundary line
	 * \else
	 * 右转弯分界线
	 * \endif
	 */
    public CFG_POLYLINE[]      stRightDivisionLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];  		
    
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
	 * number of parking spaces
	 * \else
	 * 车位数    
	 * \endif
	 */
    public int                 nParkingSpaceNum;                          
    
	/**
	 * \if ENGLISH_LANG
	 * parking configuration information, each element represents a parking space
	 * \else
	 * 车位配置信息,每个元素代表一个车位
	 * \endif
	 */
    public CFG_PARKING_SPACE[]  stParkingSpaces = new CFG_PARKING_SPACE[FinalVar.MAX_PARKING_SPACE_NUM];

	
	public CFG_TRAFFIC_SCENE_INFO() {
		for(int i=0; i<FinalVar.MAX_LANE_NUM; i++) {
			stuLanes[i] = new CFG_LANE();
		}
		
		for(int i=0; i<FinalVar.MAX_LIGHTGROUP_NUM; i++) {
			stLightGroups[i] = new CFG_LIGHTGROUPS();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stLeftDivisionLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stRightDivisionLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_PARKING_SPACE_NUM; i++) {
			stParkingSpaces[i] = new CFG_PARKING_SPACE();
		}
	}
}

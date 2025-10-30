package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ITC, , the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_INTELLECTIVETRAFFIC}
 * \else
 * 智能交通抓拍,对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_INTELLECTIVETRAFFIC}
 * \endif
 */
public class CFG_TRAFFICSNAPSHOT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device address
	 * \else
	 * 设备地址	UTF-8编码，256字节
	 * \endif
	 */
	public byte[]                    szDeviceAddress = new byte[FinalVar.MAX_DEVICE_ADDRESS];   
	
	/**
	 * \if ENGLISH_LANG
	 * OSD title mask,low bit to high bit means:0-time 1-address 2-plant 3-car lenth 4-car speed 5-speed limit 6-big car speed limit 7-small car speed limit 8-over speed  9-breaking code 10-road number 11-vihicl color 12-plant type 13-plant color 14-red light on time 15-breaking type 16-radar direction 17-device number 18-mature time 19-car type 20-driving direction
	 * \else
	 * OSD叠加类型掩码	从低位到高位分别表示：0-时间 1-地点 2-车牌3-车长 4-车速 5-限速6-大车限速 7-小车限速8-超速 9-违法代码10-车道号 11-车身颜色 12-车牌类型 13-车牌颜色14-红灯点亮时间 15-类型 16-雷达方向 17-设备编号 18-标定到期时间 19-车型 20-行驶方向
	 * \endif
	 */
	public int                    	 nVideoTitleMask;                     
	
	/**
	 * \if ENGLISH_LANG
	 * Red light margin, it means run red light will not break rule when in this time, s
	 * \else
	 * 红灯冗余间隔时间	红灯开始的一段时间内，车辆通行不算闯红灯，单位：秒
	 * \endif
	 */
	public int                       nRedLightMargin;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Long vehicle length level,m
	 * \else
	 * 超长车长度最小阈值	单位：米，包含
	 * \endif
	 */
	public float				     fLongVehicleLengthLevel;            
	
	/**
	 * \if ENGLISH_LANG
	 * Big vehicle length level, m
	 * \else
	 * 大车长度阈值	单位：米，包含小值
	 * \endif
	 */
	public float[]					 arfLargeVehicleLengthLevel = new float[2];        
	
	/**
	 * \if ENGLISH_LANG
	 * Medium vehicle length level, m
	 * \else
	 * 中型车长度阈值	单位：米，包含小值
	 * \endif
	 */
	public float[]					 arfMediumVehicleLengthLevel = new float[2];       
	
	/**
	 * \if ENGLISH_LANG
	 * Small vehicle length level, m
	 * \else
	 * 小车长度阈值	单位：米，包含小值
	 * \endif
	 */
	public float[]					 arfSmallVehicleLengthLevel = new float[2];        
	
	/**
	 * \if ENGLISH_LANG
	 * Moto lenth level, m
	 * \else
	 * 摩托车长度最大阈值	单位：米，不包含
	 * \endif
	 */
	public float					 fMotoVehicleLengthLevel;             
	
	/**
	 * \if ENGLISH_LANG
	 * Breaking snap times
	 * \else
	 * 抓拍张数
	 * \endif
	 */
	public BREAKINGSNAPTIMES_INFO    stBreakingSnapTimes = new BREAKINGSNAPTIMES_INFO();                 
	
	/**
	 * \if ENGLISH_LANG
	 * Detector configuration
	 * \else
	 * 车检器配置，下标是车道号
	 * \endif
	 */
	public DETECTOR_INFO[]           arstDetector = new DETECTOR_INFO[FinalVar.MAX_DETECTOR];         
	
	/**
	 * \if ENGLISH_LANG
	 * Car type, 0-both snap 1-snap small car 2-snap big car 3-both not snap
	 * \else
	 * 抓拍车辆类型	0-大小车都抓拍1-抓拍小车2-抓拍大车3-大小车都不抓拍
	 * \endif
	 */
	public int 					 	 nCarType;			               	  
	
	/**
	 * \if ENGLISH_LANG
	 * Max speed, 0~255km/h
	 * \else
	 * 当测得的速度超过最大速度时，则以最大速度计	0~255km/h
	 * \endif
	 */
	public int						 nMaxSpeed;			               	  
	
	/**
	 * \if ENGLISH_LANG
	 * Frame mode	1-speed adaptive 2-depend on eventhandler
	 * \else
	 * 帧间隔模式	1-速度自适应（超过速度上限取0间隔，低于速度下限取2间隔，中间取1间隔）2-由联动参数决定
	 * \endif
	 */
	public int						 nFrameMode;		               	   
	
	/**
	 * \if ENGLISH_LANG
	 * Adaptive speed
	 * \else
	 * 速度自适应下限和上限
	 * \endif
	 */
	public int[]                     arnAdaptiveSpeed = new int[2];                 
	
	/**
	 * \if ENGLISH_LANG
	 * Snap event handler
	 * \else
	 * 交通抓拍联动参数
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE      stuEventHandler = new CFG_ALARM_MSG_HANDLE();	             
	
	/**
	 * \if ENGLISH_LANG
	 * True: Scheme for camera, please take the value between vehicle and 0 as standard; False: scheme for lane. Cannot modify the data, internal use only
	 * \else
	 * TRUE:方案针对相机,以车到0的值为准;FALSE:方案针对车道。不可以修改此字段数据, 只内部使用
	 * \endif
	 */
	public boolean                   abSchemeRange;                        

	/**
	 * \if ENGLISH_LANG
	 * From low to high means:0-mark 1-red light end time 2-device manufacturer  3-small car low speed 4-truck speed limit 5-car max speed 6-truck max speed 7-device working mode 8-general 11-parking lot(van, car and etc.) 13-midium car min speed 14-medium car max speed 15-road direction  16-GPS info
	 * \else
	 * 从低位到高位分别表示：0-车标 1-红灯结束时间 2-设备制造厂商 3-小车低限速 4-大车低限速 5-小车高限速 6-大车高限速 7-设备工作模式 8-通用自定义 9-车道自定义 10-抓拍触发源 11-停车场区域12-车辆类型(面包车、轿车等等) 13-中车低限速 14-中车高限速 15-道路方向 16-GPS信息
	 * \endif
	 */
    public int                    	 nVideoTitleMask1;					 
    
	/**
	 * \if ENGLISH_LANG
	 * Combine picture OSD overlay type mask	refer to nVideoTitleMask text
	 * \else
	 * 合成图片OSD叠加类型掩码	参照nVideoTitleMask字段
	 * \endif
	 */
    public int				     	 nMergeVideoTitleMask;                
    
	/**
	 * \if ENGLISH_LANG
	 * Combine picture OSD overlay type mask	refer to nVideoTitleMask1 text
	 * \else
	 * 合成图片OSD叠加类型掩码	参照nVideoTitleMask1字段
	 * \endif
	 */
    public int				     	 nMergeVideoTitleMask1;				 
    
	/**
	 * \if ENGLISH_LANG
	 * Trigger source mask code, 0-RS232, 1-RS485, 2-IO, 3-Video, 4-Net
	 * \else
	 * 触发源掩码 0-RS232, 1-RS485, 2-IO, 3-Video, 4-Net
	 * \endif
	 */
    public int                       nTriggerSource;					   
    
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode, 0-all, 1-over speed, 2-retrogradation, 3-PK mode
	 * \else
	 * 抓拍模式 ,0-全部抓拍, 1-超速抓拍, 2-逆向抓拍, 3-PK模式
	 * \endif
	 */
    public int						 nSnapMode;							    
    
	/**
	 * \if ENGLISH_LANG
	 * Working mode, 0-auto, 1-coil snapshot, 2-coil snapshot recignize, 3-video snapshot, 4-video recognition, 5-mixed, with recognition
	 * \else
	 * 工作模式, 0-自动模式，1-线圈抓拍模式，2-线圈抓拍识别，3-视频抓拍，4-视频识别, 5-混合抓拍（带识别）
	 * \endif
	 */
    public int                       nWorkMode;							   
    
	/**
	 * \if ENGLISH_LANG
	 * Lane threshold  distinguish size lane threshold, unit : cm
	 * \else
	 * 车长阈值  区分大小车长的阈值，单位: cm
	 * \endif
	 */
    public int                       nCarThreShold;						
    
	/**
	 * \if ENGLISH_LANG
	 * Snapshot or record selection, 0-normal snapshot mode, 1-video snapshot mode, 2-black screen mode
	 * \else
	 * 抓拍或抓录选择, 0-正常抓拍模式, 1-视频抓拍模式, 2-黑屏快抓模式
	 * \endif
	 */
    public int                       nSnapType;							   
    
	/**
	 * \if ENGLISH_LANG
	 * Custom snapshot interval first element is speed lower than self-adaptive limit interval of snapshot, and so on 
	 * \else
	 * 自定义抓拍帧间隔 第一个元素指车速小于速度自适应下限时的抓拍帧间隔，依次类推
	 * \endif
	 */
    public int[]                     nCustomFrameInterval = new int[3];			   
    
	/**
	 * \if ENGLISH_LANG
	 * Alive period withrador, vehicle detector, unit is s
	 * \else
	 * 与雷达、车检器的默认保活周期 单位秒
	 * \endif
	 */
    public int                       nKeepAlive;				       
    
	/**
	 * \if ENGLISH_LANG
	 * Original picture OSD parameter config
	 * \else
	 * 原始图片OSD参数配置
	 * \endif
	 */
    public OSD_INFO				     stOSD = new OSD_INFO();								
    
	/**
	 * \if ENGLISH_LANG
	 * Combine picture OSD parameter config
	 * \else
	 * 合成图片OSD参数配置
	 * \endif
	 */
    public OSD_INFO                  stMergeOSD = new OSD_INFO();                           
    
	/**
	 * \if ENGLISH_LANG
	 * Mark expirationtime, snaoshot is valid before this time
	 * \else
	 * 标定到期时间，指该时间点之前抓拍照片有效
	 * \endif
	 */
    public CFG_NET_TIME              stValidUntilTime = new CFG_NET_TIME();					    
    
	/**
	 * \if ENGLISH_LANG
	 * Radar Info
	 * \else
	 * 雷达信息
	 * \endif
	 */
    public RADAR_INFO                stRadar = new RADAR_INFO();
    
	/**
	 * \if ENGLISH_LANG
	 * Road code
	 * \else
	 * 道路代码
	 * \endif
	 */
    public byte[]                    szRoadwayCode = new byte[FinalVar.MAX_ROADWAYNO];         
    
	/**
	 * \if ENGLISH_LANG
	 * From low to high means :0-country 1-end gas data    
	 * \else
	 * 原始图片OSD叠加类型掩码2 从低位到高位分别表示：0-国别 1-尾气数据
	 * \endif
	 */
    public int                    	 nVideoTitleMask2;					     
    
	/**
	 * \if ENGLISH_LANG
	 * Combine picture OSD overlay type mask	refer to nVideoTitleMask2 text
	 * \else
	 * 合成图片OSD叠加类型掩码2 参照nVideoTitleMask2字段
	 * \endif
	 */
    public int				     	 nMergeVideoTitleMask2;				   
    
	/**
	 * \if ENGLISH_LANG
	 * entrance type.0-default(compatible with previous), 1-entry camera,  2-export camera
	 * \else
	 * 出入口类型，0-默认( 兼容以前，不区分出口/入口 )，1-入口相机， 2-出口相机
	 * \endif
	 */
	public int                       nParkType;       
	
	public  CFG_TRAFFICSNAPSHOT_INFO() {
		for(int i=0; i<FinalVar.MAX_DETECTOR; i++) {
			arstDetector[i] = new DETECTOR_INFO();
		}
	}
}

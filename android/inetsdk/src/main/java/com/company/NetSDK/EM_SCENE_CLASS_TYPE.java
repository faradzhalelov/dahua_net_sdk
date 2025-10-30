package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the scene class type
 * \else
 * 大类业务方案
 * \endif
 */
public class EM_SCENE_CLASS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SCENE_CLASS_UNKNOW          = 0;

    /**
     * \if ENGLISH_LANG
     * Normal
     * \else
     * 普通场景
     * \endif
     */
    public static final int EM_SCENE_CLASS_NORMAL          = 1;

    /**
     * \if ENGLISH_LANG
     * Traffic
     * \else
     * 交通场景
     * \endif
     */
    public static final int EM_SCENE_CLASS_TRAFFIC          = 2;

    /**
     * \if ENGLISH_LANG
     * TrafficPatrol
     * \else
     * 交通巡视
     * \endif
     */
    public static final int EM_SCENE_CLASS_TRAFFIC_PATROL          = 3;

    /**
     * \if ENGLISH_LANG
     * FaceDetection
     * \else
     * 目标检测/目标识别
     * \endif
     */
    public static final int EM_SCENE_CLASS_FACEDETECTION          = 4;

    /**
     * \if ENGLISH_LANG
     * ATM
     * \else
     * ATM
     * \endif
     */
    public static final int EM_SCENE_CLASS_ATM          = 5;

    /**
     * \if ENGLISH_LANG
     * Indoor
     * \else
     * 室内行为分析，和普通规则相同，对室内场景的算法优化版
     * \endif
     */
    public static final int EM_SENCE_CLASS_INDOOR          = 6;

    /**
     * \if ENGLISH_LANG
     * TargetRecognition
     * \else
     * 目标识别
     * \endif
     */
    public static final int EM_SENCE_CLASS_FACERECOGNITION          = 7;

    /**
     * \if ENGLISH_LANG
     * ARGp
     * \else
     * 
     * \endif
     */
    public static final int EM_SENCE_CLASS_PS          = 8;

    /**
     * \if ENGLISH_LANG
     * NumberStat
     * \else
     * 客流量统计
     * \endif
     */
    public static final int EM_SENCE_CLASS_NUMBERSTAT          = 9;

    /**
     * \if ENGLISH_LANG
     * HeatMap
     * \else
     * 热度图
     * \endif
     */
    public static final int EM_SENCE_CLASS_HEAT_MAP          = 10;

    /**
     * \if ENGLISH_LANG
     * VideoDiagnosis
     * \else
     * 视频诊断
     * \endif
     */
    public static final int EM_SENCE_CLASS_VIDEODIAGNOSIS          = 11;

    /**
     * \if ENGLISH_LANG
     * VehicleAnalyse
     * \else
     * 车辆特征检测分析
     * \endif
     */
    public static final int EM_SENCE_CLASS_VEHICLEANALYSE          = 12;

    /**
     * \if ENGLISH_LANG
     * CourseRecord
     * \else
     * 自动录播
     * \endif
     */
    public static final int EM_SENCE_CLASS_COURSERECORD          = 13;

    /**
     * \if ENGLISH_LANG
     * Vehicle
     * \else
     * 车载场景(车载行业用，不同于智能交通的Traffic)
     * \endif
     */
    public static final int EM_SENCE_CLASS_VEHICLE          = 14;

    /**
     * \if ENGLISH_LANG
     * StandUpDetection
     * \else
     * 起立检测
     * \endif
     */
    public static final int EM_SENCE_CLASS_STANDUPDETECTION          = 15;

    /**
     * \if ENGLISH_LANG
     * Gate
     * \else
     * 卡口
     * \endif
     */
    public static final int EM_SCENE_CLASS_GATE          = 16;

    /**
     * \if ENGLISH_LANG
     * SDFaceDetect
     * \else
     * 多预置点目标检测，配置一条规则但可以在不同预置点下生效
     * \endif
     */
    public static final int EM_SCENE_CLASS_SDFACEDETECTION          = 17;

    /**
     * \if ENGLISH_LANG
     * HeatMapPlan
     * \else
     * 球机热度图计划
     * \endif
     */
    public static final int EM_SCENE_CLASS_HEAT_MAP_PLAN          = 18;

    /**
     * \if ENGLISH_LANG
     * NumberStatPlan
     * \else
     * 球机客流量统计计划
     * \endif
     */
    public static final int EM_SCENE_CLASS_NUMBERSTAT_PLAN          = 19;

    /**
     * \if ENGLISH_LANG
     * ATMFD
     * \else
     * 金融目标检测，包括正常目标、异常目标、相邻目标、头盔目标等针对ATM场景特殊优化
     * \endif
     */
    public static final int EM_SCENE_CLASS_ATMFD          = 20;

    /**
     * \if ENGLISH_LANG
     * Highway
     * \else
     * 高速交通事件检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_HIGHWAY          = 21;

    /**
     * \if ENGLISH_LANG
     * City
     * \else
     * 城市交通事件检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_CITY          = 22;

    /**
     * \if ENGLISH_LANG
     * LeTrack
     * \else
     * 民用简易跟踪
     * \endif
     */
    public static final int EM_SCENE_CLASS_LETRACK          = 23;

    /**
     * \if ENGLISH_LANG
     * SCR
     * \else
     * 打靶相机
     * \endif
     */
    public static final int EM_SCENE_CLASS_SCR          = 24;

    /**
     * \if ENGLISH_LANG
     * StereoVision
     * \else
     * 立体视觉(双目)
     * \endif
     */
    public static final int EM_SCENE_CLASS_STEREO_VISION          = 25;

    /**
     * \if ENGLISH_LANG
     * HumanDetect
     * \else
     * 人体检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_HUMANDETECT          = 26;

    /**
     * \if ENGLISH_LANG
     * FaceAnalysis
     * \else
     * 目标分析
     * \endif
     */
    public static final int EM_SCENE_CLASS_FACEANALYSIS          = 27;

    /**
     * \if ENGLISH_LANG
     * XRayDetection
     * \else
     * X光检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_XRAY_DETECTION          = 28;

    /**
     * \if ENGLISH_LANG
     * StereoNumber
     * \else
     * 双目相机客流量统计
     * \endif
     */
    public static final int EM_SCENE_CLASS_STEREO_NUMBER          = 29;

    /**
     * \if ENGLISH_LANG
     * CrowdDistriMap
     * \else
     * 人群分布图
     * \endif
     */
    public static final int EM_SCENE_CLASS_CROWDDISTRIMAP          = 30;

    /**
     * \if ENGLISH_LANG
     * ObjectDetect
     * \else
     * 目标检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_OBJECTDETECT          = 31;

    /**
     * \if ENGLISH_LANG
     * FaceAttribute
     * \else
     * IVSS目标检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_FACEATTRIBUTE          = 32;

    /**
     * \if ENGLISH_LANG
     * FaceCompare
     * \else
     * IVSS目标识别
     * \endif
     */
    public static final int EM_SCENE_CLASS_FACECOMPARE          = 33;

    /**
     * \if ENGLISH_LANG
     * StereoBehavior
     * \else
     * 立体行为分析(典型场景ATM舱)
     * \endif
     */
    public static final int EM_SCENE_CLASS_STEREO_BEHAVIOR          = 34;

    /**
     * \if ENGLISH_LANG
     * IntelliCityMgr
     * \else
     * 智慧城管
     * \endif
     */
    public static final int EM_SCENE_CLASS_INTELLICITYMANAGER          = 35;

    /**
     * \if ENGLISH_LANG
     * ProtectiveCabin
     * \else
     * 防护舱（ATM舱内）
     * \endif
     */
    public static final int EM_SCENE_CLASS_PROTECTIVECABIN          = 36;

    /**
     * \if ENGLISH_LANG
     * AirplaneDetect
     * \else
     * 飞机行为检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_AIRPLANEDETECT          = 37;

    /**
     * \if ENGLISH_LANG
     * CrowdPosture
     * \else
     * 人群态势（人群分布图服务）
     * \endif
     */
    public static final int EM_SCENE_CLASS_CROWDPOSTURE          = 38;

    /**
     * \if ENGLISH_LANG
     * PhoneCallDetect
     * \else
     * 打电话检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_PHONECALLDETECT          = 39;

    /**
     * \if ENGLISH_LANG
     * SmokeDetection
     * \else
     * 烟雾检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_SMOKEDETECTION          = 40;

    /**
     * \if ENGLISH_LANG
     * BoatDetection
     * \else
     * 船只检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_BOATDETECTION          = 41;

    /**
     * \if ENGLISH_LANG
     * SmokingDetect
     * \else
     * 吸烟检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_SMOKINGDETECT          = 42;

    /**
     * \if ENGLISH_LANG
     * WaterMonitor
     * \else
     * 水利监测
     * \endif
     */
    public static final int EM_SCENE_CLASS_WATERMONITOR          = 43;

    /**
     * \if ENGLISH_LANG
     * GenerateGraphDetection
     * \else
     * 生成图规则
     * \endif
     */
    public static final int EM_SCENE_CLASS_GENERATEGRAPHDETECTION          = 44;

    /**
     * \if ENGLISH_LANG
     * TrafficPark
     * \else
     * 交通停车
     * \endif
     */
    public static final int EM_SCENE_CLASS_TRAFFIC_PARK          = 45;

    /**
     * \if ENGLISH_LANG
     * OperateMonitor
     * \else
     * 作业检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_OPERATEMONITOR          = 46;

    /**
     * \if ENGLISH_LANG
     * IntelliRetail
     * \else
     * 智慧零售大类
     * \endif
     */
    public static final int EM_SCENE_CLASS_INTELLI_RETAIL          = 47;

    /**
     * \if ENGLISH_LANG
     * ClassroomAnalyse
     * \else
     * 教育智慧课堂
     * \endif
     */
    public static final int EM_SCENE_CLASS_CLASSROOM_ANALYSE          = 48;

    /**
     * \if ENGLISH_LANG
     * FeatureAbstract
     * \else
     * 特征向量提取大类
     * \endif
     */
    public static final int EM_SCENE_CLASS_FEATURE_ABSTRACT          = 49;

    /**
     * \if ENGLISH_LANG
     * FaceBodyDetect
     * \else
     * 人像检测大类
     * \endif
     */
    public static final int EM_SCENE_CLASS_FACEBODY_DETECT          = 50;

    /**
     * \if ENGLISH_LANG
     * FaceBodyAnalyse
     * \else
     * 人像识别大类
     * \endif
     */
    public static final int EM_SCENE_CLASS_FACEBODY_ANALYSE          = 51;

    /**
     * \if ENGLISH_LANG
     * VehiclesDistri
     * \else
     * 车辆密度
     * \endif
     */
    public static final int EM_SCENE_CLASS_VEHICLES_DISTRI          = 52;

    /**
     * \if ENGLISH_LANG
     * IntelliBreed
     * \else
     * 智慧养殖检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_INTELLI_BREED          = 53;

    /**
     * \if ENGLISH_LANG
     * IntelliARGp
     * \else
     * 行为分析
     * \endif
     */
    public static final int EM_SCENE_CLASS_INTELLI_PS          = 54;

    /**
     * \if ENGLISH_LANG
     * ElectricDetect
     * \else
     * 电力检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_ELECTRIC_DETECT          = 55;

    /**
     * \if ENGLISH_LANG
     * RadarDetect
     * \else
     * 雷达检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_RADAR_DETECT          = 56;

    /**
     * \if ENGLISH_LANG
     * ParkingSpace
     * \else
     * 车位检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_PARKINGSPACE          = 57;


    /**
     * \if ENGLISH_LANG
     * IntelliFinance
     * \else
     * 智慧金融
     * \endif
     */
    public static final int EM_SCENE_CLASS_INTELLI_FINANCE          = 58;

    /**
     * \if ENGLISH_LANG
     * CrowdAbnormal
     * \else
     * 人群异常检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_CROWD_ABNORMAL          = 59;

    /**
     * \if ENGLISH_LANG
     * AnatomyTempDetect
     * \else
     *
     * \endif
     */
    public static final int EM_SCENE_CLASS_ANATOMYTEMP_DETECT          = 60;

    /**
     * \if ENGLISH_LANG
     * WeatherMonitor
     * \else
     * 天气预览
     * \endif
     */
    public static final int EM_SCENE_CLASS_WEATHER_MONITOR          = 61;

    /**
     * \if ENGLISH_LANG
     * ElevatorAccessControl
     * \else
     * 电梯门禁
     * \endif
     */
    public static final int EM_SCENE_CLASS_ELEVATOR_ACCESS_CONTROL          = 62;

    /**
     * \if ENGLISH_LANG
     * BreakRuleBuilding
     * \else
     * 建筑
     * \endif
     */
    public static final int EM_SCENE_CLASS_BREAK_RULE_BUILDING          = 63;

    /**
     * \if ENGLISH_LANG
     * PanoramaTraffic
     * \else
     * 全景交通
     * \endif
     */
    public static final int EM_SCENE_CLASS_PANORAMA_TRAFFIC          = 64;

    /**
     * \if ENGLISH_LANG
     * PortraitDetect
     * \else
     * 人像检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_PORTRAIT_DETECT          = 65;

    /**
     * \if ENGLISH_LANG
     * ConveyorBlock
     * \else
     * 传送带阻塞
     * \endif
     */
    public static final int EM_SCENE_CLASS_CONVEY_OR_BLOCK          = 66;

    /**
     * \if ENGLISH_LANG
     * KitchenAnimal
     * \else
     * 厨房有害动物检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_KITCHEN_ANIMAL          = 67;

    /**
     * \if ENGLISH_LANG
     * AllSeeingEye
     * \else
     * 万物检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_ALLSEEINGEYE          = 68;

    /**
     * \if ENGLISH_LANG
     * Drive
     * \else
     * 驾驶行为分析
     * \endif
     */
    public static final int EM_SCENE_CLASS_DRIVE          = 69;

    /**
     * \if ENGLISH_LANG
     * DriveAssistant
     * \else
     * 高级驾驶辅助系统
     * \endif
     */
    public static final int EM_SCENE_CLASS_DRIVEASSISTANT          = 70;

    /**
     * \if ENGLISH_LANG
     * InCabinMonitor
     * \else
     * 车内驾驶舱监测
     * \endif
     */
    public static final int EM_SCENE_CLASS_INCABINMONITOR          = 71;

    /**
     * \if ENGLISH_LANG
     * BlindSpotDetection
     * \else
     * 盲区检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_BLINDSPOTDETECTION          = 72;

    /**
     * \if ENGLISH_LANG
     * ConveyerBelt
     * \else
     * 传送带检测
     * \endif
     */
    public static final int EM_SCENE_CLASS_CONVERYER_BELT          = 73;

}

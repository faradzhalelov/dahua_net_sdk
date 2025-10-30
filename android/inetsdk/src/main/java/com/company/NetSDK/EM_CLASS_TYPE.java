package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * calss type
 * \else
 * 大类业务方案
 * \endif
 */
public class EM_CLASS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知业务
     * \endif
     */
    public static final int EM_CLASS_UNKNOWN                	= 0;

    /**
     * \if ENGLISH_LANG
     * Video Synopsis
     * \else
     * 视频浓缩
     * \endif
     */
    public static final int EM_CLASS_VIDEO_SYNOPSIS            	= 1;

    /**
     * \if ENGLISH_LANG
     * Traffic Gate
     * \else
     * 卡口
     * \endif
     */
    public static final int EM_CLASS_TRAFFIV_GATE            	= 2;

    /**
     * \if ENGLISH_LANG
     *  Electronic Police
     * \else
     * 电警
     * \endif
     */
    public static final int EM_CLASS_ELECTRONIC_POLICE        	= 3;

    /**
     * \if ENGLISH_LANG
     * Single Ptz Parking
     * \else
     * 单球违停
     * \endif
     */
    public static final int EM_CLASS_SINGLE_PTZ_PARKING        	= 4;

    /**
     * \if ENGLISH_LANG
     * Ptz Parking
     * \else
     * 主从违停
     * \endif
     */
    public static final int EM_CLASS_PTZ_PARKINBG            	= 5;

    /**
     * \if ENGLISH_LANG
     * "Traffic"
     * \else
     * 交通事件"Traffic"
     * \endif
     */
    public static final int EM_CLASS_TRAFFIC                	= 6;

    /**
     * \if ENGLISH_LANG
     * "Normal"
     * \else
     * 通用行为分析"Normal"
     * \endif
     */
    public static final int EM_CLASS_NORMAL                    	= 7;

    /**
     * \if ENGLISH_LANG
     * "ARGp"
     * \else
     * 行为分析"ARGp"
     * \endif
     */
    public static final int EM_CLASS_PS                    	= 8;

    /**
     * \if ENGLISH_LANG
     * "ATM"
     * \else
     * 金融行为分析"ATM"
     * \endif
     */
    public static final int EM_CLASS_ATM                    	= 9;

    /**
     * \if ENGLISH_LANG
     * Metro
     * \else
     * 地铁行为分析
     * \endif
     */
    public static final int EM_CLASS_METRO                    	= 10;

    /**
     * \if ENGLISH_LANG
     * "FaceDetection"
     * \else
     * 目标检测"FaceDetection"
     * \endif
     */
    public static final int EM_CLASS_FACE_DETECTION            	= 11;

    /**
     * \if ENGLISH_LANG
     * "TargetRecognition"
     * \else
     * 目标识别"TargetRecognition"
     * \endif
     */
    public static final int EM_CLASS_FACE_RECOGNITION        	= 12;

    /**
     * \if ENGLISH_LANG
     * "NumberStat"
     * \else
     * 人数统计"NumberStat"
     * \endif
     */
    public static final int EM_CLASS_NUMBER_STAT            	= 13;

    /**
     * \if ENGLISH_LANG
     * "HeatMap"
     * \else
     * 热度图"HeatMap"
     * \endif
     */
    public static final int EM_CLASS_HEAT_MAP                	= 14;

    /**
     * \if ENGLISH_LANG
     * "VideoDiagnosis"
     * \else
     * 视频诊断"VideoDiagnosis"
     * \endif
     */
    public static final int EM_CLASS_VIDEO_DIAGNOSIS        	= 15;

    /**
     * \if ENGLISH_LANG
     * Video enhance
     * \else
     * 视频增强
     * \endif
     */
    public static final int EM_CLASS_VIDEO_ENHANCE            	= 16;

    /**
     * \if ENGLISH_LANG
     * Smokefire detect
     * \else
     * 烟火检测
     * \endif
     */
    public static final int EM_CLASS_SMOKEFIRE_DETECT        	= 17;

    /**
     * \if ENGLISH_LANG
     * "VehicleAnalyse"
     * \else
     * 车辆特征识别"VehicleAnalyse"
     * \endif
     */
    public static final int EM_CLASS_VEHICLE_ANALYSE        	= 18;

    /**
     * \if ENGLISH_LANG
     * Person feature
     * \else
     * 人员特征识别
     * \endif
     */
    public static final int EM_CLASS_PERSON_FEATURE            	= 19;

    /**
     * \if ENGLISH_LANG
     * "SDFaceDetect"
     * \else
     * 多预置点目标检测"SDFaceDetect"
     * \endif
     */
    public static final int EM_CLASS_SDFACEDETECTION			= 20;

    /*************************************************************************************************
     *                          配置一条规则但可以在不同预置点下生效                                 *
     *************************************************************************************************/
    /**
     * \if ENGLISH_LANG
     * "HeatMapPlan"
     * \else
     * 球机热度图计划"HeatMapPlan"
     * \endif
     */
    public static final int EM_CLASS_HEAT_MAP_PLAN				= 21;

    /**
     * \if ENGLISH_LANG
     * "NumberStatPlan"
     * \else
     * 球机客流量统计计划 "NumberStatPlan"
     * \endif
     */
    public static final int EM_CLASS_NUMBERSTAT_PLAN			= 22;

    /**
     * \if ENGLISH_LANG
     * "ATMFD"
     * \else
     * 金融目标检测，包括正常目标、异常目标、相邻目标、头盔目标等针对ATM场景特殊优化
     * \endif
     */
    public static final int EM_CLASS_ATMFD						= 23;

    /**
     * \if ENGLISH_LANG
     * "Highway"
     * \else
     * 高速交通事件检测"Highway"
     * \endif
     */
    public static final int EM_CLASS_HIGHWAY					= 24;

    /**
     * \if ENGLISH_LANG
     * "City"
     * \else
     * 城市交通事件检测 "City"
     * \endif
     */
    public static final int EM_CLASS_CITY						= 25;

    /**
     * \if ENGLISH_LANG
     * "LeTrack"
     * \else
     * 民用简易跟踪"LeTrack"
     * \endif
     */
    public static final int EM_CLASS_LETRACK					= 26;

    /**
     * \if ENGLISH_LANG
     * "SCR"
     * \else
     * 打靶相机"SCR"
     * \endif
     */
    public static final int EM_CLASS_SCR						= 27;

    /**
     * \if ENGLISH_LANG
     * "StereoVision"
     * \else
     * 立体视觉(双目)"StereoVision"
     * \endif
     */
    public static final int EM_CLASS_STEREO_VISION              = 28;

    /**
     * \if ENGLISH_LANG
     * "HumanDetect"
     * \else
     * 人体检测"HumanDetect"
     * \endif
     */
    public static final int EM_CLASS_HUMANDETECT                = 29;

    /**
     * \if ENGLISH_LANG
     * "FaceAnalysis"
     * \else
     * 目标分析 "FaceAnalysis"
     * \endif
     */
    public static final int EM_CLASS_FACE_ANALYSIS				= 30;

    /**
     * \if ENGLISH_LANG
     * "XRayDetection"
     * \else
     * X光检测 "XRayDetection"
     * \endif
     */
    public static final int EM_CALSS_XRAY_DETECTION				= 31;

    /**
     * \if ENGLISH_LANG
     * "StereoNumber"
     * \else
     * 双目相机客流量统计 "StereoNumber"
     * \endif
     */
    public static final int EM_CLASS_STEREO_NUMBER				= 32;

    /**
     * \if ENGLISH_LANG
     * "CrowdDistriMap"
     * \else
     * 人群分布图  "CrowdDistriMap"
     * \endif
     */
    public static final int EM_CLASS_CROWDDISTRIMAP				= 33;

    /**
     * \if ENGLISH_LANG
     * "ObjectDetect"
     * \else
     * 目标检测 "ObjectDetect"
     * \endif
     */
    public static final int EM_CLASS_OBJECTDETECT				= 34;

    /**
     * \if ENGLISH_LANG
     * "FaceAttribute"
     * \else
     * IVSS目标检测 "FaceAttribute"
     * \endif
     */
    public static final int EM_CLASS_FACEATTRIBUTE				= 35;

    /**
     * \if ENGLISH_LANG
     * "FaceCompare"
     * \else
     * IVSS目标识别 "FaceCompare"
     * \endif
     */
    public static final int EM_CLASS_FACECOMPARE				= 36;

    /**
     * \if ENGLISH_LANG
     * "StereoBehavior"
     * \else
     * 立体行为分析 "StereoBehavior"
     * \endif
     */
    public static final int EM_CALSS_STEREO_BEHAVIOR			= 37;

    /**
     * \if ENGLISH_LANG
     * "IntelliCityManager"
     * \else
     * 智慧城管 "IntelliCityManager"
     * \endif
     */
    public static final int EM_CALSS_INTELLICITYMANAGER			= 38;

    /**
     * \if ENGLISH_LANG
     * "ProtectiveCabin"
     * \else
     * 防护舱（ATM舱内）"ProtectiveCabin"
     * \endif
     */
    public static final int EM_CALSS_PROTECTIVECABIN			= 39;

    /**
     * \if ENGLISH_LANG
     * "AirplaneDetect"
     * \else
     * 飞机行为检测 "AirplaneDetect"
     * \endif
     */
    public static final int EM_CALSS_AIRPLANEDETECT			= 40;

    /**
     * \if ENGLISH_LANG
     * "CrowdPosture"
     * \else
     * 人群态势（人群分布图服务）"CrowdPosture"
     * \endif
     */
    public static final int EM_CALSS_CROWDPOSTURE			= 41;

    /**
     * \if ENGLISH_LANG
     * "PhoneCallDetect"
     * \else
     * 打电话检测 "PhoneCallDetect"
     * \endif
     */
    public static final int EM_CLASS_PHONECALLDETECT			= 42;

    /**
     * \if ENGLISH_LANG
     * "SmokeDetection"
     * \else
     * 烟雾检测 "SmokeDetection"
     * \endif
     */
    public static final int EM_CLASS_SMOKEDETECTION			= 43;

    /**
     * \if ENGLISH_LANG
     * "BoatDetection"
     * \else
     * 船只检测 "BoatDetection"
     * \endif
     */
    public static final int EM_CLASS_BOATDETECTION			= 44;

    /**
     * \if ENGLISH_LANG
     * "SmokingDetect"
     * \else
     * 吸烟检测 "SmokingDetect"
     * \endif
     */
    public static final int EM_CLASS_SMOKINGDETECT			= 45;

    /**
     * \if ENGLISH_LANG
     * "WaterMonitor"
     * \else
     * 水利监测 "WaterMonitor"
     * \endif
     */
    public static final int EM_CLASS_WATERMONITOR			= 46;

    /**
     * \if ENGLISH_LANG
     * "GenerateGraphDetection"
     * \else
     * 生成图规则 "GenerateGraphDetection"
     * \endif
     */
    public static final int EM_CLASS_GENERATEGRAPHDETECTION			= 47;

    /**
     * \if ENGLISH_LANG
     * "TrafficPark"
     * \else
     * 交通停车 "TrafficPark"
     * \endif
     */
    public static final int EM_CLASS_TRAFFIC_PARK			= 48;

    /**
     * \if ENGLISH_LANG
     * "OperateMonitor"
     * \else
     * 作业检测 "OperateMonitor"
     * \endif
     */
    public static final int EM_CLASS_OPERATEMONITOR			= 49;

    /**
     * \if ENGLISH_LANG
     * "IntelliRetail"
     * \else
     * 智慧零售大类 "IntelliRetail"
     * \endif
     */
    public static final int EM_CLASS_INTELLI_RETAIL			= 50;

    /**
     * \if ENGLISH_LANG
     * "ClassroomAnalyse"
     * \else
     * 教育智慧课堂"ClassroomAnalyse"
     * \endif
     */
    public static final int EM_CLASS_CLASSROOM_ANALYSE			= 51;

    /**
     * \if ENGLISH_LANG
     * "FeatureAbstract"
     * \else
     * 特征向量提取大类 "FeatureAbstract"
     * \endif
     */
    public static final int EM_CLASS_FEATURE_ABSTRACT			= 52;

    /**
     * \if ENGLISH_LANG
     * "FaceBodyDetect"
     * \else
     * 人体检测大类 "FaceBodyDetect"
     * \endif
     */
    public static final int EM_CLASS_FACEBODY_DETECT			= 53;

    /**
     * \if ENGLISH_LANG
     * "FaceBodyAnalyse"
     * \else
     * 人体识别大类 "FaceBodyAnalyse"
     * \endif
     */
    public static final int EM_CLASS_FACEBODY_ANALYSE			= 54;

    /**
     * \if ENGLISH_LANG
     * "VehiclesDistri"
     * \else
     * 车辆密度 "VehiclesDistri"
     * \endif
     */
    public static final int EM_CLASS_VEHICLES_DISTRI			= 55;

    /**
     * \if ENGLISH_LANG
     * "IntelliBreed"
     * \else
     * 智慧养殖检测 "IntelliBreed"
     * \endif
     */
    public static final int EM_CLASS_INTELLI_BREED			= 56;

    /**
     * \if ENGLISH_LANG
     * "IntelliARGp"
     * \else
     * 行为分析 "IntelliARGp"
     * \endif
     */
    public static final int EM_CLASS_INTELLI_PS			= 57;

    /**
     * \if ENGLISH_LANG
     * "ElectricDetect"
     * \else
     * 电力检测 "ElectricDetect"
     * \endif
     */
    public static final int EM_CLASS_ELECTRIC_DETECT			= 58;

    /**
     * \if ENGLISH_LANG
     * "RadarDetect"
     * \else
     * 雷达检测 "RadarDetect"
     * \endif
     */
    public static final int EM_CLASS_RADAR_DETECT			= 59;

    /**
     * \if ENGLISH_LANG
     * "ParkingSpace"
     * \else
     * 车位检测大类 "ParkingSpace"
     * \endif
     */
    public static final int EM_CLASS_PARKINGSPACE			= 60;

    /**
     * \if ENGLISH_LANG
     * "IntelliFinance"
     * \else
     * 智慧金融 "IntelliFinance"
     * \endif
     */
    public static final int EM_CLASS_INTELLI_FINANCE			= 61;

    /**
     * \if ENGLISH_LANG
     * "CrowdAbnormal"
     * \else
     * 人群异常检测 "CrowdAbnormal"
     * \endif
     */
    public static final int EM_CLASS_CROWD_ABNORMAL			= 62;

    /**
     * \if ENGLISH_LANG
     * "AnatomyTempDetect"
     * \else
     * 人体温智能检测 "AnatomyTempDetect"
     * \endif
     */
    public static final int EM_CLASS_ANATOMY_TEMP_DETECT			= 63;
}

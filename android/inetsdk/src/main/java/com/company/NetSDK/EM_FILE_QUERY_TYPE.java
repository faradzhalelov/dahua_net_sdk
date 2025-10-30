package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief media file query condition
 * \else
 * @brief media文件查询条件
 * \endif
 */
public class EM_FILE_QUERY_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle information,corresponding structure is MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \else
	 *  交通车辆信息,对应结构体为MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_TRAFFICCAR = 0;

	/**
	 * \if ENGLISH_LANG
	 *  ATM information
	 * \else
	 *  ATM信息
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_ATM = 1;

	/**
	 * \if ENGLISH_LANG
	 *  ATM transaction information
	 * \else
	 *  ATM交易信息
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_ATMTXN = 2;

	/**
	 * \if ENGLISH_LANG
	 *  Target info
	 * \else
	 *  目标信息 MEDIAFILE_FACERECOGNITION_PARAM 和 MEDIAFILE_FACERECOGNITION_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FACE = 3;

	/**
	 * \if ENGLISH_LANG
	 *  file info, corresponding to NET_IN_MEDIA_QUERY_FILE and NET_OUT_MEDIAFILE_FILE
	 * \else
	 *  文件信息对应 NET_IN_MEDIA_QUERY_FILE 和 NET_OUT_MEDIA_QUERY_FILE
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FILE = 4;

	/**
	 * \if ENGLISH_LANG
	 *  Transportation vehicle information, expand SDK_FILE_QUERY_TRAFFICCAR, support more fields
	 *  corresponding structure is MEDIA_QUERY_TRAFFICCAR_PARAM_EX
	 * \else
	 *  交通车辆信息, 扩展SDK_FILE_QUERY_TRAFFICCAR, 支持更多的字段，对应结构体为MEDIA_QUERY_TRAFFICCAR_PARAM_EX
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_TRAFFICCAR_EX = 5;

	/**
	 * \if ENGLISH_LANG
	 *  Target recognition event info MEDIAFILE_FACE_DETECTION_PARAM  and MEDIAFILE_FACE_DETECTION_INFO
	 * \else
	 *  目标检测事件信息 MEDIAFILE_FACE_DETECTION_PARAM 和 MEDIAFILE_FACE_DETECTION_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FACE_DETECTION = 6;

	/**
	 * \if ENGLISH_LANG
	 *  ivs event info MEDIAFILE_IVS_EVENT_PARAM and MEDIAFILE_IVS_EVENT_INFO
	 * \else
	 *  智能事件信息 MEDIAFILE_IVS_EVENT_PARAM 和 MEDIAFILE_IVS_EVENT_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_IVS_EVENT = 7;

	/**
	 * \if ENGLISH_LANG
	 *  analyse object info MEDIAFILE_ANALYSE_OBJECT_PARAM and MEDIAFILE_ANALYSE_OBJECT_INFO
	 * \else
	 *  智能分析其他物体(人和车除外) MEDIAFILE_ANALYSE_OBJECT_PARAM 和 MEDIAFILE_ANALYSE_OBJECT_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_ANALYSE_OBJECT = 8;

	/**
	 * \if ENGLISH_LANG
	 *  query mpt record file,corresponding to MEDIAFILE_MPT_RECORD_FILE_PARAM and MEDIAFILE_MPT_RECORD_FILE_INFO
	 * \else
	 *  MPT设备的录像文件 MEDIAFILE_MPT_RECORD_FILE_PARAM 和 MEDIAFILE_MPT_RECORD_FILE_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_MPT_RECORD_FILE = 9;

	/**
	 * \if ENGLISH_LANG
	 *  X-ray package info,corresponding to MEDIAFILE_XRAY_DETECTION_PARAM and MEDIAFILE_XRAY_DETECTION_INFO
	 * \else
	 *  X光检包裹信息对应 MEDIAFILE_XRAY_DETECTION_PARAM 和 MEDIAFILE_XRAY_DETECTION_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_XRAY_DETECTION = 10;

	/**
	 * \if ENGLISH_LANG
	 *  Human traut info,corresponding to MEDIAFILE_HUMAN_TRAIT_PARAM and MEDIAFILE_HUMAN_TRAIT_INFO
	 * \else
	 *  人体检测 MEDIAFILE_HUMAN_TRAIT_PARAM 和 MEDIAFILE_HUMAN_TRAIT_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_HUMAN_TRAIT = 11;

	/**
	 * \if ENGLISH_LANG
	 *  nonmotor record info,  corresponding to MEDIAFILE_NONMOTOR_PARAM and MEDIAFILE_NONMOTOR_INFO
	 * \else
	 *  非机动车查询,  MEDIAFILE_NONMOTOR_PARAM 和 MEDIAFILE_NONMOTOR_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_NONMOTOR = 12;

	/**
	 * \if ENGLISH_LANG
	 *  door control record info, corresponding to MEDIAFILE_DOORCONTROL_RECORD_PARAM and MEDIAFILE_DOORCONTROL_RECORD_INFO
	 * \else
	 *  门打开事件查询, MEDIAFILE_DOORCONTROL_RECORD_PARAM 和 MEDIAFILE_DOORCONTROL_RECORD_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_DOORCONTROL_RECORD = 13;

	/**
	 * \if ENGLISH_LANG
	 *  Target body detect info,MEDIAFILE_FACEBODY_DETECT_PARAM and MEDIAFILE_FACEBODY_DETECT_INFO
	 * \else
	 *  人像检测查询，MEDIAFILE_FACEBODY_DETECT_PARAM 和 MEDIAFILE_FACEBODY_DETECT_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FACEBODY_DETECT = 14;

	/**
	 * \if ENGLISH_LANG
	 *  Target body analyse,MEDIAFILE_FACEBODY_ANALYSE_PARAM and MEDIAFILE_FACEBODY_ANALYSE_INFO
	 * \else
	 *  人像识别查询，MEDIAFILE_FACEBODY_ANALYSE_PARAM 和 MEDIAFILE_FACEBODY_ANALYSE_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FACEBODY_ANALYSE = 15;

	/**
	 * \if ENGLISH_LANG
	 *  file info extended(customized), corresponding to NET_IN_MEDIA_QUERY_FILE and NET_OUT_MEDIAFILE_FILE
	 *  stuEventInfo and nEventInfoCount in NET_IN_MEDIA_QUERY_FILE are valid; nEventLists and nEventCount are invalid
	 * \else
	 *  文件信息扩展，对应 NET_IN_MEDIA_QUERY_FILE 和 NET_OUT_MEDIA_QUERY_FILE,此时 NET_IN_MEDIA_QUERY_FILE 中的 stuEventInfo 字段有效
	 *  nEventLists 及 nEventCount字段无效
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FILE_EX = 16;

	/**
	 * \if ENGLISH_LANG
	 *  snapshot with mask, corresponding to MEDIAFILE_SNAPSHORT_WITH_MARK_PARAM and MEDIAFILE_SNAPSHORT_WITH_MARK_INFO
	 * \else
	 *  标记抓图查询, 对应MEDIAFILE_SNAPSHORT_WITH_MARK_PARAM 和MEDIAFILE_SNAPSHORT_WITH_MARK_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_SNAPSHOT_WITH_MARK = 17;

	/**
	 * \if ENGLISH_LANG
	 *  anatomy temp detect, corresponding to MEDIAFILE_ANATOMY_TEMP_DETECT_PARAM and MEDIAFILE_ANATOMY_TEMP_DETECT_INFO
	 * \else
	 *  人体测温信息查询， 对应 MEDIAFILE_ANATOMY_TEMP_DETECT_PARAM 和 MEDIAFILE_ANATOMY_TEMP_DETECT_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_ANATOMY_TEMP_DETECT = 18;

	/**
	 * \if ENGLISH_LANG
	 *  illegal traffic, corresponding to MEDIAFILE_ILLEGAL_TRAFFIC_PARAM and MEDIAFILE_ILLEGAL_TRAFFIC_INFO
	 * \else
	 *  违停车辆查询，对应 MEDIAFILE_ILLEGAL_TRAFFIC_PARAM 和 MEDIAFILE_ILLEGAL_TRAFFIC_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_ILLEGAL_TRAFFIC = 19;

	/**
	 * \if ENGLISH_LANG
	 *  smoke fire,corresponding to MEDIAFILE_SMOKE_FIRE_PARAM and MEDIAFILE_SMOKE_FIRE_INFO
	 * \else
	 *  烟火检测查询，对应 MEDIAFILE_SMOKE_FIRE_PARAM 和 MEDIAFILE_SMOKE_FIRE_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_SMOKE_FIRE = 20;

	/**
	 * \if ENGLISH_LANG
	 *  fire control monitor,corresponding to MEDIAFILE_FIRE_CONTROL_MONITOR_PARAM and MEDIAFILE_FIRE_CONTROL_MONITOR_INFO
	 * \else
	 *  消控室值班行为检测事件查询，对应 MEDIAFILE_FIRE_CONTROL_MONITOR_PARAM 和 MEDIAFILE_FIRE_CONTROL_MONITOR_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FIRE_CONTROL_MONITOR = 21;

	/**
	 * \if ENGLISH_LANG
	 *  fire lane detection, corresponding to MEDIAFILE_FIRE_LANE_DETECTION_PARAM and MEDIAFILE_FIRE_LANE_DETECTION_INFO
	 * \else
	 *  消防通道占道检测查询，对应 MEDIAFILE_FIRE_LANE_DETECTION_PARAM 和 MEDIAFILE_FIRE_LANE_DETECTION_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_FIRE_LANE_DETECTION = 22;

	/**
	 * \if ENGLISH_LANG
	 *  non motor entrying, corresponding to MEDIAFILE_NONMOTOR_ENTRYING_PARAM and MEDIAFILE_NONMOTOR_ENTRYING_INFO
	 * \else
	 *  安全隐患检测查询，对应 MEDIAFILE_NONMOTOR_ENTRYING_PARAM 和 MEDIAFILE_NONMOTOR_ENTRYING_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_NONMOTOR_ENTRYING = 23;

	/**
	 * \if ENGLISH_LANG
	 *  work clothes detection,corresponding to MEDIAFILE_WORK_CLOTHES_DETECTION_PARAM and MEDIAFILE_WORK_CLOTHES_DETECTION_INFO
	 * \else
	 *  作业管控查询，对应 MEDIAFILE_WORK_CLOTHES_DETECTION_PARAM 和 MEDIAFILE_WORK_CLOTHES_DETECTION_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_WORK_CLOTHES_DETECTION = 24;

	/**
	 * \if ENGLISH_LANG
	 *  intelligent city manager,corresponding to MEDIAFILE_INTELLIGENT_CITY_MANAGER_PARAM and MEDIAFILE_INTELLIGENT_CITY_MANAGER_INFO
	 * \else
	 *  智慧城管查询查询，对应 MEDIAFILE_INTELLIGENT_CITY_MANAGER_PARAM 和 MEDIAFILE_INTELLIGENT_CITY_MANAGER_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_INTELLIGENT_CITY_MANAGER = 25;

	/**
	 * \if ENGLISH_LANG
	 *  Intelligent dynamic monitoring (SMD) video query, corresponding to MEDIAFILE_SMD_RECORD_FILE_PARAM and MEDIAFILE_SMD_RECORD_FILE_INFO
	 * \else
	 *  智能动态监测(SMD) 录像查询, 对应 MEDIAFILE_SMD_RECORD_FILE_PARAM 和 MEDIAFILE_SMD_RECORD_FILE_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_SMD_RECORD_FILE = 26;

	/**
	 * \if ENGLISH_LANG
	 *  Collection station and handheld terminal file information query,corresponding to MEDIAFILE_MOBILE_ENFORCE_PARAM and  MEDIAFILE_MOBILE_ENFORCE_INFO
	 * \else
	 *  采集站和手持终端文件信息查询,对应 MEDIAFILE_MOBILE_ENFORCE_PARAM 和 MEDIAFILE_MOBILE_ENFORCE_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_MOBILE_ENFORCE = 27;

	/**
	 * \if ENGLISH_LANG
	 *  Smart kitchen query,corresponding to MEDIAFILE_SMART_KITCHEN_CLOTHES_DETECTION_PARAM and MEDIAFILE_SMART_KITCHEN_CLOTHES_DETECTION_INFO
	 * \else
	 *  智慧厨房查询,对应 MEDIAFILE_SMART_KITCHEN_CLOTHES_DETECTION_PARAM 和 MEDIAFILE_SMART_KITCHEN_CLOTHES_DETECTION_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_SMART_KITCHEN_CLOTHES_DETECTION = 28;

	/**
	 * \if ENGLISH_LANG
	 *  Water Conservancy Search, corresponding to MEDIAFILE_WATER_CONSERVANCY_SEARCH_PARAM and MEDIAFILE_WATER_CONSERVANCY_SEARCH_INFO
	 * \else
	 *  水利查询, 对应MEDIAFILE_WATER_CONSERVANCY_SEARCH_PARAM和MEDIAFILE_WATER_CONSERVANCY_SEARCH_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_WATER_CONSERVANCY_SEARCH = 29;

	/**
	 * \if ENGLISH_LANG
	 *  Break Rule Building Search, corresponding to MEDIAFILE_BREAK_RULE_BUILDING_SEARCH_PARAM and MEDIAFILE_BREAK_RULE_BUILDING_SEARCH_INFO
	 * \else
	 *  违章建筑查询, 对应MEDIAFILE_BREAK_RULE_BUILDING_SEARCH_PARAM和MEDIAFILE_BREAK_RULE_BUILDING_SEARCH_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_BREAK_RULE_BUILDING_SEARCH = 30;

	/**
	 * \if ENGLISH_LANG
	 *  Boat Search, corresponding to MEDIAFILE_BOAT_SEARCH_PARAM and MEDIAFILE_BOAT_SEARCH_INFO
	 * \else
	 *  船只查询, 对应MEDIAFILE_BOAT_SEARCH_PARAM和MEDIAFILE_BOAT_SEARCH_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_BOAT_SEARCH = 31;

	/**
	 * \if ENGLISH_LANG
	 *  Radar alarm event query, corresponding to MEDIAFILE_RADAR_REGION_DETECTION_PARAM and MEDIAFILE_RADAR_REGION_DETECTION_INFO
	 * \else
	 *  雷达报警事件查询, 对应 MEDIAFILE_RADAR_REGION_DETECTION_PARAM 和 MEDIAFILE_RADAR_REGION_DETECTION_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_RADAR_REGION_DETECTION = 32;

	/**
	 * \if ENGLISH_LANG
	 *  Find recordings by candidate or examination room information, corresponding to NET_MEDIAFILE_EXAM_PARAM and NET_MEDIAFILE_EXAM_INFO
	 * \else
	 *  按照考生或考场信息查找录像, 对应 NET_MEDIAFILE_EXAM_PARAM 和 NET_MEDIAFILE_EXAM_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_EXAM = 33;

	/**
	 * \if ENGLISH_LANG
	 *  Search for videos by PoliceManID, PoliceCarID and PoliceOfficeID, corresponding to NET_MEDIAFILE_POLICEID_PARAM  NET_OUT_MEDIA_QUERY_FILE
	 * \else
	 *  通过用户 ID、警车 ID、警察局 ID搜索录像, 对应 NET_MEDIAFILE_POLICEID_PARAM和 NET_OUT_MEDIA_QUERY_FILE
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_POLICEID = 34;

	/**
	 * \if ENGLISH_LANG
	 *  Classroom Behavior Analysis Query , corresponding to NET_MEDIAFILE_CLASSROOM_BEHAVIOR_PARAM and NET_MEDIA_CLASSROOM_BEHAVIOR_INFO
	 * \else
	 *  课堂行为分析查询, 对应 NET_MEDIAFILE_CLASSROOM_BEHAVIOR_PARAM和 NET_MEDIA_CLASSROOM_BEHAVIOR_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_CLASSROOM_BEHAVIOR = 35;

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle Trigger Mode Query, corresponding to NET_MEDIAFILE_VEHICLE_TRIGGER_MODE_PARAM和 NET_MEDIA_VEHICLE_TRIGGER_MODE_INFO
	 * \else
	 *  车载触发模式查询, 对应 NET_MEDIAFILE_VEHICLE_TRIGGER_MODE_PARAM和 NET_MEDIA_VEHICLE_TRIGGER_MODE_INFO
	 * \endif
	 */
	public static final int					SDK_FILE_QUERY_VEHICLE_TRIGGER_MODE = 36;

}
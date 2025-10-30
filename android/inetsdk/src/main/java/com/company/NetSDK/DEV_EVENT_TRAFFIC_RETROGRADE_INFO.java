package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_TRAFFIC_RETROGRADE} 's data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_RETROGRADE} (交通-逆行事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_RETROGRADE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel ID
	 * \else
	 * 通道号
	 * \endif
	 */
	public int nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Rule ID, used to indicate which rule triggers the event. The default value is 0
	 * \else
	 * 规则编号,用于标示哪个规则触发的事件，缺省时默认为0
	 * \endif
	 */
	public int nRuleID;

	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double PTS;

	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int nEventID;

	/**
	 * \if ENGLISH_LANG
	 * Corresponding Lane number
	 * \else
	 * 对应车道号
	 * \endif
	 */
	public int nLane;

	/**
	 * \if ENGLISH_LANG
	 * have being detected object
	 * \else
	 * 车牌信息
	 * \endif
	 */
	public SDK_MSG_OBJECT stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * vehicle info
	 * \else
	 * 车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * event file info
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 * snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 表示抓拍序号,如3,2,1,1表示抓拍结束,0表示异常结束
	 * \endif
	 */
	public int nSequence;

	/**
	 * \if ENGLISH_LANG
	 * speed, km/h
	 * \else
	 * 车辆实际速度,Km/h
	 * \endif
	 */
	public int nSpeed;

	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte bEventAction;

	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 * flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 * 抓图标志(按位),具体见NET_RESERVED_COMMON
	 * \endif
	 */
	public int dwSnapFlagMask;

	/**
	 * \if ENGLISH_LANG
	 * picture resolution
	 * \else
	 * 对应图片的分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 * a corresponding alarm recording; false: no corresponding alarm recording
	 * \else
	 * rue:有对应的报警录像; false:无对应的报警录像
	 * \endif
	 */
	public boolean bIsExistAlarmRecord;

	/**
	 * \if ENGLISH_LANG
	 * Video size
	 * \else
	 * 录像大小
	 * \endif
	 */
	public int dwAlarmRecordSize;

	/**
	 * \if ENGLISH_LANG
	 * Video Path
	 * \else
	 * 录像路径
	 * \endif
	 */
	public byte szAlarmRecordPath[] = new byte[FinalVar.SDK_COMMON_STRING_256];

	/**
	 * \if ENGLISH_LANG
	 * intelli comm info
	 * \else
	 * 智能事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * GPS info ,use in mobile DVR/NVR
	 * \else
	 * GPS信息 车载
	 * \endif
	 */
	public NET_GPS_INFO stuGPSInfo = new NET_GPS_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle info
	 * \else
	 * 交通车辆信息
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Acme amount of the rule detect zone
	 * \else
	 * 规则检测区域顶点数
	 * \endif
	 */
	public int nDetectNum;

	/**
	 * \if ENGLISH_LANG
	 * Rule detect zone
	 * \else
	 * 规则检测区域
	 * \endif
	 */
	public SDK_POINT DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];

	/**
	 * \if ENGLISH_LANG
	 * public info
	 * \else
	 * 公共信息
	 * \endif
	 */
	public EVENT_COMM_INFO stCommInfo = new EVENT_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * has NonMotor information?
	 * \else
	 * 是否有非机动车对象
	 * \endif
	 */
	public boolean bHasNonMotor;

	/**
	 * \if ENGLISH_LANG
	 * NonMotor information
	 * \else
	 * 非机动车对象
	 * \endif
	 */
	public VA_OBJECT_NONMOTOR stuNonMotor = new VA_OBJECT_NONMOTOR();
	
	public DEV_EVENT_TRAFFIC_RETROGRADE_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
			DetectRegion[i] = new SDK_POINT();
		}
	}
}

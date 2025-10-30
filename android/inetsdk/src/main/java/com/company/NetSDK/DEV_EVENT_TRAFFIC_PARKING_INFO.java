package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of  {@link FinalVar#EVENT_IVS_TRAFFIC_PARKING} 's data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_PARKING} (停车事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_PARKING_INFO implements Serializable {
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
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double              PTS;

	/**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * have being detected object
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * vehicle info
	 * \else
	 * 车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * Corresponding Lane number
	 * \else
	 * 对应车道号
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * event file info
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte                bEventAction;

	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte                byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 * the time of starting parking
	 * \else
	 * 开始停车时间
	 * \endif
	 */
	public NET_TIME_EX         stuStartParkingTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop(this param work when bEventAction=2)
	 * \else
	 * 表示抓拍序号，如3,2,1,1表示抓拍结束,0表示异常结束(bEventAction=2时此参数有效)
	 * \endif
	 */
	public int                 nSequence;

	/**
	 * \if ENGLISH_LANG
	 * interval time of alarm(s) (this is a continuous event,if the interval time of recieving next event go beyond this parm, we can judge that this event is over with exception)
	 * \else
	 * 报警时间间隔，单位:秒。(此事件为连续性事件，在收到第一个此事件之后，若在超过间隔时间后未收到此事件的后续事件，则认为此事件异常结束了)
	 * \endif
	 */
	public int                 nAlarmIntervalTime;

	/**
	 * \if ENGLISH_LANG
	 * the time of legal parking
	 * \else
	 * 允许停车时长，单位：秒。
	 * \endif
	 */
	public int                 nParkingAllowedTime;

	/**
	 * \if ENGLISH_LANG
	 * detect region point number
	 * \else
	 * 规则检测区域顶点数
	 * \endif
	 */
	public int                 nDetectRegionNum;

	/**
	 * \if ENGLISH_LANG
	 * detect region point number
	 * \else
	 * 规则检测区域
	 * \endif
	 */
	public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];

	/**
	 * \if ENGLISH_LANG
	 * flag(by bit),see {@link NET_RESERVED_COMMON}
	 * \else
	 * 抓图标志(按位)，具体见 {@link NET_RESERVED_COMMON}
	 * \endif
	 */
	public int               dwSnapFlagMask;

	/**
	 * \if ENGLISH_LANG
	 * picture resolution
	 * \else
	 * 对应图片的分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 * true:corresponding alarm recording; false: no corresponding alarm recording
	 * \else
	 * rue:有对应的报警录像; false:无对应的报警录像
	 * \endif
	 */
	public boolean                bIsExistAlarmRecord;

	/**
	 * \if ENGLISH_LANG
	 * Video size
	 * \else
	 * 录像大小
	 * \endif
	 */
	public int               dwAlarmRecordSize;

	/**
	 * \if ENGLISH_LANG
	 * Video Path
	 * \else
	 * 录像路径
	 * \endif
	 */
	public byte                szAlarmRecordPath[] = new byte[FinalVar.SDK_COMMON_STRING_256];

	/**
	 * \if ENGLISH_LANG
	 * FTP path
	 * \else
	 * FTP路径
	 * \endif
	 */
	public byte                szFTPPath[] = new byte[FinalVar.SDK_COMMON_STRING_256];

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
	 * public info
	 * \else
	 * 公共信息
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();
	
	public DEV_EVENT_TRAFFIC_PARKING_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
			DetectRegion[i] = new SDK_POINT();
		}
	}
}
